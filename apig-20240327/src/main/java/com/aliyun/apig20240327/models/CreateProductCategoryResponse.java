// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateProductCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateProductCategoryResponseBody body;

    public static CreateProductCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProductCategoryResponse self = new CreateProductCategoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateProductCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProductCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProductCategoryResponse setBody(CreateProductCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProductCategoryResponseBody getBody() {
        return this.body;
    }

}
