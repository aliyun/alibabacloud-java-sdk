// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopApplyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IntlFlightReShopApplyResponseBody body;

    public static IntlFlightReShopApplyResponse build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopApplyResponse self = new IntlFlightReShopApplyResponse();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopApplyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IntlFlightReShopApplyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IntlFlightReShopApplyResponse setBody(IntlFlightReShopApplyResponseBody body) {
        this.body = body;
        return this;
    }
    public IntlFlightReShopApplyResponseBody getBody() {
        return this.body;
    }

}
