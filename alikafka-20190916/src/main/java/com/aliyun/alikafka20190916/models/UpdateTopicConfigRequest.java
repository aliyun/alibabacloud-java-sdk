// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpdateTopicConfigRequest extends TeaModel {
    /**
     * <p>The key of the topic configuration.</p>
     * <ul>
     * <li>ApsaraMQ for Kafka V2 instances allow you to modify configurations only for topics that use local storage.</li>
     * <li>ApsaraMQ for Kafka V3 instances allow you to modify configurations for all topics.</li>
     * <li>The following keys are supported by <code>local topic</code> of ApsaraMQ for Kafka V2 instances: retention.ms, retention.bytes, and replications.</li>
     * <li>The following keys are supported by ApsaraMQ for Kafka V3 instances: retention.hours and max.message.bytes.</li>
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
     * <p>The configuration item that you want to update for the topic. The following configuration items are supported by ApsaraMQ for Kafka V3 instances:</p>
     * <ul>
     * <li><code>retention.hours</code> specifies the message retention period. Value type: string. Valid values: 24 to 8760.</li>
     * <li><code>max.message.bytes</code> specifies the maximum size of a sent message. Value type: string. Valid values: 1048576 to 10485760.</li>
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
