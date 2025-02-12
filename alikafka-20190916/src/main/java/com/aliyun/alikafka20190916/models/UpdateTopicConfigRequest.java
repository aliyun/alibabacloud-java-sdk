// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpdateTopicConfigRequest extends TeaModel {
    /**
     * <p>The key of the topic configuration.</p>
     * <ul>
     * <li>For reserved instances, you can modify only the configurations of the topics that use local storage.</li>
     * <li>For serverless instances, you can modify the configurations of all topics.</li>
     * <li>Reserved instances whose topics use local storage support the following keys: retention.ms, max.message.bytes, replications, message.timestamp.type, and message.timestamp.difference.max.ms.``</li>
     * <li>Serverless instances support the following keys: retention.hours, max.message.bytes, message.timestamp.type, message.timestamp.difference.max.ms.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>replications</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_post-cn-v0h1fgs2****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the region where the instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The topic name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dqc_test2</p>
     */
    @NameInMap("Topic")
    public String topic;

    /**
     * <p>The value of the topic configuration.</p>
     * <ul>
     * <li><p>Serverless instances support the following values:</p>
     * <ul>
     * <li><code>retention.hours</code>: the message retention period. Value type: string. Valid values: 24 to 8760.</li>
     * <li><code>max.message.bytes</code>: the maximum size of a sent message. Value type: string. Valid values: 1048576 to 10485760.</li>
     * <li><code>message.timestamp.type</code>: the timestamp type of a message. Valid values: CreateTime and LogAppendTime. The value CreateTime specifies the timestamp that is specified by the producer when the message is sent. The value LogAppendTime specifies the time when the broker appends the message to its log. If you do not specify this parameter, the time when the message is created on the client is used.</li>
     * <li><code>message.timestamp.difference.max.ms</code>: the maximum positive or negative difference allowed between the timestamp when the broker receives a message and the timestamp specified in the message. If you set message.timestamp.type to CreateTime, <strong>a message is rejected</strong> if the difference in timestamp exceeds the threshold. If you set message.timestamp.type to LogAppendTime, this configuration does not take effect.</li>
     * </ul>
     * </li>
     * <li><p>Reserved instances support the following values:</p>
     * <ul>
     * <li><code>retention.ms</code>: the message retention period. Value type: string. Valid values: 3600000 to 31536000000.</li>
     * <li><code>max.message.bytes</code>: the maximum size of a sent message. Value type: string. Valid values: 1048576 to 10485760.</li>
     * <li><code>replications</code>: the number of replicas. Value type: string. Valid values: 1 to 3.</li>
     * <li><code>message.timestamp.type</code>: the timestamp type of a message. Valid values: CreateTime and LogAppendTime. The value CreateTime specifies the timestamp that is specified by the producer when the message is sent. The value LogAppendTime specifies the time when the broker appends the message to its log. If you do not specify this parameter, the time when the message is created on the client is used.</li>
     * <li><code>message.timestamp.difference.max.ms</code>: the maximum positive or negative difference allowed between the timestamp when the broker receives a message and the timestamp specified in the message. If you set message.timestamp.type to CreateTime, <strong>a message is rejected</strong> if the difference in timestamp exceeds the threshold. If you set message.timestamp.type to LogAppendTime, this configuration does not take effect.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Value")
    public String value;

    public static UpdateTopicConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTopicConfigRequest self = new UpdateTopicConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTopicConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateTopicConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateTopicConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateTopicConfigRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public UpdateTopicConfigRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
