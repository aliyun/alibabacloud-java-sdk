// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ReverseOrder extends TeaModel {
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

    // 售后单Id
    @NameInMap("ReverseOrderId")
    public String reverseOrderId;

    // * 售后单状态: 已处理(PROCESSED), 待处理(PENDING), 处理中(PROCESSING), 已驳回(REJECTED), 商家同意换货（EXCHANGE）,      * 待买家退还商品(WAITING_RETURN), 买家撤销申请(REVOKE)，系统退款(SYSTEM_REFUND), 待商家收货(WAITING_STORE_RECEIPT), 已提交至淘宝 (SUBMITTED_TO_TAOBAO)      * 退款关闭(REFUND_CLOSE), 提交退款到淘宝失败(SUBMIT_TO_TAOBAO_FAILED)
    @NameInMap("ReverseOrderStatus")
    public String reverseOrderStatus;

    // 售后单时间
    @NameInMap("ReverseOrderTime")
    public String reverseOrderTime;

    // * 售后单类型, 退货 (RETURN), 退款(REFUND), 售后单关闭(REVERSE_TRANSACTION_CLOSE)
    @NameInMap("Status")
    public String status;

    // 店铺ID
    @NameInMap("StoreId")
    public String storeId;

    // 订单ID
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
