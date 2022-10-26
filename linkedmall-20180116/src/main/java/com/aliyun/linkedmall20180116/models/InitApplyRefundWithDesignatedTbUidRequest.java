// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class InitApplyRefundWithDesignatedTbUidRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("DisputeId")
    public Long disputeId;

    @NameInMap("RefundCode")
    public Integer refundCode;

    @NameInMap("SubLmOrderId")
    public String subLmOrderId;

    @NameInMap("TbAccountType")
    public String tbAccountType;

    @NameInMap("TbUserId")
    public Long tbUserId;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    public static InitApplyRefundWithDesignatedTbUidRequest build(java.util.Map<String, ?> map) throws Exception {
        InitApplyRefundWithDesignatedTbUidRequest self = new InitApplyRefundWithDesignatedTbUidRequest();
        return TeaModel.build(map, self);
    }

    public InitApplyRefundWithDesignatedTbUidRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public InitApplyRefundWithDesignatedTbUidRequest setDisputeId(Long disputeId) {
        this.disputeId = disputeId;
        return this;
    }
    public Long getDisputeId() {
        return this.disputeId;
    }

    public InitApplyRefundWithDesignatedTbUidRequest setRefundCode(Integer refundCode) {
        this.refundCode = refundCode;
        return this;
    }
    public Integer getRefundCode() {
        return this.refundCode;
    }

    public InitApplyRefundWithDesignatedTbUidRequest setSubLmOrderId(String subLmOrderId) {
        this.subLmOrderId = subLmOrderId;
        return this;
    }
    public String getSubLmOrderId() {
        return this.subLmOrderId;
    }

    public InitApplyRefundWithDesignatedTbUidRequest setTbAccountType(String tbAccountType) {
        this.tbAccountType = tbAccountType;
        return this;
    }
    public String getTbAccountType() {
        return this.tbAccountType;
    }

    public InitApplyRefundWithDesignatedTbUidRequest setTbUserId(Long tbUserId) {
        this.tbUserId = tbUserId;
        return this;
    }
    public Long getTbUserId() {
        return this.tbUserId;
    }

    public InitApplyRefundWithDesignatedTbUidRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

}
