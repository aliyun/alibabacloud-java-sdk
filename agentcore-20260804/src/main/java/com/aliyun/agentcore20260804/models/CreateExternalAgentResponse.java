// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateExternalAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExternalAgentResponseBody body;

    public static CreateExternalAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExternalAgentResponse self = new CreateExternalAgentResponse();
        return TeaModel.build(map, self);
    }

    public CreateExternalAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExternalAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExternalAgentResponse setBody(CreateExternalAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExternalAgentResponseBody getBody() {
        return this.body;
    }

}
