// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateEventStreamingShrinkRequest extends TeaModel {
    /**
     * <p>The description of the event stream.</p>
     * 
     * <strong>example:</strong>
     * <p>rocketmq2mns</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the event stream.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myeventstreaming</p>
     */
    @NameInMap("EventStreamingName")
    public String eventStreamingName;

    /**
     * <p>The rule that is used to filter events. If you leave this parameter empty, all events are matched.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FilterPattern")
    public String filterPattern;

    /**
     * <p>The parameters that are configured for the runtime environment.</p>
     */
    @NameInMap("RunOptions")
    public String runOptionsShrink;

    /**
     * <p>The event target. You must and can specify only one event target.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Sink")
    public String sinkShrink;

    /**
     * <p>The event provider, which is also known as the event source. You must and can specify only one event source.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Source")
    public String sourceShrink;

    @NameInMap("Tags")
    public java.util.List<CreateEventStreamingShrinkRequestTags> tags;

    @NameInMap("Transforms")
    public String transformsShrink;

    public static CreateEventStreamingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEventStreamingShrinkRequest self = new CreateEventStreamingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateEventStreamingShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEventStreamingShrinkRequest setEventStreamingName(String eventStreamingName) {
        this.eventStreamingName = eventStreamingName;
        return this;
    }
    public String getEventStreamingName() {
        return this.eventStreamingName;
    }

    public CreateEventStreamingShrinkRequest setFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
        return this;
    }
    public String getFilterPattern() {
        return this.filterPattern;
    }

    public CreateEventStreamingShrinkRequest setRunOptionsShrink(String runOptionsShrink) {
        this.runOptionsShrink = runOptionsShrink;
        return this;
    }
    public String getRunOptionsShrink() {
        return this.runOptionsShrink;
    }

    public CreateEventStreamingShrinkRequest setSinkShrink(String sinkShrink) {
        this.sinkShrink = sinkShrink;
        return this;
    }
    public String getSinkShrink() {
        return this.sinkShrink;
    }

    public CreateEventStreamingShrinkRequest setSourceShrink(String sourceShrink) {
        this.sourceShrink = sourceShrink;
        return this;
    }
    public String getSourceShrink() {
        return this.sourceShrink;
    }

    public CreateEventStreamingShrinkRequest setTags(java.util.List<CreateEventStreamingShrinkRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateEventStreamingShrinkRequestTags> getTags() {
        return this.tags;
    }

    public CreateEventStreamingShrinkRequest setTransformsShrink(String transformsShrink) {
        this.transformsShrink = transformsShrink;
        return this;
    }
    public String getTransformsShrink() {
        return this.transformsShrink;
    }

    public static class CreateEventStreamingShrinkRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateEventStreamingShrinkRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingShrinkRequestTags self = new CreateEventStreamingShrinkRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingShrinkRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateEventStreamingShrinkRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
