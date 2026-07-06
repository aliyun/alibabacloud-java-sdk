// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpdateConsumerOffsetRequest extends TeaModel {
    /**
     * <p>Consumer Group name.</p>
     * <ul>
     * <li><p>Can only contain letters, numbers, hyphens (-), and underscores (_).</p>
     * </li>
     * <li><p>Length must be <strong>3-64</strong> characters. If more than <strong>64</strong> characters are provided, they will be automatically truncated.</p>
     * </li>
     * <li><p>Cannot be modified once created.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kafka-test</p>
     */
    @NameInMap("ConsumerId")
    public String consumerId;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_post-cn-mp91inkw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>When resetType is offset, this parameter is used to set the consumer offset for each partition of a topic for the consumer group.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Offsets")
    public java.util.List<UpdateConsumerOffsetRequestOffsets> offsets;

    /**
     * <p>Region ID of the instance to which the Group belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Type of consumer group offset reset, supporting the following two types:</p>
     * <ul>
     * <li><p><strong>timestamp</strong> (default)</p>
     * </li>
     * <li><p><strong>offset</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>timestamp</p>
     */
    @NameInMap("ResetType")
    public String resetType;

    /**
     * <p>Time parameter in Unix timestamp format, in milliseconds.
     * The parameter range should be <strong>less than 0</strong> or <strong>within the retention period of the consumer offset</strong>. This parameter only takes effect when resetType is timestamp.</p>
     * <ul>
     * <li><p>To reset to the latest consumer offset, pass -1.</p>
     * </li>
     * <li><p>To reset to the earliest consumer offset, pass -2.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("Time")
    public String time;

    /**
     * <p>Topic name.</p>
     * <ul>
     * <li><p>Can only contain letters, numbers, underscores (_), and hyphens (-).</p>
     * </li>
     * <li><p>Length must be <strong>3-64</strong> characters. If more than <strong>64</strong> characters are provided, they will be automatically truncated.</p>
     * </li>
     * <li><p>Cannot be modified once created.</p>
     * </li>
     * </ul>
     * <p><strong>To set the consumer offset for all topics subscribed by the current consumer, pass an empty string.</strong></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>topic_name</p>
     */
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
        /**
         * <p>Partition offset.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Offset")
        public Long offset;

        /**
         * <p>Partition ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
