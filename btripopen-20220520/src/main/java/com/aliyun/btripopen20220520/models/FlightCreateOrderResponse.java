// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightCreateOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FlightCreateOrderResponseBody body;

    public static FlightCreateOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        FlightCreateOrderResponse self = new FlightCreateOrderResponse();
        return TeaModel.build(map, self);
    }

    public FlightCreateOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightCreateOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightCreateOrderResponse setBody(FlightCreateOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightCreateOrderResponseBody getBody() {
        return this.body;
    }

}
