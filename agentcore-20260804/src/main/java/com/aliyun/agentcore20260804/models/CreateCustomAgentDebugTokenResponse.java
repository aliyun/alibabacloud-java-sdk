// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateCustomAgentDebugTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomAgentDebugTokenResponseBody body;

    public static CreateCustomAgentDebugTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomAgentDebugTokenResponse self = new CreateCustomAgentDebugTokenResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomAgentDebugTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomAgentDebugTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomAgentDebugTokenResponse setBody(CreateCustomAgentDebugTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomAgentDebugTokenResponseBody getBody() {
        return this.body;
    }

}
