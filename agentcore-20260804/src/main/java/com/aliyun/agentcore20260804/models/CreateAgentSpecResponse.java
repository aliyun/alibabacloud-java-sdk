// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateAgentSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAgentSpecResponseBody body;

    public static CreateAgentSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentSpecResponse self = new CreateAgentSpecResponse();
        return TeaModel.build(map, self);
    }

    public CreateAgentSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAgentSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAgentSpecResponse setBody(CreateAgentSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAgentSpecResponseBody getBody() {
        return this.body;
    }

}
