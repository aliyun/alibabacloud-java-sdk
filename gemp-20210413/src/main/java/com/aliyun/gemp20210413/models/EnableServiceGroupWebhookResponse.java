// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class EnableServiceGroupWebhookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableServiceGroupWebhookResponseBody body;

    public static EnableServiceGroupWebhookResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableServiceGroupWebhookResponse self = new EnableServiceGroupWebhookResponse();
        return TeaModel.build(map, self);
    }

    public EnableServiceGroupWebhookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableServiceGroupWebhookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableServiceGroupWebhookResponse setBody(EnableServiceGroupWebhookResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableServiceGroupWebhookResponseBody getBody() {
        return this.body;
    }

}
