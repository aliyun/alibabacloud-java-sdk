// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class RetrieveMemoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetrieveMemoryResponseBody body;

    public static RetrieveMemoryResponse build(java.util.Map<String, ?> map) throws Exception {
        RetrieveMemoryResponse self = new RetrieveMemoryResponse();
        return TeaModel.build(map, self);
    }

    public RetrieveMemoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetrieveMemoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetrieveMemoryResponse setBody(RetrieveMemoryResponseBody body) {
        this.body = body;
        return this;
    }
    public RetrieveMemoryResponseBody getBody() {
        return this.body;
    }

}
