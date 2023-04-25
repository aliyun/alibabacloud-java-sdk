// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpdateConsumerOffsetRequest extends TeaModel {
    @NameInMap("ConsumerId")
    public String consumerId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Offsets")
    public java.util.List<UpdateConsumerOffsetRequestOffsets> offsets;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResetType")
    public String resetType;

    @NameInMap("Time")
    public String time;

    @NameInMap("Topic")
    public String topic;

    public static UpdateConsumerOffsetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConsumerOffsetRequest self = new UpdateConsumerOffsetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConsumerOffsetRequest setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public UpdateConsumerOffsetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateConsumerOffsetRequest setOffsets(java.util.List<UpdateConsumerOffsetRequestOffsets> offsets) {
        this.offsets = offsets;
        return this;
    }
    public java.util.List<UpdateConsumerOffsetRequestOffsets> getOffsets() {
        return this.offsets;
    }

    public UpdateConsumerOffsetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateConsumerOffsetRequest setResetType(String resetType) {
        this.resetType = resetType;
        return this;
    }
    public String getResetType() {
        return this.resetType;
    }

    public UpdateConsumerOffsetRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public UpdateConsumerOffsetRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public static class UpdateConsumerOffsetRequestOffsets extends TeaModel {
        @NameInMap("Offset")
        public Long offset;

        @NameInMap("Partition")
        public Integer partition;

        public static UpdateConsumerOffsetRequestOffsets build(java.util.Map<String, ?> map) throws Exception {
            UpdateConsumerOffsetRequestOffsets self = new UpdateConsumerOffsetRequestOffsets();
            return TeaModel.build(map, self);
        }

        public UpdateConsumerOffsetRequestOffsets setOffset(Long offset) {
            this.offset = offset;
            return this;
        }
        public Long getOffset() {
            return this.offset;
        }

        public UpdateConsumerOffsetRequestOffsets setPartition(Integer partition) {
            this.partition = partition;
            return this;
        }
        public Integer getPartition() {
            return this.partition;
        }

    }

}
