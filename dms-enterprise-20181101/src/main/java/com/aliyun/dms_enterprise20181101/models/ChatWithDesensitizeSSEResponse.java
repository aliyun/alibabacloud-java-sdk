// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ChatWithDesensitizeSSEResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatWithDesensitizeSSEResponseBody body;

    public static ChatWithDesensitizeSSEResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatWithDesensitizeSSEResponse self = new ChatWithDesensitizeSSEResponse();
        return TeaModel.build(map, self);
    }

    public ChatWithDesensitizeSSEResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatWithDesensitizeSSEResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatWithDesensitizeSSEResponse setBody(ChatWithDesensitizeSSEResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatWithDesensitizeSSEResponseBody getBody() {
        return this.body;
    }

}
