// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOrderQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlightOrderQueryResponseBody body;

    public static FlightOrderQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        FlightOrderQueryResponse self = new FlightOrderQueryResponse();
        return TeaModel.build(map, self);
    }

    public FlightOrderQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightOrderQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightOrderQueryResponse setBody(FlightOrderQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightOrderQueryResponseBody getBody() {
        return this.body;
    }

}
