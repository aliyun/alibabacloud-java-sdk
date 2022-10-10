// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class Order extends TeaModel {
    @NameInMap("BuyerName")
    public String buyerName;

    @NameInMap("BuyerPhone")
    public String buyerPhone;

    @NameInMap("CheckoutSerialNumber")
    public String checkoutSerialNumber;

    @NameInMap("DiscountPrice")
    public Double discountPrice;

    @NameInMap("MtBillId")
    public String mtBillId;

    @NameInMap("OrderTime")
    public String orderTime;

    @NameInMap("PaymentPromotionPrice")
    public Double paymentPromotionPrice;

    @NameInMap("PlatformType")
    public String platformType;

    @NameInMap("Price")
    public Double price;

    @NameInMap("SaleItemPrice")
    public Double saleItemPrice;

    @NameInMap("ShippingPrice")
    public Double shippingPrice;

    @NameInMap("Status")
    public String status;

    @NameInMap("StoreId")
    public String storeId;

    @NameInMap("orderId")
    public String orderId;

    public static Order build(java.util.Map<String, ?> map) throws Exception {
        Order self = new Order();
        return TeaModel.build(map, self);
    }

    public Order setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public Order setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
        return this;
    }
    public String getBuyerPhone() {
        return this.buyerPhone;
    }

    public Order setCheckoutSerialNumber(String checkoutSerialNumber) {
        this.checkoutSerialNumber = checkoutSerialNumber;
        return this;
    }
    public String getCheckoutSerialNumber() {
        return this.checkoutSerialNumber;
    }

    public Order setDiscountPrice(Double discountPrice) {
        this.discountPrice = discountPrice;
        return this;
    }
    public Double getDiscountPrice() {
        return this.discountPrice;
    }

    public Order setMtBillId(String mtBillId) {
        this.mtBillId = mtBillId;
        return this;
    }
    public String getMtBillId() {
        return this.mtBillId;
    }

    public Order setOrderTime(String orderTime) {
        this.orderTime = orderTime;
        return this;
    }
    public String getOrderTime() {
        return this.orderTime;
    }

    public Order setPaymentPromotionPrice(Double paymentPromotionPrice) {
        this.paymentPromotionPrice = paymentPromotionPrice;
        return this;
    }
    public Double getPaymentPromotionPrice() {
        return this.paymentPromotionPrice;
    }

    public Order setPlatformType(String platformType) {
        this.platformType = platformType;
        return this;
    }
    public String getPlatformType() {
        return this.platformType;
    }

    public Order setPrice(Double price) {
        this.price = price;
        return this;
    }
    public Double getPrice() {
        return this.price;
    }

    public Order setSaleItemPrice(Double saleItemPrice) {
        this.saleItemPrice = saleItemPrice;
        return this;
    }
    public Double getSaleItemPrice() {
        return this.saleItemPrice;
    }

    public Order setShippingPrice(Double shippingPrice) {
        this.shippingPrice = shippingPrice;
        return this;
    }
    public Double getShippingPrice() {
        return this.shippingPrice;
    }

    public Order setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Order setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public Order setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
