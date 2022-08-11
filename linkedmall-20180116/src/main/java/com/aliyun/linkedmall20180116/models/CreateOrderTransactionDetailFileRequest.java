// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateOrderTransactionDetailFileRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BizName")
    public String bizName;

    @NameInMap("ChannelName")
    public String channelName;

    @NameInMap("CreateEndTime")
    public String createEndTime;

    @NameInMap("CreateStartTime")
    public String createStartTime;

    @NameInMap("ItemId")
    public String itemId;

    @NameInMap("LmShopId")
    public String lmShopId;

    @NameInMap("OrderStatus")
    public String orderStatus;

    @NameInMap("PayStatus")
    public String payStatus;

    @NameInMap("PaymentEndTime")
    public String paymentEndTime;

    @NameInMap("PaymentStartTime")
    public String paymentStartTime;

    @NameInMap("PoCode")
    public String poCode;

    @NameInMap("RefundEndTime")
    public String refundEndTime;

    @NameInMap("RefundStartTime")
    public String refundStartTime;

    @NameInMap("SellerId")
    public String sellerId;

    @NameInMap("SellerName")
    public String sellerName;

    @NameInMap("SettlementNode")
    public String settlementNode;

    @NameInMap("ShopName")
    public String shopName;

    @NameInMap("TbMainOrderId")
    public String tbMainOrderId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("TenantName")
    public String tenantName;

    public static CreateOrderTransactionDetailFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderTransactionDetailFileRequest self = new CreateOrderTransactionDetailFileRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrderTransactionDetailFileRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateOrderTransactionDetailFileRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public CreateOrderTransactionDetailFileRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public CreateOrderTransactionDetailFileRequest setCreateEndTime(String createEndTime) {
        this.createEndTime = createEndTime;
        return this;
    }
    public String getCreateEndTime() {
        return this.createEndTime;
    }

    public CreateOrderTransactionDetailFileRequest setCreateStartTime(String createStartTime) {
        this.createStartTime = createStartTime;
        return this;
    }
    public String getCreateStartTime() {
        return this.createStartTime;
    }

    public CreateOrderTransactionDetailFileRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public CreateOrderTransactionDetailFileRequest setLmShopId(String lmShopId) {
        this.lmShopId = lmShopId;
        return this;
    }
    public String getLmShopId() {
        return this.lmShopId;
    }

    public CreateOrderTransactionDetailFileRequest setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public CreateOrderTransactionDetailFileRequest setPayStatus(String payStatus) {
        this.payStatus = payStatus;
        return this;
    }
    public String getPayStatus() {
        return this.payStatus;
    }

    public CreateOrderTransactionDetailFileRequest setPaymentEndTime(String paymentEndTime) {
        this.paymentEndTime = paymentEndTime;
        return this;
    }
    public String getPaymentEndTime() {
        return this.paymentEndTime;
    }

    public CreateOrderTransactionDetailFileRequest setPaymentStartTime(String paymentStartTime) {
        this.paymentStartTime = paymentStartTime;
        return this;
    }
    public String getPaymentStartTime() {
        return this.paymentStartTime;
    }

    public CreateOrderTransactionDetailFileRequest setPoCode(String poCode) {
        this.poCode = poCode;
        return this;
    }
    public String getPoCode() {
        return this.poCode;
    }

    public CreateOrderTransactionDetailFileRequest setRefundEndTime(String refundEndTime) {
        this.refundEndTime = refundEndTime;
        return this;
    }
    public String getRefundEndTime() {
        return this.refundEndTime;
    }

    public CreateOrderTransactionDetailFileRequest setRefundStartTime(String refundStartTime) {
        this.refundStartTime = refundStartTime;
        return this;
    }
    public String getRefundStartTime() {
        return this.refundStartTime;
    }

    public CreateOrderTransactionDetailFileRequest setSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public String getSellerId() {
        return this.sellerId;
    }

    public CreateOrderTransactionDetailFileRequest setSellerName(String sellerName) {
        this.sellerName = sellerName;
        return this;
    }
    public String getSellerName() {
        return this.sellerName;
    }

    public CreateOrderTransactionDetailFileRequest setSettlementNode(String settlementNode) {
        this.settlementNode = settlementNode;
        return this;
    }
    public String getSettlementNode() {
        return this.settlementNode;
    }

    public CreateOrderTransactionDetailFileRequest setShopName(String shopName) {
        this.shopName = shopName;
        return this;
    }
    public String getShopName() {
        return this.shopName;
    }

    public CreateOrderTransactionDetailFileRequest setTbMainOrderId(String tbMainOrderId) {
        this.tbMainOrderId = tbMainOrderId;
        return this;
    }
    public String getTbMainOrderId() {
        return this.tbMainOrderId;
    }

    public CreateOrderTransactionDetailFileRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateOrderTransactionDetailFileRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
