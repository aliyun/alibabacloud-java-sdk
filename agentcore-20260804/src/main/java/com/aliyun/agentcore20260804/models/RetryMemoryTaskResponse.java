// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class RetryMemoryTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetryMemoryTaskResponseBody body;

    public static RetryMemoryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryMemoryTaskResponse self = new RetryMemoryTaskResponse();
        return TeaModel.build(map, self);
    }

    public RetryMemoryTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryMemoryTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryMemoryTaskResponse setBody(RetryMemoryTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryMemoryTaskResponseBody getBody() {
        return this.body;
    }

}
