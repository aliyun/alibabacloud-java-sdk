// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightOrderPayCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IntlFlightOrderPayCheckResponseBody body;

    public static IntlFlightOrderPayCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightOrderPayCheckResponse self = new IntlFlightOrderPayCheckResponse();
        return TeaModel.build(map, self);
    }

    public IntlFlightOrderPayCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IntlFlightOrderPayCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IntlFlightOrderPayCheckResponse setBody(IntlFlightOrderPayCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public IntlFlightOrderPayCheckResponseBody getBody() {
        return this.body;
    }

}
