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

    @NameInMap("PlatformType")
    public String platformType;

    @NameInMap("ReverseOrderId")
    public String reverseOrderId;

    @NameInMap("ReverseOrderStatus")
    public String reverseOrderStatus;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public String status;

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
