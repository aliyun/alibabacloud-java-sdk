// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class ListWebhooksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWebhooksResponseBody body;

    public static ListWebhooksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWebhooksResponse self = new ListWebhooksResponse();
        return TeaModel.build(map, self);
    }

    public ListWebhooksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWebhooksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWebhooksResponse setBody(ListWebhooksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWebhooksResponseBody getBody() {
        return this.body;
    }

}
