// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class DeleteWebhookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteWebhookResponseBody body;

    public static DeleteWebhookResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebhookResponse self = new DeleteWebhookResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWebhookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWebhookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWebhookResponse setBody(DeleteWebhookResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWebhookResponseBody getBody() {
        return this.body;
    }

}
