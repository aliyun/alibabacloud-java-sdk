// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateOrderTransactionDetailFileRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    // 业务名称
    @NameInMap("BizName")
    public String bizName;

    // 渠道名称
    @NameInMap("ChannelName")
    public String channelName;

    // 创建结束时间
    @NameInMap("CreateEndTime")
    public String createEndTime;

    // 创建开始时间
    @NameInMap("CreateStartTime")
    public String createStartTime;

    // 商品id
    @NameInMap("ItemId")
    public String itemId;

    @NameInMap("LmShopId")
    public String lmShopId;

    // 订单状态
    @NameInMap("OrderStatus")
    public String orderStatus;

    // 支付状态
    @NameInMap("PayStatus")
    public String payStatus;

    // PO单号
    @NameInMap("PoCode")
    public String poCode;

    @NameInMap("SellerId")
    public String sellerId;

    @NameInMap("SellerName")
    public String sellerName;

    // 结算节点
    @NameInMap("SettlementNode")
    public String settlementNode;

    // 店铺名称
    @NameInMap("ShopName")
    public String shopName;

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

    public CreateOrderTransactionDetailFileRequest setPoCode(String poCode) {
        this.poCode = poCode;
        return this;
    }
    public String getPoCode() {
        return this.poCode;
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
