// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOtaItemDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlightOtaItemDetailResponseBody body;

    public static FlightOtaItemDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        FlightOtaItemDetailResponse self = new FlightOtaItemDetailResponse();
        return TeaModel.build(map, self);
    }

    public FlightOtaItemDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightOtaItemDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightOtaItemDetailResponse setBody(FlightOtaItemDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightOtaItemDetailResponseBody getBody() {
        return this.body;
    }

}
