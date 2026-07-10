// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainOrderChangeConfirmRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("change_apply_id")
    public String changeApplyId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("change_settle_amount")
    public Long changeSettleAmount;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("order_id")
    public String orderId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("out_change_apply_id")
    public String outChangeApplyId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    public static TrainOrderChangeConfirmRequest build(java.util.Map<String, ?> map) throws Exception {
        TrainOrderChangeConfirmRequest self = new TrainOrderChangeConfirmRequest();
        return TeaModel.build(map, self);
    }

    public TrainOrderChangeConfirmRequest setChangeApplyId(String changeApplyId) {
        this.changeApplyId = changeApplyId;
        return this;
    }
    public String getChangeApplyId() {
        return this.changeApplyId;
    }

    public TrainOrderChangeConfirmRequest setChangeSettleAmount(Long changeSettleAmount) {
        this.changeSettleAmount = changeSettleAmount;
        return this;
    }
    public Long getChangeSettleAmount() {
        return this.changeSettleAmount;
    }

    public TrainOrderChangeConfirmRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public TrainOrderChangeConfirmRequest setOutChangeApplyId(String outChangeApplyId) {
        this.outChangeApplyId = outChangeApplyId;
        return this;
    }
    public String getOutChangeApplyId() {
        return this.outChangeApplyId;
    }

    public TrainOrderChangeConfirmRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

}
