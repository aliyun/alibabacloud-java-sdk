// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightPayOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlightPayOrderResponseBody body;

    public static FlightPayOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        FlightPayOrderResponse self = new FlightPayOrderResponse();
        return TeaModel.build(map, self);
    }

    public FlightPayOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightPayOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightPayOrderResponse setBody(FlightPayOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightPayOrderResponseBody getBody() {
        return this.body;
    }

}
