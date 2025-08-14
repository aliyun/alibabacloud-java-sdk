// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ForwardAIAgentCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ForwardAIAgentCallResponseBody body;

    public static ForwardAIAgentCallResponse build(java.util.Map<String, ?> map) throws Exception {
        ForwardAIAgentCallResponse self = new ForwardAIAgentCallResponse();
        return TeaModel.build(map, self);
    }

    public ForwardAIAgentCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ForwardAIAgentCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ForwardAIAgentCallResponse setBody(ForwardAIAgentCallResponseBody body) {
        this.body = body;
        return this;
    }
    public ForwardAIAgentCallResponseBody getBody() {
        return this.body;
    }

}
