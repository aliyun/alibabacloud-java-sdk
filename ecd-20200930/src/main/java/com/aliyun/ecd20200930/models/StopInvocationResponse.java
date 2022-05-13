// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class StopInvocationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopInvocationResponseBody body;

    public static StopInvocationResponse build(java.util.Map<String, ?> map) throws Exception {
        StopInvocationResponse self = new StopInvocationResponse();
        return TeaModel.build(map, self);
    }

    public StopInvocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopInvocationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopInvocationResponse setBody(StopInvocationResponseBody body) {
        this.body = body;
        return this;
    }
    public StopInvocationResponseBody getBody() {
        return this.body;
    }

}
