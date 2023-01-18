// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightSearchListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FlightSearchListResponseBody body;

    public static FlightSearchListResponse build(java.util.Map<String, ?> map) throws Exception {
        FlightSearchListResponse self = new FlightSearchListResponse();
        return TeaModel.build(map, self);
    }

    public FlightSearchListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightSearchListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightSearchListResponse setBody(FlightSearchListResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightSearchListResponseBody getBody() {
        return this.body;
    }

}
