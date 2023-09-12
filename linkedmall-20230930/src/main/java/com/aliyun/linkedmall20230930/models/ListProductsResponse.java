// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ListProductsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ProductPageResult body;

    public static ListProductsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductsResponse self = new ListProductsResponse();
        return TeaModel.build(map, self);
    }

    public ListProductsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductsResponse setBody(ProductPageResult body) {
        this.body = body;
        return this;
    }
    public ProductPageResult getBody() {
        return this.body;
    }

}
