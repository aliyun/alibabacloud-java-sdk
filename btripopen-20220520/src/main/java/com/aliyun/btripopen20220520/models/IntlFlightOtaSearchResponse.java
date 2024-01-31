// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightOtaSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IntlFlightOtaSearchResponseBody body;

    public static IntlFlightOtaSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightOtaSearchResponse self = new IntlFlightOtaSearchResponse();
        return TeaModel.build(map, self);
    }

    public IntlFlightOtaSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IntlFlightOtaSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IntlFlightOtaSearchResponse setBody(IntlFlightOtaSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public IntlFlightOtaSearchResponseBody getBody() {
        return this.body;
    }

}
