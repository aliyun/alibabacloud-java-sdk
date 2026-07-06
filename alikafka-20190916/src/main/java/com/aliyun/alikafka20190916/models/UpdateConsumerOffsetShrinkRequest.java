// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpdateConsumerOffsetShrinkRequest extends TeaModel {
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
    public String offsetsShrink;

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
