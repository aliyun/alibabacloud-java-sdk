// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpdateTopicConfigRequest extends TeaModel {
    /**
     * <p>The key of the topic configuration.</p>
     * <br>
     * <p>*   Valid values: retention.hours, max.message.bytes, and replications.</p>
     * <p>*   retention.hours specifies the message retention period.</p>
     * <p>*   max.message.bytes specifies the maximum size of a sent message.</p>
     * <p>*   replications specifies the number of topic replicas.</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the region where the instance resides.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The topic name.</p>
     */
    @NameInMap("Topic")
    public String topic;

    /**
     * <p>The value of the topic configuration.</p>
     * <br>
     * <p>*   retention.hours specifies the message retention period. The value is a string. Valid values: 24 to 8760.</p>
     * <p>*   max.message.bytes specifies the maximum size of a sent message. The value is a string. Valid values: 1048576 to 10485760.</p>
     * <p>*   replications specifies the number of topic replicas. The value is a string. Valid values: 1 to 3.</p>
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
