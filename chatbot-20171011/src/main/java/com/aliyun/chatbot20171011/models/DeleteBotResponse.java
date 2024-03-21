// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DeleteBotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBotResponseBody body;

    public static DeleteBotResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBotResponse self = new DeleteBotResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBotResponse setBody(DeleteBotResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBotResponseBody getBody() {
        return this.body;
    }

}
