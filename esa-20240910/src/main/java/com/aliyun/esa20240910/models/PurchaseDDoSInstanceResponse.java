// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PurchaseDDoSInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PurchaseDDoSInstanceResponseBody body;

    public static PurchaseDDoSInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        PurchaseDDoSInstanceResponse self = new PurchaseDDoSInstanceResponse();
        return TeaModel.build(map, self);
    }

    public PurchaseDDoSInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PurchaseDDoSInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PurchaseDDoSInstanceResponse setBody(PurchaseDDoSInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public PurchaseDDoSInstanceResponseBody getBody() {
        return this.body;
    }

}
