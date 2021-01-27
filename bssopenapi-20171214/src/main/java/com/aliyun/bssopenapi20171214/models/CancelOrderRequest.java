// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CancelOrderRequest extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static CancelOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelOrderRequest self = new CancelOrderRequest();
        return TeaModel.build(map, self);
    }

    public CancelOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CancelOrderRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
