// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class GetWebhookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWebhookResponseBody body;

    public static GetWebhookResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWebhookResponse self = new GetWebhookResponse();
        return TeaModel.build(map, self);
    }

    public GetWebhookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWebhookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWebhookResponse setBody(GetWebhookResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWebhookResponseBody getBody() {
        return this.body;
    }

}
