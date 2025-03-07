// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SendMessageChatTextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendMessageChatTextResponseBody body;

    public static SendMessageChatTextResponse build(java.util.Map<String, ?> map) throws Exception {
        SendMessageChatTextResponse self = new SendMessageChatTextResponse();
        return TeaModel.build(map, self);
    }

    public SendMessageChatTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendMessageChatTextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendMessageChatTextResponse setBody(SendMessageChatTextResponseBody body) {
        this.body = body;
        return this;
    }
    public SendMessageChatTextResponseBody getBody() {
        return this.body;
    }

}
