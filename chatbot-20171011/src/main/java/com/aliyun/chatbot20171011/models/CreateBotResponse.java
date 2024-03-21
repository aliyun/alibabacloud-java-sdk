// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateBotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBotResponseBody body;

    public static CreateBotResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBotResponse self = new CreateBotResponse();
        return TeaModel.build(map, self);
    }

    public CreateBotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBotResponse setBody(CreateBotResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBotResponseBody getBody() {
        return this.body;
    }

}
