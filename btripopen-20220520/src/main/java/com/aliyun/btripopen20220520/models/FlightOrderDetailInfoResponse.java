// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOrderDetailInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlightOrderDetailInfoResponseBody body;

    public static FlightOrderDetailInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        FlightOrderDetailInfoResponse self = new FlightOrderDetailInfoResponse();
        return TeaModel.build(map, self);
    }

    public FlightOrderDetailInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightOrderDetailInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightOrderDetailInfoResponse setBody(FlightOrderDetailInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightOrderDetailInfoResponseBody getBody() {
        return this.body;
    }

}
