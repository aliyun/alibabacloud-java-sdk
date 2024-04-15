// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class EventSourceParameters extends TeaModel {
    @NameInMap("sourceDTSParameters")
    public SourceDTSParameters sourceDTSParameters;

    @NameInMap("sourceKafkaParameters")
    public SourceKafkaParameters sourceKafkaParameters;

    @NameInMap("sourceMNSParameters")
    public SourceMNSParameters sourceMNSParameters;

    @NameInMap("sourceMQTTParameters")
    public SourceMQTTParameters sourceMQTTParameters;

    @NameInMap("sourceRabbitMQParameters")
    public SourceRabbitMQParameters sourceRabbitMQParameters;

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
