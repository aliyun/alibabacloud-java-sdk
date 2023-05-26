// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListNotificationPoliciesResponseBody extends TeaModel {
    /**
     * <p>The pages that are returned.</p>
     */
    @NameInMap("PageBean")
    public ListNotificationPoliciesResponseBodyPageBean pageBean;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListNotificationPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNotificationPoliciesResponseBody self = new ListNotificationPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNotificationPoliciesResponseBody setPageBean(ListNotificationPoliciesResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public ListNotificationPoliciesResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public ListNotificationPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesGroupRule extends TeaModel {
        /**
         * <p>The time interval for grouping. Unit: seconds. Default value: 30.</p>
         */
        @NameInMap("GroupInterval")
        public Long groupInterval;

        /**
         * <p>The waiting time for grouping. Unit: seconds. Default value: 5.</p>
         */
        @NameInMap("GroupWait")
        public Long groupWait;

        /**
         * <p>The fields that are used to group events.</p>
         */
        @NameInMap("GroupingFields")
        public java.util.List<String> groupingFields;

        public static ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesGroupRule build(java.util.Map<String, ?> map) throws Exception {
            ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesGroupRule self = new ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesGroupRule();
            return TeaModel.build(map, self);
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesGroupRule setGroupInterval(Long groupInterval) {
            this.groupInterval = groupInterval;
            return this;
        }
        public Long getGroupInterval() {
            return this.groupInterval;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesGroupRule setGroupWait(Long groupWait) {
            this.groupWait = groupWait;
            return this;
        }
        public Long getGroupWait() {
            return this.groupWait;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesGroupRule setGroupingFields(java.util.List<String> groupingFields) {
            this.groupingFields = groupingFields;
            return this;
        }
        public java.util.List<String> getGroupingFields() {
            return this.groupingFields;
        }

    }

    public static class ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRulesMatchingConditions extends TeaModel {
        /**
         * <p>The key of the matching condition.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The logical operator of the matching condition. Valid values:</p>
         * <br>
         * <p>*   `eq`: equal to.</p>
         * <p>*   `neq`: not equal to.</p>
         * <p>*   `in`: contains.</p>
         * <p>*   `nin`: does not contain.</p>
         * <p>*   `re`: regular expression match.</p>
         * <p>*   `nre`: regular expression mismatch.</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The value of the matching condition.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRulesMatchingConditions build(java.util.Map<String, ?> map) throws Exception {
            ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRulesMatchingConditions self = new ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRulesMatchingConditions();
            return TeaModel.build(map, self);
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRulesMatchingConditions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRulesMatchingConditions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRulesMatchingConditions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRules extends TeaModel {
        /**
         * <p>The alert event matching conditions.</p>
         */
        @NameInMap("MatchingConditions")
        public java.util.List<ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRulesMatchingConditions> matchingConditions;

        public static ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRules build(java.util.Map<String, ?> map) throws Exception {
            ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRules self = new ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRules();
            return TeaModel.build(map, self);
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRules setMatchingConditions(java.util.List<ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRulesMatchingConditions> matchingConditions) {
            this.matchingConditions = matchingConditions;
            return this;
        }
        public java.util.List<ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRulesMatchingConditions> getMatchingConditions() {
            return this.matchingConditions;
        }

    }

    public static class ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRuleNotifyObjects extends TeaModel {
        /**
         * <p>通知对象为联系人时单独的联系方式</p>
         */
        @NameInMap("NotifyChannels")
        public java.util.List<String> notifyChannels;

        /**
         * <p>The ID of the contact.</p>
         */
        @NameInMap("NotifyObjectId")
        public Long notifyObjectId;

        /**
         * <p>The name of the contact.</p>
         */
        @NameInMap("NotifyObjectName")
        public String notifyObjectName;

        /**
         * <p>The type of the contact. Valid values: </p>
         * <br>
         * <p>- CONTACT: an individual contact</p>
         * <p>- CONTACT_GROUP: a contact group</p>
         * <p>- DING_ROBOT: an instant messaging (IM) robot</p>
         * <p>- CONTACT_SCHEDULE: a person on duty based on an established schedule</p>
         */
        @NameInMap("NotifyObjectType")
        public String notifyObjectType;

        public static ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRuleNotifyObjects build(java.util.Map<String, ?> map) throws Exception {
            ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRuleNotifyObjects self = new ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRuleNotifyObjects();
            return TeaModel.build(map, self);
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRuleNotifyObjects setNotifyChannels(java.util.List<String> notifyChannels) {
            this.notifyChannels = notifyChannels;
            return this;
        }
        public java.util.List<String> getNotifyChannels() {
            return this.notifyChannels;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRuleNotifyObjects setNotifyObjectId(Long notifyObjectId) {
            this.notifyObjectId = notifyObjectId;
            return this;
        }
        public Long getNotifyObjectId() {
            return this.notifyObjectId;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRuleNotifyObjects setNotifyObjectName(String notifyObjectName) {
            this.notifyObjectName = notifyObjectName;
            return this;
        }
        public String getNotifyObjectName() {
            return this.notifyObjectName;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRuleNotifyObjects setNotifyObjectType(String notifyObjectType) {
            this.notifyObjectType = notifyObjectType;
            return this;
        }
        public String getNotifyObjectType() {
            return this.notifyObjectType;
        }

    }

    public static class ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRule extends TeaModel {
        /**
         * <p>The notification method.</p>
         */
        @NameInMap("NotifyChannels")
        public java.util.List<String> notifyChannels;

        /**
         * <p>The end time of the notification window.</p>
         */
        @NameInMap("NotifyEndTime")
        public String notifyEndTime;

        /**
         * <p>The contacts.</p>
         */
        @NameInMap("NotifyObjects")
        public java.util.List<ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRuleNotifyObjects> notifyObjects;

        /**
         * <p>The start time of the notification window.</p>
         */
        @NameInMap("NotifyStartTime")
        public String notifyStartTime;

        public static ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRule build(java.util.Map<String, ?> map) throws Exception {
            ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRule self = new ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRule();
            return TeaModel.build(map, self);
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRule setNotifyChannels(java.util.List<String> notifyChannels) {
            this.notifyChannels = notifyChannels;
            return this;
        }
        public java.util.List<String> getNotifyChannels() {
            return this.notifyChannels;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRule setNotifyEndTime(String notifyEndTime) {
            this.notifyEndTime = notifyEndTime;
            return this;
        }
        public String getNotifyEndTime() {
            return this.notifyEndTime;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRule setNotifyObjects(java.util.List<ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRuleNotifyObjects> notifyObjects) {
            this.notifyObjects = notifyObjects;
            return this;
        }
        public java.util.List<ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRuleNotifyObjects> getNotifyObjects() {
            return this.notifyObjects;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRule setNotifyStartTime(String notifyStartTime) {
            this.notifyStartTime = notifyStartTime;
            return this;
        }
        public String getNotifyStartTime() {
            return this.notifyStartTime;
        }

    }

    public static class ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate extends TeaModel {
        /**
         * <p>The content of the alert notification sent by email.</p>
         */
        @NameInMap("EmailContent")
        public String emailContent;

        /**
         * <p>The content of the alert resolution notification sent by email.</p>
         */
        @NameInMap("EmailRecoverContent")
        public String emailRecoverContent;

        /**
         * <p>The title of the alert resolution notification sent by email.</p>
         */
        @NameInMap("EmailRecoverTitle")
        public String emailRecoverTitle;

        /**
         * <p>The title of the alert notification sent by email.</p>
         */
        @NameInMap("EmailTitle")
        public String emailTitle;

        /**
         * <p>The content of the alert notification sent by an IM robot.</p>
         */
        @NameInMap("RobotContent")
        public String robotContent;

        /**
         * <p>The content of the alert notification sent by text message.</p>
         */
        @NameInMap("SmsContent")
        public String smsContent;

        /**
         * <p>The content of the alert resolution notification sent by text message.</p>
         */
        @NameInMap("SmsRecoverContent")
        public String smsRecoverContent;

        /**
         * <p>The content of the alert notification sent by phone.</p>
         */
        @NameInMap("TtsContent")
        public String ttsContent;

        /**
         * <p>The content of the alert resolution notification sent by phone.</p>
         */
        @NameInMap("TtsRecoverContent")
        public String ttsRecoverContent;

        public static ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate build(java.util.Map<String, ?> map) throws Exception {
            ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate self = new ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate();
            return TeaModel.build(map, self);
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate setEmailContent(String emailContent) {
            this.emailContent = emailContent;
            return this;
        }
        public String getEmailContent() {
            return this.emailContent;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate setEmailRecoverContent(String emailRecoverContent) {
            this.emailRecoverContent = emailRecoverContent;
            return this;
        }
        public String getEmailRecoverContent() {
            return this.emailRecoverContent;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate setEmailRecoverTitle(String emailRecoverTitle) {
            this.emailRecoverTitle = emailRecoverTitle;
            return this;
        }
        public String getEmailRecoverTitle() {
            return this.emailRecoverTitle;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate setEmailTitle(String emailTitle) {
            this.emailTitle = emailTitle;
            return this;
        }
        public String getEmailTitle() {
            return this.emailTitle;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate setRobotContent(String robotContent) {
            this.robotContent = robotContent;
            return this;
        }
        public String getRobotContent() {
            return this.robotContent;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate setSmsContent(String smsContent) {
            this.smsContent = smsContent;
            return this;
        }
        public String getSmsContent() {
            return this.smsContent;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate setSmsRecoverContent(String smsRecoverContent) {
            this.smsRecoverContent = smsRecoverContent;
            return this;
        }
        public String getSmsRecoverContent() {
            return this.smsRecoverContent;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate setTtsContent(String ttsContent) {
            this.ttsContent = ttsContent;
            return this;
        }
        public String getTtsContent() {
            return this.ttsContent;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate setTtsRecoverContent(String ttsRecoverContent) {
            this.ttsRecoverContent = ttsRecoverContent;
            return this;
        }
        public String getTtsRecoverContent() {
            return this.ttsRecoverContent;
        }

    }

    public static class ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies extends TeaModel {
        /**
         * <p>The ID of the escalation rule.</p>
         */
        @NameInMap("EscalationPolicyId")
        public Long escalationPolicyId;

        /**
         * <p>The grouping rule for alert events.</p>
         */
        @NameInMap("GroupRule")
        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesGroupRule groupRule;

        /**
         * <p>The ID of the notification policy.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The integration ID of the ticket system to which alerts are pushed.</p>
         */
        @NameInMap("IntegrationId")
        public Long integrationId;

        /**
         * <p>The alert event matching rules.</p>
         */
        @NameInMap("MatchingRules")
        public java.util.List<ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRules> matchingRules;

        /**
         * <p>The name of the notification policy.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The notification rules.</p>
         */
        @NameInMap("NotifyRule")
        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRule notifyRule;

        /**
         * <p>The notification templates.</p>
         */
        @NameInMap("NotifyTemplate")
        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate notifyTemplate;

        /**
         * <p>Indicates whether the system repeatedly sends notifications for a long-lasting unresolved alert. Default value: true. Valid values:  </p>
         * <br>
         * <p>- `true`: The system repeatedly sends notifications for a long-lasting unresolved alert at a specified time interval.</p>
         * <p>- `false`: The system sends a notification for a long-lasting unresolved alert based on an escalation policy.</p>
         */
        @NameInMap("Repeat")
        public Boolean repeat;

        /**
         * <p>The time interval at which notifications are sent for a long-lasting unresolved alert. Unit: seconds.</p>
         */
        @NameInMap("RepeatInterval")
        public Long repeatInterval;

        /**
         * <p>Specifies whether the status of an alert automatically changes to Resolved when all events related to the alert change to the Restored state. The system notifies contacts when the alert status changes to Resolved.  </p>
         * <br>
         * <p>- `true`: The system sends a notification. This is the default value.</p>
         * <p>- `false`: The system does not send a notification.</p>
         */
        @NameInMap("SendRecoverMessage")
        public Boolean sendRecoverMessage;

        public static ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies self = new ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies();
            return TeaModel.build(map, self);
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies setEscalationPolicyId(Long escalationPolicyId) {
            this.escalationPolicyId = escalationPolicyId;
            return this;
        }
        public Long getEscalationPolicyId() {
            return this.escalationPolicyId;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies setGroupRule(ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesGroupRule groupRule) {
            this.groupRule = groupRule;
            return this;
        }
        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesGroupRule getGroupRule() {
            return this.groupRule;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies setIntegrationId(Long integrationId) {
            this.integrationId = integrationId;
            return this;
        }
        public Long getIntegrationId() {
            return this.integrationId;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies setMatchingRules(java.util.List<ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRules> matchingRules) {
            this.matchingRules = matchingRules;
            return this;
        }
        public java.util.List<ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRules> getMatchingRules() {
            return this.matchingRules;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies setNotifyRule(ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRule notifyRule) {
            this.notifyRule = notifyRule;
            return this;
        }
        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRule getNotifyRule() {
            return this.notifyRule;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies setNotifyTemplate(ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate notifyTemplate) {
            this.notifyTemplate = notifyTemplate;
            return this;
        }
        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate getNotifyTemplate() {
            return this.notifyTemplate;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies setRepeat(Boolean repeat) {
            this.repeat = repeat;
            return this;
        }
        public Boolean getRepeat() {
            return this.repeat;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies setRepeatInterval(Long repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }
        public Long getRepeatInterval() {
            return this.repeatInterval;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies setSendRecoverMessage(Boolean sendRecoverMessage) {
            this.sendRecoverMessage = sendRecoverMessage;
            return this;
        }
        public Boolean getSendRecoverMessage() {
            return this.sendRecoverMessage;
        }

    }

    public static class ListNotificationPoliciesResponseBodyPageBean extends TeaModel {
        /**
         * <p>The information about the notification policies.</p>
         */
        @NameInMap("NotificationPolicies")
        public java.util.List<ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies> notificationPolicies;

        /**
         * <p>The number of the page returned.</p>
         */
        @NameInMap("Page")
        public Long page;

        /**
         * <p>The number of entries that are returned on each page.</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The number of notification policies that are returned.</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListNotificationPoliciesResponseBodyPageBean build(java.util.Map<String, ?> map) throws Exception {
            ListNotificationPoliciesResponseBodyPageBean self = new ListNotificationPoliciesResponseBodyPageBean();
            return TeaModel.build(map, self);
        }

        public ListNotificationPoliciesResponseBodyPageBean setNotificationPolicies(java.util.List<ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies> notificationPolicies) {
            this.notificationPolicies = notificationPolicies;
            return this;
        }
        public java.util.List<ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies> getNotificationPolicies() {
            return this.notificationPolicies;
        }

        public ListNotificationPoliciesResponseBodyPageBean setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public ListNotificationPoliciesResponseBodyPageBean setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListNotificationPoliciesResponseBodyPageBean setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
