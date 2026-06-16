// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateAgentSpaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAgentSpaceResponseBody body;

    public static CreateAgentSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentSpaceResponse self = new CreateAgentSpaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateAgentSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAgentSpaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAgentSpaceResponse setBody(CreateAgentSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAgentSpaceResponseBody getBody() {
        return this.body;
    }

}
