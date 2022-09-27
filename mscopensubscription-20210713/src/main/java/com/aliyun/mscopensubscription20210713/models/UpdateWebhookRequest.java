// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class UpdateWebhookRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Locale")
    public String locale;

    @NameInMap("ServerUrl")
    public String serverUrl;

    @NameInMap("WebhookId")
    public Long webhookId;

    @NameInMap("WebhookName")
    public String webhookName;

    public static UpdateWebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebhookRequest self = new UpdateWebhookRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWebhookRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateWebhookRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public UpdateWebhookRequest setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
        return this;
    }
    public String getServerUrl() {
        return this.serverUrl;
    }

    public UpdateWebhookRequest setWebhookId(Long webhookId) {
        this.webhookId = webhookId;
        return this;
    }
    public Long getWebhookId() {
        return this.webhookId;
    }

    public UpdateWebhookRequest setWebhookName(String webhookName) {
        this.webhookName = webhookName;
        return this;
    }
    public String getWebhookName() {
        return this.webhookName;
    }

}
