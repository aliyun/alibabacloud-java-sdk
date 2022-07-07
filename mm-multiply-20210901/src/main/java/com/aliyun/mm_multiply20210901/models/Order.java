// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class Order extends TeaModel {
    // 买家名称
    @NameInMap("BuyerName")
    public String buyerName;

    // 买家电话
    @NameInMap("BuyerPhone")
    public String buyerPhone;

    // 支付ID
    @NameInMap("CheckoutSerialNumber")
    public String checkoutSerialNumber;

    // 猫淘ID
    @NameInMap("MtBillId")
    public String mtBillId;

    // 下单时间
    @NameInMap("OrderTime")
    public String orderTime;

    // 来源ID，WX、H5、APP
    @NameInMap("PlatformType")
    public String platformType;

    // 价格
    @NameInMap("Price")
    public Double price;

    // 订单类型，待付款(WAITING_PAY)，待发货(WAITING_SHIP)，已发货(SHIPPED)，交易成功（TRANSACTION_CLOSED），交易关闭(TRANSACTION_SUCCEEDED)
    @NameInMap("Status")
    public String status;

    // 店铺ID
    @NameInMap("StoreId")
    public String storeId;

    // 订单ID
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
