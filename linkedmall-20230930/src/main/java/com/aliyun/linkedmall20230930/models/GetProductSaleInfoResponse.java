// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class GetProductSaleInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ProductSaleInfo body;

    public static GetProductSaleInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductSaleInfoResponse self = new GetProductSaleInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetProductSaleInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductSaleInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProductSaleInfoResponse setBody(ProductSaleInfo body) {
        this.body = body;
        return this;
    }
    public ProductSaleInfo getBody() {
        return this.body;
    }

}
