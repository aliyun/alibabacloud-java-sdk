// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopCancelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IntlFlightReShopCancelResponseBody body;

    public static IntlFlightReShopCancelResponse build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopCancelResponse self = new IntlFlightReShopCancelResponse();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopCancelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IntlFlightReShopCancelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IntlFlightReShopCancelResponse setBody(IntlFlightReShopCancelResponseBody body) {
        this.body = body;
        return this;
    }
    public IntlFlightReShopCancelResponseBody getBody() {
        return this.body;
    }

}
