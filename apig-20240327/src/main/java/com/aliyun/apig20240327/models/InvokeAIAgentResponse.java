// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class InvokeAIAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InvokeAIAgentResponseBody body;

    public static InvokeAIAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeAIAgentResponse self = new InvokeAIAgentResponse();
        return TeaModel.build(map, self);
    }

    public InvokeAIAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvokeAIAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvokeAIAgentResponse setBody(InvokeAIAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public InvokeAIAgentResponseBody getBody() {
        return this.body;
    }

}
