// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateProductResponseBody body;

    public static CreateProductResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProductResponse self = new CreateProductResponse();
        return TeaModel.build(map, self);
    }

    public CreateProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProductResponse setBody(CreateProductResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProductResponseBody getBody() {
        return this.body;
    }

}
