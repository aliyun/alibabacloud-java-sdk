// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ListPurchaserShopsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ShopPageResult body;

    public static ListPurchaserShopsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPurchaserShopsResponse self = new ListPurchaserShopsResponse();
        return TeaModel.build(map, self);
    }

    public ListPurchaserShopsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPurchaserShopsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPurchaserShopsResponse setBody(ShopPageResult body) {
        this.body = body;
        return this;
    }
    public ShopPageResult getBody() {
        return this.body;
    }

}
