// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateAlertWebhookResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("alertWebhookId")
    public String alertWebhookId;

    /**
     * <strong>example:</strong>
     * <p>264C3E89-XXXX-XXXX-XXXX-CE9C2196C7DC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateAlertWebhookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertWebhookResponseBody self = new CreateAlertWebhookResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAlertWebhookResponseBody setAlertWebhookId(String alertWebhookId) {
        this.alertWebhookId = alertWebhookId;
        return this;
    }
    public String getAlertWebhookId() {
        return this.alertWebhookId;
    }

    public CreateAlertWebhookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
