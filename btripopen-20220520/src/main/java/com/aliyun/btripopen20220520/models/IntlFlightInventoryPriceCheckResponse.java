// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightInventoryPriceCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IntlFlightInventoryPriceCheckResponseBody body;

    public static IntlFlightInventoryPriceCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightInventoryPriceCheckResponse self = new IntlFlightInventoryPriceCheckResponse();
        return TeaModel.build(map, self);
    }

    public IntlFlightInventoryPriceCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IntlFlightInventoryPriceCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IntlFlightInventoryPriceCheckResponse setBody(IntlFlightInventoryPriceCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public IntlFlightInventoryPriceCheckResponseBody getBody() {
        return this.body;
    }

}
