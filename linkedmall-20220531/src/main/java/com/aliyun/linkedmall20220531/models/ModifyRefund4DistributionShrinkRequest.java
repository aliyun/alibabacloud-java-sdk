// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ModifyRefund4DistributionShrinkRequest extends TeaModel {
    @NameInMap("ApplyReasonTextId")
    public Long applyReasonTextId;

    @NameInMap("ApplyRefundCount")
    public Integer applyRefundCount;

    @NameInMap("ApplyRefundFee")
    public Long applyRefundFee;

    @NameInMap("BizClaimType")
    public Integer bizClaimType;

    @NameInMap("DisputeId")
    public Long disputeId;

    @NameInMap("DistributorId")
    public String distributorId;

    @NameInMap("GoodsStatus")
    public Integer goodsStatus;

    @NameInMap("LeaveMessage")
    public String leaveMessage;

    @NameInMap("LeavePictureLists")
    public String leavePictureListsShrink;

    @NameInMap("SubDistributionOrderId")
    public String subDistributionOrderId;

    @NameInMap("TenantId")
    public String tenantId;

    public static ModifyRefund4DistributionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRefund4DistributionShrinkRequest self = new ModifyRefund4DistributionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRefund4DistributionShrinkRequest setApplyReasonTextId(Long applyReasonTextId) {
        this.applyReasonTextId = applyReasonTextId;
        return this;
    }
    public Long getApplyReasonTextId() {
        return this.applyReasonTextId;
    }

    public ModifyRefund4DistributionShrinkRequest setApplyRefundCount(Integer applyRefundCount) {
        this.applyRefundCount = applyRefundCount;
        return this;
    }
    public Integer getApplyRefundCount() {
        return this.applyRefundCount;
    }

    public ModifyRefund4DistributionShrinkRequest setApplyRefundFee(Long applyRefundFee) {
        this.applyRefundFee = applyRefundFee;
        return this;
    }
    public Long getApplyRefundFee() {
        return this.applyRefundFee;
    }

    public ModifyRefund4DistributionShrinkRequest setBizClaimType(Integer bizClaimType) {
        this.bizClaimType = bizClaimType;
        return this;
    }
    public Integer getBizClaimType() {
        return this.bizClaimType;
    }

    public ModifyRefund4DistributionShrinkRequest setDisputeId(Long disputeId) {
        this.disputeId = disputeId;
        return this;
    }
    public Long getDisputeId() {
        return this.disputeId;
    }

    public ModifyRefund4DistributionShrinkRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public ModifyRefund4DistributionShrinkRequest setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
        return this;
    }
    public Integer getGoodsStatus() {
        return this.goodsStatus;
    }

    public ModifyRefund4DistributionShrinkRequest setLeaveMessage(String leaveMessage) {
        this.leaveMessage = leaveMessage;
        return this;
    }
    public String getLeaveMessage() {
        return this.leaveMessage;
    }

    public ModifyRefund4DistributionShrinkRequest setLeavePictureListsShrink(String leavePictureListsShrink) {
        this.leavePictureListsShrink = leavePictureListsShrink;
        return this;
    }
    public String getLeavePictureListsShrink() {
        return this.leavePictureListsShrink;
    }

    public ModifyRefund4DistributionShrinkRequest setSubDistributionOrderId(String subDistributionOrderId) {
        this.subDistributionOrderId = subDistributionOrderId;
        return this;
    }
    public String getSubDistributionOrderId() {
        return this.subDistributionOrderId;
    }

    public ModifyRefund4DistributionShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
