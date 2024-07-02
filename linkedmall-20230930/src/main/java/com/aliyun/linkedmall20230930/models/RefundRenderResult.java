// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class RefundRenderResult extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("bizClaimType")
    public Integer bizClaimType;

    @NameInMap("maxRefundFeeData")
    public DistributionMaxRefundFee maxRefundFeeData;

    /**
     * <strong>example:</strong>
     * <p>6692****5458</p>
     */
    @NameInMap("orderLineId")
    public String orderLineId;

    @NameInMap("refundReasonList")
    public java.util.List<RefundReason> refundReasonList;

    /**
     * <strong>example:</strong>
     * <p>3239281273464326823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static RefundRenderResult build(java.util.Map<String, ?> map) throws Exception {
        RefundRenderResult self = new RefundRenderResult();
        return TeaModel.build(map, self);
    }

    public RefundRenderResult setBizClaimType(Integer bizClaimType) {
        this.bizClaimType = bizClaimType;
        return this;
    }
    public Integer getBizClaimType() {
        return this.bizClaimType;
    }

    public RefundRenderResult setMaxRefundFeeData(DistributionMaxRefundFee maxRefundFeeData) {
        this.maxRefundFeeData = maxRefundFeeData;
        return this;
    }
    public DistributionMaxRefundFee getMaxRefundFeeData() {
        return this.maxRefundFeeData;
    }

    public RefundRenderResult setOrderLineId(String orderLineId) {
        this.orderLineId = orderLineId;
        return this;
    }
    public String getOrderLineId() {
        return this.orderLineId;
    }

    public RefundRenderResult setRefundReasonList(java.util.List<RefundReason> refundReasonList) {
        this.refundReasonList = refundReasonList;
        return this;
    }
    public java.util.List<RefundReason> getRefundReasonList() {
        return this.refundReasonList;
    }

    public RefundRenderResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
