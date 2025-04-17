// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateProductImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateProductImageResponseBody body;

    public static CreateProductImageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProductImageResponse self = new CreateProductImageResponse();
        return TeaModel.build(map, self);
    }

    public CreateProductImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProductImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProductImageResponse setBody(CreateProductImageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProductImageResponseBody getBody() {
        return this.body;
    }

}
