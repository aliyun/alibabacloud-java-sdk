// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreateTopicRequest extends TeaModel {
    /**
     * <p>The cleanup policy configured when the storage engine of the topic is set to local storage. Valid values:</p>
     * <ul>
     * <li>false: delete cleanup policy.</li>
     * <li>true: compact cleanup policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CompactTopic")
    public Boolean compactTopic;

    /**
     * <p>The supplementary configuration.</p>
     * <ul>
     * <li><p>Must be in JSON format.</p>
     * </li>
     * <li><p>This parameter takes effect only when <strong>LocalTopic</strong> is set to <strong>true</strong>.</p>
     * </li>
     * <li><p>Supported configurations for reserved instances:</p>
     * <ul>
     * <li><strong>retention.ms</strong> (message retention period): ranges from 3600000 to 31536000000 milliseconds.</li>
     * <li><strong>max.message.bytes</strong> (maximum message size): ranges from 1048576 to 10485760 bytes. </li>
     * <li><strong>message.timestamp.type</strong>: specifies the type of message timestamp. CreateTime indicates the timestamp specified by the producer when sending a message. If not specified, it is the message creation time on the client. LogAppendTime indicates the time when the message is written to disk on the server. Valid values: CreateTime or LogAppendTime. Default value: CreateTime. We recommend LogAppendTime.</li>
     * </ul>
     * </li>
     * <li><p>Supported configurations for Serverless instances:</p>
     * <ul>
     * <li><strong>retention.hours</strong> (message retention period): value type is String. Valid values: 24 to 8760.</li>
     * <li><strong>max.message.bytes</strong> (maximum message size): value type is String. Valid values: 1048576 to 10485760.</li>
     * <li><strong>message.timestamp.type</strong> (type of message timestamp): CreateTime indicates the timestamp specified by the producer when sending a message. If not specified, it is the message creation time on the client. LogAppendTime indicates the time when the message is written to disk on the server. Valid values: CreateTime or LogAppendTime. Default value: CreateTime. We recommend LogAppendTime.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;retention.ms&quot;: &quot;3600000&quot;}</p>
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
     * <p>The storage engine of the topic. Valid values:</p>
     * <ul>
     * <li>false: cloud storage.</li>
     * <li>true: local storage.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LocalTopic")
    public Boolean localTopic;

    /**
     * <p>The minimum number of in-sync replicas (ISR).</p>
     * <ul>
     * <li><p>This parameter takes effect only when <strong>LocalTopic</strong> is set to <strong>true</strong>.</p>
     * </li>
     * <li><p>The value must be less than the number of topic replicas.</p>
     * </li>
     * <li><p>The number of in-sync replicas ranges from 1 to 3.</p>
     * </li>
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
     * <p>The number of partitions for the topic.</p>
     * <ul>
     * <li><p>The number of partitions ranges from 1 to 360.</p>
     * </li>
     * <li><p>The console provides different configuration suggestions based on the instance edition. Configure the number of partitions based on the console suggestions to reduce the risk of data skew.</p>
     * </li>
     * </ul>
     * <p>Default value:</p>
     * <ul>
     * <li><p>Reserved instances: 12</p>
     * </li>
     * <li><p>Serverless instances: 3</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("PartitionNum")
    public String partitionNum;

    /**
     * <p>The region ID of the instance to which the topic belongs.</p>
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
     * <li><p>Can contain only letters, digits, underscores (_), and hyphens (-).</p>
     * </li>
     * <li><p>Must be 3 to 64 characters in length.</p>
     * </li>
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
     * <li><p>This parameter takes effect only when <strong>LocalTopic</strong> is set to <strong>true</strong>.</p>
     * </li>
     * <li><p>The number of replicas ranges from 1 to 3.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If the number of replicas is set to <strong>1</strong>, data loss may occur. Set this parameter with caution.</p>
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
     * <p>The tag list.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateTopicRequestTag> tag;

    /**
     * <p>The name of the topic.</p>
     * <ul>
     * <li>Reserved instances:
     * Supports uppercase and lowercase letters, digits, underscores (_), hyphens (-), and periods (.). The name must be 3 to 64 characters in length.</li>
     * <li>Serverless instances:
     * Supports uppercase and lowercase letters, digits, underscores (_), hyphens (-), and periods (.). The name must be 1 to 249 characters in length.</li>
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
         * <p>The tag key of the resource.</p>
         * <ul>
         * <li><p>N ranges from 1 to 20.</p>
         * </li>
         * <li><p>If this parameter is left empty, all tag keys are matched.</p>
         * </li>
         * <li><p>The tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>, or contain <code>http://</code> or <code>https://</code>.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource.</p>
         * <ul>
         * <li><p>N ranges from 1 to 20.</p>
         * </li>
         * <li><p>This parameter can be left empty.</p>
         * </li>
         * <li><p>The tag value can be up to 128 characters in length and cannot start with aliyun or acs:, or contain http:// or https://.</p>
         * </li>
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
