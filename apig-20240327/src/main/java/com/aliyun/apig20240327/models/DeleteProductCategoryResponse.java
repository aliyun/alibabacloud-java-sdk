// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteProductCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteProductCategoryResponseBody body;

    public static DeleteProductCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductCategoryResponse self = new DeleteProductCategoryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProductCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProductCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProductCategoryResponse setBody(DeleteProductCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProductCategoryResponseBody getBody() {
        return this.body;
    }

}
