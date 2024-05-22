// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class BatchInsertItemsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ItemInfo")
    public java.util.List<BatchInsertItemsRequestItemInfo> itemInfo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StoreId")
    public String storeId;

    public static BatchInsertItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchInsertItemsRequest self = new BatchInsertItemsRequest();
        return TeaModel.build(map, self);
    }

    public BatchInsertItemsRequest setItemInfo(java.util.List<BatchInsertItemsRequestItemInfo> itemInfo) {
        this.itemInfo = itemInfo;
        return this;
    }
    public java.util.List<BatchInsertItemsRequestItemInfo> getItemInfo() {
        return this.itemInfo;
    }

    public BatchInsertItemsRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public static class BatchInsertItemsRequestItemInfo extends TeaModel {
        @NameInMap("ActionPrice")
        public Integer actionPrice;

        @NameInMap("BePromotion")
        public Boolean bePromotion;

        @NameInMap("BeSourceCode")
        public Boolean beSourceCode;

        @NameInMap("BrandName")
        public String brandName;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("CompanyId")
        public String companyId;

        @NameInMap("CustomizeFeatureA")
        public String customizeFeatureA;

        @NameInMap("CustomizeFeatureB")
        public String customizeFeatureB;

        @NameInMap("CustomizeFeatureC")
        public String customizeFeatureC;

        @NameInMap("CustomizeFeatureD")
        public String customizeFeatureD;

        @NameInMap("CustomizeFeatureE")
        public String customizeFeatureE;

        @NameInMap("CustomizeFeatureF")
        public String customizeFeatureF;

        @NameInMap("CustomizeFeatureG")
        public String customizeFeatureG;

        @NameInMap("CustomizeFeatureH")
        public String customizeFeatureH;

        @NameInMap("CustomizeFeatureI")
        public String customizeFeatureI;

        @NameInMap("CustomizeFeatureJ")
        public String customizeFeatureJ;

        @NameInMap("EnergyEfficiency")
        public String energyEfficiency;

        @NameInMap("ExtraAttribute")
        public String extraAttribute;

        @NameInMap("ForestFirstId")
        public String forestFirstId;

        @NameInMap("ForestSecondId")
        public String forestSecondId;

        @NameInMap("ItemBarCode")
        public String itemBarCode;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("ItemInfoIndex")
        public Integer itemInfoIndex;

        @NameInMap("ItemQrCode")
        public String itemQrCode;

        @NameInMap("ItemShortTitle")
        public String itemShortTitle;

        @NameInMap("ItemTitle")
        public String itemTitle;

        @NameInMap("MemberPrice")
        public Integer memberPrice;

        @NameInMap("ModelNumber")
        public String modelNumber;

        @NameInMap("OptionGroups")
        public String optionGroups;

        @NameInMap("OriginalPrice")
        public Integer originalPrice;

        @NameInMap("PriceUnit")
        public String priceUnit;

        @NameInMap("ProductionPlace")
        public String productionPlace;

        @NameInMap("PromotionEnd")
        public String promotionEnd;

        @NameInMap("PromotionReason")
        public String promotionReason;

        @NameInMap("PromotionStart")
        public String promotionStart;

        @NameInMap("PromotionText")
        public String promotionText;

        @NameInMap("Rank")
        public String rank;

        @NameInMap("SaleSpec")
        public String saleSpec;

        @NameInMap("SkuId")
        public String skuId;

        @NameInMap("SourceCode")
        public String sourceCode;

        @NameInMap("StoreId")
        public String storeId;

        @NameInMap("SuggestPrice")
        public Integer suggestPrice;

        public static BatchInsertItemsRequestItemInfo build(java.util.Map<String, ?> map) throws Exception {
            BatchInsertItemsRequestItemInfo self = new BatchInsertItemsRequestItemInfo();
            return TeaModel.build(map, self);
        }

        public BatchInsertItemsRequestItemInfo setActionPrice(Integer actionPrice) {
            this.actionPrice = actionPrice;
            return this;
        }
        public Integer getActionPrice() {
            return this.actionPrice;
        }

        public BatchInsertItemsRequestItemInfo setBePromotion(Boolean bePromotion) {
            this.bePromotion = bePromotion;
            return this;
        }
        public Boolean getBePromotion() {
            return this.bePromotion;
        }

        public BatchInsertItemsRequestItemInfo setBeSourceCode(Boolean beSourceCode) {
            this.beSourceCode = beSourceCode;
            return this;
        }
        public Boolean getBeSourceCode() {
            return this.beSourceCode;
        }

        public BatchInsertItemsRequestItemInfo setBrandName(String brandName) {
            this.brandName = brandName;
            return this;
        }
        public String getBrandName() {
            return this.brandName;
        }

        public BatchInsertItemsRequestItemInfo setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public BatchInsertItemsRequestItemInfo setCompanyId(String companyId) {
            this.companyId = companyId;
            return this;
        }
        public String getCompanyId() {
            return this.companyId;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureA(String customizeFeatureA) {
            this.customizeFeatureA = customizeFeatureA;
            return this;
        }
        public String getCustomizeFeatureA() {
            return this.customizeFeatureA;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureB(String customizeFeatureB) {
            this.customizeFeatureB = customizeFeatureB;
            return this;
        }
        public String getCustomizeFeatureB() {
            return this.customizeFeatureB;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureC(String customizeFeatureC) {
            this.customizeFeatureC = customizeFeatureC;
            return this;
        }
        public String getCustomizeFeatureC() {
            return this.customizeFeatureC;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureD(String customizeFeatureD) {
            this.customizeFeatureD = customizeFeatureD;
            return this;
        }
        public String getCustomizeFeatureD() {
            return this.customizeFeatureD;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureE(String customizeFeatureE) {
            this.customizeFeatureE = customizeFeatureE;
            return this;
        }
        public String getCustomizeFeatureE() {
            return this.customizeFeatureE;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureF(String customizeFeatureF) {
            this.customizeFeatureF = customizeFeatureF;
            return this;
        }
        public String getCustomizeFeatureF() {
            return this.customizeFeatureF;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureG(String customizeFeatureG) {
            this.customizeFeatureG = customizeFeatureG;
            return this;
        }
        public String getCustomizeFeatureG() {
            return this.customizeFeatureG;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureH(String customizeFeatureH) {
            this.customizeFeatureH = customizeFeatureH;
            return this;
        }
        public String getCustomizeFeatureH() {
            return this.customizeFeatureH;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureI(String customizeFeatureI) {
            this.customizeFeatureI = customizeFeatureI;
            return this;
        }
        public String getCustomizeFeatureI() {
            return this.customizeFeatureI;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureJ(String customizeFeatureJ) {
            this.customizeFeatureJ = customizeFeatureJ;
            return this;
        }
        public String getCustomizeFeatureJ() {
            return this.customizeFeatureJ;
        }

        public BatchInsertItemsRequestItemInfo setEnergyEfficiency(String energyEfficiency) {
            this.energyEfficiency = energyEfficiency;
            return this;
        }
        public String getEnergyEfficiency() {
            return this.energyEfficiency;
        }

        public BatchInsertItemsRequestItemInfo setExtraAttribute(String extraAttribute) {
            this.extraAttribute = extraAttribute;
            return this;
        }
        public String getExtraAttribute() {
            return this.extraAttribute;
        }

        public BatchInsertItemsRequestItemInfo setForestFirstId(String forestFirstId) {
            this.forestFirstId = forestFirstId;
            return this;
        }
        public String getForestFirstId() {
            return this.forestFirstId;
        }

        public BatchInsertItemsRequestItemInfo setForestSecondId(String forestSecondId) {
            this.forestSecondId = forestSecondId;
            return this;
        }
        public String getForestSecondId() {
            return this.forestSecondId;
        }

        public BatchInsertItemsRequestItemInfo setItemBarCode(String itemBarCode) {
            this.itemBarCode = itemBarCode;
            return this;
        }
        public String getItemBarCode() {
            return this.itemBarCode;
        }

        public BatchInsertItemsRequestItemInfo setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public BatchInsertItemsRequestItemInfo setItemInfoIndex(Integer itemInfoIndex) {
            this.itemInfoIndex = itemInfoIndex;
            return this;
        }
        public Integer getItemInfoIndex() {
            return this.itemInfoIndex;
        }

        public BatchInsertItemsRequestItemInfo setItemQrCode(String itemQrCode) {
            this.itemQrCode = itemQrCode;
            return this;
        }
        public String getItemQrCode() {
            return this.itemQrCode;
        }

        public BatchInsertItemsRequestItemInfo setItemShortTitle(String itemShortTitle) {
            this.itemShortTitle = itemShortTitle;
            return this;
        }
        public String getItemShortTitle() {
            return this.itemShortTitle;
        }

        public BatchInsertItemsRequestItemInfo setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public BatchInsertItemsRequestItemInfo setMemberPrice(Integer memberPrice) {
            this.memberPrice = memberPrice;
            return this;
        }
        public Integer getMemberPrice() {
            return this.memberPrice;
        }

        public BatchInsertItemsRequestItemInfo setModelNumber(String modelNumber) {
            this.modelNumber = modelNumber;
            return this;
        }
        public String getModelNumber() {
            return this.modelNumber;
        }

        public BatchInsertItemsRequestItemInfo setOptionGroups(String optionGroups) {
            this.optionGroups = optionGroups;
            return this;
        }
        public String getOptionGroups() {
            return this.optionGroups;
        }

        public BatchInsertItemsRequestItemInfo setOriginalPrice(Integer originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Integer getOriginalPrice() {
            return this.originalPrice;
        }

        public BatchInsertItemsRequestItemInfo setPriceUnit(String priceUnit) {
            this.priceUnit = priceUnit;
            return this;
        }
        public String getPriceUnit() {
            return this.priceUnit;
        }

        public BatchInsertItemsRequestItemInfo setProductionPlace(String productionPlace) {
            this.productionPlace = productionPlace;
            return this;
        }
        public String getProductionPlace() {
            return this.productionPlace;
        }

        public BatchInsertItemsRequestItemInfo setPromotionEnd(String promotionEnd) {
            this.promotionEnd = promotionEnd;
            return this;
        }
        public String getPromotionEnd() {
            return this.promotionEnd;
        }

        public BatchInsertItemsRequestItemInfo setPromotionReason(String promotionReason) {
            this.promotionReason = promotionReason;
            return this;
        }
        public String getPromotionReason() {
            return this.promotionReason;
        }

        public BatchInsertItemsRequestItemInfo setPromotionStart(String promotionStart) {
            this.promotionStart = promotionStart;
            return this;
        }
        public String getPromotionStart() {
            return this.promotionStart;
        }

        public BatchInsertItemsRequestItemInfo setPromotionText(String promotionText) {
            this.promotionText = promotionText;
            return this;
        }
        public String getPromotionText() {
            return this.promotionText;
        }

        public BatchInsertItemsRequestItemInfo setRank(String rank) {
            this.rank = rank;
            return this;
        }
        public String getRank() {
            return this.rank;
        }

        public BatchInsertItemsRequestItemInfo setSaleSpec(String saleSpec) {
            this.saleSpec = saleSpec;
            return this;
        }
        public String getSaleSpec() {
            return this.saleSpec;
        }

        public BatchInsertItemsRequestItemInfo setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public BatchInsertItemsRequestItemInfo setSourceCode(String sourceCode) {
            this.sourceCode = sourceCode;
            return this;
        }
        public String getSourceCode() {
            return this.sourceCode;
        }

        public BatchInsertItemsRequestItemInfo setStoreId(String storeId) {
            this.storeId = storeId;
            return this;
        }
        public String getStoreId() {
            return this.storeId;
        }

        public BatchInsertItemsRequestItemInfo setSuggestPrice(Integer suggestPrice) {
            this.suggestPrice = suggestPrice;
            return this;
        }
        public Integer getSuggestPrice() {
            return this.suggestPrice;
        }

    }

}
