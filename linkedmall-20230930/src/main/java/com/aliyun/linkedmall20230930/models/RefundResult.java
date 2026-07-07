// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class RefundResult extends TeaModel {
    /**
     * <p>Current buyer\&quot;s refund request description</p>
     * 
     * <strong>example:</strong>
     * <p>多拍不想要</p>
     */
    @NameInMap("applyDisputeDesc")
    public String applyDisputeDesc;

    /**
     * <p>Request reason</p>
     */
    @NameInMap("applyReason")
    public ApplyReason applyReason;

    /**
     * <p>Order return method<br>1 – identity indicates refund only<br>3 – identity indicates return and refund</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("bizClaimType")
    public Integer bizClaimType;

    /**
     * <p>Dispute creation time</p>
     * 
     * <strong>example:</strong>
     * <p>2023-09-15T19:23:59.000+08:00</p>
     */
    @NameInMap("disputeCreateTime")
    public String disputeCreateTime;

    /**
     * <p>Reverse request description</p>
     * 
     * <strong>example:</strong>
     * <p>多拍不想要</p>
     */
    @NameInMap("disputeDesc")
    public String disputeDesc;

    /**
     * <p>Reverse process end time</p>
     * 
     * <strong>example:</strong>
     * <p>2023-09-15T19:23:59.000+08:00</p>
     */
    @NameInMap("disputeEndTime")
    public String disputeEndTime;

    /**
     * <p>Reverse order ID</p>
     * 
     * <strong>example:</strong>
     * <p>6693****4352</p>
     */
    @NameInMap("disputeId")
    public String disputeId;

    /**
     * <p>Reverse order status<br>1 – Return pending<br>2 – Awaiting buyer return<br>3 – Awaiting merchant receipt<br>4 – Refund shutdown<br>5 – Refund succeeded<br>6 – Refund denied<br>17 – Canceling refund</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("disputeStatus")
    public Integer disputeStatus;

    /**
     * <p>Main order ID</p>
     * 
     * <strong>example:</strong>
     * <p>6692****5457</p>
     */
    @NameInMap("orderId")
    public String orderId;

    /**
     * <p>Sub-order ID</p>
     * 
     * <strong>example:</strong>
     * <p>6692****5458</p>
     */
    @NameInMap("orderLineId")
    public String orderLineId;

    /**
     * <p>Order logistics status<br>1 – Not shipped → Awaiting seller shipment<br>2 – Shipped → Awaiting buyer confirmation of receipt<br>3 – Received → Transaction succeeded<br>6 – Partially shipping<br>8 – Logistics order not yet created</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("orderLogisticsStatus")
    public Integer orderLogisticsStatus;

    /**
     * <p>Refund amount</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("refundFee")
    public Long refundFee;

    /**
     * <p>Refund period</p>
     */
    @NameInMap("refundFeeData")
    public RefundFeeData refundFeeData;

    /**
     * <p>Merchant return address (available when disputeStatus=2, indicating the status is pending buyer return; save the return address during this status if needed)</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云云谷</p>
     */
    @NameInMap("refunderAddress")
    public String refunderAddress;

    /**
     * <p>Return recipient name</p>
     * 
     * <strong>example:</strong>
     * <p>赵先生</p>
     */
    @NameInMap("refunderName")
    public String refunderName;

    /**
     * <p>Return contact information</p>
     * 
     * <strong>example:</strong>
     * <p>182****1334</p>
     */
    @NameInMap("refunderTel")
    public String refunderTel;

    /**
     * <p>Return address ZIP code</p>
     * 
     * <strong>example:</strong>
     * <p>331001</p>
     */
    @NameInMap("refunderZipCode")
    public String refunderZipCode;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>841471F6-5D61-1331-8C38-2****B55</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Return logistics status<br>0 – Return not initiated<br>1 – Awaiting pickup<br>2 – Package picked up<br>3 – In transit<br>4 – Out for delivery<br>5 – Delivered<br>6 – Delivery failed</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("returnGoodLogisticsStatus")
    public Integer returnGoodLogisticsStatus;

    /**
     * <p>Seller’s return approval message</p>
     * 
     * <strong>example:</strong>
     * <p>同意退款</p>
     */
    @NameInMap("sellerAgreeMsg")
    public String sellerAgreeMsg;

    /**
     * <p>Merchant\&quot;s message explaining the denial</p>
     * 
     * <strong>example:</strong>
     * <p>不同意退款</p>
     */
    @NameInMap("sellerRefuseAgreementMessage")
    public String sellerRefuseAgreementMessage;

    /**
     * <p>Merchant denial reason</p>
     * 
     * <strong>example:</strong>
     * <p>商品没问题，买家举证无效</p>
     */
    @NameInMap("sellerRefuseReason")
    public String sellerRefuseReason;

    public static RefundResult build(java.util.Map<String, ?> map) throws Exception {
        RefundResult self = new RefundResult();
        return TeaModel.build(map, self);
    }

    public RefundResult setApplyDisputeDesc(String applyDisputeDesc) {
        this.applyDisputeDesc = applyDisputeDesc;
        return this;
    }
    public String getApplyDisputeDesc() {
        return this.applyDisputeDesc;
    }

    public RefundResult setApplyReason(ApplyReason applyReason) {
        this.applyReason = applyReason;
        return this;
    }
    public ApplyReason getApplyReason() {
        return this.applyReason;
    }

    public RefundResult setBizClaimType(Integer bizClaimType) {
        this.bizClaimType = bizClaimType;
        return this;
    }
    public Integer getBizClaimType() {
        return this.bizClaimType;
    }

    public RefundResult setDisputeCreateTime(String disputeCreateTime) {
        this.disputeCreateTime = disputeCreateTime;
        return this;
    }
    public String getDisputeCreateTime() {
        return this.disputeCreateTime;
    }

    public RefundResult setDisputeDesc(String disputeDesc) {
        this.disputeDesc = disputeDesc;
        return this;
    }
    public String getDisputeDesc() {
        return this.disputeDesc;
    }

    public RefundResult setDisputeEndTime(String disputeEndTime) {
        this.disputeEndTime = disputeEndTime;
        return this;
    }
    public String getDisputeEndTime() {
        return this.disputeEndTime;
    }

    public RefundResult setDisputeId(String disputeId) {
        this.disputeId = disputeId;
        return this;
    }
    public String getDisputeId() {
        return this.disputeId;
    }

    public RefundResult setDisputeStatus(Integer disputeStatus) {
        this.disputeStatus = disputeStatus;
        return this;
    }
    public Integer getDisputeStatus() {
        return this.disputeStatus;
    }

    public RefundResult setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RefundResult setOrderLineId(String orderLineId) {
        this.orderLineId = orderLineId;
        return this;
    }
    public String getOrderLineId() {
        return this.orderLineId;
    }

    public RefundResult setOrderLogisticsStatus(Integer orderLogisticsStatus) {
        this.orderLogisticsStatus = orderLogisticsStatus;
        return this;
    }
    public Integer getOrderLogisticsStatus() {
        return this.orderLogisticsStatus;
    }

    public RefundResult setRefundFee(Long refundFee) {
        this.refundFee = refundFee;
        return this;
    }
    public Long getRefundFee() {
        return this.refundFee;
    }

    public RefundResult setRefundFeeData(RefundFeeData refundFeeData) {
        this.refundFeeData = refundFeeData;
        return this;
    }
    public RefundFeeData getRefundFeeData() {
        return this.refundFeeData;
    }

    public RefundResult setRefunderAddress(String refunderAddress) {
        this.refunderAddress = refunderAddress;
        return this;
    }
    public String getRefunderAddress() {
        return this.refunderAddress;
    }

    public RefundResult setRefunderName(String refunderName) {
        this.refunderName = refunderName;
        return this;
    }
    public String getRefunderName() {
        return this.refunderName;
    }

    public RefundResult setRefunderTel(String refunderTel) {
        this.refunderTel = refunderTel;
        return this;
    }
    public String getRefunderTel() {
        return this.refunderTel;
    }

    public RefundResult setRefunderZipCode(String refunderZipCode) {
        this.refunderZipCode = refunderZipCode;
        return this;
    }
    public String getRefunderZipCode() {
        return this.refunderZipCode;
    }

    public RefundResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefundResult setReturnGoodLogisticsStatus(Integer returnGoodLogisticsStatus) {
        this.returnGoodLogisticsStatus = returnGoodLogisticsStatus;
        return this;
    }
    public Integer getReturnGoodLogisticsStatus() {
        return this.returnGoodLogisticsStatus;
    }

    public RefundResult setSellerAgreeMsg(String sellerAgreeMsg) {
        this.sellerAgreeMsg = sellerAgreeMsg;
        return this;
    }
    public String getSellerAgreeMsg() {
        return this.sellerAgreeMsg;
    }

    public RefundResult setSellerRefuseAgreementMessage(String sellerRefuseAgreementMessage) {
        this.sellerRefuseAgreementMessage = sellerRefuseAgreementMessage;
        return this;
    }
    public String getSellerRefuseAgreementMessage() {
        return this.sellerRefuseAgreementMessage;
    }

    public RefundResult setSellerRefuseReason(String sellerRefuseReason) {
        this.sellerRefuseReason = sellerRefuseReason;
        return this;
    }
    public String getSellerRefuseReason() {
        return this.sellerRefuseReason;
    }

}
