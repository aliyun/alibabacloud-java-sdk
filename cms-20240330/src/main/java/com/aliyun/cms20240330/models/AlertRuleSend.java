// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleSend extends TeaModel {
    @NameInMap("action")
    public AlertRuleAction action;

    @NameInMap("notification")
    public AlertRuleNotification notification;

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

}
