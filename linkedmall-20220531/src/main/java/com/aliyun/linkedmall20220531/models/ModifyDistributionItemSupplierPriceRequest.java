// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ModifyDistributionItemSupplierPriceRequest extends TeaModel {
    // 业务号
    @NameInMap("BizId")
    public String bizId;

    // 分销商城id
    @NameInMap("DistributionMallId")
    public String distributionMallId;

    // 商品id
    @NameInMap("ItemList")
    public java.util.List<ModifyDistributionItemSupplierPriceRequestItemList> itemList;

    public static ModifyDistributionItemSupplierPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDistributionItemSupplierPriceRequest self = new ModifyDistributionItemSupplierPriceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDistributionItemSupplierPriceRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ModifyDistributionItemSupplierPriceRequest setDistributionMallId(String distributionMallId) {
        this.distributionMallId = distributionMallId;
        return this;
    }
    public String getDistributionMallId() {
        return this.distributionMallId;
    }

    public ModifyDistributionItemSupplierPriceRequest setItemList(java.util.List<ModifyDistributionItemSupplierPriceRequestItemList> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<ModifyDistributionItemSupplierPriceRequestItemList> getItemList() {
        return this.itemList;
    }

    public static class ModifyDistributionItemSupplierPriceRequestItemList extends TeaModel {
        // 商品id
        @NameInMap("ItemId")
        public Long itemId;

        // lm商品id
        @NameInMap("LmItemId")
        public String lmItemId;

        // skuId
        @NameInMap("SkuId")
        public Long skuId;

        // 渠道供货价
        @NameInMap("SupplierPrice")
        public Long supplierPrice;

        public static ModifyDistributionItemSupplierPriceRequestItemList build(java.util.Map<String, ?> map) throws Exception {
            ModifyDistributionItemSupplierPriceRequestItemList self = new ModifyDistributionItemSupplierPriceRequestItemList();
            return TeaModel.build(map, self);
        }

        public ModifyDistributionItemSupplierPriceRequestItemList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public ModifyDistributionItemSupplierPriceRequestItemList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public ModifyDistributionItemSupplierPriceRequestItemList setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public ModifyDistributionItemSupplierPriceRequestItemList setSupplierPrice(Long supplierPrice) {
            this.supplierPrice = supplierPrice;
            return this;
        }
        public Long getSupplierPrice() {
            return this.supplierPrice;
        }

    }

}
