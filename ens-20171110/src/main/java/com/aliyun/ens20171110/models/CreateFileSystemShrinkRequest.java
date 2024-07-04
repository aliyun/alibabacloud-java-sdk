// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateFileSystemShrinkRequest extends TeaModel {
    /**
     * <p>The information about the orders.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderDetails")
    public String orderDetailsShrink;

    public static CreateFileSystemShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileSystemShrinkRequest self = new CreateFileSystemShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileSystemShrinkRequest setOrderDetailsShrink(String orderDetailsShrink) {
        this.orderDetailsShrink = orderDetailsShrink;
        return this;
    }
    public String getOrderDetailsShrink() {
        return this.orderDetailsShrink;
    }

}
