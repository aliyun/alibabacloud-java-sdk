// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainFeeCalculateChangeShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("change_train_details")
    public String changeTrainDetailsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("distribute_order_id")
    public String distributeOrderId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("order_id")
    public String orderId;

    public static TrainFeeCalculateChangeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TrainFeeCalculateChangeShrinkRequest self = new TrainFeeCalculateChangeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TrainFeeCalculateChangeShrinkRequest setChangeTrainDetailsShrink(String changeTrainDetailsShrink) {
        this.changeTrainDetailsShrink = changeTrainDetailsShrink;
        return this;
    }
    public String getChangeTrainDetailsShrink() {
        return this.changeTrainDetailsShrink;
    }

    public TrainFeeCalculateChangeShrinkRequest setDistributeOrderId(String distributeOrderId) {
        this.distributeOrderId = distributeOrderId;
        return this;
    }
    public String getDistributeOrderId() {
        return this.distributeOrderId;
    }

    public TrainFeeCalculateChangeShrinkRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
