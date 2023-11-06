// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateOrderForRdsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOrderForRdsResponseBody body;

    public static CreateOrderForRdsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderForRdsResponse self = new CreateOrderForRdsResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrderForRdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrderForRdsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrderForRdsResponse setBody(CreateOrderForRdsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrderForRdsResponseBody getBody() {
        return this.body;
    }

}
