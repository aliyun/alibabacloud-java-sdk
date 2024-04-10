// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ChatappVerifyAndRegisterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatappVerifyAndRegisterResponseBody body;

    public static ChatappVerifyAndRegisterResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatappVerifyAndRegisterResponse self = new ChatappVerifyAndRegisterResponse();
        return TeaModel.build(map, self);
    }

    public ChatappVerifyAndRegisterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatappVerifyAndRegisterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatappVerifyAndRegisterResponse setBody(ChatappVerifyAndRegisterResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatappVerifyAndRegisterResponseBody getBody() {
        return this.body;
    }

}
