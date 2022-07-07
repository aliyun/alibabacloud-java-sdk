// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListOrderRequest extends TeaModel {
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

    // 是否mock
    @NameInMap("Mock")
    public Boolean mock;

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

    @NameInMap("StartTime")
    public String startTime;

    // * 订单类型，待付款(WAITING_PAY)，待发货(WAITING_SHIP)，已发货(SHIPPED)，交易成功（TRANSACTION_CLOSED），交易关闭(TRANSACTION_SUCCEEDED)
    @NameInMap("Status")
    public String status;

    public static ListOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOrderRequest self = new ListOrderRequest();
        return TeaModel.build(map, self);
    }

    public ListOrderRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public ListOrderRequest setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public ListOrderRequest setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
        return this;
    }
    public String getBuyerPhone() {
        return this.buyerPhone;
    }

    public ListOrderRequest setCheckoutSerialNumber(String checkoutSerialNumber) {
        this.checkoutSerialNumber = checkoutSerialNumber;
        return this;
    }
    public String getCheckoutSerialNumber() {
        return this.checkoutSerialNumber;
    }

    public ListOrderRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListOrderRequest setMock(Boolean mock) {
        this.mock = mock;
        return this;
    }
    public Boolean getMock() {
        return this.mock;
    }

    public ListOrderRequest setMtBillId(String mtBillId) {
        this.mtBillId = mtBillId;
        return this;
    }
    public String getMtBillId() {
        return this.mtBillId;
    }

    public ListOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ListOrderRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListOrderRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListOrderRequest setPlatformType(String platformType) {
        this.platformType = platformType;
        return this;
    }
    public String getPlatformType() {
        return this.platformType;
    }

    public ListOrderRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListOrderRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
