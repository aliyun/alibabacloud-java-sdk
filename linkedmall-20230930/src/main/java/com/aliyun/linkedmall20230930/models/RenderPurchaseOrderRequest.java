// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class RenderPurchaseOrderRequest extends TeaModel {
    @NameInMap("body")
    public PurchaseOrderRenderQuery body;

    public static RenderPurchaseOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        RenderPurchaseOrderRequest self = new RenderPurchaseOrderRequest();
        return TeaModel.build(map, self);
    }

    public RenderPurchaseOrderRequest setBody(PurchaseOrderRenderQuery body) {
        this.body = body;
        return this;
    }
    public PurchaseOrderRenderQuery getBody() {
        return this.body;
    }

}
