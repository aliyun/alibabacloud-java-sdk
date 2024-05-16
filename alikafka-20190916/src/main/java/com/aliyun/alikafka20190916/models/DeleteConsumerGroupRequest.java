// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DeleteConsumerGroupRequest extends TeaModel {
    /**
     * <p>The name of the consumer group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConsumerId")
    public String consumerId;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteConsumerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConsumerGroupRequest self = new DeleteConsumerGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConsumerGroupRequest setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public DeleteConsumerGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteConsumerGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
