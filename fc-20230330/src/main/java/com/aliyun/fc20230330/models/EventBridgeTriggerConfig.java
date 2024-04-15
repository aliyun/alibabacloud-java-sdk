// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class EventBridgeTriggerConfig extends TeaModel {
    @NameInMap("asyncInvocationType")
    public Boolean asyncInvocationType;

    @NameInMap("eventRuleFilterPattern")
    public String eventRuleFilterPattern;

    @NameInMap("eventSinkConfig")
    public EventSinkConfig eventSinkConfig;

    @NameInMap("eventSourceConfig")
    public EventSourceConfig eventSourceConfig;

    @NameInMap("runOptions")
    public RunOptions runOptions;

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
