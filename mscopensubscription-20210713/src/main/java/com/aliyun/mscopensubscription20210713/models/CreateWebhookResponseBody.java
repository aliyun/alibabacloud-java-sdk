// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class CreateWebhookResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>FF1EFA25-9DB3-13E4-9643-5D3AD301C1D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>10086</p>
     */
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
