// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainOrderCancelRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1234223</p>
     */
    @NameInMap("change_order_id")
    public String changeOrderId;

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
     * <p>123321245534</p>
     */
    @NameInMap("out_change_order_id")
    public String outChangeOrderId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    public static TrainOrderCancelRequest build(java.util.Map<String, ?> map) throws Exception {
        TrainOrderCancelRequest self = new TrainOrderCancelRequest();
        return TeaModel.build(map, self);
    }

    public TrainOrderCancelRequest setChangeOrderId(String changeOrderId) {
        this.changeOrderId = changeOrderId;
        return this;
    }
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

    public TrainOrderCancelRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public TrainOrderCancelRequest setOutChangeOrderId(String outChangeOrderId) {
        this.outChangeOrderId = outChangeOrderId;
        return this;
    }
    public String getOutChangeOrderId() {
        return this.outChangeOrderId;
    }

    public TrainOrderCancelRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

}
