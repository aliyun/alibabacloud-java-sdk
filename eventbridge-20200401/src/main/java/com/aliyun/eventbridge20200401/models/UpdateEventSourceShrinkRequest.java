// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateEventSourceShrinkRequest extends TeaModel {
    /**
     * <p>The description of the event source.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The event bus with which the event source is associated.</p>
     */
    @NameInMap("EventBusName")
    public String eventBusName;

    /**
     * <p>The name of the event source.</p>
     */
    @NameInMap("EventSourceName")
    public String eventSourceName;

    /**
     * <p>The parameters that are configured if the event source is HTTP events.</p>
     */
    @NameInMap("SourceHttpEventParameters")
    public String sourceHttpEventParametersShrink;

    /**
     * <p>The parameters that are configured if the event source is Message Queue for Apache Kafka.</p>
     */
    @NameInMap("SourceKafkaParameters")
    public String sourceKafkaParametersShrink;

    /**
     * <p>The parameters that are configured if the event source is Message Service (MNS).</p>
     */
    @NameInMap("SourceMNSParameters")
    public String sourceMNSParametersShrink;

    /**
     * <p>The parameters that are configured if the event source is Message Queue for RabbitMQ.</p>
     */
    @NameInMap("SourceRabbitMQParameters")
    public String sourceRabbitMQParametersShrink;

    /**
     * <p>The parameters that are configured if the event source is Message Queue for Apache RocketMQ.</p>
     */
    @NameInMap("SourceRocketMQParameters")
    public String sourceRocketMQParametersShrink;

    /**
     * <p>SourceSLSParameters</p>
     */
    @NameInMap("SourceSLSParameters")
    public String sourceSLSParametersShrink;

    /**
     * <p>The parameters that are configured if the event source is scheduled events.</p>
     */
    @NameInMap("SourceScheduledEventParameters")
    public String sourceScheduledEventParametersShrink;

    public static UpdateEventSourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventSourceShrinkRequest self = new UpdateEventSourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEventSourceShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateEventSourceShrinkRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

    public UpdateEventSourceShrinkRequest setEventSourceName(String eventSourceName) {
        this.eventSourceName = eventSourceName;
        return this;
    }
    public String getEventSourceName() {
        return this.eventSourceName;
    }

    public UpdateEventSourceShrinkRequest setSourceHttpEventParametersShrink(String sourceHttpEventParametersShrink) {
        this.sourceHttpEventParametersShrink = sourceHttpEventParametersShrink;
        return this;
    }
    public String getSourceHttpEventParametersShrink() {
        return this.sourceHttpEventParametersShrink;
    }

    public UpdateEventSourceShrinkRequest setSourceKafkaParametersShrink(String sourceKafkaParametersShrink) {
        this.sourceKafkaParametersShrink = sourceKafkaParametersShrink;
        return this;
    }
    public String getSourceKafkaParametersShrink() {
        return this.sourceKafkaParametersShrink;
    }

    public UpdateEventSourceShrinkRequest setSourceMNSParametersShrink(String sourceMNSParametersShrink) {
        this.sourceMNSParametersShrink = sourceMNSParametersShrink;
        return this;
    }
    public String getSourceMNSParametersShrink() {
        return this.sourceMNSParametersShrink;
    }

    public UpdateEventSourceShrinkRequest setSourceRabbitMQParametersShrink(String sourceRabbitMQParametersShrink) {
        this.sourceRabbitMQParametersShrink = sourceRabbitMQParametersShrink;
        return this;
    }
    public String getSourceRabbitMQParametersShrink() {
        return this.sourceRabbitMQParametersShrink;
    }

    public UpdateEventSourceShrinkRequest setSourceRocketMQParametersShrink(String sourceRocketMQParametersShrink) {
        this.sourceRocketMQParametersShrink = sourceRocketMQParametersShrink;
        return this;
    }
    public String getSourceRocketMQParametersShrink() {
        return this.sourceRocketMQParametersShrink;
    }

    public UpdateEventSourceShrinkRequest setSourceSLSParametersShrink(String sourceSLSParametersShrink) {
        this.sourceSLSParametersShrink = sourceSLSParametersShrink;
        return this;
    }
    public String getSourceSLSParametersShrink() {
        return this.sourceSLSParametersShrink;
    }

    public UpdateEventSourceShrinkRequest setSourceScheduledEventParametersShrink(String sourceScheduledEventParametersShrink) {
        this.sourceScheduledEventParametersShrink = sourceScheduledEventParametersShrink;
        return this;
    }
    public String getSourceScheduledEventParametersShrink() {
        return this.sourceScheduledEventParametersShrink;
    }

}
