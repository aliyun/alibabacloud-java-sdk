// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightPayOrderV2Request extends TeaModel {
    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("order_id")
    public String orderId;

    @NameInMap("out_order_id")
    public String outOrderId;

    @NameInMap("total_price")
    public Long totalPrice;

    @NameInMap("total_service_fee_price")
    public Long totalServiceFeePrice;

    public static FlightPayOrderV2Request build(java.util.Map<String, ?> map) throws Exception {
        FlightPayOrderV2Request self = new FlightPayOrderV2Request();
        return TeaModel.build(map, self);
    }

    public FlightPayOrderV2Request setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public FlightPayOrderV2Request setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public FlightPayOrderV2Request setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public FlightPayOrderV2Request setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }
    public Long getTotalPrice() {
        return this.totalPrice;
    }

    public FlightPayOrderV2Request setTotalServiceFeePrice(Long totalServiceFeePrice) {
        this.totalServiceFeePrice = totalServiceFeePrice;
        return this;
    }
    public Long getTotalServiceFeePrice() {
        return this.totalServiceFeePrice;
    }

}
