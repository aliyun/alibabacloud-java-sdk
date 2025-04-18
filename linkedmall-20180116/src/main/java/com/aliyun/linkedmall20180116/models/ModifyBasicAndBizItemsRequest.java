// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyBasicAndBizItemsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL2***100001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ItemList")
    public java.util.List<ModifyBasicAndBizItemsRequestItemList> itemList;

    /**
     * <strong>example:</strong>
     * <p>f4279b7cbdfc46d4b7566****</p>
     */
    @NameInMap("SubBizId")
    public String subBizId;

    public static ModifyBasicAndBizItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBasicAndBizItemsRequest self = new ModifyBasicAndBizItemsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBasicAndBizItemsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ModifyBasicAndBizItemsRequest setItemList(java.util.List<ModifyBasicAndBizItemsRequestItemList> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<ModifyBasicAndBizItemsRequestItemList> getItemList() {
        return this.itemList;
    }

    public ModifyBasicAndBizItemsRequest setSubBizId(String subBizId) {
        this.subBizId = subBizId;
        return this;
    }
    public String getSubBizId() {
        return this.subBizId;
    }

    public static class ModifyBasicAndBizItemsRequestItemListSkuList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2021090800502200000086****</p>
         */
        @NameInMap("BenefitId")
        public String benefitId;

        /**
         * <strong>example:</strong>
         * <p>1999</p>
         */
        @NameInMap("Points")
        public Long points;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PointsAmount")
        public Long pointsAmount;

        /**
         * <strong>example:</strong>
         * <p>2790</p>
         */
        @NameInMap("PriceCent")
        public Long priceCent;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Quantity")
        public Integer quantity;

        /**
         * <strong>example:</strong>
         * <p>472461998****</p>
         */
        @NameInMap("SkuId")
        public Long skuId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StatusAction")
        public Long statusAction;

        /**
         * <strong>example:</strong>
         * <p>2790</p>
         */
        @NameInMap("SupplierPrice")
        public Long supplierPrice;

        public static ModifyBasicAndBizItemsRequestItemListSkuList build(java.util.Map<String, ?> map) throws Exception {
            ModifyBasicAndBizItemsRequestItemListSkuList self = new ModifyBasicAndBizItemsRequestItemListSkuList();
            return TeaModel.build(map, self);
        }

        public ModifyBasicAndBizItemsRequestItemListSkuList setBenefitId(String benefitId) {
            this.benefitId = benefitId;
            return this;
        }
        public String getBenefitId() {
            return this.benefitId;
        }

        public ModifyBasicAndBizItemsRequestItemListSkuList setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public ModifyBasicAndBizItemsRequestItemListSkuList setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public ModifyBasicAndBizItemsRequestItemListSkuList setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public ModifyBasicAndBizItemsRequestItemListSkuList setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public ModifyBasicAndBizItemsRequestItemListSkuList setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public ModifyBasicAndBizItemsRequestItemListSkuList setStatusAction(Long statusAction) {
            this.statusAction = statusAction;
            return this;
        }
        public Long getStatusAction() {
            return this.statusAction;
        }

        public ModifyBasicAndBizItemsRequestItemListSkuList setSupplierPrice(Long supplierPrice) {
            this.supplierPrice = supplierPrice;
            return this;
        }
        public Long getSupplierPrice() {
            return this.supplierPrice;
        }

    }

    public static class ModifyBasicAndBizItemsRequestItemList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>65671280****</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        /**
         * <strong>example:</strong>
         * <p>10000035-61936646****</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("SkuList")
        public java.util.List<ModifyBasicAndBizItemsRequestItemListSkuList> skuList;

        public static ModifyBasicAndBizItemsRequestItemList build(java.util.Map<String, ?> map) throws Exception {
            ModifyBasicAndBizItemsRequestItemList self = new ModifyBasicAndBizItemsRequestItemList();
            return TeaModel.build(map, self);
        }

        public ModifyBasicAndBizItemsRequestItemList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public ModifyBasicAndBizItemsRequestItemList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public ModifyBasicAndBizItemsRequestItemList setSkuList(java.util.List<ModifyBasicAndBizItemsRequestItemListSkuList> skuList) {
            this.skuList = skuList;
            return this;
        }
        public java.util.List<ModifyBasicAndBizItemsRequestItemListSkuList> getSkuList() {
            return this.skuList;
        }

    }

}
