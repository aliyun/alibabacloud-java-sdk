// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightRefundDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("order_id")
    public String orderId;

    @NameInMap("out_order_id")
    public String outOrderId;

    @NameInMap("out_refund_apply_id")
    public String outRefundApplyId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("refund_apply_id")
    public String refundApplyId;

    public static IntlFlightRefundDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightRefundDetailRequest self = new IntlFlightRefundDetailRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightRefundDetailRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public IntlFlightRefundDetailRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public IntlFlightRefundDetailRequest setOutRefundApplyId(String outRefundApplyId) {
        this.outRefundApplyId = outRefundApplyId;
        return this;
    }
    public String getOutRefundApplyId() {
        return this.outRefundApplyId;
    }

    public IntlFlightRefundDetailRequest setRefundApplyId(String refundApplyId) {
        this.refundApplyId = refundApplyId;
        return this;
    }
    public String getRefundApplyId() {
        return this.refundApplyId;
    }

}
