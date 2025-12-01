// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CancelChatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelChatResponseBody body;

    public static CancelChatResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelChatResponse self = new CancelChatResponse();
        return TeaModel.build(map, self);
    }

    public CancelChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelChatResponse setBody(CancelChatResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelChatResponseBody getBody() {
        return this.body;
    }

}
