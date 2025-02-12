// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreateTopicRequest extends TeaModel {
    /**
     * <p>The log cleanup policy that is used for the topic. This parameter is available only when LocalTopic is set to true. Valid values:</p>
     * <ul>
     * <li>false: The topic uses the default log cleanup policy.</li>
     * <li>true: The topic uses the log compaction policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CompactTopic")
    public Boolean compactTopic;

    /**
     * <p>The additional configuration.</p>
     * <ul>
     * <li>The value must be in JSON format.</li>
     * <li>Set Key to <strong>replications</strong>. This value specifies the number of replicas of the topic. The value must be an integer that ranges from 1 to 3.</li>
     * <li>You can configure this parameter only if you set <strong>LocalTopic</strong> to <strong>true</strong> or specify <strong>Open Source Edition (Local Disk)</strong> as the instance edition.****</li>
     * </ul>
     * <blockquote>
     * <p> If you specify replications in this parameter, <strong>ReplicationFactor</strong> does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;replications&quot;: 3}</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_pre-cn-mp919o4v****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of storage that the topic uses. Valid values:</p>
     * <ul>
     * <li>false: The topic uses cloud storage.</li>
     * <li>true: The topic uses local storage.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LocalTopic")
    public Boolean localTopic;

    /**
     * <p>The minimum number of in-sync replicas (ISRs).</p>
     * <ul>
     * <li>This parameter is available only when <strong>LocalTopic</strong> is set to <strong>true</strong>, or the instance is of the <strong>Open Source Edition (Local Disk)</strong>.****</li>
     * <li>The value of this parameter must be smaller than the value of ReplicationFactor.</li>
     * <li>Valid values: 1 to 3.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("MinInsyncReplicas")
    public Long minInsyncReplicas;

    /**
     * <p>The number of partitions in the topic.</p>
     * <ul>
     * <li>Valid values: 1 to 360.</li>
     * <li>In the ApsaraMQ for Kafka console, you can view the number of partitions that the system recommends based on the specifications of the instance. We recommend that you specify the number that is recommended by the system as the value of this parameter to reduce the risk of data skew.</li>
     * </ul>
     * <p>Default values:</p>
     * <ul>
     * <li>ApsaraMQ for Kafka V2 instance: 12</li>
     * <li>ApsaraMQ for Kafka V3 instance: 3</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("PartitionNum")
    public String partitionNum;

    /**
     * <p>The region ID of the instance in which you want to create a topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The description of the topic.</p>
     * <ul>
     * <li>The description can contain only letters, digits, hyphens (-), and underscores (_).</li>
     * <li>The description must be 3 to 64 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_topic_test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The number of replicas for the topic.</p>
     * <ul>
     * <li>This parameter is available only when <strong>LocalTopic</strong> is set to <strong>true</strong>, or the instance is of the <strong>Open Source Edition (Local Disk)</strong>.****</li>
     * <li>Valid values: 1 to 3.</li>
     * </ul>
     * <blockquote>
     * <p>If you set this parameter to <strong>1</strong>, data loss may occur. Exercise caution when you configure this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
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
     * <ul>
     * <li>The name can contain only letters, digits, hyphens (-), and underscores (_).</li>
     * <li>The name must be 3 to 64 characters in length. If the name that you specify contains more than 64 characters, the system automatically truncates the name.</li>
     * <li>After a topic is created, you cannot change the name of the topic.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_topic_test</p>
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
         * <ul>
         * <li>If you do not specify this parameter, the keys of all tags are matched.</li>
         * <li>The tag key must be 1 to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>aliyun</code> or <code>acs:</code>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <ul>
         * <li>You can leave this parameter empty.</li>
         * <li>The tag value must be 1 to 128 characters in length and cannot contain http:// or https://. The tag value cannot start with aliyun or acs:.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
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
