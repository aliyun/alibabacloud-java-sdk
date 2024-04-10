// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class BeeBotChatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BeeBotChatResponseBody body;

    public static BeeBotChatResponse build(java.util.Map<String, ?> map) throws Exception {
        BeeBotChatResponse self = new BeeBotChatResponse();
        return TeaModel.build(map, self);
    }

    public BeeBotChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BeeBotChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BeeBotChatResponse setBody(BeeBotChatResponseBody body) {
        this.body = body;
        return this;
    }
    public BeeBotChatResponseBody getBody() {
        return this.body;
    }

}
