// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PurchaseBotInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PurchaseBotInstanceResponseBody body;

    public static PurchaseBotInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        PurchaseBotInstanceResponse self = new PurchaseBotInstanceResponse();
        return TeaModel.build(map, self);
    }

    public PurchaseBotInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PurchaseBotInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PurchaseBotInstanceResponse setBody(PurchaseBotInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public PurchaseBotInstanceResponseBody getBody() {
        return this.body;
    }

}
