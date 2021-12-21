// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CancelOrderRequestRequest extends TeaModel {
    @NameInMap("OrderId")
    public Long orderId;

    public static CancelOrderRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelOrderRequestRequest self = new CancelOrderRequestRequest();
        return TeaModel.build(map, self);
    }

    public CancelOrderRequestRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
