// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class RefundReason extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("proofRequired")
    public Boolean proofRequired;

    /**
     * <strong>example:</strong>
     * <p>47683</p>
     */
    @NameInMap("reasonTextId")
    public String reasonTextId;

    /**
     * <strong>example:</strong>
     * <p>不想要了</p>
     */
    @NameInMap("reasonTips")
    public String reasonTips;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
