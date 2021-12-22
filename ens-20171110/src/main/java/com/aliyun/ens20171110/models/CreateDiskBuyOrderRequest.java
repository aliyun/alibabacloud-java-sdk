// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateDiskBuyOrderRequest extends TeaModel {
    // 创建订单的订单详情
    @NameInMap("OrderDetails")
    public String orderDetails;

    public static CreateDiskBuyOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDiskBuyOrderRequest self = new CreateDiskBuyOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateDiskBuyOrderRequest setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
        return this;
    }
    public String getOrderDetails() {
        return this.orderDetails;
    }

}
