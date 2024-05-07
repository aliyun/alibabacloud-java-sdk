// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class CreatePurchaseOrderRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public PurchaseOrderCreateCmd body;

    public static CreatePurchaseOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePurchaseOrderRequest self = new CreatePurchaseOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreatePurchaseOrderRequest setBody(PurchaseOrderCreateCmd body) {
        this.body = body;
        return this;
    }
    public PurchaseOrderCreateCmd getBody() {
        return this.body;
    }

}
