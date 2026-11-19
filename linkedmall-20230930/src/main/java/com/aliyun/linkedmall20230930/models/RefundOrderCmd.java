// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class RefundOrderCmd extends TeaModel {
    /**
     * <p>The refund reason ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>47821</p>
     */
    @NameInMap("applyReasonTextId")
    public Long applyReasonTextId;

    /**
     * <p>The refund reason text.</p>
     * 
     * <strong>example:</strong>
     * <p>I no longer want it</p>
     */
    @NameInMap("applyReasonTips")
    public String applyReasonTips;

    /**
     * <p>The return quantity.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("applyRefundCount")
    public Integer applyRefundCount;

    /**
     * <p>The requested refund amount in cents.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("applyRefundFee")
    public Long applyRefundFee;

    /**
     * <p>The refund type. Valid values:</p>
     * <ul>
     * <li>1: Refund only. </li>
     * <li>3: Return and refund.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("bizClaimType")
    public Integer bizClaimType;

    /**
     * <p>The goods status. Valid values:</p>
     * <ul>
     * <li>4: Not shipped. </li>
     * <li>1: Not received.</li>
     * <li>2: Received.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("goodsStatus")
    public Integer goodsStatus;

    /**
     * <p>The message.</p>
     * 
     * <strong>example:</strong>
     * <p>I no longer want it</p>
     */
    @NameInMap("leaveMessage")
    public String leaveMessage;

    /**
     * <p>The image list.</p>
     */
    @NameInMap("leavePictureLists")
    public java.util.List<LeavePictureList> leavePictureLists;

    /**
     * <p>The sub-distribution order ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6692****5458</p>
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
