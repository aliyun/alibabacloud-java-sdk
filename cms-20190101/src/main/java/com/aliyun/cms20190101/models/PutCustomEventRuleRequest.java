// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutCustomEventRuleRequest extends TeaModel {
    /**
     * <p>The callback URL to which a POST request is sent when an alert is triggered based on the alert rule.</p>
     */
    @NameInMap("ContactGroups")
    public String contactGroups;

    /**
     * <p>The cycle that is used to aggregate monitoring data of the custom event. Unit: seconds. Set the value to an integral multiple of 60. Default value: 300.</p>
     */
    @NameInMap("EffectiveInterval")
    public String effectiveInterval;

    /**
     * <p>The alert threshold.</p>
     */
    @NameInMap("EmailSubject")
    public String emailSubject;

    /**
     * <p>The alert contact group that receives alert notifications. Separate multiple contact groups with commas (,).</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The ID of the alert rule.</p>
     * <br>
     * <p>>  You can specify an existing ID to modify the corresponding alert rule or specify a new ID to create an alert rule.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The value 200 indicates that the call was successful.</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The subject of the alert notification email.</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The name of the alert rule.</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The name of the custom event. For more information about how to obtain the event name, see [DescribeCustomEventAttribute](~~115262~~).</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The level of the alert. Valid values:</p>
     * <br>
     * <p>*   CRITICAL: critical issue</p>
     * <p>*   WARN: warning</p>
     * <p>*   INFO: information</p>
     */
    @NameInMap("Threshold")
    public String threshold;

    /**
     * <p>The time period during which the alert rule is effective. Valid values: 00:00 to 23:59.</p>
     */
    @NameInMap("Webhook")
    public String webhook;

    public static PutCustomEventRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        PutCustomEventRuleRequest self = new PutCustomEventRuleRequest();
        return TeaModel.build(map, self);
    }

    public PutCustomEventRuleRequest setContactGroups(String contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }
    public String getContactGroups() {
        return this.contactGroups;
    }

    public PutCustomEventRuleRequest setEffectiveInterval(String effectiveInterval) {
        this.effectiveInterval = effectiveInterval;
        return this;
    }
    public String getEffectiveInterval() {
        return this.effectiveInterval;
    }

    public PutCustomEventRuleRequest setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
        return this;
    }
    public String getEmailSubject() {
        return this.emailSubject;
    }

    public PutCustomEventRuleRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public PutCustomEventRuleRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public PutCustomEventRuleRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public PutCustomEventRuleRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
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

    public PutCustomEventRuleRequest setThreshold(String threshold) {
        this.threshold = threshold;
        return this;
    }
    public String getThreshold() {
        return this.threshold;
    }

    public PutCustomEventRuleRequest setWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
    public String getWebhook() {
        return this.webhook;
    }

}
