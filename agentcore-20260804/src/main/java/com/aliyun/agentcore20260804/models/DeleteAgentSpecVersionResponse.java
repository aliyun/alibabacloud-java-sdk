// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteAgentSpecVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAgentSpecVersionResponseBody body;

    public static DeleteAgentSpecVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentSpecVersionResponse self = new DeleteAgentSpecVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAgentSpecVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAgentSpecVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAgentSpecVersionResponse setBody(DeleteAgentSpecVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAgentSpecVersionResponseBody getBody() {
        return this.body;
    }

}
