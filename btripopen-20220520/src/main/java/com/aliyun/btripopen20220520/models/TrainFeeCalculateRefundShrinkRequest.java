// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainFeeCalculateRefundShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("distribute_order_id")
    public String distributeOrderId;

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
     */
    @NameInMap("refund_train_infos")
    public String refundTrainInfosShrink;

    public static TrainFeeCalculateRefundShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TrainFeeCalculateRefundShrinkRequest self = new TrainFeeCalculateRefundShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TrainFeeCalculateRefundShrinkRequest setDistributeOrderId(String distributeOrderId) {
        this.distributeOrderId = distributeOrderId;
        return this;
    }
    public String getDistributeOrderId() {
        return this.distributeOrderId;
    }

    public TrainFeeCalculateRefundShrinkRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public TrainFeeCalculateRefundShrinkRequest setRefundTrainInfosShrink(String refundTrainInfosShrink) {
        this.refundTrainInfosShrink = refundTrainInfosShrink;
        return this;
    }
    public String getRefundTrainInfosShrink() {
        return this.refundTrainInfosShrink;
    }

}
