// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateMcpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMcpResponseBody body;

    public static CreateMcpResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMcpResponse self = new CreateMcpResponse();
        return TeaModel.build(map, self);
    }

    public CreateMcpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMcpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMcpResponse setBody(CreateMcpResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMcpResponseBody getBody() {
        return this.body;
    }

}
