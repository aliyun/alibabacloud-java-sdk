// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightItineraryScanQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlightItineraryScanQueryResponseBody body;

    public static FlightItineraryScanQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        FlightItineraryScanQueryResponse self = new FlightItineraryScanQueryResponse();
        return TeaModel.build(map, self);
    }

    public FlightItineraryScanQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightItineraryScanQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightItineraryScanQueryResponse setBody(FlightItineraryScanQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightItineraryScanQueryResponseBody getBody() {
        return this.body;
    }

}
