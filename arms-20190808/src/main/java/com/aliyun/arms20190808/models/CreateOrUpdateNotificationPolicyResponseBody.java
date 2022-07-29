// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateNotificationPolicyResponseBody extends TeaModel {
    @NameInMap("NotificationPolicy")
    public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicy notificationPolicy;

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
        @NameInMap("GroupInterval")
        public Long groupInterval;

        @NameInMap("GroupWait")
        public Long groupWait;

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
        @NameInMap("Key")
        public String key;

        @NameInMap("Operator")
        public String operator;

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
        @NameInMap("NotifyObjectId")
        public Long notifyObjectId;

        @NameInMap("NotifyObjectName")
        public String notifyObjectName;

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
        @NameInMap("NotifyChannels")
        public java.util.List<String> notifyChannels;

        @NameInMap("NotifyEndTime")
        public String notifyEndTime;

        @NameInMap("NotifyObjects")
        public java.util.List<CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRuleNotifyObjects> notifyObjects;

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
        @NameInMap("EmailContent")
        public String emailContent;

        @NameInMap("EmailRecoverContent")
        public String emailRecoverContent;

        @NameInMap("EmailRecoverTitle")
        public String emailRecoverTitle;

        @NameInMap("EmailTitle")
        public String emailTitle;

        @NameInMap("RobotContent")
        public String robotContent;

        @NameInMap("SmsContent")
        public String smsContent;

        @NameInMap("SmsRecoverContent")
        public String smsRecoverContent;

        @NameInMap("TtsContent")
        public String ttsContent;

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
        @NameInMap("EscalationPolicyId")
        public Long escalationPolicyId;

        @NameInMap("GroupRule")
        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyGroupRule groupRule;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IntegrationId")
        public Long integrationId;

        @NameInMap("MatchingRules")
        public java.util.List<CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyMatchingRules> matchingRules;

        @NameInMap("Name")
        public String name;

        @NameInMap("NotifyRule")
        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRule notifyRule;

        @NameInMap("NotifyTemplate")
        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyTemplate notifyTemplate;

        @NameInMap("Repeat")
        public Boolean repeat;

        @NameInMap("RepeatInterval")
        public Long repeatInterval;

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
