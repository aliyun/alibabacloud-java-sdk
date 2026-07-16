// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopOtaSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IntlFlightReShopOtaSearchResponseBody body;

    public static IntlFlightReShopOtaSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopOtaSearchResponse self = new IntlFlightReShopOtaSearchResponse();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopOtaSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IntlFlightReShopOtaSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IntlFlightReShopOtaSearchResponse setBody(IntlFlightReShopOtaSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public IntlFlightReShopOtaSearchResponseBody getBody() {
        return this.body;
    }

}
