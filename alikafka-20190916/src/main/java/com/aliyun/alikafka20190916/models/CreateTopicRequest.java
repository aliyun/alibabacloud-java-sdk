// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreateTopicRequest extends TeaModel {
    /**
     * <p>The number of replicas for the topic.</p>
     * <br>
     * <p>*   This parameter is available only when the **LocalTopic** parameter is set to **true**\<props="local_disk">, or the **edition of the instance** is **Open Source Edition (Local Disk)**.</p>
     * <p>*   Valid values: 1 to 3.</p>
     * <br>
     * <p>> If you set this parameter to **1**, the risk of data loss increases. Exercise caution when you configure this parameter.</p>
     */
    @NameInMap("CompactTopic")
    public Boolean compactTopic;

    /**
     * <p>The status code returned. The status code 200 indicates that the request is successful.</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The region ID of the instance in which you want to create a topic.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Additional configurations.</p>
     * <br>
     * <p>*   The value of this parameter must be in JSON format.</p>
     * <p>*   The key must be **replications**. The value specifies the number of replicas for the topic. The value must be an integer that ranges from 1 to 3.</p>
     * <p>*   This parameter is available only when the **LocalTopic** parameter is set to **true**\<props="local_disk">, or the **edition of the instance** is **Open Source Edition (Local Disk)**.</p>
     * <br>
     * <p>> If you configure this parameter, the **ReplicationFactor** parameter does not take effect.</p>
     */
    @NameInMap("LocalTopic")
    public Boolean localTopic;

    /**
     * <p>The value of tag N to add to the resource.</p>
     * <br>
     * <p>*   Valid values of N: 1 to 20.</p>
     * <p>*   This parameter can be left empty.</p>
     * <p>*   A tag value can be 1 to 128 characters in length and cannot start with acs: or aliyun or contain [http:// or https://.](http://https://。)</p>
     */
    @NameInMap("MinInsyncReplicas")
    public Long minInsyncReplicas;

    /**
     * <p>The minimum number of in-sync replicas (ISRs).</p>
     * <br>
     * <p>*   This parameter is available only when the **LocalTopic** parameter is set to **true**\<props="local_disk">, or the **edition of the instance** is **Open Source Edition (Local Disk)**.</p>
     * <p>*   The value of this parameter must be smaller than the value of the ReplicationFactor parameter.</p>
     * <p>*   Valid values: 1 to 3.</p>
     */
    @NameInMap("PartitionNum")
    public String partitionNum;

    /**
     * <p>Specifies whether the topic uses local storage. Valid values:</p>
     * <br>
     * <p>*   false: The topic uses cloud storage.</p>
     * <p>*   true: The topic uses local storage.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of partitions in the topic.</p>
     * <br>
     * <p>*   Valid values: 1 to 360.</p>
     * <p>*   In the Message Queue for Apache Kafka console, you can view the number of partitions that the system recommends based on the specification of the instance. We recommend that you specify the number that is recommended by the system as the value of this parameter to reduce the risk of data skew.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The key of tag N to add to the resource.</p>
     * <br>
     * <p>*   Valid values of N: 1 to 20.</p>
     * <p>*   If this parameter is left empty, the keys of all tags are matched.</p>
     * <p>*   A tag key can be up to 128 characters in length and cannot start with acs: or aliyun or contain [http:// or https://.](http://https://。)</p>
     */
    @NameInMap("ReplicationFactor")
    public Long replicationFactor;

    @NameInMap("Tag")
    public java.util.List<CreateTopicRequestTag> tag;

    /**
     * <p>The log cleanup policy that is used for the topic. This parameter is available only when the LocalTopic parameter is set to true. Valid values:</p>
     * <br>
     * <p>*   false: The topic uses the delete policy.</p>
     * <p>*   true: The topic uses the compact policy.</p>
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
        @NameInMap("Key")
        public String key;

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
