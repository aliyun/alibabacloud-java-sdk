// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightRefundDetailV2Request extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cheshiapi</p>
     */
    @NameInMap("isv_name")
    public String isvName;

    /**
     * <strong>example:</strong>
     * <p>1002039195025156784</p>
     */
    @NameInMap("order_id")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>1002039195025156700</p>
     */
    @NameInMap("refund_apply_id")
    public String refundApplyId;

    public static FlightRefundDetailV2Request build(java.util.Map<String, ?> map) throws Exception {
        FlightRefundDetailV2Request self = new FlightRefundDetailV2Request();
        return TeaModel.build(map, self);
    }

    public FlightRefundDetailV2Request setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public FlightRefundDetailV2Request setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public FlightRefundDetailV2Request setRefundApplyId(String refundApplyId) {
        this.refundApplyId = refundApplyId;
        return this;
    }
    public String getRefundApplyId() {
        return this.refundApplyId;
    }

}
