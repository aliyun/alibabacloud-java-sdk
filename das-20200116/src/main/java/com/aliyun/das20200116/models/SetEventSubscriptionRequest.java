// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class SetEventSubscriptionRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the event subscription feature. Valid values:</p>
     * <br>
     * <p>*   **0**: disables the event subscription feature.</p>
     * <p>*   **1**: enables the event subscription feature.</p>
     */
    @NameInMap("Active")
    public String active;

    /**
     * <p>The notification method. Valid values:</p>
     * <br>
     * <p>*   **hdm_alarm_sms**: text message.</p>
     * <p>*   **dingtalk**: DingTalk chatbot.</p>
     * <p>*   **hdm_alarm_sms_and_email**: text message and email.</p>
     * <p>*   **hdm_alarm_sms,dingtalk**: text message and DingTalk chatbot.</p>
     */
    @NameInMap("ChannelType")
    public String channelType;

    /**
     * <p>The name of the contact group that receives alert notifications. Separate multiple names with commas (,).</p>
     */
    @NameInMap("ContactGroupName")
    public String contactGroupName;

    /**
     * <p>The name of the contact who receives alert notifications. Separate multiple names with commas (,).</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <p>The notification rules based on the event type. If you leave this parameter empty, the values of **MinInterval** and **ChannelType** prevail.</p>
     * <br>
     * <p>Specify this parameter in the following format: `{"silenced": {"Event type 1":Specifies whether to enable adaptive silence, "Event type 2":Specify whether to enable adaptive silence},"min_interval": {"Event type 1":Minimum interval between event notifications, "Event type 2":Minimum interval between event notifications},"alert_type": {"Event type 1":"Notification method", "Event type 2":"Notification method"}}`.</p>
     * <br>
     * <p>*   **silenced**: specifies whether to enable adaptive silence. After you enable adaptive silence, the interval between consecutive alert notifications for an event is the greater one of the minimum interval specified by **min_interval** and one third of the event duration. Valid values:</p>
     * <br>
     * <p>    *   1: enables adaptive silence.</p>
     * <p>    *   2: disables adaptive silence.</p>
     * <br>
     * <p>*   **min_interval**: the minimum interval between event notifications. Unit: seconds.</p>
     * <br>
     * <p>*   **alert_type**: the notification method. Valid values:</p>
     * <br>
     * <p>    *   **hdm_alarm_sms**: text message.</p>
     * <p>    *   **dingtalk**: DingTalk chatbot.</p>
     * <p>    *   **hdm_alarm_sms_and_email**: text message and email.</p>
     * <p>    *   **hdm_alarm_sms,dingtalk**: text message and DingTalk chatbot.</p>
     */
    @NameInMap("DispatchRule")
    public String dispatchRule;

    /**
     * <p>The supported event scenarios. You can set the value to **AllContext**, which indicates that all scenarios are supported.</p>
     */
    @NameInMap("EventContext")
    public String eventContext;

    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of event notifications. You can set the value to **zh-CN**, which indicates that event notifications are sent in Chinese.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The risk level of the events. Valid values:</p>
     * <br>
     * <p>*   **Notice**: events that trigger notifications, including events at the **Notice**, **Optimization**, **Warn**, and **Critical** levels.</p>
     * <p>*   **Optimization**: events that trigger optimizations, including events at the **Optimization**, **Warn**, and **Critical** levels.</p>
     * <p>*   **Warn**: events that trigger warnings, including events at the **Warn** and **Critical** levels.</p>
     * <p>*   **Critical**: events that trigger critical warnings.</p>
     * <br>
     * <p>The following content describes the events at each level in detail:</p>
     * <br>
     * <p>*   Notice: events that are related to database exceptions for which no suggestions are generated.</p>
     * <p>*   Optimization: events for which optimization suggestions are generated based on the status of the database.</p>
     * <p>*   Warn: events that may affect the running of the database.</p>
     * <p>*   Critical: events that affect the running of the database.</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The minimum interval between consecutive event notifications. Unit: seconds.</p>
     */
    @NameInMap("MinInterval")
    public String minInterval;

    /**
     * <p>The alert severity based on the event type.</p>
     * <br>
     * <p>Specify this parameter in the following format: `{"Event type 1":"Alert severity", "Event type 2":"Alert severity"}`.</p>
     * <br>
     * <p>Valid values of event types:</p>
     * <br>
     * <p>*   **AutoScale**: auto scaling event.</p>
     * <p>*   **SQLThrottle**: throttling event.</p>
     * <p>*   **TimeSeriesAbnormal**: event for detecting time series anomalies.</p>
     * <p>*   **SQLOptimize**: SQL optimization event.</p>
     * <p>*   **ResourceOptimize**: storage optimization event.</p>
     * <br>
     * <p>Valid values of alert severities:</p>
     * <br>
     * <p>*   **info**</p>
     * <p>*   **noticed**</p>
     * <p>*   **warning**</p>
     * <p>*   **critical**</p>
     */
    @NameInMap("Severity")
    public String severity;

    public static SetEventSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetEventSubscriptionRequest self = new SetEventSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public SetEventSubscriptionRequest setActive(String active) {
        this.active = active;
        return this;
    }
    public String getActive() {
        return this.active;
    }

    public SetEventSubscriptionRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public SetEventSubscriptionRequest setContactGroupName(String contactGroupName) {
        this.contactGroupName = contactGroupName;
        return this;
    }
    public String getContactGroupName() {
        return this.contactGroupName;
    }

    public SetEventSubscriptionRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public SetEventSubscriptionRequest setDispatchRule(String dispatchRule) {
        this.dispatchRule = dispatchRule;
        return this;
    }
    public String getDispatchRule() {
        return this.dispatchRule;
    }

    public SetEventSubscriptionRequest setEventContext(String eventContext) {
        this.eventContext = eventContext;
        return this;
    }
    public String getEventContext() {
        return this.eventContext;
    }

    public SetEventSubscriptionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetEventSubscriptionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SetEventSubscriptionRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public SetEventSubscriptionRequest setMinInterval(String minInterval) {
        this.minInterval = minInterval;
        return this;
    }
    public String getMinInterval() {
        return this.minInterval;
    }

    public SetEventSubscriptionRequest setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

}
