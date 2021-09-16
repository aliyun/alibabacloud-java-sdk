// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CheckWebhookRequest extends TeaModel {
    // 幂等校验token
    @NameInMap("clientToken")
    public String clientToken;

    // webook地址
    @NameInMap("webhook")
    public String webhook;

    // webhook地址类型 企业微信WEIXIN_GROUP 钉钉群 DING_GROUP 飞书 FEISHU_GROUP
    @NameInMap("webhookType")
    public String webhookType;

    public static CheckWebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckWebhookRequest self = new CheckWebhookRequest();
        return TeaModel.build(map, self);
    }

    public CheckWebhookRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CheckWebhookRequest setWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
    public String getWebhook() {
        return this.webhook;
    }

    public CheckWebhookRequest setWebhookType(String webhookType) {
        this.webhookType = webhookType;
        return this;
    }
    public String getWebhookType() {
        return this.webhookType;
    }

}
