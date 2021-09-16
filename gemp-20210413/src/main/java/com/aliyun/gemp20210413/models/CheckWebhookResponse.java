// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CheckWebhookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CheckWebhookResponse setBody(CheckWebhookResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckWebhookResponseBody getBody() {
        return this.body;
    }

}
