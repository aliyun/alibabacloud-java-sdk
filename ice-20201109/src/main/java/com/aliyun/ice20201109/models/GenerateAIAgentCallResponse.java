// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GenerateAIAgentCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateAIAgentCallResponseBody body;

    public static GenerateAIAgentCallResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateAIAgentCallResponse self = new GenerateAIAgentCallResponse();
        return TeaModel.build(map, self);
    }

    public GenerateAIAgentCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateAIAgentCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateAIAgentCallResponse setBody(GenerateAIAgentCallResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateAIAgentCallResponseBody getBody() {
        return this.body;
    }

}
