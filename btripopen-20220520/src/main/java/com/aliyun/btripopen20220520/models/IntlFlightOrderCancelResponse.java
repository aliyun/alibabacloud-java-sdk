// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightOrderCancelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IntlFlightOrderCancelResponseBody body;

    public static IntlFlightOrderCancelResponse build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightOrderCancelResponse self = new IntlFlightOrderCancelResponse();
        return TeaModel.build(map, self);
    }

    public IntlFlightOrderCancelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IntlFlightOrderCancelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IntlFlightOrderCancelResponse setBody(IntlFlightOrderCancelResponseBody body) {
        this.body = body;
        return this;
    }
    public IntlFlightOrderCancelResponseBody getBody() {
        return this.body;
    }

}
