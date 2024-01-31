// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOtaSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlightOtaSearchResponseBody body;

    public static FlightOtaSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        FlightOtaSearchResponse self = new FlightOtaSearchResponse();
        return TeaModel.build(map, self);
    }

    public FlightOtaSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightOtaSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightOtaSearchResponse setBody(FlightOtaSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightOtaSearchResponseBody getBody() {
        return this.body;
    }

}
