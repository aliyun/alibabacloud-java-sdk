// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class DeleteMcpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMcpResponseBody body;

    public static DeleteMcpResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcpResponse self = new DeleteMcpResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMcpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMcpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMcpResponse setBody(DeleteMcpResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMcpResponseBody getBody() {
        return this.body;
    }

}
