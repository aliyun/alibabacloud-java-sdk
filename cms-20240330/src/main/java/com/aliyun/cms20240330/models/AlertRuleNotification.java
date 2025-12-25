// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleNotification extends TeaModel {
    @NameInMap("contacts")
    public java.util.List<String> contacts;

    @NameInMap("customWebhooks")
    public java.util.List<String> customWebhooks;

    @NameInMap("dingCoolAppWebhooks")
    public java.util.List<String> dingCoolAppWebhooks;

    @NameInMap("dingWebhooks")
    public java.util.List<String> dingWebhooks;

    @NameInMap("fsWebhooks")
    public java.util.List<String> fsWebhooks;

    @NameInMap("groups")
    public java.util.List<String> groups;

    @NameInMap("notifyTime")
    public AlertRuleTimeSpan notifyTime;

    @NameInMap("silenceTime")
    public Long silenceTime;

    @NameInMap("slackWebhooks")
    public java.util.List<String> slackWebhooks;

    @NameInMap("wxWebhooks")
    public java.util.List<String> wxWebhooks;

    public static AlertRuleNotification build(java.util.Map<String, ?> map) throws Exception {
        AlertRuleNotification self = new AlertRuleNotification();
        return TeaModel.build(map, self);
    }

    public AlertRuleNotification setContacts(java.util.List<String> contacts) {
        this.contacts = contacts;
        return this;
    }
    public java.util.List<String> getContacts() {
        return this.contacts;
    }

    public AlertRuleNotification setCustomWebhooks(java.util.List<String> customWebhooks) {
        this.customWebhooks = customWebhooks;
        return this;
    }
    public java.util.List<String> getCustomWebhooks() {
        return this.customWebhooks;
    }

    public AlertRuleNotification setDingCoolAppWebhooks(java.util.List<String> dingCoolAppWebhooks) {
        this.dingCoolAppWebhooks = dingCoolAppWebhooks;
        return this;
    }
    public java.util.List<String> getDingCoolAppWebhooks() {
        return this.dingCoolAppWebhooks;
    }

    public AlertRuleNotification setDingWebhooks(java.util.List<String> dingWebhooks) {
        this.dingWebhooks = dingWebhooks;
        return this;
    }
    public java.util.List<String> getDingWebhooks() {
        return this.dingWebhooks;
    }

    public AlertRuleNotification setFsWebhooks(java.util.List<String> fsWebhooks) {
        this.fsWebhooks = fsWebhooks;
        return this;
    }
    public java.util.List<String> getFsWebhooks() {
        return this.fsWebhooks;
    }

    public AlertRuleNotification setGroups(java.util.List<String> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<String> getGroups() {
        return this.groups;
    }

    public AlertRuleNotification setNotifyTime(AlertRuleTimeSpan notifyTime) {
        this.notifyTime = notifyTime;
        return this;
    }
    public AlertRuleTimeSpan getNotifyTime() {
        return this.notifyTime;
    }

    public AlertRuleNotification setSilenceTime(Long silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public Long getSilenceTime() {
        return this.silenceTime;
    }

    public AlertRuleNotification setSlackWebhooks(java.util.List<String> slackWebhooks) {
        this.slackWebhooks = slackWebhooks;
        return this;
    }
    public java.util.List<String> getSlackWebhooks() {
        return this.slackWebhooks;
    }

    public AlertRuleNotification setWxWebhooks(java.util.List<String> wxWebhooks) {
        this.wxWebhooks = wxWebhooks;
        return this;
    }
    public java.util.List<String> getWxWebhooks() {
        return this.wxWebhooks;
    }

}
