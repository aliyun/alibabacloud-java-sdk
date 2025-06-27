// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class LlmStreamChatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LlmStreamChatResponseBody body;

    public static LlmStreamChatResponse build(java.util.Map<String, ?> map) throws Exception {
        LlmStreamChatResponse self = new LlmStreamChatResponse();
        return TeaModel.build(map, self);
    }

    public LlmStreamChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LlmStreamChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LlmStreamChatResponse setBody(LlmStreamChatResponseBody body) {
        this.body = body;
        return this;
    }
    public LlmStreamChatResponseBody getBody() {
        return this.body;
    }

}
