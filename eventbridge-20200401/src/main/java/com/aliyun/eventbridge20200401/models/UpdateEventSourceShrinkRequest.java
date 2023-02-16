// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateEventSourceShrinkRequest extends TeaModel {
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

    public static UpdateEventSourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventSourceShrinkRequest self = new UpdateEventSourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEventSourceShrinkRequest setDescription(byte[] description) {
        this.description = description;
        return this;
    }
    public byte[] getDescription() {
        return this.description;
    }

    public UpdateEventSourceShrinkRequest setEventBusName(byte[] eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public byte[] getEventBusName() {
        return this.eventBusName;
    }

    public UpdateEventSourceShrinkRequest setEventSourceName(byte[] eventSourceName) {
        this.eventSourceName = eventSourceName;
        return this;
    }
    public byte[] getEventSourceName() {
        return this.eventSourceName;
    }

    public UpdateEventSourceShrinkRequest setSourceHttpEventParametersShrink(String sourceHttpEventParametersShrink) {
        this.sourceHttpEventParametersShrink = sourceHttpEventParametersShrink;
        return this;
    }
    public String getSourceHttpEventParametersShrink() {
        return this.sourceHttpEventParametersShrink;
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

}
