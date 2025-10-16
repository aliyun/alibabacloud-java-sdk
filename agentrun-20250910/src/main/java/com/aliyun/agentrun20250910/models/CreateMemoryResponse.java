// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateMemoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMemoryResponseBody body;

    public static CreateMemoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMemoryResponse self = new CreateMemoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateMemoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMemoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMemoryResponse setBody(CreateMemoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMemoryResponseBody getBody() {
        return this.body;
    }

}
