// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jeepproduct20211213.models;

import com.aliyun.tea.*;

public class TraceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TraceResponseBody body;

    public static TraceResponse build(java.util.Map<String, ?> map) throws Exception {
        TraceResponse self = new TraceResponse();
        return TeaModel.build(map, self);
    }

    public TraceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TraceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TraceResponse setBody(TraceResponseBody body) {
        this.body = body;
        return this;
    }
    public TraceResponseBody getBody() {
        return this.body;
    }

}
