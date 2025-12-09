// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class SendChatMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendChatMessageResponseBody body;

    public static SendChatMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        SendChatMessageResponse self = new SendChatMessageResponse();
        return TeaModel.build(map, self);
    }

    public SendChatMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendChatMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendChatMessageResponse setBody(SendChatMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public SendChatMessageResponseBody getBody() {
        return this.body;
    }

}
