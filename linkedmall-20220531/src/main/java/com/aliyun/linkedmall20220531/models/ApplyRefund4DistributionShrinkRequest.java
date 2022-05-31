// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ApplyRefund4DistributionShrinkRequest extends TeaModel {
    // 退款原因ID
    @NameInMap("ApplyReasonTextId")
    public Long applyReasonTextId;

    // 退货数量
    @NameInMap("ApplyRefundCount")
    public Integer applyRefundCount;

    // 申请退款金额
    @NameInMap("ApplyRefundFee")
    public Long applyRefundFee;

    // 退款类型
    @NameInMap("BizClaimType")
    public Integer bizClaimType;

    // 分销商ID
    @NameInMap("DistributorId")
    public String distributorId;

    // 货物状态
    @NameInMap("GoodsStatus")
    public Integer goodsStatus;

    // 留言
    @NameInMap("LeaveMessage")
    public String leaveMessage;

    // 凭证
    @NameInMap("LeavePictureLists")
    public String leavePictureListsShrink;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 子分销订单ID
    @NameInMap("SubDistributionOrderId")
    public String subDistributionOrderId;

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

    public ApplyRefund4DistributionShrinkRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyRefund4DistributionShrinkRequest setSubDistributionOrderId(String subDistributionOrderId) {
        this.subDistributionOrderId = subDistributionOrderId;
        return this;
    }
    public String getSubDistributionOrderId() {
        return this.subDistributionOrderId;
    }

}
