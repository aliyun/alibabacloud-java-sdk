// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class NotificationChannelsFilter extends TeaModel {
    /**
     * <p>The alert contact list of the rule contains any value in the array (OR semantics), corresponding to V1 notification.contacts.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;John&quot;,&quot;Jane&quot;]</p>
     */
    @NameInMap("containsContacts")
    public java.util.List<String> containsContacts;

    /**
     * <p>The custom webhook list of the rule contains any value in the array (OR semantics), corresponding to V1 notification.customWebhooks.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;<a href="https://my-service.example.com/webhook/alert%22%5D">https://my-service.example.com/webhook/alert&quot;]</a></p>
     */
    @NameInMap("containsCustomWebhooks")
    public java.util.List<String> containsCustomWebhooks;

    /**
     * <p>The DingTalk webhook list of the rule contains any value in the array (OR semantics), corresponding to V1 notification.dingWebhooks.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;<a href="https://oapi.dingtalk.com/robot/send?access_token=abc123%22%5D">https://oapi.dingtalk.com/robot/send?access_token=abc123&quot;]</a></p>
     */
    @NameInMap("containsDingWebhooks")
    public java.util.List<String> containsDingWebhooks;

    /**
     * <p>The Lark webhook list of the rule contains any value in the array (OR semantics), corresponding to V1 notification.fsWebhooks.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;<a href="https://open.feishu.cn/open-apis/bot/v2/hook/abc123%22%5D">https://open.feishu.cn/open-apis/bot/v2/hook/abc123&quot;]</a></p>
     */
    @NameInMap("containsFsWebhooks")
    public java.util.List<String> containsFsWebhooks;

    /**
     * <p>The alert contact group list of the rule contains any value in the array (OR semantics), corresponding to V1 notification.groups.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;OpsTeam&quot;,&quot;SRETeam&quot;]</p>
     */
    @NameInMap("containsGroups")
    public java.util.List<String> containsGroups;

    /**
     * <p>The Slack webhook list of the rule contains any value in the array (OR semantics), corresponding to V1 notification.slackWebhooks.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;<a href="https://hooks.slack.com/services/T00000000/B00000000/XXXXXXXX%22%5D">https://hooks.slack.com/services/T00000000/B00000000/XXXXXXXX&quot;]</a></p>
     */
    @NameInMap("containsSlackWebhooks")
    public java.util.List<String> containsSlackWebhooks;

    /**
     * <p>The WeCom webhook list of the rule contains any value in the array (OR semantics), corresponding to V1 notification.wxWebhooks.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;<a href="https://qyapi.weixin.qq.com/cgi-bin/webhook/send?key=abc123%22%5D">https://qyapi.weixin.qq.com/cgi-bin/webhook/send?key=abc123&quot;]</a></p>
     */
    @NameInMap("containsWxWebhooks")
    public java.util.List<String> containsWxWebhooks;

    public static NotificationChannelsFilter build(java.util.Map<String, ?> map) throws Exception {
        NotificationChannelsFilter self = new NotificationChannelsFilter();
        return TeaModel.build(map, self);
    }

    public NotificationChannelsFilter setContainsContacts(java.util.List<String> containsContacts) {
        this.containsContacts = containsContacts;
        return this;
    }
    public java.util.List<String> getContainsContacts() {
        return this.containsContacts;
    }

    public NotificationChannelsFilter setContainsCustomWebhooks(java.util.List<String> containsCustomWebhooks) {
        this.containsCustomWebhooks = containsCustomWebhooks;
        return this;
    }
    public java.util.List<String> getContainsCustomWebhooks() {
        return this.containsCustomWebhooks;
    }

    public NotificationChannelsFilter setContainsDingWebhooks(java.util.List<String> containsDingWebhooks) {
        this.containsDingWebhooks = containsDingWebhooks;
        return this;
    }
    public java.util.List<String> getContainsDingWebhooks() {
        return this.containsDingWebhooks;
    }

    public NotificationChannelsFilter setContainsFsWebhooks(java.util.List<String> containsFsWebhooks) {
        this.containsFsWebhooks = containsFsWebhooks;
        return this;
    }
    public java.util.List<String> getContainsFsWebhooks() {
        return this.containsFsWebhooks;
    }

    public NotificationChannelsFilter setContainsGroups(java.util.List<String> containsGroups) {
        this.containsGroups = containsGroups;
        return this;
    }
    public java.util.List<String> getContainsGroups() {
        return this.containsGroups;
    }

    public NotificationChannelsFilter setContainsSlackWebhooks(java.util.List<String> containsSlackWebhooks) {
        this.containsSlackWebhooks = containsSlackWebhooks;
        return this;
    }
    public java.util.List<String> getContainsSlackWebhooks() {
        return this.containsSlackWebhooks;
    }

    public NotificationChannelsFilter setContainsWxWebhooks(java.util.List<String> containsWxWebhooks) {
        this.containsWxWebhooks = containsWxWebhooks;
        return this;
    }
    public java.util.List<String> getContainsWxWebhooks() {
        return this.containsWxWebhooks;
    }

}
