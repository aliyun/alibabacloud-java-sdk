// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketApplyRefundRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AccountNo")
    public Long accountNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("DistributorOrderId")
    public String distributorOrderId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>计划有变</p>
     */
    @NameInMap("RefundReason")
    public String refundReason;

    /**
     * <strong>example:</strong>
     * <p>档期冲突</p>
     */
    @NameInMap("RefundRemark")
    public String refundRemark;

    public static TicketApplyRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        TicketApplyRefundRequest self = new TicketApplyRefundRequest();
        return TeaModel.build(map, self);
    }

    public TicketApplyRefundRequest setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public Long getAccountNo() {
        return this.accountNo;
    }

    public TicketApplyRefundRequest setDistributorOrderId(String distributorOrderId) {
        this.distributorOrderId = distributorOrderId;
        return this;
    }
    public String getDistributorOrderId() {
        return this.distributorOrderId;
    }

    public TicketApplyRefundRequest setRefundReason(String refundReason) {
        this.refundReason = refundReason;
        return this;
    }
    public String getRefundReason() {
        return this.refundReason;
    }

    public TicketApplyRefundRequest setRefundRemark(String refundRemark) {
        this.refundRemark = refundRemark;
        return this;
    }
    public String getRefundRemark() {
        return this.refundRemark;
    }

}
