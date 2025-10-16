// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetMemoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMemoryResponseBody body;

    public static GetMemoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMemoryResponse self = new GetMemoryResponse();
        return TeaModel.build(map, self);
    }

    public GetMemoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMemoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMemoryResponse setBody(GetMemoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMemoryResponseBody getBody() {
        return this.body;
    }

}
