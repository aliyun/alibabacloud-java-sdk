// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SendAIAgentSpeechResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendAIAgentSpeechResponseBody body;

    public static SendAIAgentSpeechResponse build(java.util.Map<String, ?> map) throws Exception {
        SendAIAgentSpeechResponse self = new SendAIAgentSpeechResponse();
        return TeaModel.build(map, self);
    }

    public SendAIAgentSpeechResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendAIAgentSpeechResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendAIAgentSpeechResponse setBody(SendAIAgentSpeechResponseBody body) {
        this.body = body;
        return this;
    }
    public SendAIAgentSpeechResponseBody getBody() {
        return this.body;
    }

}
