// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreateTopicShrinkRequest extends TeaModel {
    @NameInMap("CompactTopic")
    public Boolean compactTopic;

    @NameInMap("Config")
    public String configShrink;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LocalTopic")
    public Boolean localTopic;

    @NameInMap("MinInsyncReplicas")
    public Long minInsyncReplicas;

    @NameInMap("PartitionNum")
    public String partitionNum;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("ReplicationFactor")
    public Long replicationFactor;

    @NameInMap("Topic")
    public String topic;

    public static CreateTopicShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTopicShrinkRequest self = new CreateTopicShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTopicShrinkRequest setCompactTopic(Boolean compactTopic) {
        this.compactTopic = compactTopic;
        return this;
    }
    public Boolean getCompactTopic() {
        return this.compactTopic;
    }

    public CreateTopicShrinkRequest setConfigShrink(String configShrink) {
        this.configShrink = configShrink;
        return this;
    }
    public String getConfigShrink() {
        return this.configShrink;
    }

    public CreateTopicShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTopicShrinkRequest setLocalTopic(Boolean localTopic) {
        this.localTopic = localTopic;
        return this;
    }
    public Boolean getLocalTopic() {
        return this.localTopic;
    }

    public CreateTopicShrinkRequest setMinInsyncReplicas(Long minInsyncReplicas) {
        this.minInsyncReplicas = minInsyncReplicas;
        return this;
    }
    public Long getMinInsyncReplicas() {
        return this.minInsyncReplicas;
    }

    public CreateTopicShrinkRequest setPartitionNum(String partitionNum) {
        this.partitionNum = partitionNum;
        return this;
    }
    public String getPartitionNum() {
        return this.partitionNum;
    }

    public CreateTopicShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTopicShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateTopicShrinkRequest setReplicationFactor(Long replicationFactor) {
        this.replicationFactor = replicationFactor;
        return this;
    }
    public Long getReplicationFactor() {
        return this.replicationFactor;
    }

    public CreateTopicShrinkRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
