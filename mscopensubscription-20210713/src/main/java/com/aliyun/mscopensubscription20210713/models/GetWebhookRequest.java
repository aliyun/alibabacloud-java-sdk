// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class GetWebhookRequest extends TeaModel {
    @NameInMap("Locale")
    public String locale;

    @NameInMap("WebhookId")
    public Long webhookId;

    public static GetWebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWebhookRequest self = new GetWebhookRequest();
        return TeaModel.build(map, self);
    }

    public GetWebhookRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public GetWebhookRequest setWebhookId(Long webhookId) {
        this.webhookId = webhookId;
        return this;
    }
    public Long getWebhookId() {
        return this.webhookId;
    }

}
