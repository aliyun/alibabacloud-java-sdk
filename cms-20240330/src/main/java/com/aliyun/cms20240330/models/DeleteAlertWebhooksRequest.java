// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteAlertWebhooksRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("webhookIds")
    public java.util.List<String> webhookIds;

    public static DeleteAlertWebhooksRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertWebhooksRequest self = new DeleteAlertWebhooksRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlertWebhooksRequest setWebhookIds(java.util.List<String> webhookIds) {
        this.webhookIds = webhookIds;
        return this;
    }
    public java.util.List<String> getWebhookIds() {
        return this.webhookIds;
    }

}
