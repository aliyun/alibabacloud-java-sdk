// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateStorageGatewayShrinkRequest extends TeaModel {
    /**
     * <p>The array of orders.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderDetails")
    public String orderDetailsShrink;

    public static CreateStorageGatewayShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageGatewayShrinkRequest self = new CreateStorageGatewayShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateStorageGatewayShrinkRequest setOrderDetailsShrink(String orderDetailsShrink) {
        this.orderDetailsShrink = orderDetailsShrink;
        return this;
    }
    public String getOrderDetailsShrink() {
        return this.orderDetailsShrink;
    }

}
