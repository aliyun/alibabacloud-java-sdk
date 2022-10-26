// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyRefundWithDesignatedTbUidRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("DisputeId")
    public Long disputeId;

    @NameInMap("GoodsStatus")
    public Integer goodsStatus;

    @NameInMap("Message")
    public String message;

    @NameInMap("Proofs")
    public java.util.List<ModifyRefundWithDesignatedTbUidRequestProofs> proofs;

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

    public static ModifyRefundWithDesignatedTbUidRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRefundWithDesignatedTbUidRequest self = new ModifyRefundWithDesignatedTbUidRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRefundWithDesignatedTbUidRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ModifyRefundWithDesignatedTbUidRequest setDisputeId(Long disputeId) {
        this.disputeId = disputeId;
        return this;
    }
    public Long getDisputeId() {
        return this.disputeId;
    }

    public ModifyRefundWithDesignatedTbUidRequest setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
        return this;
    }
    public Integer getGoodsStatus() {
        return this.goodsStatus;
    }

    public ModifyRefundWithDesignatedTbUidRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyRefundWithDesignatedTbUidRequest setProofs(java.util.List<ModifyRefundWithDesignatedTbUidRequestProofs> proofs) {
        this.proofs = proofs;
        return this;
    }
    public java.util.List<ModifyRefundWithDesignatedTbUidRequestProofs> getProofs() {
        return this.proofs;
    }

    public ModifyRefundWithDesignatedTbUidRequest setReasonId(Long reasonId) {
        this.reasonId = reasonId;
        return this;
    }
    public Long getReasonId() {
        return this.reasonId;
    }

    public ModifyRefundWithDesignatedTbUidRequest setRefundCode(Integer refundCode) {
        this.refundCode = refundCode;
        return this;
    }
    public Integer getRefundCode() {
        return this.refundCode;
    }

    public ModifyRefundWithDesignatedTbUidRequest setRefundCount(Integer refundCount) {
        this.refundCount = refundCount;
        return this;
    }
    public Integer getRefundCount() {
        return this.refundCount;
    }

    public ModifyRefundWithDesignatedTbUidRequest setRefundFee(Long refundFee) {
        this.refundFee = refundFee;
        return this;
    }
    public Long getRefundFee() {
        return this.refundFee;
    }

    public ModifyRefundWithDesignatedTbUidRequest setSubLmOrderId(String subLmOrderId) {
        this.subLmOrderId = subLmOrderId;
        return this;
    }
    public String getSubLmOrderId() {
        return this.subLmOrderId;
    }

    public ModifyRefundWithDesignatedTbUidRequest setTbAccountType(String tbAccountType) {
        this.tbAccountType = tbAccountType;
        return this;
    }
    public String getTbAccountType() {
        return this.tbAccountType;
    }

    public ModifyRefundWithDesignatedTbUidRequest setTbUserId(Long tbUserId) {
        this.tbUserId = tbUserId;
        return this;
    }
    public Long getTbUserId() {
        return this.tbUserId;
    }

    public ModifyRefundWithDesignatedTbUidRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public static class ModifyRefundWithDesignatedTbUidRequestProofs extends TeaModel {
        @NameInMap("MessagePic")
        public String messagePic;

        @NameInMap("MessagePicDesc")
        public String messagePicDesc;

        public static ModifyRefundWithDesignatedTbUidRequestProofs build(java.util.Map<String, ?> map) throws Exception {
            ModifyRefundWithDesignatedTbUidRequestProofs self = new ModifyRefundWithDesignatedTbUidRequestProofs();
            return TeaModel.build(map, self);
        }

        public ModifyRefundWithDesignatedTbUidRequestProofs setMessagePic(String messagePic) {
            this.messagePic = messagePic;
            return this;
        }
        public String getMessagePic() {
            return this.messagePic;
        }

        public ModifyRefundWithDesignatedTbUidRequestProofs setMessagePicDesc(String messagePicDesc) {
            this.messagePicDesc = messagePicDesc;
            return this;
        }
        public String getMessagePicDesc() {
            return this.messagePicDesc;
        }

    }

}
