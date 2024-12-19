// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ApplyRefundWithDesignatedTbUidRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL20***001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>142***071</p>
     */
    @NameInMap("DisputeId")
    public Long disputeId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("GoodsStatus")
    public Integer goodsStatus;

    @NameInMap("Message")
    public String message;

    @NameInMap("Proofs")
    public java.util.List<ApplyRefundWithDesignatedTbUidRequestProofs> proofs;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>150013</p>
     */
    @NameInMap("ReasonId")
    public Long reasonId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RefundCode")
    public Integer refundCode;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RefundCount")
    public Integer refundCount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>990</p>
     */
    @NameInMap("RefundFee")
    public Long refundFee;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>702091003</p>
     */
    @NameInMap("SubLmOrderId")
    public String subLmOrderId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ANONY</p>
     */
    @NameInMap("TbAccountType")
    public String tbAccountType;

    /**
     * <strong>example:</strong>
     * <p>333***21</p>
     */
    @NameInMap("TbUserId")
    public Long tbUserId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>U333***21</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p><a href="https://aliyundoc.com">https://aliyundoc.com</a></p>
         */
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
