// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RenderOrderRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ANONY</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL2000***12</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>2212850685759</p>
     */
    @NameInMap("BizUid")
    public String bizUid;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("DeliveryAddress")
    public String deliveryAddress;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExtJson")
    public String extJson;

    @NameInMap("ItemList")
    public java.util.List<RenderOrderRequestItemList> itemList;

    /**
     * <strong>example:</strong>
     * <p>10016572-654408058233</p>
     */
    @NameInMap("LmItemId")
    public String lmItemId;

    /**
     * <strong>example:</strong>
     * <p>2212850685759</p>
     */
    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseAnonymousTbAccount")
    public Boolean useAnonymousTbAccount;

    public static RenderOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        RenderOrderRequest self = new RenderOrderRequest();
        return TeaModel.build(map, self);
    }

    public RenderOrderRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public RenderOrderRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RenderOrderRequest setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public RenderOrderRequest setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }
    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public RenderOrderRequest setExtJson(String extJson) {
        this.extJson = extJson;
        return this;
    }
    public String getExtJson() {
        return this.extJson;
    }

    public RenderOrderRequest setItemList(java.util.List<RenderOrderRequestItemList> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<RenderOrderRequestItemList> getItemList() {
        return this.itemList;
    }

    public RenderOrderRequest setLmItemId(String lmItemId) {
        this.lmItemId = lmItemId;
        return this;
    }
    public String getLmItemId() {
        return this.lmItemId;
    }

    public RenderOrderRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public RenderOrderRequest setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
        this.useAnonymousTbAccount = useAnonymousTbAccount;
        return this;
    }
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

    public static class RenderOrderRequestItemList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>620033847326</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        /**
         * <strong>example:</strong>
         * <p>10016572-654408058233</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Quantity")
        public Integer quantity;

        /**
         * <strong>example:</strong>
         * <p>4415814743135</p>
         */
        @NameInMap("SkuId")
        public Long skuId;

        public static RenderOrderRequestItemList build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderRequestItemList self = new RenderOrderRequestItemList();
            return TeaModel.build(map, self);
        }

        public RenderOrderRequestItemList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public RenderOrderRequestItemList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public RenderOrderRequestItemList setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public RenderOrderRequestItemList setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

    }

}
