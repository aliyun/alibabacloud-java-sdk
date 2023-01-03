// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateVpdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVpdResponseBody body;

    public static CreateVpdResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVpdResponse self = new CreateVpdResponse();
        return TeaModel.build(map, self);
    }

    public CreateVpdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVpdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVpdResponse setBody(CreateVpdResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVpdResponseBody getBody() {
        return this.body;
    }

}
