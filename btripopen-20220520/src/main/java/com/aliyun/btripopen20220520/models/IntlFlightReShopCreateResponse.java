// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopCreateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IntlFlightReShopCreateResponseBody body;

    public static IntlFlightReShopCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopCreateResponse self = new IntlFlightReShopCreateResponse();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IntlFlightReShopCreateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IntlFlightReShopCreateResponse setBody(IntlFlightReShopCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public IntlFlightReShopCreateResponseBody getBody() {
        return this.body;
    }

}
