// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteWebhookContactRequest extends TeaModel {
    /**
     * <p>The ID of the webhook alert contact.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
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
