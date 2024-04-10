// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SendChatappMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendChatappMessageResponseBody body;

    public static SendChatappMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        SendChatappMessageResponse self = new SendChatappMessageResponse();
        return TeaModel.build(map, self);
    }

    public SendChatappMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendChatappMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendChatappMessageResponse setBody(SendChatappMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public SendChatappMessageResponseBody getBody() {
        return this.body;
    }

}
