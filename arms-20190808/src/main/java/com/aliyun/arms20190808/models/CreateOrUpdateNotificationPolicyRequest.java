// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateNotificationPolicyRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable simple mode.</p>
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
     * <p>An array of alert event group objects.</p>
     * <ul>
     * <li><p>If you do not specify the groupingFields field, all alerts will be sent to contacts based on <code>alertname</code>.</p>
     * </li>
     * <li><p>If you specify the groupingFields field, alerts with the same field will be sent to contacts in one notification.</p>
     * <p>Sample statement:</p>
     * </li>
     * </ul>
     * <pre><code>
     * { 
     * &quot;groupWait&quot;:5,    // The waiting time for grouping. 
     * &quot;groupInterval&quot;:30,     // The time interval of grouping. 
     * &quot;groupingFields&quot;:[&quot;alertname&quot;]       // The field that is used to group alert events. 
     * }
     * </code></pre>
     * 
     * <strong>example:</strong>
     * <p>{ 	&quot;groupWait&quot;:5, 	&quot;groupInterval&quot;:30, 	&quot;groupingFields&quot;:[&quot;alertname&quot;] }</p>
     */
    @NameInMap("GroupRule")
    public String groupRule;

    /**
     * <p>The ID of the notification policy.</p>
     * <ul>
     * <li>If you do not specify this parameter, a new notification policy is created.</li>
     * <li>If you specify this parameter, the specified notification policy is modified.</li>
     * </ul>
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
     * <p>The matching rules. Sample statement:</p>
     * <pre><code>
     * [
     *  {
     *  &quot;matchingConditions&quot;: [
     *  { 
     *  &quot;value&quot;: &quot;test&quot;,    // The value of the matching condition. 
     *  &quot;key&quot;: &quot;alertname&quot;,     // The key of the matching condition. 
     *  &quot;operator&quot;: &quot;eq&quot;   // The logical operator of the matching condition, including eq (equal to), neq (not equal to), in (contains), nin (does not contain), re (regular expression match), and nre (regular expression mismatch).   
     *  }
     *  ]
     *  } 
     *  ]
     * </code></pre>
     * 
     * <strong>example:</strong>
     * <p>[ 		 { 		 &quot;matchingConditions&quot;: [          { 		 &quot;value&quot;: &quot;test&quot;, 		 &quot;key&quot;: &quot;alertname&quot;, 		 &quot;operator&quot;: &quot;eq&quot;         }       ]     }   ]</p>
     */
    @NameInMap("MatchingRules")
    public String matchingRules;

    /**
     * <p>The name of the notification policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>notificationpolicy_test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>An array of notification rule objects. Format:</p>
     * <pre><code>{ 
     *  &quot;notifyStartTime&quot;:&quot;00:00&quot;,      // The start time of the notification window. 
     *  &quot;notifyEndTime&quot;:&quot;23:59&quot;,       // The end time of the notification window. 
     *  &quot;notifyChannels&quot;:[&quot;dingTalk&quot;, &quot;email&quot;, &quot;sms&quot;, &quot;tts&quot;, &quot;webhook&quot;],       // The notification methods. Valid values: dingTalk, email, sms, tts, and webhook. 
     *  &quot;notifyObjects&quot;:[{       // An array of notification objects. 
     *  &quot;notifyObjectType&quot;:&quot;CONTACT&quot;,       // The type of the notification object. Valid values: CONTACT (contact), CONTACT_GROUP (contact group), ARMS_CONTACT (ARMS contact), ARMS_CONTACT_GROUP (ARMS contact group), DING_ROBOT_GROUP (DingTalk, Lark, WeCom, or IM chatbot), and CONTACT_SCHEDULE (user on duty defined by a schedule). 
     *  &quot;notifyObjectId&quot;:123,       // The ID of the notification object. 
     *  &quot;notifyObjectName&quot;:&quot;test&quot;       // The name of the notification object. 
     *  &quot;notifyChannels&quot;: [ // The notification methods specified for a contact. Valid values: email, sms, and tts.
     *                 &quot;email&quot;,		
     *                 &quot;sms&quot;,
     *                 &quot;tts&quot;
     *             ],
     *  }]
     * </code></pre>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;notifyStartTime&quot;:&quot;00:00&quot;,     &quot;notifyEndTime&quot;:&quot;23:59&quot;,     &quot;notifyChannels&quot;:[         &quot;dingTalk&quot;,         &quot;email&quot;,         &quot;sms&quot;,         &quot;tts&quot;,         &quot;webhook&quot;     ],     &quot;notifyObjects&quot;:[         {             &quot;notifyObjectType&quot;:&quot;CONTACT&quot;,             &quot;notifyObjectId&quot;:123,             &quot;notifyObjectName&quot;:&quot;test&quot;         }     ] }</p>
     */
    @NameInMap("NotifyRule")
    public String notifyRule;

    /**
     * <p>The notification template. The default notification template is provided below the table.</p>
     * 
     * <strong>example:</strong>
     * <p>{{if .commonLabels.clustername }}</p>
     * <p> &gt;  Cluster Name: {{ .commonLabels.clustername }} </p>
     * <p> {{ end }}{{if eq &quot;app&quot; .commonLabels._aliyun_arms_involvedObject_kind }}</p>
     * <p> &gt;  App Name: {{ .commonLabels._aliyun_arms_involvedObject_name }} </p>
     * <p> {{ end }}{{ for .alerts }} &gt;  {{ .annotations.message }} {{if .generatorURL }} <a href="%7B%7B.generatorURL%7D%7D">Details</a>  {{end}} {{if .annotations._aliyun_arms_insights_analyze_link }}[&lt;font color=\&quot;#ff0000\&quot;&gt;diagnostic analysis&lt;/font&gt;]({{ .annotations._aliyun_arms_insights_analyze_link}}){{ end }}{{if  eq &quot;1&quot; .labels._aliyun_arms_denoise_code }} (Important:{{.labels._aliyun_arms_important_reason }}) {{end}}</p>
     * <p>{{end}}</p>
     */
    @NameInMap("NotifyTemplate")
    public String notifyTemplate;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to resend a notification for a long-lasting unresolved alert. Default value: true. Valid values:</p>
     * <ul>
     * <li><code>true</code>: If you set this parameter to <code>true</code>, you must set <strong>RepeatInterval</strong>.</li>
     * <li><code>false</code>: If you set this parameter to <code>false</code>, you must set <strong>EscalationPolicyId</strong>.</li>
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
     * <p>Indicates whether the system sends a notification to the contacts when the status of an alert changes to Resolved. Default value: true. Valid values:</p>
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
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("State")
    public String state;

    public static CreateOrUpdateNotificationPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateNotificationPolicyRequest self = new CreateOrUpdateNotificationPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateNotificationPolicyRequest setDirectedMode(Boolean directedMode) {
        this.directedMode = directedMode;
        return this;
    }
    public Boolean getDirectedMode() {
        return this.directedMode;
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

    public CreateOrUpdateNotificationPolicyRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
