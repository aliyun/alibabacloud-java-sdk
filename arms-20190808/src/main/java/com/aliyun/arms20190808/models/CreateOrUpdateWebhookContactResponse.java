// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateWebhookContactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOrUpdateWebhookContactResponseBody body;

    public static CreateOrUpdateWebhookContactResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateWebhookContactResponse self = new CreateOrUpdateWebhookContactResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateWebhookContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrUpdateWebhookContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrUpdateWebhookContactResponse setBody(CreateOrUpdateWebhookContactResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrUpdateWebhookContactResponseBody getBody() {
        return this.body;
    }

}
