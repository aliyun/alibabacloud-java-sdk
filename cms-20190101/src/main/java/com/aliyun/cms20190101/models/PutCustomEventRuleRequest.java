// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutCustomEventRuleRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("EventName")
    public String eventName;

    @NameInMap("ContactGroups")
    public String contactGroups;

    @NameInMap("Webhook")
    public String webhook;

    @NameInMap("EffectiveInterval")
    public String effectiveInterval;

    @NameInMap("Period")
    public String period;

    @NameInMap("EmailSubject")
    public String emailSubject;

    @NameInMap("Threshold")
    public String threshold;

    @NameInMap("Level")
    public String level;

    public static PutCustomEventRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        PutCustomEventRuleRequest self = new PutCustomEventRuleRequest();
        return TeaModel.build(map, self);
    }

    public PutCustomEventRuleRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public PutCustomEventRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public PutCustomEventRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public PutCustomEventRuleRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public PutCustomEventRuleRequest setContactGroups(String contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }
    public String getContactGroups() {
        return this.contactGroups;
    }

    public PutCustomEventRuleRequest setWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
    public String getWebhook() {
        return this.webhook;
    }

    public PutCustomEventRuleRequest setEffectiveInterval(String effectiveInterval) {
        this.effectiveInterval = effectiveInterval;
        return this;
    }
    public String getEffectiveInterval() {
        return this.effectiveInterval;
    }

    public PutCustomEventRuleRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public PutCustomEventRuleRequest setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
        return this;
    }
    public String getEmailSubject() {
        return this.emailSubject;
    }

    public PutCustomEventRuleRequest setThreshold(String threshold) {
        this.threshold = threshold;
        return this;
    }
    public String getThreshold() {
        return this.threshold;
    }

    public PutCustomEventRuleRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

}
