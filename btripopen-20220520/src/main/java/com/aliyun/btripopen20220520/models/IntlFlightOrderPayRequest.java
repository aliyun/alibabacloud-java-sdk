// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightOrderPayRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("btrip_user_id")
    public String btripUserId;

    /**
     * <strong>example:</strong>
     * <p>ZHANG/SAN</p>
     */
    @NameInMap("buyer_name")
    public String buyerName;

    @NameInMap("isv_name")
    public String isvName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("order_id")
    public String orderId;

    @NameInMap("order_price")
    public Long orderPrice;

    @NameInMap("out_order_id")
    public String outOrderId;

    public static IntlFlightOrderPayRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightOrderPayRequest self = new IntlFlightOrderPayRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightOrderPayRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public IntlFlightOrderPayRequest setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
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

    public IntlFlightOrderPayRequest setOrderPrice(Long orderPrice) {
        this.orderPrice = orderPrice;
        return this;
    }
    public Long getOrderPrice() {
        return this.orderPrice;
    }

    public IntlFlightOrderPayRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

}
