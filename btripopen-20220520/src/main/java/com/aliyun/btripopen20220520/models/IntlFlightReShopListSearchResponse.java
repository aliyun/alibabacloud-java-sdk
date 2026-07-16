// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopListSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IntlFlightReShopListSearchResponseBody body;

    public static IntlFlightReShopListSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopListSearchResponse self = new IntlFlightReShopListSearchResponse();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopListSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IntlFlightReShopListSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IntlFlightReShopListSearchResponse setBody(IntlFlightReShopListSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public IntlFlightReShopListSearchResponseBody getBody() {
        return this.body;
    }

}
