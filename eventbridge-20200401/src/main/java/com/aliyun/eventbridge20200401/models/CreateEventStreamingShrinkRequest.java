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
     * <p>The event filtering rule. If not specified, all events are matched.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     * &quot;source&quot;: [
     * {
     * &quot;prefix&quot;: &quot;acs:mns&quot;
     * }
     * ],
     * &quot;type&quot;: [
     * {
     * &quot;prefix&quot;: &quot;mns:Queue&quot;
     * }
     * ],
     * &quot;subject&quot;: [
     * {
     * &quot;prefix&quot;: &quot;acs:mns:cn-hangzhou:123456789098****:queues/zeus&quot;
     * }
     * ]
     * }</p>
     */
    @NameInMap("FilterPattern")
    public String filterPattern;

    @NameInMap("Metadata")
    public String metadata;

    /**
     * <p>The runtime environment parameters.</p>
     */
    @NameInMap("RunOptions")
    public String runOptionsShrink;

    /**
     * <p>The event target. You must select exactly one Sink type.</p>
     */
    @NameInMap("Sink")
    public String sinkShrink;

    /**
     * <p>The event provider. You must select exactly one Source type.</p>
     */
    @NameInMap("Source")
    public String sourceShrink;

    /**
     * <p>The tag list. A maximum of 20 items are supported.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateEventStreamingShrinkRequestTags> tags;

    /**
     * <p>The Transform-related configurations.</p>
     */
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

    public CreateEventStreamingShrinkRequest setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }
    public String getMetadata() {
        return this.metadata;
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
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
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
