// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ApplyRefundWithDesignatedTbUidShrinkRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("DisputeId")
    public Long disputeId;

    @NameInMap("GoodsStatus")
    public Integer goodsStatus;

    @NameInMap("Message")
    public String message;

    @NameInMap("Proofs")
    public String proofsShrink;

    @NameInMap("ReasonId")
    public Long reasonId;

    @NameInMap("RefundCode")
    public Integer refundCode;

    @NameInMap("RefundCount")
    public Integer refundCount;

    @NameInMap("RefundFee")
    public Long refundFee;

    @NameInMap("SubLmOrderId")
    public String subLmOrderId;

    @NameInMap("TbAccountType")
    public String tbAccountType;

    @NameInMap("TbUserId")
    public Long tbUserId;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    public static ApplyRefundWithDesignatedTbUidShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyRefundWithDesignatedTbUidShrinkRequest self = new ApplyRefundWithDesignatedTbUidShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ApplyRefundWithDesignatedTbUidShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ApplyRefundWithDesignatedTbUidShrinkRequest setDisputeId(Long disputeId) {
        this.disputeId = disputeId;
        return this;
    }
    public Long getDisputeId() {
        return this.disputeId;
    }

    public ApplyRefundWithDesignatedTbUidShrinkRequest setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
        return this;
    }
    public Integer getGoodsStatus() {
        return this.goodsStatus;
    }

    public ApplyRefundWithDesignatedTbUidShrinkRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplyRefundWithDesignatedTbUidShrinkRequest setProofsShrink(String proofsShrink) {
        this.proofsShrink = proofsShrink;
        return this;
    }
    public String getProofsShrink() {
        return this.proofsShrink;
    }

    public ApplyRefundWithDesignatedTbUidShrinkRequest setReasonId(Long reasonId) {
        this.reasonId = reasonId;
        return this;
    }
    public Long getReasonId() {
        return this.reasonId;
    }

    public ApplyRefundWithDesignatedTbUidShrinkRequest setRefundCode(Integer refundCode) {
        this.refundCode = refundCode;
        return this;
    }
    public Integer getRefundCode() {
        return this.refundCode;
    }

    public ApplyRefundWithDesignatedTbUidShrinkRequest setRefundCount(Integer refundCount) {
        this.refundCount = refundCount;
        return this;
    }
    public Integer getRefundCount() {
        return this.refundCount;
    }

    public ApplyRefundWithDesignatedTbUidShrinkRequest setRefundFee(Long refundFee) {
        this.refundFee = refundFee;
        return this;
    }
    public Long getRefundFee() {
        return this.refundFee;
    }

    public ApplyRefundWithDesignatedTbUidShrinkRequest setSubLmOrderId(String subLmOrderId) {
        this.subLmOrderId = subLmOrderId;
        return this;
    }
    public String getSubLmOrderId() {
        return this.subLmOrderId;
    }

    public ApplyRefundWithDesignatedTbUidShrinkRequest setTbAccountType(String tbAccountType) {
        this.tbAccountType = tbAccountType;
        return this;
    }
    public String getTbAccountType() {
        return this.tbAccountType;
    }

    public ApplyRefundWithDesignatedTbUidShrinkRequest setTbUserId(Long tbUserId) {
        this.tbUserId = tbUserId;
        return this;
    }
    public Long getTbUserId() {
        return this.tbUserId;
    }

    public ApplyRefundWithDesignatedTbUidShrinkRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

}
