// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightRefundPreCalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlightRefundPreCalResponseBody body;

    public static FlightRefundPreCalResponse build(java.util.Map<String, ?> map) throws Exception {
        FlightRefundPreCalResponse self = new FlightRefundPreCalResponse();
        return TeaModel.build(map, self);
    }

    public FlightRefundPreCalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightRefundPreCalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightRefundPreCalResponse setBody(FlightRefundPreCalResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightRefundPreCalResponseBody getBody() {
        return this.body;
    }

}
