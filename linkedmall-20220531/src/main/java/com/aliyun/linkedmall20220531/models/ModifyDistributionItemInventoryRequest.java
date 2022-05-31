// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ModifyDistributionItemInventoryRequest extends TeaModel {
    // 业务号
    @NameInMap("BizId")
    public String bizId;

    // 分销商城id
    @NameInMap("DistributionMallId")
    public String distributionMallId;

    // 商品id
    @NameInMap("ItemList")
    public java.util.List<ModifyDistributionItemInventoryRequestItemList> itemList;

    public static ModifyDistributionItemInventoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDistributionItemInventoryRequest self = new ModifyDistributionItemInventoryRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDistributionItemInventoryRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ModifyDistributionItemInventoryRequest setDistributionMallId(String distributionMallId) {
        this.distributionMallId = distributionMallId;
        return this;
    }
    public String getDistributionMallId() {
        return this.distributionMallId;
    }

    public ModifyDistributionItemInventoryRequest setItemList(java.util.List<ModifyDistributionItemInventoryRequestItemList> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<ModifyDistributionItemInventoryRequestItemList> getItemList() {
        return this.itemList;
    }

    public static class ModifyDistributionItemInventoryRequestItemList extends TeaModel {
        // 商品id
        @NameInMap("ItemId")
        public Long itemId;

        // lm商品id
        @NameInMap("LmItemId")
        public String lmItemId;

        // 库存数量
        @NameInMap("Quantity")
        public Long quantity;

        // skuId
        @NameInMap("SkuId")
        public Long skuId;

        public static ModifyDistributionItemInventoryRequestItemList build(java.util.Map<String, ?> map) throws Exception {
            ModifyDistributionItemInventoryRequestItemList self = new ModifyDistributionItemInventoryRequestItemList();
            return TeaModel.build(map, self);
        }

        public ModifyDistributionItemInventoryRequestItemList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public ModifyDistributionItemInventoryRequestItemList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public ModifyDistributionItemInventoryRequestItemList setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }
        public Long getQuantity() {
            return this.quantity;
        }

        public ModifyDistributionItemInventoryRequestItemList setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

    }

}
