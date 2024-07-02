// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class RefundOrderResult extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6693****4352</p>
     */
    @NameInMap("disputeId")
    public String disputeId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("disputeStatus")
    public Integer disputeStatus;

    /**
     * <strong>example:</strong>
     * <p>6692****5458</p>
     */
    @NameInMap("orderLineId")
    public String orderLineId;

    /**
     * <strong>example:</strong>
     * <p>3239281273464326823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static RefundOrderResult build(java.util.Map<String, ?> map) throws Exception {
        RefundOrderResult self = new RefundOrderResult();
        return TeaModel.build(map, self);
    }

    public RefundOrderResult setDisputeId(String disputeId) {
        this.disputeId = disputeId;
        return this;
    }
    public String getDisputeId() {
        return this.disputeId;
    }

    public RefundOrderResult setDisputeStatus(Integer disputeStatus) {
        this.disputeStatus = disputeStatus;
        return this;
    }
    public Integer getDisputeStatus() {
        return this.disputeStatus;
    }

    public RefundOrderResult setOrderLineId(String orderLineId) {
        this.orderLineId = orderLineId;
        return this;
    }
    public String getOrderLineId() {
        return this.orderLineId;
    }

    public RefundOrderResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
