// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightRefundDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IntlFlightRefundDetailResponseBody body;

    public static IntlFlightRefundDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightRefundDetailResponse self = new IntlFlightRefundDetailResponse();
        return TeaModel.build(map, self);
    }

    public IntlFlightRefundDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IntlFlightRefundDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IntlFlightRefundDetailResponse setBody(IntlFlightRefundDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public IntlFlightRefundDetailResponseBody getBody() {
        return this.body;
    }

}
