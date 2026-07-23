// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateEventSourceShrinkRequest extends TeaModel {
    /**
     * <p>The description of the event source.</p>
     * 
     * <strong>example:</strong>
     * <p>RabbitMQ event source</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the event bus associated with the event source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-event-bus</p>
     */
    @NameInMap("EventBusName")
    public String eventBusName;

    /**
     * <p>The name of the event source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myrabbitmq.sourc</p>
     */
    @NameInMap("EventSourceName")
    public String eventSourceName;

    /**
     * <p>The configuration of the external data source.</p>
     */
    @NameInMap("ExternalSourceConfig")
    public String externalSourceConfigShrink;

    /**
     * <p>The type of the external data source.</p>
     * 
     * <strong>example:</strong>
     * <p>RabbitMQ</p>
     */
    @NameInMap("ExternalSourceType")
    public byte[] externalSourceType;

    /**
     * <p>Specifies whether to connect to an external data source.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("LinkedExternalSource")
    public Boolean linkedExternalSource;

    /**
     * <p>Parameters for an HTTP endpoint event source.</p>
     */
    @NameInMap("SourceHttpEventParameters")
    public String sourceHttpEventParametersShrink;

    /**
     * <p>Parameters for the Message Queue for Apache Kafka event source.</p>
     */
    @NameInMap("SourceKafkaParameters")
    public String sourceKafkaParametersShrink;

    /**
     * <p>Parameters for the Message Service (MNS) event source. The <code>RegionId</code>, <code>IsBase64Decode</code>, and <code>QueueName</code> parameters are required for this type.</p>
     */
    @NameInMap("SourceMNSParameters")
    public String sourceMNSParametersShrink;

    /**
     * <p>Parameters for the Object Storage Service (OSS) event source.</p>
     */
    @NameInMap("SourceOSSEventParameters")
    public String sourceOSSEventParametersShrink;

    /**
     * <p>Parameters for the Message Queue for RabbitMQ event source.</p>
     */
    @NameInMap("SourceRabbitMQParameters")
    public String sourceRabbitMQParametersShrink;

    /**
     * <p>Parameters for the Message Queue for Apache RocketMQ event source.</p>
     */
    @NameInMap("SourceRocketMQParameters")
    public String sourceRocketMQParametersShrink;

    /**
     * <p>Parameters for the Simple Log Service (SLS) event source.</p>
     */
    @NameInMap("SourceSLSParameters")
    public String sourceSLSParametersShrink;

    /**
     * <p>Parameters for a scheduled event source.</p>
     */
    @NameInMap("SourceScheduledEventParameters")
    public String sourceScheduledEventParametersShrink;

    public static CreateEventSourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEventSourceShrinkRequest self = new CreateEventSourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateEventSourceShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEventSourceShrinkRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

    public CreateEventSourceShrinkRequest setEventSourceName(String eventSourceName) {
        this.eventSourceName = eventSourceName;
        return this;
    }
    public String getEventSourceName() {
        return this.eventSourceName;
    }

    public CreateEventSourceShrinkRequest setExternalSourceConfigShrink(String externalSourceConfigShrink) {
        this.externalSourceConfigShrink = externalSourceConfigShrink;
        return this;
    }
    public String getExternalSourceConfigShrink() {
        return this.externalSourceConfigShrink;
    }

    public CreateEventSourceShrinkRequest setExternalSourceType(byte[] externalSourceType) {
        this.externalSourceType = externalSourceType;
        return this;
    }
    public byte[] getExternalSourceType() {
        return this.externalSourceType;
    }

    public CreateEventSourceShrinkRequest setLinkedExternalSource(Boolean linkedExternalSource) {
        this.linkedExternalSource = linkedExternalSource;
        return this;
    }
    public Boolean getLinkedExternalSource() {
        return this.linkedExternalSource;
    }

    public CreateEventSourceShrinkRequest setSourceHttpEventParametersShrink(String sourceHttpEventParametersShrink) {
        this.sourceHttpEventParametersShrink = sourceHttpEventParametersShrink;
        return this;
    }
    public String getSourceHttpEventParametersShrink() {
        return this.sourceHttpEventParametersShrink;
    }

    public CreateEventSourceShrinkRequest setSourceKafkaParametersShrink(String sourceKafkaParametersShrink) {
        this.sourceKafkaParametersShrink = sourceKafkaParametersShrink;
        return this;
    }
    public String getSourceKafkaParametersShrink() {
        return this.sourceKafkaParametersShrink;
    }

    public CreateEventSourceShrinkRequest setSourceMNSParametersShrink(String sourceMNSParametersShrink) {
        this.sourceMNSParametersShrink = sourceMNSParametersShrink;
        return this;
    }
    public String getSourceMNSParametersShrink() {
        return this.sourceMNSParametersShrink;
    }

    public CreateEventSourceShrinkRequest setSourceOSSEventParametersShrink(String sourceOSSEventParametersShrink) {
        this.sourceOSSEventParametersShrink = sourceOSSEventParametersShrink;
        return this;
    }
    public String getSourceOSSEventParametersShrink() {
        return this.sourceOSSEventParametersShrink;
    }

    public CreateEventSourceShrinkRequest setSourceRabbitMQParametersShrink(String sourceRabbitMQParametersShrink) {
        this.sourceRabbitMQParametersShrink = sourceRabbitMQParametersShrink;
        return this;
    }
    public String getSourceRabbitMQParametersShrink() {
        return this.sourceRabbitMQParametersShrink;
    }

    public CreateEventSourceShrinkRequest setSourceRocketMQParametersShrink(String sourceRocketMQParametersShrink) {
        this.sourceRocketMQParametersShrink = sourceRocketMQParametersShrink;
        return this;
    }
    public String getSourceRocketMQParametersShrink() {
        return this.sourceRocketMQParametersShrink;
    }

    public CreateEventSourceShrinkRequest setSourceSLSParametersShrink(String sourceSLSParametersShrink) {
        this.sourceSLSParametersShrink = sourceSLSParametersShrink;
        return this;
    }
    public String getSourceSLSParametersShrink() {
        return this.sourceSLSParametersShrink;
    }

    public CreateEventSourceShrinkRequest setSourceScheduledEventParametersShrink(String sourceScheduledEventParametersShrink) {
        this.sourceScheduledEventParametersShrink = sourceScheduledEventParametersShrink;
        return this;
    }
    public String getSourceScheduledEventParametersShrink() {
        return this.sourceScheduledEventParametersShrink;
    }

}
