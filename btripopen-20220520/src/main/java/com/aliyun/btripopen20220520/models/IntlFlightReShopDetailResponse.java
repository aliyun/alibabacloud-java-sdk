// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IntlFlightReShopDetailResponseBody body;

    public static IntlFlightReShopDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopDetailResponse self = new IntlFlightReShopDetailResponse();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IntlFlightReShopDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IntlFlightReShopDetailResponse setBody(IntlFlightReShopDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public IntlFlightReShopDetailResponseBody getBody() {
        return this.body;
    }

}
