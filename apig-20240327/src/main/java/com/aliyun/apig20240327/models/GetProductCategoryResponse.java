// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetProductCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProductCategoryResponseBody body;

    public static GetProductCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductCategoryResponse self = new GetProductCategoryResponse();
        return TeaModel.build(map, self);
    }

    public GetProductCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProductCategoryResponse setBody(GetProductCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductCategoryResponseBody getBody() {
        return this.body;
    }

}
