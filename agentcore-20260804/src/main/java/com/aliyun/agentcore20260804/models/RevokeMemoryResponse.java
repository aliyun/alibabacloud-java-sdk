// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class RevokeMemoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeMemoryResponseBody body;

    public static RevokeMemoryResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeMemoryResponse self = new RevokeMemoryResponse();
        return TeaModel.build(map, self);
    }

    public RevokeMemoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeMemoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeMemoryResponse setBody(RevokeMemoryResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeMemoryResponseBody getBody() {
        return this.body;
    }

}
