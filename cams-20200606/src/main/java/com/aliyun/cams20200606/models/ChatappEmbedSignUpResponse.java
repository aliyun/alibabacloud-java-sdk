// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ChatappEmbedSignUpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatappEmbedSignUpResponseBody body;

    public static ChatappEmbedSignUpResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatappEmbedSignUpResponse self = new ChatappEmbedSignUpResponse();
        return TeaModel.build(map, self);
    }

    public ChatappEmbedSignUpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatappEmbedSignUpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatappEmbedSignUpResponse setBody(ChatappEmbedSignUpResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatappEmbedSignUpResponseBody getBody() {
        return this.body;
    }

}
