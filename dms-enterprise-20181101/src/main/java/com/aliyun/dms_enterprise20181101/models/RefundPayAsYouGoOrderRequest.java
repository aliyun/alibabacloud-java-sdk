// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RefundPayAsYouGoOrderRequest extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The order ID of the order for the pay-as-you-go resource. You can call the ListEffectiveOrders operation to query the order ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static RefundPayAsYouGoOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        RefundPayAsYouGoOrderRequest self = new RefundPayAsYouGoOrderRequest();
        return TeaModel.build(map, self);
    }

    public RefundPayAsYouGoOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RefundPayAsYouGoOrderRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
