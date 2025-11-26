// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleSend extends TeaModel {
    @NameInMap("action")
    public AlertRuleAction action;

    @NameInMap("notification")
    public AlertRuleNotification notification;

    @NameInMap("notifyStrategies")
    public java.util.List<String> notifyStrategies;

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

    public AlertRuleSend setSendToArms(Boolean sendToArms) {
        this.sendToArms = sendToArms;
        return this;
    }
    public Boolean getSendToArms() {
        return this.sendToArms;
    }

}
