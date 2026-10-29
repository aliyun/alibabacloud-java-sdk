// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateEventSourceShrinkRequest extends TeaModel {
    /**
     * <p>The description of the event source.</p>
     * 
     * <strong>example:</strong>
     * <p>Event source of the RabbitMQ type</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the associated event bus.</p>
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
     * <p>myrabbitmq.source</p>
     */
    @NameInMap("EventSourceName")
    public String eventSourceName;

    /**
     * <p>The external data source configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;ConsumePosition\&quot;:\&quot;end\&quot;,\&quot;LogStore\&quot;:\&quot;oss_log\&quot;,\&quot;Project\&quot;:\&quot;slsaudit-center-5795350335281001-cn-beijing\&quot;,\&quot;RoleName\&quot;:\&quot;sls-beijing-tf\&quot;}</p>
     */
    @NameInMap("ExternalSourceConfig")
    public String externalSourceConfigShrink;

    /**
     * <p>The type of the external data source.</p>
     * 
     * <strong>example:</strong>
     * <p>SLS</p>
     */
    @NameInMap("ExternalSourceType")
    public String externalSourceType;

    /**
     * <p>Specifies whether to connect to an external data source.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("LinkedExternalSource")
    public Boolean linkedExternalSource;

    /**
     * <p>The SourceHttpEventParameters request parameter.</p>
     */
    @NameInMap("SourceHttpEventParameters")
    public String sourceHttpEventParametersShrink;

    /**
     * <p>The SourceKafkaParameters request parameter.</p>
     */
    @NameInMap("SourceKafkaParameters")
    public String sourceKafkaParametersShrink;

    /**
     * <p>The parameters for a Simple Message Queue (formerly MNS) event source.</p>
     */
    @NameInMap("SourceMNSParameters")
    public String sourceMNSParametersShrink;

    /**
     * <p>The parameters for an OSS event source.</p>
     */
    @NameInMap("SourceOSSEventParameters")
    public String sourceOSSEventParametersShrink;

    /**
     * <p>The SourceRabbitMQParameters request parameter.</p>
     */
    @NameInMap("SourceRabbitMQParameters")
    public String sourceRabbitMQParametersShrink;

    /**
     * <p>The SourceRocketMQParameters request parameter.</p>
     */
    @NameInMap("SourceRocketMQParameters")
    public String sourceRocketMQParametersShrink;

    /**
     * <p>The parameters for a Simple Log Service event source.</p>
     */
    @NameInMap("SourceSLSParameters")
    public String sourceSLSParametersShrink;

    /**
     * <p>The SourceScheduledEventParameters request parameter.</p>
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

    public UpdateEventSourceShrinkRequest setExternalSourceConfigShrink(String externalSourceConfigShrink) {
        this.externalSourceConfigShrink = externalSourceConfigShrink;
        return this;
    }
    public String getExternalSourceConfigShrink() {
        return this.externalSourceConfigShrink;
    }

    public UpdateEventSourceShrinkRequest setExternalSourceType(String externalSourceType) {
        this.externalSourceType = externalSourceType;
        return this;
    }
    public String getExternalSourceType() {
        return this.externalSourceType;
    }

    public UpdateEventSourceShrinkRequest setLinkedExternalSource(Boolean linkedExternalSource) {
        this.linkedExternalSource = linkedExternalSource;
        return this;
    }
    public Boolean getLinkedExternalSource() {
        return this.linkedExternalSource;
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

    public UpdateEventSourceShrinkRequest setSourceOSSEventParametersShrink(String sourceOSSEventParametersShrink) {
        this.sourceOSSEventParametersShrink = sourceOSSEventParametersShrink;
        return this;
    }
    public String getSourceOSSEventParametersShrink() {
        return this.sourceOSSEventParametersShrink;
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
