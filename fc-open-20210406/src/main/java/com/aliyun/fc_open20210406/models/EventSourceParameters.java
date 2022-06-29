// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class EventSourceParameters extends TeaModel {
    @NameInMap("sourceMNSParameters")
    public SourceMNSParameters sourceMNSParameters;

    @NameInMap("sourceRabbitMQParameters")
    public SourceRabbitMQParameters sourceRabbitMQParameters;

    @NameInMap("sourceRocketMQParameters")
    public SourceRocketMQParameters sourceRocketMQParameters;

    public static EventSourceParameters build(java.util.Map<String, ?> map) throws Exception {
        EventSourceParameters self = new EventSourceParameters();
        return TeaModel.build(map, self);
    }

    public EventSourceParameters setSourceMNSParameters(SourceMNSParameters sourceMNSParameters) {
        this.sourceMNSParameters = sourceMNSParameters;
        return this;
    }
    public SourceMNSParameters getSourceMNSParameters() {
        return this.sourceMNSParameters;
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
