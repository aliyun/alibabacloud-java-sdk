// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightListingSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlightListingSearchResponseBody body;

    public static FlightListingSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        FlightListingSearchResponse self = new FlightListingSearchResponse();
        return TeaModel.build(map, self);
    }

    public FlightListingSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightListingSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightListingSearchResponse setBody(FlightListingSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightListingSearchResponseBody getBody() {
        return this.body;
    }

}
