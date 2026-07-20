// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class OrderRefundDetailQueryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZLJD12241231000002</p>
     */
    @NameInMap("cooperator_order_id")
    public String cooperatorOrderId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1012000000000000</p>
     */
    @NameInMap("order_id")
    public String orderId;

    public static OrderRefundDetailQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        OrderRefundDetailQueryRequest self = new OrderRefundDetailQueryRequest();
        return TeaModel.build(map, self);
    }

    public OrderRefundDetailQueryRequest setCooperatorOrderId(String cooperatorOrderId) {
        this.cooperatorOrderId = cooperatorOrderId;
        return this;
    }
    public String getCooperatorOrderId() {
        return this.cooperatorOrderId;
    }

    public OrderRefundDetailQueryRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
