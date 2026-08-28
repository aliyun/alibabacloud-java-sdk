// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateAgentSpecVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAgentSpecVersionResponseBody body;

    public static CreateAgentSpecVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentSpecVersionResponse self = new CreateAgentSpecVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateAgentSpecVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAgentSpecVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAgentSpecVersionResponse setBody(CreateAgentSpecVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAgentSpecVersionResponseBody getBody() {
        return this.body;
    }

}
