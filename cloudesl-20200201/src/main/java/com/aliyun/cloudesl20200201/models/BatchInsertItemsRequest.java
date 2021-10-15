// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class BatchInsertItemsRequest extends TeaModel {
    @NameInMap("ExtraParams")
    public String extraParams;

    @NameInMap("ItemInfo")
    public java.util.List<BatchInsertItemsRequestItemInfo> itemInfo;

    @NameInMap("StoreId")
    public String storeId;

    @NameInMap("SyncByItemId")
    public Boolean syncByItemId;

    public static BatchInsertItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchInsertItemsRequest self = new BatchInsertItemsRequest();
        return TeaModel.build(map, self);
    }

    public BatchInsertItemsRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
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

    public BatchInsertItemsRequest setSyncByItemId(Boolean syncByItemId) {
        this.syncByItemId = syncByItemId;
        return this;
    }
    public Boolean getSyncByItemId() {
        return this.syncByItemId;
    }

    public static class BatchInsertItemsRequestItemInfo extends TeaModel {
        @NameInMap("ActionPrice")
        public Integer actionPrice;

        @NameInMap("ItemTitle")
        public String itemTitle;

        @NameInMap("BrandName")
        public String brandName;

        @NameInMap("SourceCode")
        public String sourceCode;

        @NameInMap("PriceUnit")
        public String priceUnit;

        @NameInMap("ForestFirstId")
        public String forestFirstId;

        @NameInMap("CustomizeFeatureF")
        public String customizeFeatureF;

        @NameInMap("CustomizeFeatureA")
        public String customizeFeatureA;

        @NameInMap("CustomizeFeatureK")
        public String customizeFeatureK;

        @NameInMap("TemplateSceneId")
        public String templateSceneId;

        @NameInMap("CustomizeFeatureD")
        public String customizeFeatureD;

        @NameInMap("MemberPrice")
        public Integer memberPrice;

        @NameInMap("ModelNumber")
        public String modelNumber;

        @NameInMap("PromotionStart")
        public String promotionStart;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("CustomizeFeatureE")
        public String customizeFeatureE;

        @NameInMap("SuggestPrice")
        public Integer suggestPrice;

        @NameInMap("SaleSpec")
        public String saleSpec;

        @NameInMap("PromotionText")
        public String promotionText;

        @NameInMap("PromotionReason")
        public String promotionReason;

        @NameInMap("Rank")
        public String rank;

        @NameInMap("CustomizeFeatureG")
        public String customizeFeatureG;

        @NameInMap("SalesPrice")
        public Integer salesPrice;

        @NameInMap("CustomizeFeatureH")
        public String customizeFeatureH;

        @NameInMap("OriginalPrice")
        public Integer originalPrice;

        @NameInMap("CustomizeFeatureI")
        public String customizeFeatureI;

        @NameInMap("ProductionPlace")
        public String productionPlace;

        @NameInMap("CustomizeFeatureB")
        public String customizeFeatureB;

        @NameInMap("ItemShortTitle")
        public String itemShortTitle;

        @NameInMap("CustomizeFeatureN")
        public String customizeFeatureN;

        @NameInMap("BeMember")
        public Boolean beMember;

        @NameInMap("TaxFee")
        public String taxFee;

        @NameInMap("InventoryStatus")
        public String inventoryStatus;

        @NameInMap("ItemPicUrl")
        public String itemPicUrl;

        @NameInMap("SupplierName")
        public String supplierName;

        @NameInMap("CustomizeFeatureL")
        public String customizeFeatureL;

        @NameInMap("EnergyEfficiency")
        public String energyEfficiency;

        @NameInMap("CustomizeFeatureC")
        public String customizeFeatureC;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("Manufacturer")
        public String manufacturer;

        @NameInMap("Material")
        public String material;

        @NameInMap("CustomizeFeatureJ")
        public String customizeFeatureJ;

        @NameInMap("CustomizeFeatureO")
        public String customizeFeatureO;

        @NameInMap("SkuId")
        public String skuId;

        @NameInMap("CustomizeFeatureM")
        public String customizeFeatureM;

        @NameInMap("BePromotion")
        public Boolean bePromotion;

        @NameInMap("BeSourceCode")
        public Boolean beSourceCode;

        @NameInMap("ForestSecondId")
        public String forestSecondId;

        @NameInMap("ItemQrCode")
        public String itemQrCode;

        @NameInMap("ItemInfoIndex")
        public Integer itemInfoIndex;

        @NameInMap("PromotionEnd")
        public String promotionEnd;

        @NameInMap("ItemBarCode")
        public String itemBarCode;

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

        public BatchInsertItemsRequestItemInfo setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public BatchInsertItemsRequestItemInfo setBrandName(String brandName) {
            this.brandName = brandName;
            return this;
        }
        public String getBrandName() {
            return this.brandName;
        }

        public BatchInsertItemsRequestItemInfo setSourceCode(String sourceCode) {
            this.sourceCode = sourceCode;
            return this;
        }
        public String getSourceCode() {
            return this.sourceCode;
        }

        public BatchInsertItemsRequestItemInfo setPriceUnit(String priceUnit) {
            this.priceUnit = priceUnit;
            return this;
        }
        public String getPriceUnit() {
            return this.priceUnit;
        }

        public BatchInsertItemsRequestItemInfo setForestFirstId(String forestFirstId) {
            this.forestFirstId = forestFirstId;
            return this;
        }
        public String getForestFirstId() {
            return this.forestFirstId;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureF(String customizeFeatureF) {
            this.customizeFeatureF = customizeFeatureF;
            return this;
        }
        public String getCustomizeFeatureF() {
            return this.customizeFeatureF;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureA(String customizeFeatureA) {
            this.customizeFeatureA = customizeFeatureA;
            return this;
        }
        public String getCustomizeFeatureA() {
            return this.customizeFeatureA;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureK(String customizeFeatureK) {
            this.customizeFeatureK = customizeFeatureK;
            return this;
        }
        public String getCustomizeFeatureK() {
            return this.customizeFeatureK;
        }

        public BatchInsertItemsRequestItemInfo setTemplateSceneId(String templateSceneId) {
            this.templateSceneId = templateSceneId;
            return this;
        }
        public String getTemplateSceneId() {
            return this.templateSceneId;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureD(String customizeFeatureD) {
            this.customizeFeatureD = customizeFeatureD;
            return this;
        }
        public String getCustomizeFeatureD() {
            return this.customizeFeatureD;
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

        public BatchInsertItemsRequestItemInfo setPromotionStart(String promotionStart) {
            this.promotionStart = promotionStart;
            return this;
        }
        public String getPromotionStart() {
            return this.promotionStart;
        }

        public BatchInsertItemsRequestItemInfo setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureE(String customizeFeatureE) {
            this.customizeFeatureE = customizeFeatureE;
            return this;
        }
        public String getCustomizeFeatureE() {
            return this.customizeFeatureE;
        }

        public BatchInsertItemsRequestItemInfo setSuggestPrice(Integer suggestPrice) {
            this.suggestPrice = suggestPrice;
            return this;
        }
        public Integer getSuggestPrice() {
            return this.suggestPrice;
        }

        public BatchInsertItemsRequestItemInfo setSaleSpec(String saleSpec) {
            this.saleSpec = saleSpec;
            return this;
        }
        public String getSaleSpec() {
            return this.saleSpec;
        }

        public BatchInsertItemsRequestItemInfo setPromotionText(String promotionText) {
            this.promotionText = promotionText;
            return this;
        }
        public String getPromotionText() {
            return this.promotionText;
        }

        public BatchInsertItemsRequestItemInfo setPromotionReason(String promotionReason) {
            this.promotionReason = promotionReason;
            return this;
        }
        public String getPromotionReason() {
            return this.promotionReason;
        }

        public BatchInsertItemsRequestItemInfo setRank(String rank) {
            this.rank = rank;
            return this;
        }
        public String getRank() {
            return this.rank;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureG(String customizeFeatureG) {
            this.customizeFeatureG = customizeFeatureG;
            return this;
        }
        public String getCustomizeFeatureG() {
            return this.customizeFeatureG;
        }

        public BatchInsertItemsRequestItemInfo setSalesPrice(Integer salesPrice) {
            this.salesPrice = salesPrice;
            return this;
        }
        public Integer getSalesPrice() {
            return this.salesPrice;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureH(String customizeFeatureH) {
            this.customizeFeatureH = customizeFeatureH;
            return this;
        }
        public String getCustomizeFeatureH() {
            return this.customizeFeatureH;
        }

        public BatchInsertItemsRequestItemInfo setOriginalPrice(Integer originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Integer getOriginalPrice() {
            return this.originalPrice;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureI(String customizeFeatureI) {
            this.customizeFeatureI = customizeFeatureI;
            return this;
        }
        public String getCustomizeFeatureI() {
            return this.customizeFeatureI;
        }

        public BatchInsertItemsRequestItemInfo setProductionPlace(String productionPlace) {
            this.productionPlace = productionPlace;
            return this;
        }
        public String getProductionPlace() {
            return this.productionPlace;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureB(String customizeFeatureB) {
            this.customizeFeatureB = customizeFeatureB;
            return this;
        }
        public String getCustomizeFeatureB() {
            return this.customizeFeatureB;
        }

        public BatchInsertItemsRequestItemInfo setItemShortTitle(String itemShortTitle) {
            this.itemShortTitle = itemShortTitle;
            return this;
        }
        public String getItemShortTitle() {
            return this.itemShortTitle;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureN(String customizeFeatureN) {
            this.customizeFeatureN = customizeFeatureN;
            return this;
        }
        public String getCustomizeFeatureN() {
            return this.customizeFeatureN;
        }

        public BatchInsertItemsRequestItemInfo setBeMember(Boolean beMember) {
            this.beMember = beMember;
            return this;
        }
        public Boolean getBeMember() {
            return this.beMember;
        }

        public BatchInsertItemsRequestItemInfo setTaxFee(String taxFee) {
            this.taxFee = taxFee;
            return this;
        }
        public String getTaxFee() {
            return this.taxFee;
        }

        public BatchInsertItemsRequestItemInfo setInventoryStatus(String inventoryStatus) {
            this.inventoryStatus = inventoryStatus;
            return this;
        }
        public String getInventoryStatus() {
            return this.inventoryStatus;
        }

        public BatchInsertItemsRequestItemInfo setItemPicUrl(String itemPicUrl) {
            this.itemPicUrl = itemPicUrl;
            return this;
        }
        public String getItemPicUrl() {
            return this.itemPicUrl;
        }

        public BatchInsertItemsRequestItemInfo setSupplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }
        public String getSupplierName() {
            return this.supplierName;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureL(String customizeFeatureL) {
            this.customizeFeatureL = customizeFeatureL;
            return this;
        }
        public String getCustomizeFeatureL() {
            return this.customizeFeatureL;
        }

        public BatchInsertItemsRequestItemInfo setEnergyEfficiency(String energyEfficiency) {
            this.energyEfficiency = energyEfficiency;
            return this;
        }
        public String getEnergyEfficiency() {
            return this.energyEfficiency;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureC(String customizeFeatureC) {
            this.customizeFeatureC = customizeFeatureC;
            return this;
        }
        public String getCustomizeFeatureC() {
            return this.customizeFeatureC;
        }

        public BatchInsertItemsRequestItemInfo setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public BatchInsertItemsRequestItemInfo setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        public String getManufacturer() {
            return this.manufacturer;
        }

        public BatchInsertItemsRequestItemInfo setMaterial(String material) {
            this.material = material;
            return this;
        }
        public String getMaterial() {
            return this.material;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureJ(String customizeFeatureJ) {
            this.customizeFeatureJ = customizeFeatureJ;
            return this;
        }
        public String getCustomizeFeatureJ() {
            return this.customizeFeatureJ;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureO(String customizeFeatureO) {
            this.customizeFeatureO = customizeFeatureO;
            return this;
        }
        public String getCustomizeFeatureO() {
            return this.customizeFeatureO;
        }

        public BatchInsertItemsRequestItemInfo setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureM(String customizeFeatureM) {
            this.customizeFeatureM = customizeFeatureM;
            return this;
        }
        public String getCustomizeFeatureM() {
            return this.customizeFeatureM;
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

        public BatchInsertItemsRequestItemInfo setForestSecondId(String forestSecondId) {
            this.forestSecondId = forestSecondId;
            return this;
        }
        public String getForestSecondId() {
            return this.forestSecondId;
        }

        public BatchInsertItemsRequestItemInfo setItemQrCode(String itemQrCode) {
            this.itemQrCode = itemQrCode;
            return this;
        }
        public String getItemQrCode() {
            return this.itemQrCode;
        }

        public BatchInsertItemsRequestItemInfo setItemInfoIndex(Integer itemInfoIndex) {
            this.itemInfoIndex = itemInfoIndex;
            return this;
        }
        public Integer getItemInfoIndex() {
            return this.itemInfoIndex;
        }

        public BatchInsertItemsRequestItemInfo setPromotionEnd(String promotionEnd) {
            this.promotionEnd = promotionEnd;
            return this;
        }
        public String getPromotionEnd() {
            return this.promotionEnd;
        }

        public BatchInsertItemsRequestItemInfo setItemBarCode(String itemBarCode) {
            this.itemBarCode = itemBarCode;
            return this;
        }
        public String getItemBarCode() {
            return this.itemBarCode;
        }

    }

}
