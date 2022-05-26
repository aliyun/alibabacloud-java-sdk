// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateEntityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEntityResponseBody body;

    public static CreateEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEntityResponse self = new CreateEntityResponse();
        return TeaModel.build(map, self);
    }

    public CreateEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEntityResponse setBody(CreateEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEntityResponseBody getBody() {
        return this.body;
    }

}
