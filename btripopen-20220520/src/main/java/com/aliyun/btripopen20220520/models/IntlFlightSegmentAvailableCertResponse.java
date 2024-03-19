// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightSegmentAvailableCertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IntlFlightSegmentAvailableCertResponseBody body;

    public static IntlFlightSegmentAvailableCertResponse build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightSegmentAvailableCertResponse self = new IntlFlightSegmentAvailableCertResponse();
        return TeaModel.build(map, self);
    }

    public IntlFlightSegmentAvailableCertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IntlFlightSegmentAvailableCertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IntlFlightSegmentAvailableCertResponse setBody(IntlFlightSegmentAvailableCertResponseBody body) {
        this.body = body;
        return this;
    }
    public IntlFlightSegmentAvailableCertResponseBody getBody() {
        return this.body;
    }

}
