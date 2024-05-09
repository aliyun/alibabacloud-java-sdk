// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainApplyChangeShrinkRequest extends TeaModel {
    @NameInMap("accept_no_seat")
    public String acceptNoSeat;

    @NameInMap("change_train_info_s")
    public String changeTrainInfoSShrink;

    @NameInMap("force_match")
    public String forceMatch;

    @NameInMap("is_pay_now")
    public Boolean isPayNow;

    @NameInMap("order_id")
    public String orderId;

    @NameInMap("out_change_apply_id")
    public String outChangeApplyId;

    @NameInMap("out_order_id")
    public String outOrderId;

    public static TrainApplyChangeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TrainApplyChangeShrinkRequest self = new TrainApplyChangeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TrainApplyChangeShrinkRequest setAcceptNoSeat(String acceptNoSeat) {
        this.acceptNoSeat = acceptNoSeat;
        return this;
    }
    public String getAcceptNoSeat() {
        return this.acceptNoSeat;
    }

    public TrainApplyChangeShrinkRequest setChangeTrainInfoSShrink(String changeTrainInfoSShrink) {
        this.changeTrainInfoSShrink = changeTrainInfoSShrink;
        return this;
    }
    public String getChangeTrainInfoSShrink() {
        return this.changeTrainInfoSShrink;
    }

    public TrainApplyChangeShrinkRequest setForceMatch(String forceMatch) {
        this.forceMatch = forceMatch;
        return this;
    }
    public String getForceMatch() {
        return this.forceMatch;
    }

    public TrainApplyChangeShrinkRequest setIsPayNow(Boolean isPayNow) {
        this.isPayNow = isPayNow;
        return this;
    }
    public Boolean getIsPayNow() {
        return this.isPayNow;
    }

    public TrainApplyChangeShrinkRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public TrainApplyChangeShrinkRequest setOutChangeApplyId(String outChangeApplyId) {
        this.outChangeApplyId = outChangeApplyId;
        return this;
    }
    public String getOutChangeApplyId() {
        return this.outChangeApplyId;
    }

    public TrainApplyChangeShrinkRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

}
