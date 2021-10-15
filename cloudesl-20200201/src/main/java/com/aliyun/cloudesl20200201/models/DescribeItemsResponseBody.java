// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeItemsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Items")
    public java.util.List<DescribeItemsResponseBodyItems> items;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TemplateSceneId")
    public String templateSceneId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeItemsResponseBody self = new DescribeItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeItemsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeItemsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeItemsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeItemsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeItemsResponseBody setItems(java.util.List<DescribeItemsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeItemsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeItemsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeItemsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeItemsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeItemsResponseBody setTemplateSceneId(String templateSceneId) {
        this.templateSceneId = templateSceneId;
        return this;
    }
    public String getTemplateSceneId() {
        return this.templateSceneId;
    }

    public DescribeItemsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeItemsResponseBodyItems extends TeaModel {
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

        @NameInMap("PromotionStart")
        public String promotionStart;

        @NameInMap("ModelNumber")
        public String modelNumber;

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

        @NameInMap("Rank")
        public String rank;

        @NameInMap("PromotionReason")
        public String promotionReason;

        @NameInMap("CustomizeFeatureG")
        public String customizeFeatureG;

        @NameInMap("SalesPrice")
        public Integer salesPrice;

        @NameInMap("CustomizeFeatureH")
        public String customizeFeatureH;

        @NameInMap("OriginalPrice")
        public Integer originalPrice;

        @NameInMap("GmtModified")
        public String gmtModified;

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

        @NameInMap("SupplierName")
        public String supplierName;

        @NameInMap("ItemPicUrl")
        public String itemPicUrl;

        @NameInMap("EnergyEfficiency")
        public String energyEfficiency;

        @NameInMap("CustomizeFeatureL")
        public String customizeFeatureL;

        @NameInMap("CustomizeFeatureC")
        public String customizeFeatureC;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("Manufacturer")
        public String manufacturer;

        @NameInMap("Material")
        public String material;

        @NameInMap("CustomizeFeatureO")
        public String customizeFeatureO;

        @NameInMap("CustomizeFeatureJ")
        public String customizeFeatureJ;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("CustomizeFeatureM")
        public String customizeFeatureM;

        @NameInMap("BePromotion")
        public Boolean bePromotion;

        @NameInMap("SkuId")
        public String skuId;

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

        public static DescribeItemsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeItemsResponseBodyItems self = new DescribeItemsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeItemsResponseBodyItems setActionPrice(Integer actionPrice) {
            this.actionPrice = actionPrice;
            return this;
        }
        public Integer getActionPrice() {
            return this.actionPrice;
        }

        public DescribeItemsResponseBodyItems setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public DescribeItemsResponseBodyItems setBrandName(String brandName) {
            this.brandName = brandName;
            return this;
        }
        public String getBrandName() {
            return this.brandName;
        }

        public DescribeItemsResponseBodyItems setSourceCode(String sourceCode) {
            this.sourceCode = sourceCode;
            return this;
        }
        public String getSourceCode() {
            return this.sourceCode;
        }

        public DescribeItemsResponseBodyItems setPriceUnit(String priceUnit) {
            this.priceUnit = priceUnit;
            return this;
        }
        public String getPriceUnit() {
            return this.priceUnit;
        }

        public DescribeItemsResponseBodyItems setForestFirstId(String forestFirstId) {
            this.forestFirstId = forestFirstId;
            return this;
        }
        public String getForestFirstId() {
            return this.forestFirstId;
        }

        public DescribeItemsResponseBodyItems setCustomizeFeatureF(String customizeFeatureF) {
            this.customizeFeatureF = customizeFeatureF;
            return this;
        }
        public String getCustomizeFeatureF() {
            return this.customizeFeatureF;
        }

        public DescribeItemsResponseBodyItems setCustomizeFeatureA(String customizeFeatureA) {
            this.customizeFeatureA = customizeFeatureA;
            return this;
        }
        public String getCustomizeFeatureA() {
            return this.customizeFeatureA;
        }

        public DescribeItemsResponseBodyItems setCustomizeFeatureK(String customizeFeatureK) {
            this.customizeFeatureK = customizeFeatureK;
            return this;
        }
        public String getCustomizeFeatureK() {
            return this.customizeFeatureK;
        }

        public DescribeItemsResponseBodyItems setTemplateSceneId(String templateSceneId) {
            this.templateSceneId = templateSceneId;
            return this;
        }
        public String getTemplateSceneId() {
            return this.templateSceneId;
        }

        public DescribeItemsResponseBodyItems setCustomizeFeatureD(String customizeFeatureD) {
            this.customizeFeatureD = customizeFeatureD;
            return this;
        }
        public String getCustomizeFeatureD() {
            return this.customizeFeatureD;
        }

        public DescribeItemsResponseBodyItems setMemberPrice(Integer memberPrice) {
            this.memberPrice = memberPrice;
            return this;
        }
        public Integer getMemberPrice() {
            return this.memberPrice;
        }

        public DescribeItemsResponseBodyItems setPromotionStart(String promotionStart) {
            this.promotionStart = promotionStart;
            return this;
        }
        public String getPromotionStart() {
            return this.promotionStart;
        }

        public DescribeItemsResponseBodyItems setModelNumber(String modelNumber) {
            this.modelNumber = modelNumber;
            return this;
        }
        public String getModelNumber() {
            return this.modelNumber;
        }

        public DescribeItemsResponseBodyItems setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeItemsResponseBodyItems setCustomizeFeatureE(String customizeFeatureE) {
            this.customizeFeatureE = customizeFeatureE;
            return this;
        }
        public String getCustomizeFeatureE() {
            return this.customizeFeatureE;
        }

        public DescribeItemsResponseBodyItems setSuggestPrice(Integer suggestPrice) {
            this.suggestPrice = suggestPrice;
            return this;
        }
        public Integer getSuggestPrice() {
            return this.suggestPrice;
        }

        public DescribeItemsResponseBodyItems setSaleSpec(String saleSpec) {
            this.saleSpec = saleSpec;
            return this;
        }
        public String getSaleSpec() {
            return this.saleSpec;
        }

        public DescribeItemsResponseBodyItems setPromotionText(String promotionText) {
            this.promotionText = promotionText;
            return this;
        }
        public String getPromotionText() {
            return this.promotionText;
        }

        public DescribeItemsResponseBodyItems setRank(String rank) {
            this.rank = rank;
            return this;
        }
        public String getRank() {
            return this.rank;
        }

        public DescribeItemsResponseBodyItems setPromotionReason(String promotionReason) {
            this.promotionReason = promotionReason;
            return this;
        }
        public String getPromotionReason() {
            return this.promotionReason;
        }

        public DescribeItemsResponseBodyItems setCustomizeFeatureG(String customizeFeatureG) {
            this.customizeFeatureG = customizeFeatureG;
            return this;
        }
        public String getCustomizeFeatureG() {
            return this.customizeFeatureG;
        }

        public DescribeItemsResponseBodyItems setSalesPrice(Integer salesPrice) {
            this.salesPrice = salesPrice;
            return this;
        }
        public Integer getSalesPrice() {
            return this.salesPrice;
        }

        public DescribeItemsResponseBodyItems setCustomizeFeatureH(String customizeFeatureH) {
            this.customizeFeatureH = customizeFeatureH;
            return this;
        }
        public String getCustomizeFeatureH() {
            return this.customizeFeatureH;
        }

        public DescribeItemsResponseBodyItems setOriginalPrice(Integer originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Integer getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeItemsResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeItemsResponseBodyItems setCustomizeFeatureI(String customizeFeatureI) {
            this.customizeFeatureI = customizeFeatureI;
            return this;
        }
        public String getCustomizeFeatureI() {
            return this.customizeFeatureI;
        }

        public DescribeItemsResponseBodyItems setProductionPlace(String productionPlace) {
            this.productionPlace = productionPlace;
            return this;
        }
        public String getProductionPlace() {
            return this.productionPlace;
        }

        public DescribeItemsResponseBodyItems setCustomizeFeatureB(String customizeFeatureB) {
            this.customizeFeatureB = customizeFeatureB;
            return this;
        }
        public String getCustomizeFeatureB() {
            return this.customizeFeatureB;
        }

        public DescribeItemsResponseBodyItems setItemShortTitle(String itemShortTitle) {
            this.itemShortTitle = itemShortTitle;
            return this;
        }
        public String getItemShortTitle() {
            return this.itemShortTitle;
        }

        public DescribeItemsResponseBodyItems setCustomizeFeatureN(String customizeFeatureN) {
            this.customizeFeatureN = customizeFeatureN;
            return this;
        }
        public String getCustomizeFeatureN() {
            return this.customizeFeatureN;
        }

        public DescribeItemsResponseBodyItems setBeMember(Boolean beMember) {
            this.beMember = beMember;
            return this;
        }
        public Boolean getBeMember() {
            return this.beMember;
        }

        public DescribeItemsResponseBodyItems setTaxFee(String taxFee) {
            this.taxFee = taxFee;
            return this;
        }
        public String getTaxFee() {
            return this.taxFee;
        }

        public DescribeItemsResponseBodyItems setInventoryStatus(String inventoryStatus) {
            this.inventoryStatus = inventoryStatus;
            return this;
        }
        public String getInventoryStatus() {
            return this.inventoryStatus;
        }

        public DescribeItemsResponseBodyItems setSupplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }
        public String getSupplierName() {
            return this.supplierName;
        }

        public DescribeItemsResponseBodyItems setItemPicUrl(String itemPicUrl) {
            this.itemPicUrl = itemPicUrl;
            return this;
        }
        public String getItemPicUrl() {
            return this.itemPicUrl;
        }

        public DescribeItemsResponseBodyItems setEnergyEfficiency(String energyEfficiency) {
            this.energyEfficiency = energyEfficiency;
            return this;
        }
        public String getEnergyEfficiency() {
            return this.energyEfficiency;
        }

        public DescribeItemsResponseBodyItems setCustomizeFeatureL(String customizeFeatureL) {
            this.customizeFeatureL = customizeFeatureL;
            return this;
        }
        public String getCustomizeFeatureL() {
            return this.customizeFeatureL;
        }

        public DescribeItemsResponseBodyItems setCustomizeFeatureC(String customizeFeatureC) {
            this.customizeFeatureC = customizeFeatureC;
            return this;
        }
        public String getCustomizeFeatureC() {
            return this.customizeFeatureC;
        }

        public DescribeItemsResponseBodyItems setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public DescribeItemsResponseBodyItems setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        public String getManufacturer() {
            return this.manufacturer;
        }

        public DescribeItemsResponseBodyItems setMaterial(String material) {
            this.material = material;
            return this;
        }
        public String getMaterial() {
            return this.material;
        }

        public DescribeItemsResponseBodyItems setCustomizeFeatureO(String customizeFeatureO) {
            this.customizeFeatureO = customizeFeatureO;
            return this;
        }
        public String getCustomizeFeatureO() {
            return this.customizeFeatureO;
        }

        public DescribeItemsResponseBodyItems setCustomizeFeatureJ(String customizeFeatureJ) {
            this.customizeFeatureJ = customizeFeatureJ;
            return this;
        }
        public String getCustomizeFeatureJ() {
            return this.customizeFeatureJ;
        }

        public DescribeItemsResponseBodyItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeItemsResponseBodyItems setCustomizeFeatureM(String customizeFeatureM) {
            this.customizeFeatureM = customizeFeatureM;
            return this;
        }
        public String getCustomizeFeatureM() {
            return this.customizeFeatureM;
        }

        public DescribeItemsResponseBodyItems setBePromotion(Boolean bePromotion) {
            this.bePromotion = bePromotion;
            return this;
        }
        public Boolean getBePromotion() {
            return this.bePromotion;
        }

        public DescribeItemsResponseBodyItems setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public DescribeItemsResponseBodyItems setBeSourceCode(Boolean beSourceCode) {
            this.beSourceCode = beSourceCode;
            return this;
        }
        public Boolean getBeSourceCode() {
            return this.beSourceCode;
        }

        public DescribeItemsResponseBodyItems setForestSecondId(String forestSecondId) {
            this.forestSecondId = forestSecondId;
            return this;
        }
        public String getForestSecondId() {
            return this.forestSecondId;
        }

        public DescribeItemsResponseBodyItems setItemQrCode(String itemQrCode) {
            this.itemQrCode = itemQrCode;
            return this;
        }
        public String getItemQrCode() {
            return this.itemQrCode;
        }

        public DescribeItemsResponseBodyItems setItemInfoIndex(Integer itemInfoIndex) {
            this.itemInfoIndex = itemInfoIndex;
            return this;
        }
        public Integer getItemInfoIndex() {
            return this.itemInfoIndex;
        }

        public DescribeItemsResponseBodyItems setPromotionEnd(String promotionEnd) {
            this.promotionEnd = promotionEnd;
            return this;
        }
        public String getPromotionEnd() {
            return this.promotionEnd;
        }

        public DescribeItemsResponseBodyItems setItemBarCode(String itemBarCode) {
            this.itemBarCode = itemBarCode;
            return this;
        }
        public String getItemBarCode() {
            return this.itemBarCode;
        }

    }

}
