// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightOrderPayShrinkRequest extends TeaModel {
    @NameInMap("ext_params")
    public String extParamsShrink;

    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("order_id")
    public String orderId;

    @NameInMap("out_order_id")
    public String outOrderId;

    @NameInMap("total_price")
    public Long totalPrice;

    public static IntlFlightOrderPayShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightOrderPayShrinkRequest self = new IntlFlightOrderPayShrinkRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightOrderPayShrinkRequest setExtParamsShrink(String extParamsShrink) {
        this.extParamsShrink = extParamsShrink;
        return this;
    }
    public String getExtParamsShrink() {
        return this.extParamsShrink;
    }

    public IntlFlightOrderPayShrinkRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public IntlFlightOrderPayShrinkRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public IntlFlightOrderPayShrinkRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public IntlFlightOrderPayShrinkRequest setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }
    public Long getTotalPrice() {
        return this.totalPrice;
    }

}
