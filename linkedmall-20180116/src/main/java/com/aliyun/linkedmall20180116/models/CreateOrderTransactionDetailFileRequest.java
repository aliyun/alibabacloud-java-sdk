// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateOrderTransactionDetailFileRequest extends TeaModel {
    // 下单账号类型：
    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("AliyunBid")
    public Long aliyunBid;

    @NameInMap("AliyunCallerType")
    public String aliyunCallerType;

    @NameInMap("AliyunId")
    public String aliyunId;

    @NameInMap("AliyunPid")
    public Long aliyunPid;

    @NameInMap("AliyunUid")
    public Long aliyunUid;

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

    @NameInMap("LmUserId")
    public Long lmUserId;

    // 订单状态
    @NameInMap("OrderStatus")
    public String orderStatus;

    // 支付状态
    @NameInMap("PayStatus")
    public String payStatus;

    // PO单号
    @NameInMap("PoCode")
    public String poCode;

    @NameInMap("ProxyOriginalSourceIp")
    public String proxyOriginalSourceIp;

    @NameInMap("RequestId")
    public String requestId;

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

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("TbNick")
    public String tbNick;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("TenantName")
    public String tenantName;

    // 企业侧用户ID
    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    @NameInMap("UscTbId")
    public String uscTbId;

    // 是否使用匿名（USC）淘宝ID
    @NameInMap("UseAnonymousTbAccount")
    public Boolean useAnonymousTbAccount;

    public static CreateOrderTransactionDetailFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderTransactionDetailFileRequest self = new CreateOrderTransactionDetailFileRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrderTransactionDetailFileRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public CreateOrderTransactionDetailFileRequest setAliyunBid(Long aliyunBid) {
        this.aliyunBid = aliyunBid;
        return this;
    }
    public Long getAliyunBid() {
        return this.aliyunBid;
    }

    public CreateOrderTransactionDetailFileRequest setAliyunCallerType(String aliyunCallerType) {
        this.aliyunCallerType = aliyunCallerType;
        return this;
    }
    public String getAliyunCallerType() {
        return this.aliyunCallerType;
    }

    public CreateOrderTransactionDetailFileRequest setAliyunId(String aliyunId) {
        this.aliyunId = aliyunId;
        return this;
    }
    public String getAliyunId() {
        return this.aliyunId;
    }

    public CreateOrderTransactionDetailFileRequest setAliyunPid(Long aliyunPid) {
        this.aliyunPid = aliyunPid;
        return this;
    }
    public Long getAliyunPid() {
        return this.aliyunPid;
    }

    public CreateOrderTransactionDetailFileRequest setAliyunUid(Long aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public Long getAliyunUid() {
        return this.aliyunUid;
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

    public CreateOrderTransactionDetailFileRequest setLmUserId(Long lmUserId) {
        this.lmUserId = lmUserId;
        return this;
    }
    public Long getLmUserId() {
        return this.lmUserId;
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

    public CreateOrderTransactionDetailFileRequest setProxyOriginalSourceIp(String proxyOriginalSourceIp) {
        this.proxyOriginalSourceIp = proxyOriginalSourceIp;
        return this;
    }
    public String getProxyOriginalSourceIp() {
        return this.proxyOriginalSourceIp;
    }

    public CreateOrderTransactionDetailFileRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public CreateOrderTransactionDetailFileRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateOrderTransactionDetailFileRequest setTbNick(String tbNick) {
        this.tbNick = tbNick;
        return this;
    }
    public String getTbNick() {
        return this.tbNick;
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

    public CreateOrderTransactionDetailFileRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public CreateOrderTransactionDetailFileRequest setUscTbId(String uscTbId) {
        this.uscTbId = uscTbId;
        return this;
    }
    public String getUscTbId() {
        return this.uscTbId;
    }

    public CreateOrderTransactionDetailFileRequest setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
        this.useAnonymousTbAccount = useAnonymousTbAccount;
        return this;
    }
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

}
