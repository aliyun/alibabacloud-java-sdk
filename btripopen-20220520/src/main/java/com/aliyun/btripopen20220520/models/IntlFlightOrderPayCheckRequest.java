// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightOrderPayCheckRequest extends TeaModel {
    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("order_id")
    public String orderId;

    @NameInMap("out_order_id")
    public String outOrderId;

    public static IntlFlightOrderPayCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightOrderPayCheckRequest self = new IntlFlightOrderPayCheckRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightOrderPayCheckRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public IntlFlightOrderPayCheckRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public IntlFlightOrderPayCheckRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

}
