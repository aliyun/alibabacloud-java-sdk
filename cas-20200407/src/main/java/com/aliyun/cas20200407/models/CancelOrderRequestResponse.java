// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CancelOrderRequestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelOrderRequestResponseBody body;

    public static CancelOrderRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelOrderRequestResponse self = new CancelOrderRequestResponse();
        return TeaModel.build(map, self);
    }

    public CancelOrderRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelOrderRequestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelOrderRequestResponse setBody(CancelOrderRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelOrderRequestResponseBody getBody() {
        return this.body;
    }

}
