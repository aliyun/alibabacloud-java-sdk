// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightOrderPayRequest extends TeaModel {
    @NameInMap("ext_params")
    public java.util.Map<String, ?> extParams;

    /**
     * <strong>example:</strong>
     * <p>TRAVEL</p>
     */
    @NameInMap("isv_name")
    public String isvName;

    /**
     * <strong>example:</strong>
     * <p>1002145190081005400</p>
     */
    @NameInMap("order_id")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>F11372878673688133632</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    /**
     * <strong>example:</strong>
     * <p>15500</p>
     */
    @NameInMap("total_price")
    public Long totalPrice;

    public static IntlFlightOrderPayRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightOrderPayRequest self = new IntlFlightOrderPayRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightOrderPayRequest setExtParams(java.util.Map<String, ?> extParams) {
        this.extParams = extParams;
        return this;
    }
    public java.util.Map<String, ?> getExtParams() {
        return this.extParams;
    }

    public IntlFlightOrderPayRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public IntlFlightOrderPayRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public IntlFlightOrderPayRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public IntlFlightOrderPayRequest setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }
    public Long getTotalPrice() {
        return this.totalPrice;
    }

}
