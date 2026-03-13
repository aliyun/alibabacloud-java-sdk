// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class EventSourceParameters extends TeaModel {
    /**
     * <p>The custom configurations when the event source is Data Transmission Service (DTS).</p>
     */
    @NameInMap("sourceDTSParameters")
    public SourceDTSParameters sourceDTSParameters;

    /**
     * <p>The custom configurations when the event source is ApsaraMQ for Kafka.</p>
     */
    @NameInMap("sourceKafkaParameters")
    public SourceKafkaParameters sourceKafkaParameters;

    /**
     * <p>The custom configurations when the event source is Simple Message Queue (formerly MNS).</p>
     */
    @NameInMap("sourceMNSParameters")
    public SourceMNSParameters sourceMNSParameters;

    /**
     * <p>The custom configurations when the event source is ApsaraMQ for MQTT.</p>
     */
    @NameInMap("sourceMQTTParameters")
    public SourceMQTTParameters sourceMQTTParameters;

    /**
     * <p>The custom configurations when the event source is ApsaraMQ for RabbitMQ.</p>
     */
    @NameInMap("sourceRabbitMQParameters")
    public SourceRabbitMQParameters sourceRabbitMQParameters;

    /**
     * <p>The custom configurations when the event source is ApsaraMQ for RocketMQ.</p>
     */
    @NameInMap("sourceRocketMQParameters")
    public SourceRocketMQParameters sourceRocketMQParameters;

    public static EventSourceParameters build(java.util.Map<String, ?> map) throws Exception {
        EventSourceParameters self = new EventSourceParameters();
        return TeaModel.build(map, self);
    }

    public EventSourceParameters setSourceDTSParameters(SourceDTSParameters sourceDTSParameters) {
        this.sourceDTSParameters = sourceDTSParameters;
        return this;
    }
    public SourceDTSParameters getSourceDTSParameters() {
        return this.sourceDTSParameters;
    }

    public EventSourceParameters setSourceKafkaParameters(SourceKafkaParameters sourceKafkaParameters) {
        this.sourceKafkaParameters = sourceKafkaParameters;
        return this;
    }
    public SourceKafkaParameters getSourceKafkaParameters() {
        return this.sourceKafkaParameters;
    }

    public EventSourceParameters setSourceMNSParameters(SourceMNSParameters sourceMNSParameters) {
        this.sourceMNSParameters = sourceMNSParameters;
        return this;
    }
    public SourceMNSParameters getSourceMNSParameters() {
        return this.sourceMNSParameters;
    }

    public EventSourceParameters setSourceMQTTParameters(SourceMQTTParameters sourceMQTTParameters) {
        this.sourceMQTTParameters = sourceMQTTParameters;
        return this;
    }
    public SourceMQTTParameters getSourceMQTTParameters() {
        return this.sourceMQTTParameters;
    }

    public EventSourceParameters setSourceRabbitMQParameters(SourceRabbitMQParameters sourceRabbitMQParameters) {
        this.sourceRabbitMQParameters = sourceRabbitMQParameters;
        return this;
    }
    public SourceRabbitMQParameters getSourceRabbitMQParameters() {
        return this.sourceRabbitMQParameters;
    }

    public EventSourceParameters setSourceRocketMQParameters(SourceRocketMQParameters sourceRocketMQParameters) {
        this.sourceRocketMQParameters = sourceRocketMQParameters;
        return this;
    }
    public SourceRocketMQParameters getSourceRocketMQParameters() {
        return this.sourceRocketMQParameters;
    }

}
