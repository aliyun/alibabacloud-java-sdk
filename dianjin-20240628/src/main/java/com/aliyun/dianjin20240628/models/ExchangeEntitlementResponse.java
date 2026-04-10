// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class ExchangeEntitlementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExchangeEntitlementResponseBody body;

    public static ExchangeEntitlementResponse build(java.util.Map<String, ?> map) throws Exception {
        ExchangeEntitlementResponse self = new ExchangeEntitlementResponse();
        return TeaModel.build(map, self);
    }

    public ExchangeEntitlementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExchangeEntitlementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExchangeEntitlementResponse setBody(ExchangeEntitlementResponseBody body) {
        this.body = body;
        return this;
    }
    public ExchangeEntitlementResponseBody getBody() {
        return this.body;
    }

}
