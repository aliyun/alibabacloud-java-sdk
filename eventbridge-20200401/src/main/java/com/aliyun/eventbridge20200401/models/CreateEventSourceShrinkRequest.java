// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateEventSourceShrinkRequest extends TeaModel {
    /**
     * <p>事件源描述详情</p>
     */
    @NameInMap("Description")
    public byte[] description;

    @NameInMap("EventBusName")
    public byte[] eventBusName;

    /**
     * <p>事件源英文Code</p>
     */
    @NameInMap("EventSourceName")
    public byte[] eventSourceName;

    @NameInMap("SourceHttpEventParameters")
    public String sourceHttpEventParametersShrink;

    @NameInMap("SourceMNSParameters")
    public String sourceMNSParametersShrink;

    @NameInMap("SourceRabbitMQParameters")
    public String sourceRabbitMQParametersShrink;

    @NameInMap("SourceRocketMQParameters")
    public String sourceRocketMQParametersShrink;

    /**
     * <p>SourceSLSParameters</p>
     */
    @NameInMap("SourceSLSParameters")
    public String sourceSLSParametersShrink;

    public static CreateEventSourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEventSourceShrinkRequest self = new CreateEventSourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateEventSourceShrinkRequest setDescription(byte[] description) {
        this.description = description;
        return this;
    }
    public byte[] getDescription() {
        return this.description;
    }

    public CreateEventSourceShrinkRequest setEventBusName(byte[] eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public byte[] getEventBusName() {
        return this.eventBusName;
    }

    public CreateEventSourceShrinkRequest setEventSourceName(byte[] eventSourceName) {
        this.eventSourceName = eventSourceName;
        return this;
    }
    public byte[] getEventSourceName() {
        return this.eventSourceName;
    }

    public CreateEventSourceShrinkRequest setSourceHttpEventParametersShrink(String sourceHttpEventParametersShrink) {
        this.sourceHttpEventParametersShrink = sourceHttpEventParametersShrink;
        return this;
    }
    public String getSourceHttpEventParametersShrink() {
        return this.sourceHttpEventParametersShrink;
    }

    public CreateEventSourceShrinkRequest setSourceMNSParametersShrink(String sourceMNSParametersShrink) {
        this.sourceMNSParametersShrink = sourceMNSParametersShrink;
        return this;
    }
    public String getSourceMNSParametersShrink() {
        return this.sourceMNSParametersShrink;
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

}
