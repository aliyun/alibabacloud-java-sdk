// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CheckWebhookRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FD200FAE-E98F-496E-BFE6-4CE61E59A2E9</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=XXX">https://oapi.dingtalk.com/robot/send?access_token=XXX</a></p>
     */
    @NameInMap("webhook")
    public String webhook;

    /**
     * <strong>example:</strong>
     * <p>DING_GROUP</p>
     */
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
