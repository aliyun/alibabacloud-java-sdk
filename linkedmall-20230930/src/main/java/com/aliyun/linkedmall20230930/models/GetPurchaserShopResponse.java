// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class GetPurchaserShopResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public Shop body;

    public static GetPurchaserShopResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPurchaserShopResponse self = new GetPurchaserShopResponse();
        return TeaModel.build(map, self);
    }

    public GetPurchaserShopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPurchaserShopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPurchaserShopResponse setBody(Shop body) {
        this.body = body;
        return this;
    }
    public Shop getBody() {
        return this.body;
    }

}
