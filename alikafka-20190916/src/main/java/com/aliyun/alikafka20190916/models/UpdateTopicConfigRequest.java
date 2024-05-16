// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpdateTopicConfigRequest extends TeaModel {
    /**
     * <p>The key of the topic configuration.</p>
     * <br>
     * <p>*   ApsaraMQ for Kafka V2 instances allow you to modify configurations only for topics that use local storage.</p>
     * <p>*   ApsaraMQ for Kafka V3 instances allow you to modify configurations for all topics.</p>
     * <p>*   The following keys are supported by `local topic` of ApsaraMQ for Kafka V2 instances: retention.ms, retention.bytes, and replications.</p>
     * <p>*   The following keys are supported by ApsaraMQ for Kafka V3 instances: retention.hours and max.message.bytes.</p>
     * <br>
     * <p>This parameter is required.</p>
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
     * <p>The ID of the region where the instance resides.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The topic name.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Topic")
    public String topic;

    /**
     * <p>The configuration item that you want to update for the topic. The following configuration items are supported by ApsaraMQ for Kafka V3 instances:</p>
     * <br>
     * <p>*   `retention.hours` specifies the message retention period. Value type: string. Valid values: 24 to 8760.</p>
     * <p>*   `max.message.bytes` specifies the maximum size of a sent message. Value type: string. Valid values: 1048576 to 10485760.</p>
     * <br>
     * <p>This parameter is required.</p>
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
