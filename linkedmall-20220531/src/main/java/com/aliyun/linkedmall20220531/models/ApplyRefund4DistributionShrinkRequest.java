// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ApplyRefund4DistributionShrinkRequest extends TeaModel {
    @NameInMap("ApplyReasonTextId")
    public Long applyReasonTextId;

    @NameInMap("ApplyRefundCount")
    public Integer applyRefundCount;

    @NameInMap("ApplyRefundFee")
    public Long applyRefundFee;

    @NameInMap("BizClaimType")
    public Integer bizClaimType;

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

    public static ApplyRefund4DistributionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyRefund4DistributionShrinkRequest self = new ApplyRefund4DistributionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ApplyRefund4DistributionShrinkRequest setApplyReasonTextId(Long applyReasonTextId) {
        this.applyReasonTextId = applyReasonTextId;
        return this;
    }
    public Long getApplyReasonTextId() {
        return this.applyReasonTextId;
    }

    public ApplyRefund4DistributionShrinkRequest setApplyRefundCount(Integer applyRefundCount) {
        this.applyRefundCount = applyRefundCount;
        return this;
    }
    public Integer getApplyRefundCount() {
        return this.applyRefundCount;
    }

    public ApplyRefund4DistributionShrinkRequest setApplyRefundFee(Long applyRefundFee) {
        this.applyRefundFee = applyRefundFee;
        return this;
    }
    public Long getApplyRefundFee() {
        return this.applyRefundFee;
    }

    public ApplyRefund4DistributionShrinkRequest setBizClaimType(Integer bizClaimType) {
        this.bizClaimType = bizClaimType;
        return this;
    }
    public Integer getBizClaimType() {
        return this.bizClaimType;
    }

    public ApplyRefund4DistributionShrinkRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public ApplyRefund4DistributionShrinkRequest setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
        return this;
    }
    public Integer getGoodsStatus() {
        return this.goodsStatus;
    }

    public ApplyRefund4DistributionShrinkRequest setLeaveMessage(String leaveMessage) {
        this.leaveMessage = leaveMessage;
        return this;
    }
    public String getLeaveMessage() {
        return this.leaveMessage;
    }

    public ApplyRefund4DistributionShrinkRequest setLeavePictureListsShrink(String leavePictureListsShrink) {
        this.leavePictureListsShrink = leavePictureListsShrink;
        return this;
    }
    public String getLeavePictureListsShrink() {
        return this.leavePictureListsShrink;
    }

    public ApplyRefund4DistributionShrinkRequest setSubDistributionOrderId(String subDistributionOrderId) {
        this.subDistributionOrderId = subDistributionOrderId;
        return this;
    }
    public String getSubDistributionOrderId() {
        return this.subDistributionOrderId;
    }

    public ApplyRefund4DistributionShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
