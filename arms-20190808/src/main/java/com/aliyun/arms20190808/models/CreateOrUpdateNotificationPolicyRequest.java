// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateNotificationPolicyRequest extends TeaModel {
    // The ID of the escalation policy.
    @NameInMap("EscalationPolicyId")
    public Long escalationPolicyId;

    // An array of alert event group objects.
    // 
    // *   If you do not specify the groupingFields field, all alerts will be sent to contacts based on `alertname`.
    // 
    // *   If you specify the groupingFields field, alerts with the same field will be sent to contacts in one notification.
    // 
    //     Sample statement:
    // 
    // ```
    // 
    // { 
    // "groupWait":5,    // The waiting time for grouping. 
    // "groupInterval":30,     // The time interval of grouping. 
    // "groupingFields":["alertname"]       // The field that is used to group alert events. 
    // }
    // ```
    @NameInMap("GroupRule")
    public String groupRule;

    // The ID of the notification policy.
    // 
    // *   If you do not specify this parameter, a new notification policy is created.
    // *   If you specify this parameter, the specified notification policy is modified.
    @NameInMap("Id")
    public Long id;

    // The integration ID of the ticket system to which alerts are pushed.
    @NameInMap("IntegrationId")
    public Long integrationId;

    // The matching rules. Sample statement:
    // 
    // ```
    // 
    // [
    //  {
    //  "matchingConditions": [
    //  { 
    //  "value": "test",    // The value of the matching condition. 
    //  "key": "alertname",     // The key of the matching condition. 
    //  "operator": "eq"   // The logical operator of the matching condition, including eq (equal to), neq (not equal to), in (contains), nin (does not contain), re (regular expression match), and nre (regular expression mismatch).   
    //  }
    //  ]
    //  } 
    //  ]
    // ```
    @NameInMap("MatchingRules")
    public String matchingRules;

    // The name of the notification policy.
    @NameInMap("Name")
    public String name;

    // An array of notification rule objects. Sample statement:
    // 
    // ```
    // 
    // { 
    //  "notifyStartTime":"00:00",      // The start time of the notification window. 
    //  "notifyEndTime":"23:59",       // The end time of the notification window. 
    //  "notifyChannels":["dingTalk", "email", "sms", "tts", "webhook"],       // The notification methods. Valid values: dingTalk, email, sms, tts, and webhook. 
    //  "notifyObjects":[{       // An array of notification contact objects. 
    //  "notifyObjectType":"CONTACT",       // The type of the notification contact. Valid values: CONTACT (individual contacts), CONTACT_GROUP (contact groups), DING_ROBOT (the instant message robot), and CONTACT_SCHEDULE (the person on duty based on an established schedule). 
    //  "notifyObjectId":123,       // The ID of the notification contact. 
    //  "notifyObjectName":"test"       // The name of the notification contact. 
    //  }]
    // ```
    @NameInMap("NotifyRule")
    public String notifyRule;

    // The notification template. The default notification template is provided below the table.
    @NameInMap("NotifyTemplate")
    public String notifyTemplate;

    @NameInMap("RegionId")
    public String regionId;

    // Specifies whether to resend a notification for a long-lasting unresolved alert. Default value: true. Valid values:
    // 
    // *   `true`: If you set this parameter to `true`, you must set **RepeatInterval**.
    // *   `false`: If you set this parameter to `false`, you must set **EscalationPolicyId**.
    @NameInMap("Repeat")
    public Boolean repeat;

    // The time interval at which a notification is resent for a long-lasting unresolved alert. Unit: seconds.
    @NameInMap("RepeatInterval")
    public Long repeatInterval;

    // Indicates whether the system sends a notification to the contacts when the status of an alert changes to Resolved. Default value: true. Valid values:
    // 
    // *   `true`: The system sends a notification.
    // *   `false`: The system does not send a notification.
    @NameInMap("SendRecoverMessage")
    public Boolean sendRecoverMessage;

    public static CreateOrUpdateNotificationPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateNotificationPolicyRequest self = new CreateOrUpdateNotificationPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateNotificationPolicyRequest setEscalationPolicyId(Long escalationPolicyId) {
        this.escalationPolicyId = escalationPolicyId;
        return this;
    }
    public Long getEscalationPolicyId() {
        return this.escalationPolicyId;
    }

    public CreateOrUpdateNotificationPolicyRequest setGroupRule(String groupRule) {
        this.groupRule = groupRule;
        return this;
    }
    public String getGroupRule() {
        return this.groupRule;
    }

    public CreateOrUpdateNotificationPolicyRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateOrUpdateNotificationPolicyRequest setIntegrationId(Long integrationId) {
        this.integrationId = integrationId;
        return this;
    }
    public Long getIntegrationId() {
        return this.integrationId;
    }

    public CreateOrUpdateNotificationPolicyRequest setMatchingRules(String matchingRules) {
        this.matchingRules = matchingRules;
        return this;
    }
    public String getMatchingRules() {
        return this.matchingRules;
    }

    public CreateOrUpdateNotificationPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateOrUpdateNotificationPolicyRequest setNotifyRule(String notifyRule) {
        this.notifyRule = notifyRule;
        return this;
    }
    public String getNotifyRule() {
        return this.notifyRule;
    }

    public CreateOrUpdateNotificationPolicyRequest setNotifyTemplate(String notifyTemplate) {
        this.notifyTemplate = notifyTemplate;
        return this;
    }
    public String getNotifyTemplate() {
        return this.notifyTemplate;
    }

    public CreateOrUpdateNotificationPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateOrUpdateNotificationPolicyRequest setRepeat(Boolean repeat) {
        this.repeat = repeat;
        return this;
    }
    public Boolean getRepeat() {
        return this.repeat;
    }

    public CreateOrUpdateNotificationPolicyRequest setRepeatInterval(Long repeatInterval) {
        this.repeatInterval = repeatInterval;
        return this;
    }
    public Long getRepeatInterval() {
        return this.repeatInterval;
    }

    public CreateOrUpdateNotificationPolicyRequest setSendRecoverMessage(Boolean sendRecoverMessage) {
        this.sendRecoverMessage = sendRecoverMessage;
        return this;
    }
    public Boolean getSendRecoverMessage() {
        return this.sendRecoverMessage;
    }

}
