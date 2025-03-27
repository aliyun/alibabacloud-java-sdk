// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PurchaseCacheReserveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PurchaseCacheReserveResponseBody body;

    public static PurchaseCacheReserveResponse build(java.util.Map<String, ?> map) throws Exception {
        PurchaseCacheReserveResponse self = new PurchaseCacheReserveResponse();
        return TeaModel.build(map, self);
    }

    public PurchaseCacheReserveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PurchaseCacheReserveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PurchaseCacheReserveResponse setBody(PurchaseCacheReserveResponseBody body) {
        this.body = body;
        return this;
    }
    public PurchaseCacheReserveResponseBody getBody() {
        return this.body;
    }

}
