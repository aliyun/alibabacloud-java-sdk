// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateAgentVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAgentVersionResponseBody body;

    public static CreateAgentVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentVersionResponse self = new CreateAgentVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateAgentVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAgentVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAgentVersionResponse setBody(CreateAgentVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAgentVersionResponseBody getBody() {
        return this.body;
    }

}
