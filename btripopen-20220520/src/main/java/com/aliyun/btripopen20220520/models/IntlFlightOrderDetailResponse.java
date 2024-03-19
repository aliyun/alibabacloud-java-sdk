// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightOrderDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IntlFlightOrderDetailResponseBody body;

    public static IntlFlightOrderDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightOrderDetailResponse self = new IntlFlightOrderDetailResponse();
        return TeaModel.build(map, self);
    }

    public IntlFlightOrderDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IntlFlightOrderDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IntlFlightOrderDetailResponse setBody(IntlFlightOrderDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public IntlFlightOrderDetailResponseBody getBody() {
        return this.body;
    }

}
