// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class DeleteWebhookRequest extends TeaModel {
    @NameInMap("Locale")
    public String locale;

    @NameInMap("WebhookId")
    public Long webhookId;

    public static DeleteWebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebhookRequest self = new DeleteWebhookRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWebhookRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public DeleteWebhookRequest setWebhookId(Long webhookId) {
        this.webhookId = webhookId;
        return this;
    }
    public Long getWebhookId() {
        return this.webhookId;
    }

}
