// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DeleteMemoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMemoryResponseBody body;

    public static DeleteMemoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMemoryResponse self = new DeleteMemoryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMemoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMemoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMemoryResponse setBody(DeleteMemoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMemoryResponseBody getBody() {
        return this.body;
    }

}
