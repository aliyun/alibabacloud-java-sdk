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
     */
    @NameInMap("EscalationPolicyId")
    public Long escalationPolicyId;

    /**
     * <p>An array of alert event group objects.</p>
     * <br>
     * <p>*   If you do not specify the groupingFields field, all alerts will be sent to contacts based on `alertname`.</p>
     * <br>
     * <p>*   If you specify the groupingFields field, alerts with the same field will be sent to contacts in one notification.</p>
     * <br>
     * <p>    Sample statement:</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p>{ </p>
     * <p>"groupWait":5,    // The waiting time for grouping. </p>
     * <p>"groupInterval":30,     // The time interval of grouping. </p>
     * <p>"groupingFields":["alertname"]       // The field that is used to group alert events. </p>
     * <p>}</p>
     * <p>```</p>
     */
    @NameInMap("GroupRule")
    public String groupRule;

    /**
     * <p>The ID of the notification policy.</p>
     * <br>
     * <p>*   If you do not specify this parameter, a new notification policy is created.</p>
     * <p>*   If you specify this parameter, the specified notification policy is modified.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The integration ID of the ticket system to which alerts are pushed.</p>
     */
    @NameInMap("IntegrationId")
    public Long integrationId;

    /**
     * <p>The matching rules. Sample statement:</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p>[</p>
     * <p> {</p>
     * <p> "matchingConditions": [</p>
     * <p> { </p>
     * <p> "value": "test",    // The value of the matching condition. </p>
     * <p> "key": "alertname",     // The key of the matching condition. </p>
     * <p> "operator": "eq"   // The logical operator of the matching condition, including eq (equal to), neq (not equal to), in (contains), nin (does not contain), re (regular expression match), and nre (regular expression mismatch).   </p>
     * <p> }</p>
     * <p> ]</p>
     * <p> } </p>
     * <p> ]</p>
     * <p>```</p>
     */
    @NameInMap("MatchingRules")
    public String matchingRules;

    /**
     * <p>The name of the notification policy.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>An array of notification rule objects. Format:</p>
     * <br>
     * <p>    { </p>
     * <p>     "notifyStartTime":"00:00",      // The start time of the notification window. </p>
     * <p>     "notifyEndTime":"23:59",       // The end time of the notification window. </p>
     * <p>     "notifyChannels":["dingTalk", "email", "sms", "tts", "webhook"],       // The notification methods. Valid values: dingTalk, email, sms, tts, and webhook. </p>
     * <p>     "notifyObjects":[{       // An array of notification objects. </p>
     * <p>     "notifyObjectType":"CONTACT",       // The type of the notification object. Valid values: CONTACT (contact), CONTACT_GROUP (contact group), ARMS_CONTACT (ARMS contact), ARMS_CONTACT_GROUP (ARMS contact group), DING_ROBOT_GROUP (DingTalk, Lark, WeCom, or IM chatbot), and CONTACT_SCHEDULE (user on duty defined by a schedule). </p>
     * <p>     "notifyObjectId":123,       // The ID of the notification object. </p>
     * <p>     "notifyObjectName":"test"       // The name of the notification object. </p>
     * <p>     "notifyChannels": [ // The notification methods specified for a contact. Valid values: email, sms, and tts.</p>
     * <p>                    "email",		</p>
     * <p>                    "sms",</p>
     * <p>                    "tts"</p>
     * <p>                ],</p>
     * <p>     }]</p>
     */
    @NameInMap("NotifyRule")
    public String notifyRule;

    /**
     * <p>The notification template. The default notification template is provided below the table.</p>
     */
    @NameInMap("NotifyTemplate")
    public String notifyTemplate;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to resend a notification for a long-lasting unresolved alert. Default value: true. Valid values:</p>
     * <br>
     * <p>*   `true`: If you set this parameter to `true`, you must set **RepeatInterval**.</p>
     * <p>*   `false`: If you set this parameter to `false`, you must set **EscalationPolicyId**.</p>
     */
    @NameInMap("Repeat")
    public Boolean repeat;

    /**
     * <p>The time interval at which a notification is resent for a long-lasting unresolved alert. Unit: seconds.</p>
     */
    @NameInMap("RepeatInterval")
    public Long repeatInterval;

    /**
     * <p>Indicates whether the system sends a notification to the contacts when the status of an alert changes to Resolved. Default value: true. Valid values:</p>
     * <br>
     * <p>*   `true`: The system sends a notification.</p>
     * <p>*   `false`: The system does not send a notification.</p>
     */
    @NameInMap("SendRecoverMessage")
    public Boolean sendRecoverMessage;

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

}
