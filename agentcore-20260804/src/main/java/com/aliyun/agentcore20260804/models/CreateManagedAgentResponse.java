// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateManagedAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateManagedAgentResponseBody body;

    public static CreateManagedAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateManagedAgentResponse self = new CreateManagedAgentResponse();
        return TeaModel.build(map, self);
    }

    public CreateManagedAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateManagedAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateManagedAgentResponse setBody(CreateManagedAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateManagedAgentResponseBody getBody() {
        return this.body;
    }

}
