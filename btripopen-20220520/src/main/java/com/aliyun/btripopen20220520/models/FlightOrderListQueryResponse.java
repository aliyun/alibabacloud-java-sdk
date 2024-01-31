// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOrderListQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlightOrderListQueryResponseBody body;

    public static FlightOrderListQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        FlightOrderListQueryResponse self = new FlightOrderListQueryResponse();
        return TeaModel.build(map, self);
    }

    public FlightOrderListQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightOrderListQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightOrderListQueryResponse setBody(FlightOrderListQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightOrderListQueryResponseBody getBody() {
        return this.body;
    }

}
