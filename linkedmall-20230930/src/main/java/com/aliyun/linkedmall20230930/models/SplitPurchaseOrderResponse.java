// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class SplitPurchaseOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PurchaseOrderRenderResult body;

    public static SplitPurchaseOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        SplitPurchaseOrderResponse self = new SplitPurchaseOrderResponse();
        return TeaModel.build(map, self);
    }

    public SplitPurchaseOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SplitPurchaseOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SplitPurchaseOrderResponse setBody(PurchaseOrderRenderResult body) {
        this.body = body;
        return this;
    }
    public PurchaseOrderRenderResult getBody() {
        return this.body;
    }

}
