// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetMcpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMcpResponseBody body;

    public static GetMcpResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMcpResponse self = new GetMcpResponse();
        return TeaModel.build(map, self);
    }

    public GetMcpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMcpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMcpResponse setBody(GetMcpResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMcpResponseBody getBody() {
        return this.body;
    }

}
