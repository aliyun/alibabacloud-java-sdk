// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateNotificationPolicyResponseBody extends TeaModel {
    // An array of notification policy objects.
    @NameInMap("NotificationPolicy")
    public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicy notificationPolicy;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOrUpdateNotificationPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateNotificationPolicyResponseBody self = new CreateOrUpdateNotificationPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateNotificationPolicyResponseBody setNotificationPolicy(CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicy notificationPolicy) {
        this.notificationPolicy = notificationPolicy;
        return this;
    }
    public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicy getNotificationPolicy() {
        return this.notificationPolicy;
    }

    public CreateOrUpdateNotificationPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyGroupRule extends TeaModel {
        // The time interval of grouping. Unit: seconds. Default value: 30.
        @NameInMap("GroupInterval")
        public Long groupInterval;

        // The waiting time for grouping. Unit: seconds. Default value: 5.
        @NameInMap("GroupWait")
        public Long groupWait;

        // The field that is used for grouping.
        @NameInMap("GroupingFields")
        public java.util.List<String> groupingFields;

        public static CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyGroupRule build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyGroupRule self = new CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyGroupRule();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyGroupRule setGroupInterval(Long groupInterval) {
            this.groupInterval = groupInterval;
            return this;
        }
        public Long getGroupInterval() {
            return this.groupInterval;
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyGroupRule setGroupWait(Long groupWait) {
            this.groupWait = groupWait;
            return this;
        }
        public Long getGroupWait() {
            return this.groupWait;
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyGroupRule setGroupingFields(java.util.List<String> groupingFields) {
            this.groupingFields = groupingFields;
            return this;
        }
        public java.util.List<String> getGroupingFields() {
            return this.groupingFields;
        }

    }

    public static class CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyMatchingRulesMatchingConditions extends TeaModel {
        // The key of the matching condition.
        @NameInMap("Key")
        public String key;

        // The logical operator of the matching condition. Valid values:
        // 
        // *   `eq`: equal to
        // *   `neq`: not equal to
        // *   `in`: contains
        // *   `nin`: does not contain
        // *   `re`: regular expression match
        // *   `nre`: regular expression mismatch
        @NameInMap("Operator")
        public String operator;

        // The value of the matching condition.
        @NameInMap("Value")
        public String value;

        public static CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyMatchingRulesMatchingConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyMatchingRulesMatchingConditions self = new CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyMatchingRulesMatchingConditions();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyMatchingRulesMatchingConditions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyMatchingRulesMatchingConditions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyMatchingRulesMatchingConditions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyMatchingRules extends TeaModel {
        // An array of alert event matching condition objects.
        @NameInMap("MatchingConditions")
        public java.util.List<CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyMatchingRulesMatchingConditions> matchingConditions;

        public static CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyMatchingRules build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyMatchingRules self = new CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyMatchingRules();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyMatchingRules setMatchingConditions(java.util.List<CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyMatchingRulesMatchingConditions> matchingConditions) {
            this.matchingConditions = matchingConditions;
            return this;
        }
        public java.util.List<CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyMatchingRulesMatchingConditions> getMatchingConditions() {
            return this.matchingConditions;
        }

    }

    public static class CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRuleNotifyObjects extends TeaModel {
        // The ID of the notification contact.
        @NameInMap("NotifyObjectId")
        public Long notifyObjectId;

        // The name of the notification contact.
        @NameInMap("NotifyObjectName")
        public String notifyObjectName;

        // The type of the notification contact. Valid values: 
        // 
        // - CONTACT: an individual contact
        // - CONTACT_GROUP: a contact group
        // - DING_ROBOT: an instant messaging (IM) robot
        // - CONTACT_SCHEDULE: a person on duty based on an established schedule
        @NameInMap("NotifyObjectType")
        public String notifyObjectType;

        public static CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRuleNotifyObjects build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRuleNotifyObjects self = new CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRuleNotifyObjects();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRuleNotifyObjects setNotifyObjectId(Long notifyObjectId) {
            this.notifyObjectId = notifyObjectId;
            return this;
        }
        public Long getNotifyObjectId() {
            return this.notifyObjectId;
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRuleNotifyObjects setNotifyObjectName(String notifyObjectName) {
            this.notifyObjectName = notifyObjectName;
            return this;
        }
        public String getNotifyObjectName() {
            return this.notifyObjectName;
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRuleNotifyObjects setNotifyObjectType(String notifyObjectType) {
            this.notifyObjectType = notifyObjectType;
            return this;
        }
        public String getNotifyObjectType() {
            return this.notifyObjectType;
        }

    }

    public static class CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRule extends TeaModel {
        // The notification methods. Valid values: 
        // 
        // - `dingTalk`: DingTalk
        // - `email`: email
        // - `sms`: text message
        // - `tts`: phone call
        // - `webhook`: webhook
        @NameInMap("NotifyChannels")
        public java.util.List<String> notifyChannels;

        // The end time of the notification window.
        @NameInMap("NotifyEndTime")
        public String notifyEndTime;

        // An array of notification contact objects.
        @NameInMap("NotifyObjects")
        public java.util.List<CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRuleNotifyObjects> notifyObjects;

        // The start time of the notification window.
        @NameInMap("NotifyStartTime")
        public String notifyStartTime;

        public static CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRule build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRule self = new CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRule();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRule setNotifyChannels(java.util.List<String> notifyChannels) {
            this.notifyChannels = notifyChannels;
            return this;
        }
        public java.util.List<String> getNotifyChannels() {
            return this.notifyChannels;
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRule setNotifyEndTime(String notifyEndTime) {
            this.notifyEndTime = notifyEndTime;
            return this;
        }
        public String getNotifyEndTime() {
            return this.notifyEndTime;
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRule setNotifyObjects(java.util.List<CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRuleNotifyObjects> notifyObjects) {
            this.notifyObjects = notifyObjects;
            return this;
        }
        public java.util.List<CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRuleNotifyObjects> getNotifyObjects() {
            return this.notifyObjects;
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRule setNotifyStartTime(String notifyStartTime) {
            this.notifyStartTime = notifyStartTime;
            return this;
        }
        public String getNotifyStartTime() {
            return this.notifyStartTime;
        }

    }

    public static class CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyTemplate extends TeaModel {
        // The content of the alert notification sent through email.
        @NameInMap("EmailContent")
        public String emailContent;

        // The content of the alert resolution notification sent through email.
        @NameInMap("EmailRecoverContent")
        public String emailRecoverContent;

        // The title of the alert resolution notification sent through email.
        @NameInMap("EmailRecoverTitle")
        public String emailRecoverTitle;

        // The title of the alert notification sent through email.
        @NameInMap("EmailTitle")
        public String emailTitle;

        // The content of the alert notification sent by the IM robot.
        @NameInMap("RobotContent")
        public String robotContent;

        // The content of the alert notification sent through text message.
        @NameInMap("SmsContent")
        public String smsContent;

        // The content of the alert resolution notification sent through text message.
        @NameInMap("SmsRecoverContent")
        public String smsRecoverContent;

        // The content of the alert notification by phone.
        @NameInMap("TtsContent")
        public String ttsContent;

        // The content of the alert resolution notification by phone.
        @NameInMap("TtsRecoverContent")
        public String ttsRecoverContent;

        public static CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyTemplate build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyTemplate self = new CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyTemplate();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyTemplate setEmailContent(String emailContent) {
            this.emailContent = emailContent;
            return this;
        }
        public String getEmailContent() {
            return this.emailContent;
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyTemplate setEmailRecoverContent(String emailRecoverContent) {
            this.emailRecoverContent = emailRecoverContent;
            return this;
        }
        public String getEmailRecoverContent() {
            return this.emailRecoverContent;
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyTemplate setEmailRecoverTitle(String emailRecoverTitle) {
            this.emailRecoverTitle = emailRecoverTitle;
            return this;
        }
        public String getEmailRecoverTitle() {
            return this.emailRecoverTitle;
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyTemplate setEmailTitle(String emailTitle) {
            this.emailTitle = emailTitle;
            return this;
        }
        public String getEmailTitle() {
            return this.emailTitle;
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyTemplate setRobotContent(String robotContent) {
            this.robotContent = robotContent;
            return this;
        }
        public String getRobotContent() {
            return this.robotContent;
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyTemplate setSmsContent(String smsContent) {
            this.smsContent = smsContent;
            return this;
        }
        public String getSmsContent() {
            return this.smsContent;
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyTemplate setSmsRecoverContent(String smsRecoverContent) {
            this.smsRecoverContent = smsRecoverContent;
            return this;
        }
        public String getSmsRecoverContent() {
            return this.smsRecoverContent;
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyTemplate setTtsContent(String ttsContent) {
            this.ttsContent = ttsContent;
            return this;
        }
        public String getTtsContent() {
            return this.ttsContent;
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyTemplate setTtsRecoverContent(String ttsRecoverContent) {
            this.ttsRecoverContent = ttsRecoverContent;
            return this;
        }
        public String getTtsRecoverContent() {
            return this.ttsRecoverContent;
        }

    }

    public static class CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicy extends TeaModel {
        // The ID of the escalation policy.
        @NameInMap("EscalationPolicyId")
        public Long escalationPolicyId;

        // An array of alert event group objects.
        @NameInMap("GroupRule")
        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyGroupRule groupRule;

        // The ID of the notification policy.
        @NameInMap("Id")
        public Long id;

        // The integration ID of the ticket system to which alerts are pushed.
        @NameInMap("IntegrationId")
        public Long integrationId;

        // An array of alert event matching rule objects.
        @NameInMap("MatchingRules")
        public java.util.List<CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyMatchingRules> matchingRules;

        // The name of the notification policy.
        @NameInMap("Name")
        public String name;

        // An array of notification rule objects.
        @NameInMap("NotifyRule")
        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRule notifyRule;

        // An array of notification template objects.
        @NameInMap("NotifyTemplate")
        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyTemplate notifyTemplate;

        // Indicates whether a notification is resent for a long-lasting unresolved alert. Default value: true. Valid values:  
        // 
        // - `true`: The system resends a notification for a long-lasting unresolved alert at a specified time interval.
        // - `false`: The system sends a notification for a long-lasting unresolved alert based on an escalation policy.
        @NameInMap("Repeat")
        public Boolean repeat;

        // The time interval at which a notification is resent for a long-lasting unresolved alert. Unit: seconds.
        @NameInMap("RepeatInterval")
        public Long repeatInterval;

        // Indicates whether the system sends a notification to the contacts when the status of an alert changes to Resolved. Default value: true. Valid values:   
        // 
        // - `true`: The system sends a notification.
        // - `false`: The system does not send a notification.
        @NameInMap("SendRecoverMessage")
        public Boolean sendRecoverMessage;

        public static CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicy self = new CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicy();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicy setEscalationPolicyId(Long escalationPolicyId) {
            this.escalationPolicyId = escalationPolicyId;
            return this;
        }
        public Long getEscalationPolicyId() {
            return this.escalationPolicyId;
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicy setGroupRule(CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyGroupRule groupRule) {
            this.groupRule = groupRule;
            return this;
        }
        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyGroupRule getGroupRule() {
            return this.groupRule;
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicy setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicy setIntegrationId(Long integrationId) {
            this.integrationId = integrationId;
            return this;
        }
        public Long getIntegrationId() {
            return this.integrationId;
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicy setMatchingRules(java.util.List<CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyMatchingRules> matchingRules) {
            this.matchingRules = matchingRules;
            return this;
        }
        public java.util.List<CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyMatchingRules> getMatchingRules() {
            return this.matchingRules;
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicy setNotifyRule(CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRule notifyRule) {
            this.notifyRule = notifyRule;
            return this;
        }
        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRule getNotifyRule() {
            return this.notifyRule;
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicy setNotifyTemplate(CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyTemplate notifyTemplate) {
            this.notifyTemplate = notifyTemplate;
            return this;
        }
        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyTemplate getNotifyTemplate() {
            return this.notifyTemplate;
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicy setRepeat(Boolean repeat) {
            this.repeat = repeat;
            return this;
        }
        public Boolean getRepeat() {
            return this.repeat;
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicy setRepeatInterval(Long repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }
        public Long getRepeatInterval() {
            return this.repeatInterval;
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicy setSendRecoverMessage(Boolean sendRecoverMessage) {
            this.sendRecoverMessage = sendRecoverMessage;
            return this;
        }
        public Boolean getSendRecoverMessage() {
            return this.sendRecoverMessage;
        }

    }

}
