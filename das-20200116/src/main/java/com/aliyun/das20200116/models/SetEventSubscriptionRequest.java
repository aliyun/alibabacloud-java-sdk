// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class SetEventSubscriptionRequest extends TeaModel {
    @NameInMap("Active")
    public String active;

    @NameInMap("ChannelType")
    public String channelType;

    @NameInMap("ContactGroupName")
    public String contactGroupName;

    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("DispatchRule")
    public String dispatchRule;

    @NameInMap("EventContext")
    public String eventContext;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Level")
    public String level;

    @NameInMap("MinInterval")
    public String minInterval;

    @NameInMap("Severity")
    public String severity;

    public static SetEventSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetEventSubscriptionRequest self = new SetEventSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public SetEventSubscriptionRequest setActive(String active) {
        this.active = active;
        return this;
    }
    public String getActive() {
        return this.active;
    }

    public SetEventSubscriptionRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public SetEventSubscriptionRequest setContactGroupName(String contactGroupName) {
        this.contactGroupName = contactGroupName;
        return this;
    }
    public String getContactGroupName() {
        return this.contactGroupName;
    }

    public SetEventSubscriptionRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public SetEventSubscriptionRequest setDispatchRule(String dispatchRule) {
        this.dispatchRule = dispatchRule;
        return this;
    }
    public String getDispatchRule() {
        return this.dispatchRule;
    }

    public SetEventSubscriptionRequest setEventContext(String eventContext) {
        this.eventContext = eventContext;
        return this;
    }
    public String getEventContext() {
        return this.eventContext;
    }

    public SetEventSubscriptionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetEventSubscriptionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SetEventSubscriptionRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public SetEventSubscriptionRequest setMinInterval(String minInterval) {
        this.minInterval = minInterval;
        return this;
    }
    public String getMinInterval() {
        return this.minInterval;
    }

    public SetEventSubscriptionRequest setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

}
