// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainApplyRefundShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1002145190081005400</p>
     */
    @NameInMap("order_id")
    public String orderId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456778</p>
     */
    @NameInMap("out_refund_id")
    public String outRefundId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("refund_train_infos")
    public String refundTrainInfosShrink;

    public static TrainApplyRefundShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TrainApplyRefundShrinkRequest self = new TrainApplyRefundShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TrainApplyRefundShrinkRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public TrainApplyRefundShrinkRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public TrainApplyRefundShrinkRequest setOutRefundId(String outRefundId) {
        this.outRefundId = outRefundId;
        return this;
    }
    public String getOutRefundId() {
        return this.outRefundId;
    }

    public TrainApplyRefundShrinkRequest setRefundTrainInfosShrink(String refundTrainInfosShrink) {
        this.refundTrainInfosShrink = refundTrainInfosShrink;
        return this;
    }
    public String getRefundTrainInfosShrink() {
        return this.refundTrainInfosShrink;
    }

}
