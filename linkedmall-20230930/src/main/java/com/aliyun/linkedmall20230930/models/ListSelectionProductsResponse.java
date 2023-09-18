// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ListSelectionProductsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ProductPageResult body;

    public static ListSelectionProductsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSelectionProductsResponse self = new ListSelectionProductsResponse();
        return TeaModel.build(map, self);
    }

    public ListSelectionProductsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSelectionProductsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSelectionProductsResponse setBody(ProductPageResult body) {
        this.body = body;
        return this;
    }
    public ProductPageResult getBody() {
        return this.body;
    }

}
