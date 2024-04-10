// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ChatappPhoneNumberRegisterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatappPhoneNumberRegisterResponseBody body;

    public static ChatappPhoneNumberRegisterResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatappPhoneNumberRegisterResponse self = new ChatappPhoneNumberRegisterResponse();
        return TeaModel.build(map, self);
    }

    public ChatappPhoneNumberRegisterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatappPhoneNumberRegisterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatappPhoneNumberRegisterResponse setBody(ChatappPhoneNumberRegisterResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatappPhoneNumberRegisterResponseBody getBody() {
        return this.body;
    }

}
