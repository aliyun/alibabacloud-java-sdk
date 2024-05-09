// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainOrderPayRequest extends TeaModel {
    @NameInMap("order_id")
    public String orderId;

    @NameInMap("out_order_id")
    public String outOrderId;

    @NameInMap("pay_amount")
    public Long payAmount;

    public static TrainOrderPayRequest build(java.util.Map<String, ?> map) throws Exception {
        TrainOrderPayRequest self = new TrainOrderPayRequest();
        return TeaModel.build(map, self);
    }

    public TrainOrderPayRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public TrainOrderPayRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public TrainOrderPayRequest setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
        return this;
    }
    public Long getPayAmount() {
        return this.payAmount;
    }

}
