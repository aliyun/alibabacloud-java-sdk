// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class RefundOrderResult extends TeaModel {
    /**
     * <p>Dispute ID</p>
     * 
     * <strong>example:</strong>
     * <p>6693****4352</p>
     */
    @NameInMap("disputeId")
    public String disputeId;

    /**
     * <p>Status of the reverse operation<br>1 – Return pending<br>2 – Awaiting buyer return<br>3 – Awaiting merchant receipt<br>4 – Refund closed<br>5 – Refund succeeded<br>6 – Refund denied<br>17 – Canceling refund</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("disputeStatus")
    public Integer disputeStatus;

    /**
     * <p>Sub-distribution order ID for which the reverse operation was initiated</p>
     * 
     * <strong>example:</strong>
     * <p>6692****5458</p>
     */
    @NameInMap("orderLineId")
    public String orderLineId;

    /**
     * <p>API request ID</p>
     * 
     * <strong>example:</strong>
     * <p>841471F6-5D61-1331-8C38-2****B55</p>
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
