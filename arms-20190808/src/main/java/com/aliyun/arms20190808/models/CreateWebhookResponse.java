// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateWebhookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWebhookResponseBody body;

    public static CreateWebhookResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWebhookResponse self = new CreateWebhookResponse();
        return TeaModel.build(map, self);
    }

    public CreateWebhookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWebhookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWebhookResponse setBody(CreateWebhookResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWebhookResponseBody getBody() {
        return this.body;
    }

}
