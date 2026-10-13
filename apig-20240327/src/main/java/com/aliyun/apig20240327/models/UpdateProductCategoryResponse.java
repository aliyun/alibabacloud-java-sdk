// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateProductCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProductCategoryResponseBody body;

    public static UpdateProductCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductCategoryResponse self = new UpdateProductCategoryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProductCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProductCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProductCategoryResponse setBody(UpdateProductCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProductCategoryResponseBody getBody() {
        return this.body;
    }

}
