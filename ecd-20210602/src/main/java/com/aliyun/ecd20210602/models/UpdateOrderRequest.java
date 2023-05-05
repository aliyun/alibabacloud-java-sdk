// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class UpdateOrderRequest extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("Status")
    public Long status;

    public static UpdateOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOrderRequest self = new UpdateOrderRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpdateOrderRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
