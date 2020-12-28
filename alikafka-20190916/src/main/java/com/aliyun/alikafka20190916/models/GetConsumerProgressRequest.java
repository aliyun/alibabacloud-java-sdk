// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetConsumerProgressRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ConsumerId")
    public String consumerId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetConsumerProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerProgressRequest self = new GetConsumerProgressRequest();
        return TeaModel.build(map, self);
    }

    public GetConsumerProgressRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetConsumerProgressRequest setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public GetConsumerProgressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
