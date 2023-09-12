// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ListProductSaleInfosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ProductSaleInfoListResult body;

    public static ListProductSaleInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductSaleInfosResponse self = new ListProductSaleInfosResponse();
        return TeaModel.build(map, self);
    }

    public ListProductSaleInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductSaleInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductSaleInfosResponse setBody(ProductSaleInfoListResult body) {
        this.body = body;
        return this;
    }
    public ProductSaleInfoListResult getBody() {
        return this.body;
    }

}
