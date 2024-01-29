// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteUserSayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUserSayResponseBody body;

    public static DeleteUserSayResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserSayResponse self = new DeleteUserSayResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserSayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserSayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserSayResponse setBody(DeleteUserSayResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserSayResponseBody getBody() {
        return this.body;
    }

}
