// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleSend extends TeaModel {
    /**
     * <p>The alert action integration configuration.</p>
     */
    @NameInMap("action")
    public AlertRuleAction action;

    /**
     * <p>The alert notification configuration.</p>
     */
    @NameInMap("notification")
    public AlertRuleNotification notification;

    /**
     * <p>The list of notification policies that define the notification methods or Policy Name values to use for different alert states, such as triggered and recover.</p>
     */
    @NameInMap("notifyStrategies")
    public java.util.List<String> notifyStrategies;

    /**
     * <p>The root cause analysis (RCA) configuration. After this feature is enabled, root cause analysis is automatically performed when an alert is triggered.</p>
     */
    @NameInMap("rcaConfig")
    public AlertRuleRcaConfig rcaConfig;

    /**
     * <p>Indicates whether event delivery of alert events to ARMS alert management is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("sendToArms")
    public Boolean sendToArms;

    public static AlertRuleSend build(java.util.Map<String, ?> map) throws Exception {
        AlertRuleSend self = new AlertRuleSend();
        return TeaModel.build(map, self);
    }

    public AlertRuleSend setAction(AlertRuleAction action) {
        this.action = action;
        return this;
    }
    public AlertRuleAction getAction() {
        return this.action;
    }

    public AlertRuleSend setNotification(AlertRuleNotification notification) {
        this.notification = notification;
        return this;
    }
    public AlertRuleNotification getNotification() {
        return this.notification;
    }

    public AlertRuleSend setNotifyStrategies(java.util.List<String> notifyStrategies) {
        this.notifyStrategies = notifyStrategies;
        return this;
    }
    public java.util.List<String> getNotifyStrategies() {
        return this.notifyStrategies;
    }

    public AlertRuleSend setRcaConfig(AlertRuleRcaConfig rcaConfig) {
        this.rcaConfig = rcaConfig;
        return this;
    }
    public AlertRuleRcaConfig getRcaConfig() {
        return this.rcaConfig;
    }

    public AlertRuleSend setSendToArms(Boolean sendToArms) {
        this.sendToArms = sendToArms;
        return this;
    }
    public Boolean getSendToArms() {
        return this.sendToArms;
    }

}
