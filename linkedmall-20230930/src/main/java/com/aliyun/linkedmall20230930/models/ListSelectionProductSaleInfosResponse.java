// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ListSelectionProductSaleInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ProductSaleInfoListResult body;

    public static ListSelectionProductSaleInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSelectionProductSaleInfosResponse self = new ListSelectionProductSaleInfosResponse();
        return TeaModel.build(map, self);
    }

    public ListSelectionProductSaleInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSelectionProductSaleInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSelectionProductSaleInfosResponse setBody(ProductSaleInfoListResult body) {
        this.body = body;
        return this;
    }
    public ProductSaleInfoListResult getBody() {
        return this.body;
    }

}
