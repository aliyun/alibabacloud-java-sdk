// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20181015.models;

import com.aliyun.tea.*;

public class CreateConsumerGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>consumer_group_test</p>
     */
    @NameInMap("ConsumerId")
    public String consumerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_pre-cn-0pp1954n****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateConsumerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerGroupRequest self = new CreateConsumerGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateConsumerGroupRequest setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public CreateConsumerGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateConsumerGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
