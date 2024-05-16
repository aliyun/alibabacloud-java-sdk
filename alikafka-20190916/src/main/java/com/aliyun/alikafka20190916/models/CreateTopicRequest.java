// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreateTopicRequest extends TeaModel {
    /**
     * <p>The log cleanup policy that is used for the topic. This parameter is available only when LocalTopic is set to true. Valid values:</p>
     * <br>
     * <p>*   false: The topic uses the default log cleanup policy.</p>
     * <p>*   true: The topic uses the log compaction policy.</p>
     */
    @NameInMap("CompactTopic")
    public Boolean compactTopic;

    /**
     * <p>The additional configurations.</p>
     * <br>
     * <p>*   The value of this parameter must be in JSON format.</p>
     * <p>*   The key must be **replications**. The value indicates the number of replicas for the topic. The value must be an integer that ranges from 1 to 3.</p>
     * <p>*   This parameter is available only when **LocalTopic** is set to **true**, or the instance is of the **Open Source Edition (Local Disk)**.****</p>
     * <br>
     * <p>> If you specify this parameter, **ReplicationFactor** does not take effect.</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of storage that the topic uses. Valid values:</p>
     * <br>
     * <p>*   false: The topic uses cloud storage.</p>
     * <p>*   true: The topic uses local storage.</p>
     */
    @NameInMap("LocalTopic")
    public Boolean localTopic;

    /**
     * <p>The minimum number of in-sync replicas (ISRs).</p>
     * <br>
     * <p>*   This parameter is available only when **LocalTopic** is set to **true**, or the instance is of the **Open Source Edition (Local Disk)**.****</p>
     * <p>*   The value of this parameter must be smaller than the value of ReplicationFactor.</p>
     * <p>*   Valid values: 1 to 3.</p>
     */
    @NameInMap("MinInsyncReplicas")
    public Long minInsyncReplicas;

    /**
     * <p>The number of partitions in the topic.</p>
     * <br>
     * <p>*   Valid values: 1 to 360.</p>
     * <p>*   In the ApsaraMQ for Kafka console, you can view the number of partitions that the system recommends based on the specifications of the instance. We recommend that you specify the number that is recommended by the system as the value of this parameter to reduce the risk of data skew.</p>
     * <br>
     * <p>Default values:</p>
     * <br>
     * <p>*   ApsaraMQ for Kafka V2 instance: 12</p>
     * <p>*   ApsaraMQ for Kafka V3 instance: 3</p>
     */
    @NameInMap("PartitionNum")
    public String partitionNum;

    /**
     * <p>The region ID of the instance in which you want to create a topic.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The description of the topic.</p>
     * <br>
     * <p>*   The description can contain only letters, digits, hyphens (-), and underscores (_).</p>
     * <p>*   The description must be 3 to 64 characters in length.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The number of replicas for the topic.</p>
     * <br>
     * <p>*   This parameter is available only when **LocalTopic** is set to **true**, or the instance is of the **Open Source Edition (Local Disk)**.****</p>
     * <p>*   Valid values: 1 to 3.</p>
     * <br>
     * <p>> If you set this parameter to **1**, data loss may occur. Exercise caution when you configure this parameter.</p>
     */
    @NameInMap("ReplicationFactor")
    public Long replicationFactor;

    /**
     * <p>The tags that you want to add to the topic.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateTopicRequestTag> tag;

    /**
     * <p>The topic name.</p>
     * <br>
     * <p>*   The name can contain only letters, digits, hyphens (-), and underscores (_).</p>
     * <p>*   The name must be 3 to 64 characters in length. If the name that you specify contains more than 64 characters, the system automatically truncates the name.</p>
     * <p>*   After a topic is created, you cannot change the name of the topic.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static CreateTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTopicRequest self = new CreateTopicRequest();
        return TeaModel.build(map, self);
    }

    public CreateTopicRequest setCompactTopic(Boolean compactTopic) {
        this.compactTopic = compactTopic;
        return this;
    }
    public Boolean getCompactTopic() {
        return this.compactTopic;
    }

    public CreateTopicRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateTopicRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTopicRequest setLocalTopic(Boolean localTopic) {
        this.localTopic = localTopic;
        return this;
    }
    public Boolean getLocalTopic() {
        return this.localTopic;
    }

    public CreateTopicRequest setMinInsyncReplicas(Long minInsyncReplicas) {
        this.minInsyncReplicas = minInsyncReplicas;
        return this;
    }
    public Long getMinInsyncReplicas() {
        return this.minInsyncReplicas;
    }

    public CreateTopicRequest setPartitionNum(String partitionNum) {
        this.partitionNum = partitionNum;
        return this;
    }
    public String getPartitionNum() {
        return this.partitionNum;
    }

    public CreateTopicRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTopicRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateTopicRequest setReplicationFactor(Long replicationFactor) {
        this.replicationFactor = replicationFactor;
        return this;
    }
    public Long getReplicationFactor() {
        return this.replicationFactor;
    }

    public CreateTopicRequest setTag(java.util.List<CreateTopicRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateTopicRequestTag> getTag() {
        return this.tag;
    }

    public CreateTopicRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public static class CreateTopicRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <br>
         * <p>*   If you do not specify this parameter, the keys of all tags are matched.</p>
         * <p>*   The tag key must be 1 to 128 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `aliyun` or `acs:`.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <br>
         * <p>*   You can leave this parameter empty.</p>
         * <p>*   The tag value must be 1 to 128 characters in length and cannot contain http:// or https://. The tag value cannot start with aliyun or acs:.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateTopicRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateTopicRequestTag self = new CreateTopicRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateTopicRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTopicRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
