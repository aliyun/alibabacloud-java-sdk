// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateUserSayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUserSayResponseBody body;

    public static CreateUserSayResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUserSayResponse self = new CreateUserSayResponse();
        return TeaModel.build(map, self);
    }

    public CreateUserSayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUserSayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUserSayResponse setBody(CreateUserSayResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUserSayResponseBody getBody() {
        return this.body;
    }

}
