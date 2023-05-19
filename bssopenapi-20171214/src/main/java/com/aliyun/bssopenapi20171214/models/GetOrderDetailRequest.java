// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetOrderDetailRequest extends TeaModel {
    /**
     * <p>The ID of the order.</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static GetOrderDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOrderDetailRequest self = new GetOrderDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetOrderDetailRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetOrderDetailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
