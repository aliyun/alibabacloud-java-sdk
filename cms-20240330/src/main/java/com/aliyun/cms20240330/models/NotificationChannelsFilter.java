// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class NotificationChannelsFilter extends TeaModel {
    /**
     * <p>The list of notification contacts in the rule contains any value in the array. This uses OR logic and corresponds to notification.contacts in V1.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;张三&quot;,&quot;李四&quot;]</p>
     */
    @NameInMap("containsContacts")
    public java.util.List<String> containsContacts;

    /**
     * <p>The list of custom webhooks in the rule contains any value in the array. This uses OR logic and corresponds to notification.customWebhooks in V1.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;<a href="https://my-service.example.com/webhook/alert%22%5D">https://my-service.example.com/webhook/alert&quot;]</a></p>
     */
    @NameInMap("containsCustomWebhooks")
    public java.util.List<String> containsCustomWebhooks;

    /**
     * <p>The list of DingTalk webhooks in the rule contains any value in the array. This uses OR logic and corresponds to notification.dingWebhooks in V1.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;<a href="https://oapi.dingtalk.com/robot/send?access_token=abc123%22%5D">https://oapi.dingtalk.com/robot/send?access_token=abc123&quot;]</a></p>
     */
    @NameInMap("containsDingWebhooks")
    public java.util.List<String> containsDingWebhooks;

    /**
     * <p>The list of Lark webhooks in the rule contains any value in the array. This uses OR logic and corresponds to notification.fsWebhooks in V1.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;<a href="https://open.feishu.cn/open-apis/bot/v2/hook/abc123%22%5D">https://open.feishu.cn/open-apis/bot/v2/hook/abc123&quot;]</a></p>
     */
    @NameInMap("containsFsWebhooks")
    public java.util.List<String> containsFsWebhooks;

    /**
     * <p>The list of contact groups in the rule contains any value in the array. This uses OR logic and corresponds to notification.groups in V1.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;运维组&quot;,&quot;SRE团队&quot;]</p>
     */
    @NameInMap("containsGroups")
    public java.util.List<String> containsGroups;

    /**
     * <p>The list of Slack webhooks in the rule contains any value in the array. This uses OR logic and corresponds to notification.slackWebhooks in V1.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;<a href="https://hooks.slack.com/services/T00000000/B00000000/XXXXXXXX%22%5D">https://hooks.slack.com/services/T00000000/B00000000/XXXXXXXX&quot;]</a></p>
     */
    @NameInMap("containsSlackWebhooks")
    public java.util.List<String> containsSlackWebhooks;

    /**
     * <p>The list of WeCom webhooks in the rule contains any value in the array. This uses OR logic and corresponds to notification.wxWebhooks in V1.</p>
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
