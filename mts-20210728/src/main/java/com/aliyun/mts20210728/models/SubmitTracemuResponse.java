// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class SubmitTracemuResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitTracemuResponseBody body;

    public static SubmitTracemuResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitTracemuResponse self = new SubmitTracemuResponse();
        return TeaModel.build(map, self);
    }

    public SubmitTracemuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitTracemuResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitTracemuResponse setBody(SubmitTracemuResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitTracemuResponseBody getBody() {
        return this.body;
    }

}
