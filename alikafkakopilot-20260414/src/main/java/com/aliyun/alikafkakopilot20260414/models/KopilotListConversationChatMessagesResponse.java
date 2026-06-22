// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkakopilot20260414.models;

import com.aliyun.tea.*;

public class KopilotListConversationChatMessagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public KopilotListConversationChatMessagesResponseBody body;

    public static KopilotListConversationChatMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        KopilotListConversationChatMessagesResponse self = new KopilotListConversationChatMessagesResponse();
        return TeaModel.build(map, self);
    }

    public KopilotListConversationChatMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KopilotListConversationChatMessagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public KopilotListConversationChatMessagesResponse setBody(KopilotListConversationChatMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public KopilotListConversationChatMessagesResponseBody getBody() {
        return this.body;
    }

}
