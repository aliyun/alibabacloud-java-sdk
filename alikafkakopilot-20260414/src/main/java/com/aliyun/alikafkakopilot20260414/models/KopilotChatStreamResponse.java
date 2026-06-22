// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkakopilot20260414.models;

import com.aliyun.tea.*;

public class KopilotChatStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public KopilotChatStreamResponseBody body;

    public static KopilotChatStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        KopilotChatStreamResponse self = new KopilotChatStreamResponse();
        return TeaModel.build(map, self);
    }

    public KopilotChatStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KopilotChatStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public KopilotChatStreamResponse setBody(KopilotChatStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public KopilotChatStreamResponseBody getBody() {
        return this.body;
    }

}
