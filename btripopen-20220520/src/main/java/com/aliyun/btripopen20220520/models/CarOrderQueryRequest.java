// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CarOrderQueryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1012000000000000</p>
     */
    @NameInMap("order_id")
    public Long orderId;

    /**
     * <strong>example:</strong>
     * <p>1000000</p>
     */
    @NameInMap("sub_order_id")
    public Long subOrderId;

    public static CarOrderQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        CarOrderQueryRequest self = new CarOrderQueryRequest();
        return TeaModel.build(map, self);
    }

    public CarOrderQueryRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CarOrderQueryRequest setSubOrderId(Long subOrderId) {
        this.subOrderId = subOrderId;
        return this;
    }
    public Long getSubOrderId() {
        return this.subOrderId;
    }

}
