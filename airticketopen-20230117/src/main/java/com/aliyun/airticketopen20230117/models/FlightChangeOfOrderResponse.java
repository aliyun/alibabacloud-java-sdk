// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class FlightChangeOfOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FlightChangeOfOrderResponseBody body;

    public static FlightChangeOfOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        FlightChangeOfOrderResponse self = new FlightChangeOfOrderResponse();
        return TeaModel.build(map, self);
    }

    public FlightChangeOfOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightChangeOfOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightChangeOfOrderResponse setBody(FlightChangeOfOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightChangeOfOrderResponseBody getBody() {
        return this.body;
    }

}
