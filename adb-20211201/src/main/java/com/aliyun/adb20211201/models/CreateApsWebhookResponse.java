// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateApsWebhookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateApsWebhookResponseBody body;

    public static CreateApsWebhookResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApsWebhookResponse self = new CreateApsWebhookResponse();
        return TeaModel.build(map, self);
    }

    public CreateApsWebhookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApsWebhookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApsWebhookResponse setBody(CreateApsWebhookResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApsWebhookResponseBody getBody() {
        return this.body;
    }

}
