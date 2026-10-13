// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateCategoryProductsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCategoryProductsResponseBody body;

    public static UpdateCategoryProductsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCategoryProductsResponse self = new UpdateCategoryProductsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCategoryProductsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCategoryProductsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCategoryProductsResponse setBody(UpdateCategoryProductsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCategoryProductsResponseBody getBody() {
        return this.body;
    }

}
