// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateCoreWordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCoreWordResponseBody body;

    public static CreateCoreWordResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCoreWordResponse self = new CreateCoreWordResponse();
        return TeaModel.build(map, self);
    }

    public CreateCoreWordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCoreWordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCoreWordResponse setBody(CreateCoreWordResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCoreWordResponseBody getBody() {
        return this.body;
    }

}
