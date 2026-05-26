// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentretailvision20260506.models;

import com.aliyun.tea.*;

public class RegisterWebhookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RegisterWebhookResponseBody body;

    public static RegisterWebhookResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterWebhookResponse self = new RegisterWebhookResponse();
        return TeaModel.build(map, self);
    }

    public RegisterWebhookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterWebhookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterWebhookResponse setBody(RegisterWebhookResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterWebhookResponseBody getBody() {
        return this.body;
    }

}
