// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateElbBuyOrderRequest extends TeaModel {
    @NameInMap("OrderDetails")
    public String orderDetails;

    public static CreateElbBuyOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateElbBuyOrderRequest self = new CreateElbBuyOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateElbBuyOrderRequest setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
        return this;
    }
    public String getOrderDetails() {
        return this.orderDetails;
    }

}
