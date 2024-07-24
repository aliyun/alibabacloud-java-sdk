// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateNotificationPolicyResponseBody extends TeaModel {
    /**
     * <p>An array of notification policy objects.</p>
     */
    @NameInMap("NotificationPolicy")
    public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicy notificationPolicy;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A5EC8221-08F2-4C95-9AF1-49FD998C****</p>
     */
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
         * <p>The field that is used for grouping.</p>
         */
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
        /**
         * <p>The matching conditions.</p>
         */
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
        /**
         * <p>The notification methods specified for a contact.</p>
         */
        @NameInMap("NotifyChannels")
        public java.util.List<String> notifyChannels;

        /**
         * <p>The ID of the notification contact.</p>
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
         * <li>CONTACT: individual contact</li>
         * <li>CONTACT_GROUP: contact group</li>
         * <li>ARMS_CONTACT: individual ARMS contact</li>
         * <li>ARMS_CONTACT_GROUP: ARMS contact group</li>
         * <li>DING_ROBOT_GROUP: DingTalk, Lark, or WeCom IM chatbot</li>
         * <li>CONTACT_SCHEDULE: user on duty defined by a schedule</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CONTACT</p>
         */
        @NameInMap("NotifyObjectType")
        public String notifyObjectType;

        public static CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRuleNotifyObjects build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRuleNotifyObjects self = new CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRuleNotifyObjects();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRuleNotifyObjects setNotifyChannels(java.util.List<String> notifyChannels) {
            this.notifyChannels = notifyChannels;
            return this;
        }
        public java.util.List<String> getNotifyChannels() {
            return this.notifyChannels;
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
        /**
         * <p>The notification methods. Valid values: </p>
         * <ul>
         * <li><code>dingTalk</code>: DingTalk</li>
         * <li><code>email</code>: email</li>
         * <li><code>sms</code>: text message</li>
         * <li><code>tts</code>: phone call</li>
         * <li><code>webhook</code>: webhook</li>
         * </ul>
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
         * <p>An array of notification contact objects.</p>
         */
        @NameInMap("NotifyObjects")
        public java.util.List<CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRuleNotifyObjects> notifyObjects;

        /**
         * <p>The start time of the notification window.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00</p>
         */
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
        /**
         * <p>The content of the alert notification sent through email.</p>
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
         * <p>The content of the alert resolution notification sent through email.</p>
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
         * <p>The title of the alert resolution notification sent through email.</p>
         * 
         * <strong>example:</strong>
         * <p>{{ .commonLabels.alertname }}</p>
         */
        @NameInMap("EmailRecoverTitle")
        public String emailRecoverTitle;

        /**
         * <p>The title of the alert notification sent through email.</p>
         * 
         * <strong>example:</strong>
         * <p>{{ .commonLabels.alertname }}</p>
         */
        @NameInMap("EmailTitle")
        public String emailTitle;

        /**
         * <p>The content of the alert notification sent by the IM robot.</p>
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
         * <p>The content of the alert notification sent through text message.</p>
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
         * <p>The content of the alert resolution notification sent through text message.</p>
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
         * <p>The content of the alert notification by phone.</p>
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
         * <p>The content of the alert resolution notification by phone.</p>
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
         * <p>An array of alert event group objects.</p>
         */
        @NameInMap("GroupRule")
        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyGroupRule groupRule;

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
         * <p>An array of alert event matching rule objects.</p>
         */
        @NameInMap("MatchingRules")
        public java.util.List<CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyMatchingRules> matchingRules;

        /**
         * <p>The name of the notification policy.</p>
         * 
         * <strong>example:</strong>
         * <p>notificationpolicy_test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>An array of notification rule objects.</p>
         */
        @NameInMap("NotifyRule")
        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyRule notifyRule;

        /**
         * <p>An array of notification template objects.</p>
         */
        @NameInMap("NotifyTemplate")
        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicyNotifyTemplate notifyTemplate;

        /**
         * <p>Indicates whether a notification is resent for a long-lasting unresolved alert. Default value: true. Valid values:  </p>
         * <ul>
         * <li><code>true</code>: The system resends a notification for a long-lasting unresolved alert at a specified time interval.</li>
         * <li><code>false</code>: The system sends a notification for a long-lasting unresolved alert based on an escalation policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Repeat")
        public Boolean repeat;

        /**
         * <p>The time interval at which a notification is resent for a long-lasting unresolved alert. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("RepeatInterval")
        public Long repeatInterval;

        /**
         * <p>Indicates whether the system sends a notification to the contacts when the status of an alert changes to Resolved. Default value: true. Valid values:   </p>
         * <ul>
         * <li><code>true</code>: The system sends a notification.</li>
         * <li><code>false</code>: The system does not send a notification.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SendRecoverMessage")
        public Boolean sendRecoverMessage;

        /**
         * <p>Indicates whether the notification policy is enabled. Valid values: enable and disable.</p>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("State")
        public String state;

        public static CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicy self = new CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicy();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicy setDirectedMode(Boolean directedMode) {
            this.directedMode = directedMode;
            return this;
        }
        public Boolean getDirectedMode() {
            return this.directedMode;
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

        public CreateOrUpdateNotificationPolicyResponseBodyNotificationPolicy setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
