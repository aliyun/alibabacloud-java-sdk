// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class RenderPurchaseOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PurchaseOrderRenderResult body;

    public static RenderPurchaseOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        RenderPurchaseOrderResponse self = new RenderPurchaseOrderResponse();
        return TeaModel.build(map, self);
    }

    public RenderPurchaseOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenderPurchaseOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenderPurchaseOrderResponse setBody(PurchaseOrderRenderResult body) {
        this.body = body;
        return this;
    }
    public PurchaseOrderRenderResult getBody() {
        return this.body;
    }

}
