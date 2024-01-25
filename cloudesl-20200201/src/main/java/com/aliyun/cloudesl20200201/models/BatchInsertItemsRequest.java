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

        @NameInMap("BeClearance")
        public Boolean beClearance;

        @NameInMap("BeMember")
        public Boolean beMember;

        @NameInMap("BePromotion")
        public Boolean bePromotion;

        @NameInMap("BeSourceCode")
        public Boolean beSourceCode;

        @NameInMap("BrandName")
        public String brandName;

        @NameInMap("CategoryName")
        public String categoryName;

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

        @NameInMap("CustomizeFeatureK")
        public String customizeFeatureK;

        @NameInMap("CustomizeFeatureL")
        public String customizeFeatureL;

        @NameInMap("CustomizeFeatureM")
        public String customizeFeatureM;

        @NameInMap("CustomizeFeatureN")
        public String customizeFeatureN;

        @NameInMap("CustomizeFeatureO")
        public String customizeFeatureO;

        @NameInMap("CustomizeFeatureP")
        public String customizeFeatureP;

        @NameInMap("CustomizeFeatureQ")
        public String customizeFeatureQ;

        @NameInMap("CustomizeFeatureR")
        public String customizeFeatureR;

        @NameInMap("CustomizeFeatureS")
        public String customizeFeatureS;

        @NameInMap("CustomizeFeatureT")
        public String customizeFeatureT;

        @NameInMap("CustomizeFeatureU")
        public String customizeFeatureU;

        @NameInMap("CustomizeFeatureV")
        public String customizeFeatureV;

        @NameInMap("CustomizeFeatureW")
        public String customizeFeatureW;

        @NameInMap("CustomizeFeatureX")
        public String customizeFeatureX;

        @NameInMap("CustomizeFeatureY")
        public String customizeFeatureY;

        @NameInMap("CustomizeFeatureZ")
        public String customizeFeatureZ;

        @NameInMap("EnergyEfficiency")
        public String energyEfficiency;

        @NameInMap("ForestFirstId")
        public String forestFirstId;

        @NameInMap("ForestSecondId")
        public String forestSecondId;

        @NameInMap("InventoryStatus")
        public String inventoryStatus;

        @NameInMap("ItemBarCode")
        public String itemBarCode;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ItemInfoIndex")
        public Integer itemInfoIndex;

        @NameInMap("ItemPicUrl")
        public String itemPicUrl;

        @NameInMap("ItemQrCode")
        public String itemQrCode;

        @NameInMap("ItemShortTitle")
        public String itemShortTitle;

        @NameInMap("ItemTitle")
        public String itemTitle;

        @NameInMap("Manufacturer")
        public String manufacturer;

        @NameInMap("Material")
        public String material;

        @NameInMap("MemberPrice")
        public Integer memberPrice;

        @NameInMap("ModelNumber")
        public String modelNumber;

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

        @NameInMap("SalesPrice")
        public Integer salesPrice;

        @NameInMap("SkuId")
        public String skuId;

        @NameInMap("SourceCode")
        public String sourceCode;

        @NameInMap("SuggestPrice")
        public Integer suggestPrice;

        @NameInMap("SupplierName")
        public String supplierName;

        @NameInMap("TaxFee")
        public String taxFee;

        @NameInMap("TemplateSceneId")
        public String templateSceneId;

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

        public BatchInsertItemsRequestItemInfo setBeClearance(Boolean beClearance) {
            this.beClearance = beClearance;
            return this;
        }
        public Boolean getBeClearance() {
            return this.beClearance;
        }

        public BatchInsertItemsRequestItemInfo setBeMember(Boolean beMember) {
            this.beMember = beMember;
            return this;
        }
        public Boolean getBeMember() {
            return this.beMember;
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

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureK(String customizeFeatureK) {
            this.customizeFeatureK = customizeFeatureK;
            return this;
        }
        public String getCustomizeFeatureK() {
            return this.customizeFeatureK;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureL(String customizeFeatureL) {
            this.customizeFeatureL = customizeFeatureL;
            return this;
        }
        public String getCustomizeFeatureL() {
            return this.customizeFeatureL;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureM(String customizeFeatureM) {
            this.customizeFeatureM = customizeFeatureM;
            return this;
        }
        public String getCustomizeFeatureM() {
            return this.customizeFeatureM;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureN(String customizeFeatureN) {
            this.customizeFeatureN = customizeFeatureN;
            return this;
        }
        public String getCustomizeFeatureN() {
            return this.customizeFeatureN;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureO(String customizeFeatureO) {
            this.customizeFeatureO = customizeFeatureO;
            return this;
        }
        public String getCustomizeFeatureO() {
            return this.customizeFeatureO;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureP(String customizeFeatureP) {
            this.customizeFeatureP = customizeFeatureP;
            return this;
        }
        public String getCustomizeFeatureP() {
            return this.customizeFeatureP;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureQ(String customizeFeatureQ) {
            this.customizeFeatureQ = customizeFeatureQ;
            return this;
        }
        public String getCustomizeFeatureQ() {
            return this.customizeFeatureQ;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureR(String customizeFeatureR) {
            this.customizeFeatureR = customizeFeatureR;
            return this;
        }
        public String getCustomizeFeatureR() {
            return this.customizeFeatureR;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureS(String customizeFeatureS) {
            this.customizeFeatureS = customizeFeatureS;
            return this;
        }
        public String getCustomizeFeatureS() {
            return this.customizeFeatureS;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureT(String customizeFeatureT) {
            this.customizeFeatureT = customizeFeatureT;
            return this;
        }
        public String getCustomizeFeatureT() {
            return this.customizeFeatureT;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureU(String customizeFeatureU) {
            this.customizeFeatureU = customizeFeatureU;
            return this;
        }
        public String getCustomizeFeatureU() {
            return this.customizeFeatureU;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureV(String customizeFeatureV) {
            this.customizeFeatureV = customizeFeatureV;
            return this;
        }
        public String getCustomizeFeatureV() {
            return this.customizeFeatureV;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureW(String customizeFeatureW) {
            this.customizeFeatureW = customizeFeatureW;
            return this;
        }
        public String getCustomizeFeatureW() {
            return this.customizeFeatureW;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureX(String customizeFeatureX) {
            this.customizeFeatureX = customizeFeatureX;
            return this;
        }
        public String getCustomizeFeatureX() {
            return this.customizeFeatureX;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureY(String customizeFeatureY) {
            this.customizeFeatureY = customizeFeatureY;
            return this;
        }
        public String getCustomizeFeatureY() {
            return this.customizeFeatureY;
        }

        public BatchInsertItemsRequestItemInfo setCustomizeFeatureZ(String customizeFeatureZ) {
            this.customizeFeatureZ = customizeFeatureZ;
            return this;
        }
        public String getCustomizeFeatureZ() {
            return this.customizeFeatureZ;
        }

        public BatchInsertItemsRequestItemInfo setEnergyEfficiency(String energyEfficiency) {
            this.energyEfficiency = energyEfficiency;
            return this;
        }
        public String getEnergyEfficiency() {
            return this.energyEfficiency;
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

        public BatchInsertItemsRequestItemInfo setInventoryStatus(String inventoryStatus) {
            this.inventoryStatus = inventoryStatus;
            return this;
        }
        public String getInventoryStatus() {
            return this.inventoryStatus;
        }

        public BatchInsertItemsRequestItemInfo setItemBarCode(String itemBarCode) {
            this.itemBarCode = itemBarCode;
            return this;
        }
        public String getItemBarCode() {
            return this.itemBarCode;
        }

        public BatchInsertItemsRequestItemInfo setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public BatchInsertItemsRequestItemInfo setItemInfoIndex(Integer itemInfoIndex) {
            this.itemInfoIndex = itemInfoIndex;
            return this;
        }
        public Integer getItemInfoIndex() {
            return this.itemInfoIndex;
        }

        public BatchInsertItemsRequestItemInfo setItemPicUrl(String itemPicUrl) {
            this.itemPicUrl = itemPicUrl;
            return this;
        }
        public String getItemPicUrl() {
            return this.itemPicUrl;
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

        public BatchInsertItemsRequestItemInfo setSalesPrice(Integer salesPrice) {
            this.salesPrice = salesPrice;
            return this;
        }
        public Integer getSalesPrice() {
            return this.salesPrice;
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

        public BatchInsertItemsRequestItemInfo setSuggestPrice(Integer suggestPrice) {
            this.suggestPrice = suggestPrice;
            return this;
        }
        public Integer getSuggestPrice() {
            return this.suggestPrice;
        }

        public BatchInsertItemsRequestItemInfo setSupplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }
        public String getSupplierName() {
            return this.supplierName;
        }

        public BatchInsertItemsRequestItemInfo setTaxFee(String taxFee) {
            this.taxFee = taxFee;
            return this;
        }
        public String getTaxFee() {
            return this.taxFee;
        }

        public BatchInsertItemsRequestItemInfo setTemplateSceneId(String templateSceneId) {
            this.templateSceneId = templateSceneId;
            return this;
        }
        public String getTemplateSceneId() {
            return this.templateSceneId;
        }

    }

}
