// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListReverseOrderRequest extends TeaModel {
    @NameInMap("BusinessId")
    public String businessId;

    @NameInMap("BuyerName")
    public String buyerName;

    @NameInMap("BuyerPhone")
    public String buyerPhone;

    @NameInMap("CheckoutSerialNumber")
    public String checkoutSerialNumber;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("MtBillId")
    public String mtBillId;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    // WX、H5、APP
    @NameInMap("PlatformType")
    public String platformType;

    @NameInMap("ReverseOrderId")
    public String reverseOrderId;

    // * 售后单状态: 已处理(PROCESSED), 待处理(PENDING), 处理中(PROCESSING), 已驳回(REJECTED), 商家同意换货（EXCHANGE）,      * 待买家退还商品(WAITING_RETURN), 买家撤销申请(REVOKE)，系统退款(SYSTEM_REFUND), 待商家收货(WAITING_STORE_RECEIPT), 已提交至淘宝 (SUBMITTED_TO_TAOBAO)      * 退款关闭(REFUND_CLOSE), 提交退款到淘宝失败(SUBMIT_TO_TAOBAO_FAILED)
    @NameInMap("ReverseOrderStatus")
    public String reverseOrderStatus;

    @NameInMap("StartTime")
    public String startTime;

    // * 售后单类型, 退货 (RETURN), 退款(REFUND), 售后单关闭(REVERSE_TRANSACTION_CLOSE)
    @NameInMap("Status")
    public String status;

    // 供应商ID
    @NameInMap("SupplierId")
    public String supplierId;

    public static ListReverseOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ListReverseOrderRequest self = new ListReverseOrderRequest();
        return TeaModel.build(map, self);
    }

    public ListReverseOrderRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public ListReverseOrderRequest setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public ListReverseOrderRequest setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
        return this;
    }
    public String getBuyerPhone() {
        return this.buyerPhone;
    }

    public ListReverseOrderRequest setCheckoutSerialNumber(String checkoutSerialNumber) {
        this.checkoutSerialNumber = checkoutSerialNumber;
        return this;
    }
    public String getCheckoutSerialNumber() {
        return this.checkoutSerialNumber;
    }

    public ListReverseOrderRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListReverseOrderRequest setMtBillId(String mtBillId) {
        this.mtBillId = mtBillId;
        return this;
    }
    public String getMtBillId() {
        return this.mtBillId;
    }

    public ListReverseOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ListReverseOrderRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListReverseOrderRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListReverseOrderRequest setPlatformType(String platformType) {
        this.platformType = platformType;
        return this;
    }
    public String getPlatformType() {
        return this.platformType;
    }

    public ListReverseOrderRequest setReverseOrderId(String reverseOrderId) {
        this.reverseOrderId = reverseOrderId;
        return this;
    }
    public String getReverseOrderId() {
        return this.reverseOrderId;
    }

    public ListReverseOrderRequest setReverseOrderStatus(String reverseOrderStatus) {
        this.reverseOrderStatus = reverseOrderStatus;
        return this;
    }
    public String getReverseOrderStatus() {
        return this.reverseOrderStatus;
    }

    public ListReverseOrderRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListReverseOrderRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListReverseOrderRequest setSupplierId(String supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public String getSupplierId() {
        return this.supplierId;
    }

}
