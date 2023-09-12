// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ListSkuSaleInfosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SkuSaleInfoListResult body;

    public static ListSkuSaleInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSkuSaleInfosResponse self = new ListSkuSaleInfosResponse();
        return TeaModel.build(map, self);
    }

    public ListSkuSaleInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSkuSaleInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSkuSaleInfosResponse setBody(SkuSaleInfoListResult body) {
        this.body = body;
        return this;
    }
    public SkuSaleInfoListResult getBody() {
        return this.body;
    }

}
