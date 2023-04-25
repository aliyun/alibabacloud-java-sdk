// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpdateConsumerOffsetShrinkRequest extends TeaModel {
    @NameInMap("ConsumerId")
    public String consumerId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Offsets")
    public String offsetsShrink;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResetType")
    public String resetType;

    @NameInMap("Time")
    public String time;

    @NameInMap("Topic")
    public String topic;

    public static UpdateConsumerOffsetShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConsumerOffsetShrinkRequest self = new UpdateConsumerOffsetShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConsumerOffsetShrinkRequest setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public UpdateConsumerOffsetShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateConsumerOffsetShrinkRequest setOffsetsShrink(String offsetsShrink) {
        this.offsetsShrink = offsetsShrink;
        return this;
    }
    public String getOffsetsShrink() {
        return this.offsetsShrink;
    }

    public UpdateConsumerOffsetShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateConsumerOffsetShrinkRequest setResetType(String resetType) {
        this.resetType = resetType;
        return this;
    }
    public String getResetType() {
        return this.resetType;
    }

    public UpdateConsumerOffsetShrinkRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public UpdateConsumerOffsetShrinkRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
