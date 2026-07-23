// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateEventStreamingShrinkRequest extends TeaModel {
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
     * <p>The event filtering rule. If you do not specify this parameter, all events are matched. For more information, see <a href="https://www.alibabacloud.com/help/en/eventbridge/user-guide/event-patterns">https://www.alibabacloud.com/help/en/eventbridge/user-guide/event-patterns</a></p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;source&quot;: [
     *         {
     *             &quot;prefix&quot;: &quot;acs:mns&quot;
     *         }
     *     ],
     *     &quot;type&quot;: [
     *         {
     *             &quot;prefix&quot;: &quot;mns:Queue&quot;
     *         }
     *     ],
     *     &quot;subject&quot;: [
     *         {
     *             &quot;prefix&quot;: &quot;acs:mns:cn-hangzhou:123456789098****:queues/zeus&quot;
     *         }
     *     ]
     * }</p>
     */
    @NameInMap("FilterPattern")
    public String filterPattern;

    @NameInMap("Metadata")
    public String metadata;

    /**
     * <p>The runtime parameters.</p>
     */
    @NameInMap("RunOptions")
    public String runOptionsShrink;

    /**
     * <p>The event target. You must select one and only one Sink type.</p>
     */
    @NameInMap("Sink")
    public String sinkShrink;

    /**
     * <p>The event provider. You must select one and only one Source type.</p>
     */
    @NameInMap("Source")
    public String sourceShrink;

    /**
     * <p>The Transform-related configurations.</p>
     */
    @NameInMap("Transforms")
    public String transformsShrink;

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

    public UpdateEventStreamingShrinkRequest setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }
    public String getMetadata() {
        return this.metadata;
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

    public UpdateEventStreamingShrinkRequest setTransformsShrink(String transformsShrink) {
        this.transformsShrink = transformsShrink;
        return this;
    }
    public String getTransformsShrink() {
        return this.transformsShrink;
    }

}
