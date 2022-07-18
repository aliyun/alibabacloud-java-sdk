// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateStressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateStressResponseBody body;

    public static CreateStressResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStressResponse self = new CreateStressResponse();
        return TeaModel.build(map, self);
    }

    public CreateStressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStressResponse setBody(CreateStressResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStressResponseBody getBody() {
        return this.body;
    }

}
