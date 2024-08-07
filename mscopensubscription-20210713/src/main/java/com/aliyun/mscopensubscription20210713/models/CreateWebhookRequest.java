// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class CreateWebhookRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>abc-def</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>zh-cn</p>
     */
    @NameInMap("Locale")
    public String locale;

    /**
     * <p>回调地址</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=">https://oapi.dingtalk.com/robot/send?access_token=</a></p>
     */
    @NameInMap("ServerUrl")
    public String serverUrl;

    /**
     * <p>名称</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("WebhookName")
    public String webhookName;

    public static CreateWebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWebhookRequest self = new CreateWebhookRequest();
        return TeaModel.build(map, self);
    }

    public CreateWebhookRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateWebhookRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public CreateWebhookRequest setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
        return this;
    }
    public String getServerUrl() {
        return this.serverUrl;
    }

    public CreateWebhookRequest setWebhookName(String webhookName) {
        this.webhookName = webhookName;
        return this;
    }
    public String getWebhookName() {
        return this.webhookName;
    }

}
