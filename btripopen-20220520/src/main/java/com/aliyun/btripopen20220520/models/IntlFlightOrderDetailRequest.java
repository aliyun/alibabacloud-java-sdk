// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightOrderDetailRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>TRAVEL</p>
     */
    @NameInMap("isv_name")
    public String isvName;

    /**
     * <strong>example:</strong>
     * <p>1012000000000000</p>
     */
    @NameInMap("order_id")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>F11374007131319304192</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    public static IntlFlightOrderDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightOrderDetailRequest self = new IntlFlightOrderDetailRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightOrderDetailRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public IntlFlightOrderDetailRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public IntlFlightOrderDetailRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

}
