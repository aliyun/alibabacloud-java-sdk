// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightCreateOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IntlFlightCreateOrderResponseBody body;

    public static IntlFlightCreateOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightCreateOrderResponse self = new IntlFlightCreateOrderResponse();
        return TeaModel.build(map, self);
    }

    public IntlFlightCreateOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IntlFlightCreateOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IntlFlightCreateOrderResponse setBody(IntlFlightCreateOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public IntlFlightCreateOrderResponseBody getBody() {
        return this.body;
    }

}
