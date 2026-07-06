// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpdateTopicConfigRequest extends TeaModel {
    /**
     * <p>The key of the topic configuration.</p>
     * <ul>
     * <li><p>You can modify the configurations only for topics that use the local storage engine on reserved instances. You cannot modify the configurations for topics that use the cloud storage engine.</p>
     * </li>
     * <li><p>You can modify the configurations of topics for Serverless instances.</p>
     * </li>
     * <li><p>For <code>local topics</code> on reserved instances, the supported keys are \<code>retention.ms\\</code>, \<code>max.message.bytes\\</code>, \<code>message.timestamp.type\\</code>, and \<code>message.timestamp.difference.max.ms\\</code>.</p>
     * </li>
     * <li><p>For Serverless instances, the supported keys are \<code>retention.hours\\</code>, \<code>max.message.bytes\\</code>, \<code>message.timestamp.type\\</code>, and \<code>message.timestamp.difference.max.ms\\</code>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>retention.ms</p>
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
     * <p>The region ID of the instance.</p>
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
     * <li><p>The following configurations are supported for Serverless instances:</p>
     * <ul>
     * <li><p><code>retention.hours</code> specifies the message retention period. The value must be a string. The value must be in the range of 24 to 8,760.</p>
     * </li>
     * <li><p><code>max.message.bytes</code> specifies the maximum message size. The value must be a string. The value must be in the range of 1,048,576 to 10,485,760.</p>
     * </li>
     * <li><p><code>message.timestamp.type</code> specifies the message timestamp type. \<code>CreateTime\\</code> indicates the timestamp that is specified by the producer when the message is sent. If no timestamp is specified, the time when the message is created on the client is used. \<code>LogAppendTime\\</code> indicates the time when the message is stored on the server. Valid values: \<code>CreateTime\\</code> and \<code>LogAppendTime\\</code>.</p>
     * </li>
     * <li><p><code>message.timestamp.difference.max.ms</code> specifies the maximum allowed difference between the timestamp of the server that receives the message and the timestamp specified in the message. If \<code>message.timestamp.type\\</code> is set to \<code>CreateTime\\</code> and the time difference exceeds this threshold, <strong>the message is rejected</strong>. This configuration does not take effect if \<code>message.timestamp.type\\</code> is set to \<code>LogAppendTime\\</code>.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>The following configurations are supported for reserved instances:</p>
     * <ul>
     * <li><p><code>retention.ms</code> specifies the message retention period. The value must be a string. The value must be in the range of 3,600,000 to 31,536,000,000.</p>
     * </li>
     * <li><p><code>max.message.bytes</code> specifies the maximum message size. The value must be a string. The value must be in the range of 1,048,576 to 10,485,760.</p>
     * </li>
     * <li><p><code>message.timestamp.type</code> specifies the message timestamp type. \<code>CreateTime\\</code> indicates the timestamp that is specified by the producer when the message is sent. If no timestamp is specified, the time when the message is created on the client is used. \<code>LogAppendTime\\</code> indicates the time when the message is stored on the server. Valid values: \<code>CreateTime\\</code> and \<code>LogAppendTime\\</code>.</p>
     * </li>
     * <li><p><code>message.timestamp.difference.max.ms</code> specifies the maximum allowed difference between the timestamp of the server that receives the message and the timestamp specified in the message. If \<code>message.timestamp.type\\</code> is set to \<code>CreateTime\\</code> and the time difference exceeds this threshold, <strong>the message is rejected</strong>. This configuration does not take effect if \<code>message.timestamp.type\\</code> is set to \<code>LogAppendTime\\</code>.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3600000</p>
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
