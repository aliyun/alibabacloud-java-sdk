// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ApplyRefund4DistributionRequest extends TeaModel {
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
    public java.util.List<ApplyRefund4DistributionRequestLeavePictureLists> leavePictureLists;

    @NameInMap("SubDistributionOrderId")
    public String subDistributionOrderId;

    @NameInMap("TenantId")
    public String tenantId;

    public static ApplyRefund4DistributionRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyRefund4DistributionRequest self = new ApplyRefund4DistributionRequest();
        return TeaModel.build(map, self);
    }

    public ApplyRefund4DistributionRequest setApplyReasonTextId(Long applyReasonTextId) {
        this.applyReasonTextId = applyReasonTextId;
        return this;
    }
    public Long getApplyReasonTextId() {
        return this.applyReasonTextId;
    }

    public ApplyRefund4DistributionRequest setApplyRefundCount(Integer applyRefundCount) {
        this.applyRefundCount = applyRefundCount;
        return this;
    }
    public Integer getApplyRefundCount() {
        return this.applyRefundCount;
    }

    public ApplyRefund4DistributionRequest setApplyRefundFee(Long applyRefundFee) {
        this.applyRefundFee = applyRefundFee;
        return this;
    }
    public Long getApplyRefundFee() {
        return this.applyRefundFee;
    }

    public ApplyRefund4DistributionRequest setBizClaimType(Integer bizClaimType) {
        this.bizClaimType = bizClaimType;
        return this;
    }
    public Integer getBizClaimType() {
        return this.bizClaimType;
    }

    public ApplyRefund4DistributionRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public ApplyRefund4DistributionRequest setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
        return this;
    }
    public Integer getGoodsStatus() {
        return this.goodsStatus;
    }

    public ApplyRefund4DistributionRequest setLeaveMessage(String leaveMessage) {
        this.leaveMessage = leaveMessage;
        return this;
    }
    public String getLeaveMessage() {
        return this.leaveMessage;
    }

    public ApplyRefund4DistributionRequest setLeavePictureLists(java.util.List<ApplyRefund4DistributionRequestLeavePictureLists> leavePictureLists) {
        this.leavePictureLists = leavePictureLists;
        return this;
    }
    public java.util.List<ApplyRefund4DistributionRequestLeavePictureLists> getLeavePictureLists() {
        return this.leavePictureLists;
    }

    public ApplyRefund4DistributionRequest setSubDistributionOrderId(String subDistributionOrderId) {
        this.subDistributionOrderId = subDistributionOrderId;
        return this;
    }
    public String getSubDistributionOrderId() {
        return this.subDistributionOrderId;
    }

    public ApplyRefund4DistributionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public static class ApplyRefund4DistributionRequestLeavePictureLists extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        @NameInMap("Picture")
        public String picture;

        public static ApplyRefund4DistributionRequestLeavePictureLists build(java.util.Map<String, ?> map) throws Exception {
            ApplyRefund4DistributionRequestLeavePictureLists self = new ApplyRefund4DistributionRequestLeavePictureLists();
            return TeaModel.build(map, self);
        }

        public ApplyRefund4DistributionRequestLeavePictureLists setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ApplyRefund4DistributionRequestLeavePictureLists setPicture(String picture) {
            this.picture = picture;
            return this;
        }
        public String getPicture() {
            return this.picture;
        }

    }

}
