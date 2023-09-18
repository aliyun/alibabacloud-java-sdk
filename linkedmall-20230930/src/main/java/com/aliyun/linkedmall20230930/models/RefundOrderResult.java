// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class RefundOrderResult extends TeaModel {
    @NameInMap("disputeId")
    public String disputeId;

    @NameInMap("disputeStatus")
    public Integer disputeStatus;

    @NameInMap("orderLineId")
    public String orderLineId;

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
