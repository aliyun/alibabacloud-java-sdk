// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class EventBridgeTriggerConfig extends TeaModel {
    /**
     * <p>Whether to invoke the function in asynchronous mode. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <blockquote>
     * <p> The default value is <strong>false</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("asyncInvocationType")
    public Boolean asyncInvocationType;

    /**
     * <p>The event pattern. The value is in the JSON format. For more information, see <a href="https://help.aliyun.com/document_detail/181432.html">Event patterns</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("eventRuleFilterPattern")
    public String eventRuleFilterPattern;

    /**
     * <p>The event destination configurations.</p>
     */
    @NameInMap("eventSinkConfig")
    public EventSinkConfig eventSinkConfig;

    /**
     * <p>The event source configurations.</p>
     */
    @NameInMap("eventSourceConfig")
    public EventSourceConfig eventSourceConfig;

    /**
     * <p>The runtime configurations.</p>
     */
    @NameInMap("runOptions")
    public RunOptions runOptions;

    /**
     * <p>Whether to enable the trigger. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <blockquote>
     * <p> The default value is <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("triggerEnable")
    public Boolean triggerEnable;

    public static EventBridgeTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
        EventBridgeTriggerConfig self = new EventBridgeTriggerConfig();
        return TeaModel.build(map, self);
    }

    public EventBridgeTriggerConfig setAsyncInvocationType(Boolean asyncInvocationType) {
        this.asyncInvocationType = asyncInvocationType;
        return this;
    }
    public Boolean getAsyncInvocationType() {
        return this.asyncInvocationType;
    }

    public EventBridgeTriggerConfig setEventRuleFilterPattern(String eventRuleFilterPattern) {
        this.eventRuleFilterPattern = eventRuleFilterPattern;
        return this;
    }
    public String getEventRuleFilterPattern() {
        return this.eventRuleFilterPattern;
    }

    public EventBridgeTriggerConfig setEventSinkConfig(EventSinkConfig eventSinkConfig) {
        this.eventSinkConfig = eventSinkConfig;
        return this;
    }
    public EventSinkConfig getEventSinkConfig() {
        return this.eventSinkConfig;
    }

    public EventBridgeTriggerConfig setEventSourceConfig(EventSourceConfig eventSourceConfig) {
        this.eventSourceConfig = eventSourceConfig;
        return this;
    }
    public EventSourceConfig getEventSourceConfig() {
        return this.eventSourceConfig;
    }

    public EventBridgeTriggerConfig setRunOptions(RunOptions runOptions) {
        this.runOptions = runOptions;
        return this;
    }
    public RunOptions getRunOptions() {
        return this.runOptions;
    }

    public EventBridgeTriggerConfig setTriggerEnable(Boolean triggerEnable) {
        this.triggerEnable = triggerEnable;
        return this;
    }
    public Boolean getTriggerEnable() {
        return this.triggerEnable;
    }

}
