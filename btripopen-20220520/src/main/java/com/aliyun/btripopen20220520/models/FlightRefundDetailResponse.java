// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightRefundDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlightRefundDetailResponseBody body;

    public static FlightRefundDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        FlightRefundDetailResponse self = new FlightRefundDetailResponse();
        return TeaModel.build(map, self);
    }

    public FlightRefundDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightRefundDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightRefundDetailResponse setBody(FlightRefundDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightRefundDetailResponseBody getBody() {
        return this.body;
    }

}
