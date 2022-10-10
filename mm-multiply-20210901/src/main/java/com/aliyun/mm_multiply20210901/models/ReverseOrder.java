// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ReverseOrder extends TeaModel {
    @NameInMap("BuyerName")
    public String buyerName;

    @NameInMap("BuyerPhone")
    public String buyerPhone;

    @NameInMap("CheckoutSerialNumber")
    public String checkoutSerialNumber;

    @NameInMap("MtBillId")
    public String mtBillId;

    @NameInMap("OrderTime")
    public String orderTime;

    @NameInMap("PlatformType")
    public String platformType;

    @NameInMap("Price")
    public Double price;

    @NameInMap("ReverseOrderId")
    public String reverseOrderId;

    @NameInMap("ReverseOrderStatus")
    public String reverseOrderStatus;

    @NameInMap("ReverseOrderTime")
    public String reverseOrderTime;

    @NameInMap("Status")
    public String status;

    @NameInMap("StoreId")
    public String storeId;

    @NameInMap("orderId")
    public String orderId;

    public static ReverseOrder build(java.util.Map<String, ?> map) throws Exception {
        ReverseOrder self = new ReverseOrder();
        return TeaModel.build(map, self);
    }

    public ReverseOrder setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public ReverseOrder setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
        return this;
    }
    public String getBuyerPhone() {
        return this.buyerPhone;
    }

    public ReverseOrder setCheckoutSerialNumber(String checkoutSerialNumber) {
        this.checkoutSerialNumber = checkoutSerialNumber;
        return this;
    }
    public String getCheckoutSerialNumber() {
        return this.checkoutSerialNumber;
    }

    public ReverseOrder setMtBillId(String mtBillId) {
        this.mtBillId = mtBillId;
        return this;
    }
    public String getMtBillId() {
        return this.mtBillId;
    }

    public ReverseOrder setOrderTime(String orderTime) {
        this.orderTime = orderTime;
        return this;
    }
    public String getOrderTime() {
        return this.orderTime;
    }

    public ReverseOrder setPlatformType(String platformType) {
        this.platformType = platformType;
        return this;
    }
    public String getPlatformType() {
        return this.platformType;
    }

    public ReverseOrder setPrice(Double price) {
        this.price = price;
        return this;
    }
    public Double getPrice() {
        return this.price;
    }

    public ReverseOrder setReverseOrderId(String reverseOrderId) {
        this.reverseOrderId = reverseOrderId;
        return this;
    }
    public String getReverseOrderId() {
        return this.reverseOrderId;
    }

    public ReverseOrder setReverseOrderStatus(String reverseOrderStatus) {
        this.reverseOrderStatus = reverseOrderStatus;
        return this;
    }
    public String getReverseOrderStatus() {
        return this.reverseOrderStatus;
    }

    public ReverseOrder setReverseOrderTime(String reverseOrderTime) {
        this.reverseOrderTime = reverseOrderTime;
        return this;
    }
    public String getReverseOrderTime() {
        return this.reverseOrderTime;
    }

    public ReverseOrder setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ReverseOrder setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public ReverseOrder setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
