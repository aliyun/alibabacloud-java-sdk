// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IFlightOrderDetailQueryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1017035199702438072</p>
     */
    @NameInMap("order_id")
    public Long orderId;

    public static IFlightOrderDetailQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        IFlightOrderDetailQueryRequest self = new IFlightOrderDetailQueryRequest();
        return TeaModel.build(map, self);
    }

    public IFlightOrderDetailQueryRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
