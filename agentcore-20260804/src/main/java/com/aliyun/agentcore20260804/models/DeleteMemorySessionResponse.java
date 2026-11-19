// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteMemorySessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMemorySessionResponseBody body;

    public static DeleteMemorySessionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMemorySessionResponse self = new DeleteMemorySessionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMemorySessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMemorySessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMemorySessionResponse setBody(DeleteMemorySessionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMemorySessionResponseBody getBody() {
        return this.body;
    }

}
