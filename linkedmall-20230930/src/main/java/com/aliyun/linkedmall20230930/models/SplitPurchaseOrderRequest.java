// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class SplitPurchaseOrderRequest extends TeaModel {
    @NameInMap("body")
    public PurchaseOrderRenderQuery body;

    public static SplitPurchaseOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        SplitPurchaseOrderRequest self = new SplitPurchaseOrderRequest();
        return TeaModel.build(map, self);
    }

    public SplitPurchaseOrderRequest setBody(PurchaseOrderRenderQuery body) {
        this.body = body;
        return this;
    }
    public PurchaseOrderRenderQuery getBody() {
        return this.body;
    }

}
