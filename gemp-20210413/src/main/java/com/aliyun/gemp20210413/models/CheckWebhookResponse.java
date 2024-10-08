// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CheckWebhookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckWebhookResponseBody body;

    public static CheckWebhookResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckWebhookResponse self = new CheckWebhookResponse();
        return TeaModel.build(map, self);
    }

    public CheckWebhookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckWebhookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckWebhookResponse setBody(CheckWebhookResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckWebhookResponseBody getBody() {
        return this.body;
    }

}
