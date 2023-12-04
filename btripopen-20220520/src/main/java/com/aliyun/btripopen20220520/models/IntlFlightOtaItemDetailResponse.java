// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightOtaItemDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public IntlFlightOtaItemDetailResponseBody body;

    public static IntlFlightOtaItemDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightOtaItemDetailResponse self = new IntlFlightOtaItemDetailResponse();
        return TeaModel.build(map, self);
    }

    public IntlFlightOtaItemDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IntlFlightOtaItemDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IntlFlightOtaItemDetailResponse setBody(IntlFlightOtaItemDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public IntlFlightOtaItemDetailResponseBody getBody() {
        return this.body;
    }

}
