// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateMcpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMcpResponseBody body;

    public static UpdateMcpResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMcpResponse self = new UpdateMcpResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMcpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMcpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMcpResponse setBody(UpdateMcpResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMcpResponseBody getBody() {
        return this.body;
    }

}
