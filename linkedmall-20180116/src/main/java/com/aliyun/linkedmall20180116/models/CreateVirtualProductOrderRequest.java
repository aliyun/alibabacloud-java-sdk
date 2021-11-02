// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateVirtualProductOrderRequest extends TeaModel {
    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BizUid")
    public String bizUid;

    @NameInMap("DeliveryAddress")
    public String deliveryAddress;

    @NameInMap("ExtJson")
    public String extJson;

    @NameInMap("ItemId")
    public Long itemId;

    @NameInMap("ItemList")
    public java.util.List<CreateVirtualProductOrderRequestItemList> itemList;

    @NameInMap("LmItemId")
    public String lmItemId;

    @NameInMap("OrderExpireTime")
    public Long orderExpireTime;

    @NameInMap("OutTradeId")
    public String outTradeId;

    @NameInMap("Quantity")
    public Long quantity;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    @NameInMap("TotalAmount")
    public Long totalAmount;

    @NameInMap("UseAnonymousTbAccount")
    public Boolean useAnonymousTbAccount;

    public static CreateVirtualProductOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualProductOrderRequest self = new CreateVirtualProductOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateVirtualProductOrderRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public CreateVirtualProductOrderRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateVirtualProductOrderRequest setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public CreateVirtualProductOrderRequest setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }
    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public CreateVirtualProductOrderRequest setExtJson(String extJson) {
        this.extJson = extJson;
        return this;
    }
    public String getExtJson() {
        return this.extJson;
    }

    public CreateVirtualProductOrderRequest setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }
    public Long getItemId() {
        return this.itemId;
    }

    public CreateVirtualProductOrderRequest setItemList(java.util.List<CreateVirtualProductOrderRequestItemList> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<CreateVirtualProductOrderRequestItemList> getItemList() {
        return this.itemList;
    }

    public CreateVirtualProductOrderRequest setLmItemId(String lmItemId) {
        this.lmItemId = lmItemId;
        return this;
    }
    public String getLmItemId() {
        return this.lmItemId;
    }

    public CreateVirtualProductOrderRequest setOrderExpireTime(Long orderExpireTime) {
        this.orderExpireTime = orderExpireTime;
        return this;
    }
    public Long getOrderExpireTime() {
        return this.orderExpireTime;
    }

    public CreateVirtualProductOrderRequest setOutTradeId(String outTradeId) {
        this.outTradeId = outTradeId;
        return this;
    }
    public String getOutTradeId() {
        return this.outTradeId;
    }

    public CreateVirtualProductOrderRequest setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

    public CreateVirtualProductOrderRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public CreateVirtualProductOrderRequest setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public CreateVirtualProductOrderRequest setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
        this.useAnonymousTbAccount = useAnonymousTbAccount;
        return this;
    }
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

    public static class CreateVirtualProductOrderRequestItemList extends TeaModel {
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("Quantity")
        public Integer quantity;

        @NameInMap("SkuId")
        public Long skuId;

        public static CreateVirtualProductOrderRequestItemList build(java.util.Map<String, ?> map) throws Exception {
            CreateVirtualProductOrderRequestItemList self = new CreateVirtualProductOrderRequestItemList();
            return TeaModel.build(map, self);
        }

        public CreateVirtualProductOrderRequestItemList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public CreateVirtualProductOrderRequestItemList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public CreateVirtualProductOrderRequestItemList setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public CreateVirtualProductOrderRequestItemList setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

    }

}
