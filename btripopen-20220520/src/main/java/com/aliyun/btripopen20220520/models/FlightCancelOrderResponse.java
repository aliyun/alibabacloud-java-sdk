// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightCancelOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlightCancelOrderResponseBody body;

    public static FlightCancelOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        FlightCancelOrderResponse self = new FlightCancelOrderResponse();
        return TeaModel.build(map, self);
    }

    public FlightCancelOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightCancelOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightCancelOrderResponse setBody(FlightCancelOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightCancelOrderResponseBody getBody() {
        return this.body;
    }

}
