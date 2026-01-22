// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateAlertWebhookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAlertWebhookResponseBody body;

    public static CreateAlertWebhookResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertWebhookResponse self = new CreateAlertWebhookResponse();
        return TeaModel.build(map, self);
    }

    public CreateAlertWebhookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAlertWebhookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAlertWebhookResponse setBody(CreateAlertWebhookResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAlertWebhookResponseBody getBody() {
        return this.body;
    }

}
