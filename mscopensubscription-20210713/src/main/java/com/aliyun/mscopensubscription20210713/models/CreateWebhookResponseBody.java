// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class CreateWebhookResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("WebhookId")
    public Long webhookId;

    public static CreateWebhookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWebhookResponseBody self = new CreateWebhookResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWebhookResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateWebhookResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateWebhookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWebhookResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateWebhookResponseBody setWebhookId(Long webhookId) {
        this.webhookId = webhookId;
        return this;
    }
    public Long getWebhookId() {
        return this.webhookId;
    }

}
