// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateChatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateChatResponseBody body;

    public static CreateChatResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateChatResponse self = new CreateChatResponse();
        return TeaModel.build(map, self);
    }

    public CreateChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateChatResponse setBody(CreateChatResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateChatResponseBody getBody() {
        return this.body;
    }

}
