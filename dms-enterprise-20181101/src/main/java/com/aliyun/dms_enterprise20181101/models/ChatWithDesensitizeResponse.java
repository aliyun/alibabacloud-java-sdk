// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ChatWithDesensitizeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatWithDesensitizeResponseBody body;

    public static ChatWithDesensitizeResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatWithDesensitizeResponse self = new ChatWithDesensitizeResponse();
        return TeaModel.build(map, self);
    }

    public ChatWithDesensitizeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatWithDesensitizeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatWithDesensitizeResponse setBody(ChatWithDesensitizeResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatWithDesensitizeResponseBody getBody() {
        return this.body;
    }

}
