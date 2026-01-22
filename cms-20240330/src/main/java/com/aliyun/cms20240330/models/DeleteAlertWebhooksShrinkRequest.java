// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteAlertWebhooksShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("webhookIds")
    public String webhookIdsShrink;

    public static DeleteAlertWebhooksShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertWebhooksShrinkRequest self = new DeleteAlertWebhooksShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlertWebhooksShrinkRequest setWebhookIdsShrink(String webhookIdsShrink) {
        this.webhookIdsShrink = webhookIdsShrink;
        return this;
    }
    public String getWebhookIdsShrink() {
        return this.webhookIdsShrink;
    }

}
