// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateEventStreamingShrinkRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("EventStreamingName")
    public String eventStreamingName;

    @NameInMap("FilterPattern")
    public String filterPattern;

    @NameInMap("RunOptions")
    public String runOptionsShrink;

    @NameInMap("Sink")
    public String sinkShrink;

    @NameInMap("Source")
    public String sourceShrink;

    public static UpdateEventStreamingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventStreamingShrinkRequest self = new UpdateEventStreamingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEventStreamingShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateEventStreamingShrinkRequest setEventStreamingName(String eventStreamingName) {
        this.eventStreamingName = eventStreamingName;
        return this;
    }
    public String getEventStreamingName() {
        return this.eventStreamingName;
    }

    public UpdateEventStreamingShrinkRequest setFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
        return this;
    }
    public String getFilterPattern() {
        return this.filterPattern;
    }

    public UpdateEventStreamingShrinkRequest setRunOptionsShrink(String runOptionsShrink) {
        this.runOptionsShrink = runOptionsShrink;
        return this;
    }
    public String getRunOptionsShrink() {
        return this.runOptionsShrink;
    }

    public UpdateEventStreamingShrinkRequest setSinkShrink(String sinkShrink) {
        this.sinkShrink = sinkShrink;
        return this;
    }
    public String getSinkShrink() {
        return this.sinkShrink;
    }

    public UpdateEventStreamingShrinkRequest setSourceShrink(String sourceShrink) {
        this.sourceShrink = sourceShrink;
        return this;
    }
    public String getSourceShrink() {
        return this.sourceShrink;
    }

}
