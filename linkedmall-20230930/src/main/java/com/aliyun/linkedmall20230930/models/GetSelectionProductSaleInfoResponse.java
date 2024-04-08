// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class GetSelectionProductSaleInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ProductSaleInfo body;

    public static GetSelectionProductSaleInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSelectionProductSaleInfoResponse self = new GetSelectionProductSaleInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetSelectionProductSaleInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSelectionProductSaleInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSelectionProductSaleInfoResponse setBody(ProductSaleInfo body) {
        this.body = body;
        return this;
    }
    public ProductSaleInfo getBody() {
        return this.body;
    }

}
