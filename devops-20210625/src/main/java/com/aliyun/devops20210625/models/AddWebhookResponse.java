// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class AddWebhookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddWebhookResponseBody body;

    public static AddWebhookResponse build(java.util.Map<String, ?> map) throws Exception {
        AddWebhookResponse self = new AddWebhookResponse();
        return TeaModel.build(map, self);
    }

    public AddWebhookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddWebhookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddWebhookResponse setBody(AddWebhookResponseBody body) {
        this.body = body;
        return this;
    }
    public AddWebhookResponseBody getBody() {
        return this.body;
    }

}
