// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GenerateMessageChatTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateMessageChatTokenResponseBody body;

    public static GenerateMessageChatTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateMessageChatTokenResponse self = new GenerateMessageChatTokenResponse();
        return TeaModel.build(map, self);
    }

    public GenerateMessageChatTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateMessageChatTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateMessageChatTokenResponse setBody(GenerateMessageChatTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateMessageChatTokenResponseBody getBody() {
        return this.body;
    }

}
