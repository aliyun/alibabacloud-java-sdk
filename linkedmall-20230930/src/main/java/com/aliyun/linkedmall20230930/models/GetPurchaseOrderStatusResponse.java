// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class GetPurchaseOrderStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PurchaseOrderStatusResult body;

    public static GetPurchaseOrderStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPurchaseOrderStatusResponse self = new GetPurchaseOrderStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetPurchaseOrderStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPurchaseOrderStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPurchaseOrderStatusResponse setBody(PurchaseOrderStatusResult body) {
        this.body = body;
        return this;
    }
    public PurchaseOrderStatusResult getBody() {
        return this.body;
    }

}
