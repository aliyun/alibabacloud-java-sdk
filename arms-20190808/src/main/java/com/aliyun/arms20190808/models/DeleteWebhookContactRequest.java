// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteWebhookContactRequest extends TeaModel {
    @NameInMap("WebhookId")
    public Long webhookId;

    public static DeleteWebhookContactRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebhookContactRequest self = new DeleteWebhookContactRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWebhookContactRequest setWebhookId(Long webhookId) {
        this.webhookId = webhookId;
        return this;
    }
    public Long getWebhookId() {
        return this.webhookId;
    }

}
