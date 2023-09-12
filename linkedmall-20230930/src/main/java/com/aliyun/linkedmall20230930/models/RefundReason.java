// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class RefundReason extends TeaModel {
    @NameInMap("proofRequired")
    public Boolean proofRequired;

    @NameInMap("reasonTextId")
    public String reasonTextId;

    @NameInMap("reasonTips")
    public String reasonTips;

    @NameInMap("refundDescRequired")
    public Boolean refundDescRequired;

    public static RefundReason build(java.util.Map<String, ?> map) throws Exception {
        RefundReason self = new RefundReason();
        return TeaModel.build(map, self);
    }

    public RefundReason setProofRequired(Boolean proofRequired) {
        this.proofRequired = proofRequired;
        return this;
    }
    public Boolean getProofRequired() {
        return this.proofRequired;
    }

    public RefundReason setReasonTextId(String reasonTextId) {
        this.reasonTextId = reasonTextId;
        return this;
    }
    public String getReasonTextId() {
        return this.reasonTextId;
    }

    public RefundReason setReasonTips(String reasonTips) {
        this.reasonTips = reasonTips;
        return this;
    }
    public String getReasonTips() {
        return this.reasonTips;
    }

    public RefundReason setRefundDescRequired(Boolean refundDescRequired) {
        this.refundDescRequired = refundDescRequired;
        return this;
    }
    public Boolean getRefundDescRequired() {
        return this.refundDescRequired;
    }

}
