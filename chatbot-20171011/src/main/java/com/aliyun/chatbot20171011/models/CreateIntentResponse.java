// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateIntentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIntentResponseBody body;

    public static CreateIntentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIntentResponse self = new CreateIntentResponse();
        return TeaModel.build(map, self);
    }

    public CreateIntentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIntentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIntentResponse setBody(CreateIntentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIntentResponseBody getBody() {
        return this.body;
    }

}
