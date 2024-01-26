// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteWebhookContactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWebhookContactResponseBody body;

    public static DeleteWebhookContactResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebhookContactResponse self = new DeleteWebhookContactResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWebhookContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWebhookContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWebhookContactResponse setBody(DeleteWebhookContactResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWebhookContactResponseBody getBody() {
        return this.body;
    }

}
