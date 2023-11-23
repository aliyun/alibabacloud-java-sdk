// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateEventStreamingShrinkRequest extends TeaModel {
    /**
     * <p>The description of the event stream.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the event stream.</p>
     */
    @NameInMap("EventStreamingName")
    public String eventStreamingName;

    /**
     * <p>The rule that is used to filter events. If you leave this parameter empty, all events are matched.</p>
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
     */
    @NameInMap("Sink")
    public String sinkShrink;

    /**
     * <p>The event provider, which is also known as the event source. You must and can specify only one event source.</p>
     */
    @NameInMap("Source")
    public String sourceShrink;

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

    public CreateEventStreamingShrinkRequest setTransformsShrink(String transformsShrink) {
        this.transformsShrink = transformsShrink;
        return this;
    }
    public String getTransformsShrink() {
        return this.transformsShrink;
    }

}
