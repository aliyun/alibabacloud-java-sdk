// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class EventBridgeTriggerConfig extends TeaModel {
    // asyncInvocationType
    @NameInMap("asyncInvocationType")
    public Boolean asyncInvocationType;

    // eventRuleFilterPattern
    @NameInMap("eventRuleFilterPattern")
    public String eventRuleFilterPattern;

    @NameInMap("eventSourceConfig")
    public EventSourceConfig eventSourceConfig;

    // triggerEnable
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

    public EventBridgeTriggerConfig setEventSourceConfig(EventSourceConfig eventSourceConfig) {
        this.eventSourceConfig = eventSourceConfig;
        return this;
    }
    public EventSourceConfig getEventSourceConfig() {
        return this.eventSourceConfig;
    }

    public EventBridgeTriggerConfig setTriggerEnable(Boolean triggerEnable) {
        this.triggerEnable = triggerEnable;
        return this;
    }
    public Boolean getTriggerEnable() {
        return this.triggerEnable;
    }

}
