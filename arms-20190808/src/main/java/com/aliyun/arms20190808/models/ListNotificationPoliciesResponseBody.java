// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListNotificationPoliciesResponseBody extends TeaModel {
    /**
     * <p>The returned pages.</p>
     */
    @NameInMap("PageBean")
    public ListNotificationPoliciesResponseBodyPageBean pageBean;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>78901766-3806-4E96-8E47-CFEF59E4****</p>
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
         * <p>The time interval of grouping. Unit: seconds. Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("GroupInterval")
        public Long groupInterval;

        /**
         * <p>The waiting time for grouping. Unit: seconds. Default value: 5.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("GroupWait")
        public Long groupWait;

        /**
         * <p>The fields that are used to group events.</p>
         * <ul>
         * <li>If this parameter is not returned, all alert notifications are sent to the alert contacts that belong to the <code>alertname</code> group. By default, this parameter is not returned.</li>
         * <li>If this parameter is returned, alerts with the same fields are sent to the alert contacts in one notification.</li>
         * </ul>
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
         * 
         * <strong>example:</strong>
         * <p>altertname</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The logical operator of the matching condition. Valid values:</p>
         * <ul>
         * <li><code>eq</code>: equal to</li>
         * <li><code>neq</code>: not equal to</li>
         * <li><code>in</code>: contains</li>
         * <li><code>nin</code>: does not contain</li>
         * <li><code>re</code>: regular expression match</li>
         * <li><code>nre</code>: regular expression mismatch</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The value of the matching condition.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
         * <p>The matching conditions.</p>
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
         * <p>The notification methods specified for a contact.</p>
         */
        @NameInMap("NotifyChannels")
        public java.util.List<String> notifyChannels;

        /**
         * <p>The ID of the notification object.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("NotifyObjectId")
        public Long notifyObjectId;

        /**
         * <p>The name of the notification object.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("NotifyObjectName")
        public String notifyObjectName;

        /**
         * <p>The type of the notification object. Valid values:</p>
         * <ul>
         * <li>CONTACT: an individual contact</li>
         * <li>CONTACT_GROUP: a contact group</li>
         * <li>DING_ROBOT: an instant messaging (IM) chatbot</li>
         * <li>CONTACT_SCHEDULE: a person on duty based on an established schedule</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CONTACT</p>
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
         * <p>The notification methods.</p>
         */
        @NameInMap("NotifyChannels")
        public java.util.List<String> notifyChannels;

        /**
         * <p>The end time of the notification window.</p>
         * 
         * <strong>example:</strong>
         * <p>23:59</p>
         */
        @NameInMap("NotifyEndTime")
        public String notifyEndTime;

        /**
         * <p>The notification objects.</p>
         */
        @NameInMap("NotifyObjects")
        public java.util.List<ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRuleNotifyObjects> notifyObjects;

        /**
         * <p>The start time of the notification window.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00</p>
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
         * 
         * <strong>example:</strong>
         * <p>Alert Name: {{ .commonLabels.alertname }}{{if .commonLabels.clustername }}
         * Cluster Name: {{ .commonLabels.clustername }} {{ end }}{{if eq &quot;app&quot; .commonLabels._aliyun_arms_involvedObject_kind }}
         * App Name: {{ .commonLabels._aliyun_arms_involvedObject_name }} {{ end }}
         * Notification Policy: {{ .dispatchRuleName }}
         * Alert Time: {{ .startTime }}
         * Description: {{ for .alerts }} {{ .annotations.message }}  {{if .generatorURL }}  &lt;a href=&quot;{{.generatorURL}}&quot; &gt; Details&lt;/a&gt;
         *  {{ end }} {{ end }}</p>
         */
        @NameInMap("EmailContent")
        public String emailContent;

        /**
         * <p>The content of the alert resolution notification sent by email.</p>
         * 
         * <strong>example:</strong>
         * <p>Alert Name: {{ .commonLabels.alertname }}{{if .commonLabels.clustername }}
         * Cluster Name: {{ .commonLabels.clustername }} {{ end }}{{if eq &quot;app&quot; .commonLabels._aliyun_arms_involvedObject_kind }}
         * App Name: {{ .commonLabels._aliyun_arms_involvedObject_name }} {{ end }}
         * Notification Policy: {{ .dispatchRuleName }}
         * Recover Time: {{ .endTime }}
         * Description: {{ for .alerts }} {{ .annotations.message }}  {{if .generatorURL }} &lt;a href=&quot;{{.generatorURL}}&quot; &gt; Details&lt;/a&gt;
         *  {{ end }} {{ end }}</p>
         */
        @NameInMap("EmailRecoverContent")
        public String emailRecoverContent;

        /**
         * <p>The title of the alert resolution notification sent by email.</p>
         * 
         * <strong>example:</strong>
         * <p>{{ .commonLabels.alertname }}</p>
         */
        @NameInMap("EmailRecoverTitle")
        public String emailRecoverTitle;

        /**
         * <p>The title of the alert notification sent by email.</p>
         * 
         * <strong>example:</strong>
         * <p>{{ .commonLabels.alertname }}</p>
         */
        @NameInMap("EmailTitle")
        public String emailTitle;

        /**
         * <p>The content of the alert notification sent by an IM chatbot.</p>
         * 
         * <strong>example:</strong>
         * <p>{{if .commonLabels.clustername }}</p>
         * <p> &gt;  Cluster Name: {{ .commonLabels.clustername }} </p>
         * <p> {{ end }}{{if eq &quot;app&quot; .commonLabels._aliyun_arms_involvedObject_kind }}</p>
         * <p> &gt;  App Name: {{ .commonLabels._aliyun_arms_involvedObject_name }} </p>
         * <p> {{ end }}{{ for .alerts }} &gt;  {{ .annotations.message }} {{if .generatorURL }} <a href="%7B%7B.generatorURL%7D%7D">Details</a>  {{end}} {{if .annotations._aliyun_arms_insights_analyze_link }}[&lt;font color=\&quot;#ff0000\&quot;&gt;diagnostic analysis&lt;/font&gt;]({{ .annotations._aliyun_arms_insights_analyze_link}}){{ end }}{{if  eq &quot;1&quot; .labels._aliyun_arms_denoise_code }} (Important:{{.labels._aliyun_arms_important_reason }}) {{end}}</p>
         * <p>{{end}}</p>
         */
        @NameInMap("RobotContent")
        public String robotContent;

        /**
         * <p>The content of the alert notification sent by text message.</p>
         * 
         * <strong>example:</strong>
         * <p>{{ .level }}Alert Occurs
         * Alert Name: {{ .commonLabels.alertname }}{{if .commonLabels.clustername }}
         * Cluster Name: {{ .commonLabels.clustername }} {{ end }}{{if eq &quot;app&quot; .commonLabels._aliyun_arms_involvedObject_kind }}
         * App Name: {{ .commonLabels._aliyun_arms_involvedObject_name }} {{ end }}
         * Notification Policy: {{ .dispatchRuleName }}
         * Alert Time: {{ .startTime }}
         * Description: {{ for .alerts }} {{ .annotations.message }} {{ end }}</p>
         */
        @NameInMap("SmsContent")
        public String smsContent;

        /**
         * <p>The content of the alert resolution notification sent by text message.</p>
         * 
         * <strong>example:</strong>
         * <p>Alert Recovery Notification
         * Alert Name: {{ .commonLabels.alertname }}{{if .commonLabels.clustername }}
         * Cluster Name: {{ .commonLabels.clustername }} {{ end }}{{if eq &quot;app&quot; .commonLabels._aliyun_arms_involvedObject_kind }}
         * App Name: {{ .commonLabels._aliyun_arms_involvedObject_name }} {{ end }}
         * Notification Policy: {{ .dispatchRuleName }}
         * Recover Time: {{ .endTime }}
         * Description: {{ for .alerts }} {{ .annotations.message }} {{ end }}</p>
         */
        @NameInMap("SmsRecoverContent")
        public String smsRecoverContent;

        /**
         * <p>The content of the alert notification sent by phone.</p>
         * 
         * <strong>example:</strong>
         * <p>Alert Name: {{ .commonLabels.alertname }}{{if .commonLabels.clustername }}
         * Cluster Name: {{ .commonLabels.clustername }} {{ end }}{{if eq &quot;app&quot; .commonLabels._aliyun_arms_involvedObject_kind }}
         * App Name: {{ .commonLabels._aliyun_arms_involvedObject_name }} {{ end }}
         * Notification Policy: {{ .dispatchRuleName }}
         * Alert Time: {{ .startTime }}
         * Description: {{ for .alerts }} {{ .annotations.message }} {{ end }}</p>
         */
        @NameInMap("TtsContent")
        public String ttsContent;

        /**
         * <p>The content of the alert resolution notification sent by phone.</p>
         * 
         * <strong>example:</strong>
         * <p>Alert Name: {{ .commonLabels.alertname }}{{if .commonLabels.clustername }}
         * Cluster Name: {{ .commonLabels.clustername }} {{ end }}{{if eq &quot;app&quot; .commonLabels._aliyun_arms_involvedObject_kind }}
         * App Name: {{ .commonLabels._aliyun_arms_involvedObject_name }} {{ end }}
         * Notification Policy: {{ .dispatchRuleName }}
         * Recover Time: {{ .endTime }}
         * Description: {{ for .alerts }} {{ .annotations.message }} {{ end }}</p>
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
         * <p>Indicates whether simple mode is enabled.</p>
         */
        @NameInMap("DirectedMode")
        public Boolean directedMode;

        /**
         * <p>The ID of the escalation policy.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
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
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The integration ID of the ticket system to which alerts are pushed.</p>
         * 
         * <strong>example:</strong>
         * <p>34</p>
         */
        @NameInMap("IntegrationId")
        public Long integrationId;

        /**
         * <p>The matching rules for alert events.</p>
         */
        @NameInMap("MatchingRules")
        public java.util.List<ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRules> matchingRules;

        /**
         * <p>The name of the notification policy.</p>
         * 
         * <strong>example:</strong>
         * <p>notificationpolicy_test</p>
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
         * <p>Indicates whether the system resends notifications for a long-lasting unresolved alert. Valid values:</p>
         * <ul>
         * <li><code>true</code> (default): The system resends notifications for a long-lasting unresolved alert at a specified time interval.</li>
         * <li><code>false</code>: The system resends notifications for a long-lasting unresolved alert based on an escalation policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Repeat")
        public Boolean repeat;

        /**
         * <p>The time interval at which notifications are resent for a long-lasting unresolved alert. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("RepeatInterval")
        public Long repeatInterval;

        /**
         * <p>Indicates whether the status of an alert automatically changes to Resolved when all events related to the alert change to the Restored state. The system sends a notification to the alert contacts when the alert status changes to Resolved.</p>
         * <ul>
         * <li><code>true</code> (default): The system sends a notification.</li>
         * <li><code>false</code>: The system does not send a notification.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SendRecoverMessage")
        public Boolean sendRecoverMessage;

        /**
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("State")
        public String state;

        public static ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies self = new ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies();
            return TeaModel.build(map, self);
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies setDirectedMode(Boolean directedMode) {
            this.directedMode = directedMode;
            return this;
        }
        public Boolean getDirectedMode() {
            return this.directedMode;
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

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class ListNotificationPoliciesResponseBodyPageBean extends TeaModel {
        /**
         * <p>The queried notification policies.</p>
         */
        @NameInMap("NotificationPolicies")
        public java.util.List<ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies> notificationPolicies;

        /**
         * <p>The number of the page returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Long page;

        /**
         * <p>The number of entries that are returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The number of notification policies that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
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
