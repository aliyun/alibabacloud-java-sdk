// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightRefundConsultRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1002145190081005400</p>
     */
    @NameInMap("order_id")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>3753197470069161984</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    public static IntlFlightRefundConsultRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightRefundConsultRequest self = new IntlFlightRefundConsultRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightRefundConsultRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public IntlFlightRefundConsultRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

}
