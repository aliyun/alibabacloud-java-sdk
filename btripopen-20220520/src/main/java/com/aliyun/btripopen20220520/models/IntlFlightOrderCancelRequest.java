// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightOrderCancelRequest extends TeaModel {
    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("memo")
    public String memo;

    @NameInMap("order_id")
    public String orderId;

    @NameInMap("out_order_id")
    public String outOrderId;

    public static IntlFlightOrderCancelRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightOrderCancelRequest self = new IntlFlightOrderCancelRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightOrderCancelRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public IntlFlightOrderCancelRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public IntlFlightOrderCancelRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public IntlFlightOrderCancelRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

}
