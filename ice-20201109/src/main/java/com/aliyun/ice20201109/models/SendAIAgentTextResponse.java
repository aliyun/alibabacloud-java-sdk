// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SendAIAgentTextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendAIAgentTextResponseBody body;

    public static SendAIAgentTextResponse build(java.util.Map<String, ?> map) throws Exception {
        SendAIAgentTextResponse self = new SendAIAgentTextResponse();
        return TeaModel.build(map, self);
    }

    public SendAIAgentTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendAIAgentTextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendAIAgentTextResponse setBody(SendAIAgentTextResponseBody body) {
        this.body = body;
        return this;
    }
    public SendAIAgentTextResponseBody getBody() {
        return this.body;
    }

}
