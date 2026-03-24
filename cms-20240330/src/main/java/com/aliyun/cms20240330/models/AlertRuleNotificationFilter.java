// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleNotificationFilter extends TeaModel {
    /**
     * <p>联系人ID过滤</p>
     */
    @NameInMap("contacts")
    public java.util.List<String> contacts;

    /**
     * <p>自定义webhook ID过滤</p>
     */
    @NameInMap("customWebhooks")
    public java.util.List<String> customWebhooks;

    /**
     * <p>钉钉webhook ID过滤</p>
     */
    @NameInMap("dingWebhooks")
    public java.util.List<String> dingWebhooks;

    /**
     * <p>飞书webhook ID过滤</p>
     */
    @NameInMap("fsWebhooks")
    public java.util.List<String> fsWebhooks;

    /**
     * <p>联系人组过滤配置</p>
     */
    @NameInMap("groups")
    public java.util.List<String> groups;

    /**
     * <p>slack webhook ID过滤列表</p>
     */
    @NameInMap("slackWebhooks")
    public java.util.List<String> slackWebhooks;

    /**
     * <p>微信webhook ID过滤</p>
     */
    @NameInMap("wxWebhooks")
    public java.util.List<String> wxWebhooks;

    public static AlertRuleNotificationFilter build(java.util.Map<String, ?> map) throws Exception {
        AlertRuleNotificationFilter self = new AlertRuleNotificationFilter();
        return TeaModel.build(map, self);
    }

    public AlertRuleNotificationFilter setContacts(java.util.List<String> contacts) {
        this.contacts = contacts;
        return this;
    }
    public java.util.List<String> getContacts() {
        return this.contacts;
    }

    public AlertRuleNotificationFilter setCustomWebhooks(java.util.List<String> customWebhooks) {
        this.customWebhooks = customWebhooks;
        return this;
    }
    public java.util.List<String> getCustomWebhooks() {
        return this.customWebhooks;
    }

    public AlertRuleNotificationFilter setDingWebhooks(java.util.List<String> dingWebhooks) {
        this.dingWebhooks = dingWebhooks;
        return this;
    }
    public java.util.List<String> getDingWebhooks() {
        return this.dingWebhooks;
    }

    public AlertRuleNotificationFilter setFsWebhooks(java.util.List<String> fsWebhooks) {
        this.fsWebhooks = fsWebhooks;
        return this;
    }
    public java.util.List<String> getFsWebhooks() {
        return this.fsWebhooks;
    }

    public AlertRuleNotificationFilter setGroups(java.util.List<String> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<String> getGroups() {
        return this.groups;
    }

    public AlertRuleNotificationFilter setSlackWebhooks(java.util.List<String> slackWebhooks) {
        this.slackWebhooks = slackWebhooks;
        return this;
    }
    public java.util.List<String> getSlackWebhooks() {
        return this.slackWebhooks;
    }

    public AlertRuleNotificationFilter setWxWebhooks(java.util.List<String> wxWebhooks) {
        this.wxWebhooks = wxWebhooks;
        return this;
    }
    public java.util.List<String> getWxWebhooks() {
        return this.wxWebhooks;
    }

}
