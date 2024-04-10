// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ChatappPhoneNumberDeregisterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatappPhoneNumberDeregisterResponseBody body;

    public static ChatappPhoneNumberDeregisterResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatappPhoneNumberDeregisterResponse self = new ChatappPhoneNumberDeregisterResponse();
        return TeaModel.build(map, self);
    }

    public ChatappPhoneNumberDeregisterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatappPhoneNumberDeregisterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatappPhoneNumberDeregisterResponse setBody(ChatappPhoneNumberDeregisterResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatappPhoneNumberDeregisterResponseBody getBody() {
        return this.body;
    }

}
