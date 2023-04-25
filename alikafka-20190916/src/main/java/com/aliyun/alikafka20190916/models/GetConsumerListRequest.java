// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetConsumerListRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("ConsumerId")
    public String consumerId;

    /**
     * <p>The tags of the topic.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the consumer group. If you do not configure this parameter, all consumer groups are queried.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetConsumerListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerListRequest self = new GetConsumerListRequest();
        return TeaModel.build(map, self);
    }

    public GetConsumerListRequest setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public GetConsumerListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetConsumerListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
