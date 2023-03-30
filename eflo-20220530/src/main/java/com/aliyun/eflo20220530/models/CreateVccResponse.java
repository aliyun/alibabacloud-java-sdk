// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateVccResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVccResponseBody body;

    public static CreateVccResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVccResponse self = new CreateVccResponse();
        return TeaModel.build(map, self);
    }

    public CreateVccResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVccResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVccResponse setBody(CreateVccResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVccResponseBody getBody() {
        return this.body;
    }

}
