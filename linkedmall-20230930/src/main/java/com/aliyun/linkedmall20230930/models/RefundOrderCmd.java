// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class RefundOrderCmd extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("applyReasonTextId")
    public Long applyReasonTextId;

    @NameInMap("applyReasonTips")
    public String applyReasonTips;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("applyRefundCount")
    public Integer applyRefundCount;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("applyRefundFee")
    public Long applyRefundFee;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("bizClaimType")
    public Integer bizClaimType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("goodsStatus")
    public Integer goodsStatus;

    @NameInMap("leaveMessage")
    public String leaveMessage;

    @NameInMap("leavePictureLists")
    public java.util.List<LeavePictureList> leavePictureLists;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("orderLineId")
    public String orderLineId;

    public static RefundOrderCmd build(java.util.Map<String, ?> map) throws Exception {
        RefundOrderCmd self = new RefundOrderCmd();
        return TeaModel.build(map, self);
    }

    public RefundOrderCmd setApplyReasonTextId(Long applyReasonTextId) {
        this.applyReasonTextId = applyReasonTextId;
        return this;
    }
    public Long getApplyReasonTextId() {
        return this.applyReasonTextId;
    }

    public RefundOrderCmd setApplyReasonTips(String applyReasonTips) {
        this.applyReasonTips = applyReasonTips;
        return this;
    }
    public String getApplyReasonTips() {
        return this.applyReasonTips;
    }

    public RefundOrderCmd setApplyRefundCount(Integer applyRefundCount) {
        this.applyRefundCount = applyRefundCount;
        return this;
    }
    public Integer getApplyRefundCount() {
        return this.applyRefundCount;
    }

    public RefundOrderCmd setApplyRefundFee(Long applyRefundFee) {
        this.applyRefundFee = applyRefundFee;
        return this;
    }
    public Long getApplyRefundFee() {
        return this.applyRefundFee;
    }

    public RefundOrderCmd setBizClaimType(Integer bizClaimType) {
        this.bizClaimType = bizClaimType;
        return this;
    }
    public Integer getBizClaimType() {
        return this.bizClaimType;
    }

    public RefundOrderCmd setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
        return this;
    }
    public Integer getGoodsStatus() {
        return this.goodsStatus;
    }

    public RefundOrderCmd setLeaveMessage(String leaveMessage) {
        this.leaveMessage = leaveMessage;
        return this;
    }
    public String getLeaveMessage() {
        return this.leaveMessage;
    }

    public RefundOrderCmd setLeavePictureLists(java.util.List<LeavePictureList> leavePictureLists) {
        this.leavePictureLists = leavePictureLists;
        return this;
    }
    public java.util.List<LeavePictureList> getLeavePictureLists() {
        return this.leavePictureLists;
    }

    public RefundOrderCmd setOrderLineId(String orderLineId) {
        this.orderLineId = orderLineId;
        return this;
    }
    public String getOrderLineId() {
        return this.orderLineId;
    }

}
