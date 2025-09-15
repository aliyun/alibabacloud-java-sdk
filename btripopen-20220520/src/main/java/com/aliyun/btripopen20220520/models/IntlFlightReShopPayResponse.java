// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopPayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IntlFlightReShopPayResponseBody body;

    public static IntlFlightReShopPayResponse build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopPayResponse self = new IntlFlightReShopPayResponse();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopPayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IntlFlightReShopPayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IntlFlightReShopPayResponse setBody(IntlFlightReShopPayResponseBody body) {
        this.body = body;
        return this;
    }
    public IntlFlightReShopPayResponseBody getBody() {
        return this.body;
    }

}
