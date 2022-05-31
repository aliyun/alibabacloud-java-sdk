// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ModifyRefund4DistributionRequest extends TeaModel {
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

    // 纠纷id
    @NameInMap("DisputeId")
    public Long disputeId;

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
    public java.util.List<ModifyRefund4DistributionRequestLeavePictureLists> leavePictureLists;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 子分销订单ID
    @NameInMap("SubDistributionOrderId")
    public String subDistributionOrderId;

    public static ModifyRefund4DistributionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRefund4DistributionRequest self = new ModifyRefund4DistributionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRefund4DistributionRequest setApplyReasonTextId(Long applyReasonTextId) {
        this.applyReasonTextId = applyReasonTextId;
        return this;
    }
    public Long getApplyReasonTextId() {
        return this.applyReasonTextId;
    }

    public ModifyRefund4DistributionRequest setApplyRefundCount(Integer applyRefundCount) {
        this.applyRefundCount = applyRefundCount;
        return this;
    }
    public Integer getApplyRefundCount() {
        return this.applyRefundCount;
    }

    public ModifyRefund4DistributionRequest setApplyRefundFee(Long applyRefundFee) {
        this.applyRefundFee = applyRefundFee;
        return this;
    }
    public Long getApplyRefundFee() {
        return this.applyRefundFee;
    }

    public ModifyRefund4DistributionRequest setBizClaimType(Integer bizClaimType) {
        this.bizClaimType = bizClaimType;
        return this;
    }
    public Integer getBizClaimType() {
        return this.bizClaimType;
    }

    public ModifyRefund4DistributionRequest setDisputeId(Long disputeId) {
        this.disputeId = disputeId;
        return this;
    }
    public Long getDisputeId() {
        return this.disputeId;
    }

    public ModifyRefund4DistributionRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public ModifyRefund4DistributionRequest setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
        return this;
    }
    public Integer getGoodsStatus() {
        return this.goodsStatus;
    }

    public ModifyRefund4DistributionRequest setLeaveMessage(String leaveMessage) {
        this.leaveMessage = leaveMessage;
        return this;
    }
    public String getLeaveMessage() {
        return this.leaveMessage;
    }

    public ModifyRefund4DistributionRequest setLeavePictureLists(java.util.List<ModifyRefund4DistributionRequestLeavePictureLists> leavePictureLists) {
        this.leavePictureLists = leavePictureLists;
        return this;
    }
    public java.util.List<ModifyRefund4DistributionRequestLeavePictureLists> getLeavePictureLists() {
        return this.leavePictureLists;
    }

    public ModifyRefund4DistributionRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyRefund4DistributionRequest setSubDistributionOrderId(String subDistributionOrderId) {
        this.subDistributionOrderId = subDistributionOrderId;
        return this;
    }
    public String getSubDistributionOrderId() {
        return this.subDistributionOrderId;
    }

    public static class ModifyRefund4DistributionRequestLeavePictureLists extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        @NameInMap("Picture")
        public String picture;

        public static ModifyRefund4DistributionRequestLeavePictureLists build(java.util.Map<String, ?> map) throws Exception {
            ModifyRefund4DistributionRequestLeavePictureLists self = new ModifyRefund4DistributionRequestLeavePictureLists();
            return TeaModel.build(map, self);
        }

        public ModifyRefund4DistributionRequestLeavePictureLists setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ModifyRefund4DistributionRequestLeavePictureLists setPicture(String picture) {
            this.picture = picture;
            return this;
        }
        public String getPicture() {
            return this.picture;
        }

    }

}
