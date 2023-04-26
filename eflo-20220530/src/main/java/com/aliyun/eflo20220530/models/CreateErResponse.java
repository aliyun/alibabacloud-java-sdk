// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateErResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateErResponseBody body;

    public static CreateErResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateErResponse self = new CreateErResponse();
        return TeaModel.build(map, self);
    }

    public CreateErResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateErResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateErResponse setBody(CreateErResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateErResponseBody getBody() {
        return this.body;
    }

}
