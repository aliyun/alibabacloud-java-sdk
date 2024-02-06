// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class GetTraceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTraceResponseBody body;

    public static GetTraceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTraceResponse self = new GetTraceResponse();
        return TeaModel.build(map, self);
    }

    public GetTraceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTraceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTraceResponse setBody(GetTraceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTraceResponseBody getBody() {
        return this.body;
    }

}
