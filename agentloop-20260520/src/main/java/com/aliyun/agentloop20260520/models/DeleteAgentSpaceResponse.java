// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class DeleteAgentSpaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAgentSpaceResponseBody body;

    public static DeleteAgentSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentSpaceResponse self = new DeleteAgentSpaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAgentSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAgentSpaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAgentSpaceResponse setBody(DeleteAgentSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAgentSpaceResponseBody getBody() {
        return this.body;
    }

}
