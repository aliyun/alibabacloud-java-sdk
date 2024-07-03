// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class SetEventSubscriptionRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the event subscription feature. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disables the event subscription feature.</li>
     * <li><strong>1</strong>: enables the event subscription feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Active")
    public String active;

    /**
     * <p>The notification method. Valid values:</p>
     * <ul>
     * <li><strong>hdm_alarm_sms</strong>: text message.</li>
     * <li><strong>dingtalk</strong>: DingTalk chatbot.</li>
     * <li><strong>hdm_alarm_sms_and_email</strong>: text message and email.</li>
     * <li><strong>hdm_alarm_sms,dingtalk</strong>: text message and DingTalk chatbot.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hdm_alarm_sms,dingtalk</p>
     */
    @NameInMap("ChannelType")
    public String channelType;

    /**
     * <p>The name of the contact group that receives alert notifications. Separate multiple names with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>Default contact group</p>
     */
    @NameInMap("ContactGroupName")
    public String contactGroupName;

    /**
     * <p>The name of the contact who receives alert notifications. Separate multiple names with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>Default contact</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <p>The notification rules based on the event type. If you leave this parameter empty, the values of <strong>MinInterval</strong> and <strong>ChannelType</strong> prevail.</p>
     * <p>Specify this parameter in the following format: <code>{&quot;silenced&quot;: {&quot;Event type 1&quot;:Specifies whether to enable adaptive silence, &quot;Event type 2&quot;:Specify whether to enable adaptive silence},&quot;min_interval&quot;: {&quot;Event type 1&quot;:Minimum interval between event notifications, &quot;Event type 2&quot;:Minimum interval between event notifications},&quot;alert_type&quot;: {&quot;Event type 1&quot;:&quot;Notification method&quot;, &quot;Event type 2&quot;:&quot;Notification method&quot;}}</code>.</p>
     * <ul>
     * <li><p><strong>silenced</strong>: specifies whether to enable adaptive silence. After you enable adaptive silence, the interval between consecutive alert notifications for an event is the greater one of the minimum interval specified by <strong>min_interval</strong> and one third of the event duration. Valid values:</p>
     * <ul>
     * <li>1: enables adaptive silence.</li>
     * <li>2: disables adaptive silence.</li>
     * </ul>
     * </li>
     * <li><p><strong>min_interval</strong>: the minimum interval between event notifications. Unit: seconds.</p>
     * </li>
     * <li><p><strong>alert_type</strong>: the notification method. Valid values:</p>
     * <ul>
     * <li><strong>hdm_alarm_sms</strong>: text message.</li>
     * <li><strong>dingtalk</strong>: DingTalk chatbot.</li>
     * <li><strong>hdm_alarm_sms_and_email</strong>: text message and email.</li>
     * <li><strong>hdm_alarm_sms,dingtalk</strong>: text message and DingTalk chatbot.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;silenced&quot;: {&quot;AutoScale&quot;:1, &quot;SQLThrottle&quot;:0, &quot;TimeSeriesAbnormal&quot;: 1}, &quot;min_interval&quot;: {&quot;AutoScale&quot;:300, &quot;SQLThrottle&quot;:360, &quot;TimeSeriesAbnormal&quot;: 120}, &quot;alert_type&quot;: {&quot;AutoScale&quot;:&quot;hdm_alarm_sms&quot;, &quot;SQLThrottle&quot;:&quot;hdm_alarm_sms_and_email&quot;, &quot;TimeSeriesAbnormal&quot;: &quot;hdm_alarm_sms,dingtalk&quot;}}</p>
     */
    @NameInMap("DispatchRule")
    public String dispatchRule;

    /**
     * <p>The supported event scenarios. You can set the value to <strong>AllContext</strong>, which indicates that all scenarios are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>AllContext</p>
     */
    @NameInMap("EventContext")
    public String eventContext;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze8g2am97624****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of event notifications. You can set the value to <strong>zh-CN</strong>, which indicates that event notifications are sent in Chinese.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The risk level of the events. Valid values:</p>
     * <ul>
     * <li><strong>Notice</strong>: events that trigger notifications, including events at the <strong>Notice</strong>, <strong>Optimization</strong>, <strong>Warn</strong>, and <strong>Critical</strong> levels.</li>
     * <li><strong>Optimization</strong>: events that trigger optimizations, including events at the <strong>Optimization</strong>, <strong>Warn</strong>, and <strong>Critical</strong> levels.</li>
     * <li><strong>Warn</strong>: events that trigger warnings, including events at the <strong>Warn</strong> and <strong>Critical</strong> levels.</li>
     * <li><strong>Critical</strong>: events that trigger critical warnings.</li>
     * </ul>
     * <p>The following content describes the events at each level in detail:</p>
     * <ul>
     * <li>Notice: events that are related to database exceptions for which no suggestions are generated.</li>
     * <li>Optimization: events for which optimization suggestions are generated based on the status of the database.</li>
     * <li>Warn: events that may affect the running of the database.</li>
     * <li>Critical: events that affect the running of the database.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Optimization</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The minimum interval between consecutive event notifications. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("MinInterval")
    public String minInterval;

    /**
     * <p>The alert severity based on the event type.</p>
     * <p>Specify this parameter in the following format: <code>{&quot;Event type 1&quot;:&quot;Alert severity&quot;, &quot;Event type 2&quot;:&quot;Alert severity&quot;}</code>.</p>
     * <p>Valid values of event types:</p>
     * <ul>
     * <li><strong>AutoScale</strong>: auto scaling event.</li>
     * <li><strong>SQLThrottle</strong>: throttling event.</li>
     * <li><strong>TimeSeriesAbnormal</strong>: event for detecting time series anomalies.</li>
     * <li><strong>SQLOptimize</strong>: SQL optimization event.</li>
     * <li><strong>ResourceOptimize</strong>: storage optimization event.</li>
     * </ul>
     * <p>Valid values of alert severities:</p>
     * <ul>
     * <li><strong>info</strong></li>
     * <li><strong>noticed</strong></li>
     * <li><strong>warning</strong></li>
     * <li><strong>critical</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AutoScale&quot;:&quot;critical&quot;,&quot;SQLThrottle&quot;:&quot;info&quot;,&quot;TimeSeriesAbnormal&quot;:&quot;warning&quot;}</p>
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
