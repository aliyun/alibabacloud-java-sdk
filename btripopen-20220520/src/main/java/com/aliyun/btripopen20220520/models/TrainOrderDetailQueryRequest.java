// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainOrderDetailQueryRequest extends TeaModel {
    @NameInMap("order_id")
    public String orderId;

    @NameInMap("out_order_id")
    public String outOrderId;

    public static TrainOrderDetailQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        TrainOrderDetailQueryRequest self = new TrainOrderDetailQueryRequest();
        return TeaModel.build(map, self);
    }

    public TrainOrderDetailQueryRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public TrainOrderDetailQueryRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

}
