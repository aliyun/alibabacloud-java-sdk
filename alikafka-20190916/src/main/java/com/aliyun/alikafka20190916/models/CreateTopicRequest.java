// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreateTopicRequest extends TeaModel {
    /**
     * <p>The cleanup policy for the topic. This parameter is available only if the storage engine of the topic is local storage. Valid values:</p>
     * <ul>
     * <li><p>false: The delete cleanup policy.</p>
     * </li>
     * <li><p>true: The compact cleanup policy.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CompactTopic")
    public Boolean compactTopic;

    /**
     * <p>The advanced configurations of the topic.</p>
     * <ul>
     * <li><p>Configure this parameter in the JSON format.</p>
     * </li>
     * <li><p>This parameter is available only if <strong>LocalTopic</strong> is set to <strong>true</strong>.</p>
     * </li>
     * <li><p>The following configurations are supported for reserved instances:</p>
     * <ul>
     * <li><p><strong>retention.ms</strong>: The message retention period. The value must be an integer from 3,600,000 to 31,536,000,000. Unit: milliseconds.</p>
     * </li>
     * <li><p><strong>max.message.bytes</strong>: The maximum size of a message that can be sent. The value must be an integer from 1,048,576 to 10,485,760. Unit: bytes.</p>
     * </li>
     * <li><p>message.timestamp.type: The timestamp type of a message. Valid values: CreateTime or LogAppendTime. CreateTime indicates that the message timestamp is the time when the producer creates the message. If you do not specify a timestamp, the client time is used. LogAppendTime indicates that the message timestamp is the time when the server stores the message. The default value is CreateTime. We recommend that you set this parameter to <strong>LogAppendTime</strong>.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>The following configurations are supported for Serverless instances:</p>
     * <ul>
     * <li><p><strong>retention.hours</strong>: The message retention period. The value is of the string type. The value must be an integer from 24 to 8,760.</p>
     * </li>
     * <li><p><strong>max.message.bytes</strong>: The maximum size of a message that can be sent. The value is of the string type. The value must be an integer from 1,048,576 to 10,485,760.</p>
     * </li>
     * <li><p>message.timestamp.type: The timestamp type of a message. Valid values: CreateTime or LogAppendTime. CreateTime indicates that the message timestamp is the time when the producer creates the message. If you do not specify a timestamp, the client time is used. LogAppendTime indicates that the message timestamp is the time when the server stores the message. The default value is CreateTime. We recommend that you set this parameter to <strong>LogAppendTime</strong>.</p>
     * </li>
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
     * <p>The ID of the instance.</p>
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
     * <li><p>false: cloud storage.</p>
     * </li>
     * <li><p>true: local storage.</p>
     * </li>
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
     * <li><p>This parameter is available only if <strong>LocalTopic</strong> is set to <strong>true</strong>.</p>
     * </li>
     * <li><p>The value of this parameter must be smaller than the number of replicas for the topic.</p>
     * </li>
     * <li><p>The value must be an integer from 1 to 3.</p>
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
     * <p>The number of partitions in the topic.</p>
     * <ul>
     * <li><p>The value must be an integer from 1 to 360.</p>
     * </li>
     * <li><p>The console suggests a number of partitions based on the instance type. Follow the suggestion to reduce the risk of data skew.</p>
     * </li>
     * </ul>
     * <p>Default value:</p>
     * <ul>
     * <li><p>Reserved instance: 12</p>
     * </li>
     * <li><p>Serverless instance: 3</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("PartitionNum")
    public String partitionNum;

    /**
     * <p>The ID of the region where the instance that contains the topic is located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The remarks on the topic.</p>
     * <ul>
     * <li><p>The remarks can contain only letters, digits, underscores (_), and hyphens (-).</p>
     * </li>
     * <li><p>The remarks must be 3 to 64 characters in length.</p>
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
     * <li><p>This parameter is available only if <strong>LocalTopic</strong> is set to <strong>true</strong>.</p>
     * </li>
     * <li><p>The value must be an integer from 1 to 3.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you set the number of replicas to <strong>1</strong>, you may lose data. Set this parameter with caution.</p>
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
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateTopicRequestTag> tag;

    /**
     * <p>The name of the topic.</p>
     * <ul>
     * <li><p>Reserved instance: The name can contain uppercase letters, lowercase letters, digits, underscores (_), hyphens (-), and periods (.). The name must be 3 to 64 characters in length.</p>
     * </li>
     * <li><p>Serverless instance: The name can contain uppercase letters, lowercase letters, digits, underscores (_), hyphens (-), and periods (.). The name must be 1 to 249 characters in length.</p>
     * </li>
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
         * <li><p>N specifies the number of the tag. The value of N must be an integer from 1 to 20.</p>
         * </li>
         * <li><p>If this parameter is left empty, all tag keys are matched.</p>
         * </li>
         * <li><p>The tag key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
         * <li><p>N specifies the number of the tag. The value of N must be an integer from 1 to 20.</p>
         * </li>
         * <li><p>The tag value can be empty.</p>
         * </li>
         * <li><p>The tag value can be up to 128 characters in length. It cannot start with aliyun or acs:, and cannot contain http\:// or https\://.</p>
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
