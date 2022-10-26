// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ApplyRefundWithDesignatedTbUidRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("DisputeId")
    public Long disputeId;

    @NameInMap("GoodsStatus")
    public Integer goodsStatus;

    @NameInMap("Message")
    public String message;

    @NameInMap("Proofs")
    public java.util.List<ApplyRefundWithDesignatedTbUidRequestProofs> proofs;

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

    public static ApplyRefundWithDesignatedTbUidRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyRefundWithDesignatedTbUidRequest self = new ApplyRefundWithDesignatedTbUidRequest();
        return TeaModel.build(map, self);
    }

    public ApplyRefundWithDesignatedTbUidRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ApplyRefundWithDesignatedTbUidRequest setDisputeId(Long disputeId) {
        this.disputeId = disputeId;
        return this;
    }
    public Long getDisputeId() {
        return this.disputeId;
    }

    public ApplyRefundWithDesignatedTbUidRequest setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
        return this;
    }
    public Integer getGoodsStatus() {
        return this.goodsStatus;
    }

    public ApplyRefundWithDesignatedTbUidRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplyRefundWithDesignatedTbUidRequest setProofs(java.util.List<ApplyRefundWithDesignatedTbUidRequestProofs> proofs) {
        this.proofs = proofs;
        return this;
    }
    public java.util.List<ApplyRefundWithDesignatedTbUidRequestProofs> getProofs() {
        return this.proofs;
    }

    public ApplyRefundWithDesignatedTbUidRequest setReasonId(Long reasonId) {
        this.reasonId = reasonId;
        return this;
    }
    public Long getReasonId() {
        return this.reasonId;
    }

    public ApplyRefundWithDesignatedTbUidRequest setRefundCode(Integer refundCode) {
        this.refundCode = refundCode;
        return this;
    }
    public Integer getRefundCode() {
        return this.refundCode;
    }

    public ApplyRefundWithDesignatedTbUidRequest setRefundCount(Integer refundCount) {
        this.refundCount = refundCount;
        return this;
    }
    public Integer getRefundCount() {
        return this.refundCount;
    }

    public ApplyRefundWithDesignatedTbUidRequest setRefundFee(Long refundFee) {
        this.refundFee = refundFee;
        return this;
    }
    public Long getRefundFee() {
        return this.refundFee;
    }

    public ApplyRefundWithDesignatedTbUidRequest setSubLmOrderId(String subLmOrderId) {
        this.subLmOrderId = subLmOrderId;
        return this;
    }
    public String getSubLmOrderId() {
        return this.subLmOrderId;
    }

    public ApplyRefundWithDesignatedTbUidRequest setTbAccountType(String tbAccountType) {
        this.tbAccountType = tbAccountType;
        return this;
    }
    public String getTbAccountType() {
        return this.tbAccountType;
    }

    public ApplyRefundWithDesignatedTbUidRequest setTbUserId(Long tbUserId) {
        this.tbUserId = tbUserId;
        return this;
    }
    public Long getTbUserId() {
        return this.tbUserId;
    }

    public ApplyRefundWithDesignatedTbUidRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public static class ApplyRefundWithDesignatedTbUidRequestProofs extends TeaModel {
        @NameInMap("MessagePic")
        public String messagePic;

        @NameInMap("MessagePicDesc")
        public String messagePicDesc;

        public static ApplyRefundWithDesignatedTbUidRequestProofs build(java.util.Map<String, ?> map) throws Exception {
            ApplyRefundWithDesignatedTbUidRequestProofs self = new ApplyRefundWithDesignatedTbUidRequestProofs();
            return TeaModel.build(map, self);
        }

        public ApplyRefundWithDesignatedTbUidRequestProofs setMessagePic(String messagePic) {
            this.messagePic = messagePic;
            return this;
        }
        public String getMessagePic() {
            return this.messagePic;
        }

        public ApplyRefundWithDesignatedTbUidRequestProofs setMessagePicDesc(String messagePicDesc) {
            this.messagePicDesc = messagePicDesc;
            return this;
        }
        public String getMessagePicDesc() {
            return this.messagePicDesc;
        }

    }

}
