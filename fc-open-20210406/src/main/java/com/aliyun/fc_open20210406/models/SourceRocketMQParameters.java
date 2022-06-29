// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class SourceRocketMQParameters extends TeaModel {
    // GroupID
    @NameInMap("GroupID")
    public String groupID;

    // InstanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // Offset
    @NameInMap("Offset")
    public String offset;

    // RegionId
    @NameInMap("RegionId")
    public String regionId;

    // Tag
    @NameInMap("Tag")
    public String tag;

    // Timestamp
    @NameInMap("Timestamp")
    public Long timestamp;

    // Topic
    @NameInMap("Topic")
    public String topic;

    public static SourceRocketMQParameters build(java.util.Map<String, ?> map) throws Exception {
        SourceRocketMQParameters self = new SourceRocketMQParameters();
        return TeaModel.build(map, self);
    }

    public SourceRocketMQParameters setGroupID(String groupID) {
        this.groupID = groupID;
        return this;
    }
    public String getGroupID() {
        return this.groupID;
    }

    public SourceRocketMQParameters setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SourceRocketMQParameters setOffset(String offset) {
        this.offset = offset;
        return this;
    }
    public String getOffset() {
        return this.offset;
    }

    public SourceRocketMQParameters setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SourceRocketMQParameters setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public SourceRocketMQParameters setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public SourceRocketMQParameters setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
