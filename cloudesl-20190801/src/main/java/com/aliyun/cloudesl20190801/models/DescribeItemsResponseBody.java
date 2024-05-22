// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

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
    public DescribeItemsResponseBodyItems items;

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

    public DescribeItemsResponseBody setItems(DescribeItemsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeItemsResponseBodyItems getItems() {
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

    public DescribeItemsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeItemsResponseBodyItemsItemInfo extends TeaModel {
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

        public static DescribeItemsResponseBodyItemsItemInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeItemsResponseBodyItemsItemInfo self = new DescribeItemsResponseBodyItemsItemInfo();
            return TeaModel.build(map, self);
        }

        public DescribeItemsResponseBodyItemsItemInfo setActionPrice(Integer actionPrice) {
            this.actionPrice = actionPrice;
            return this;
        }
        public Integer getActionPrice() {
            return this.actionPrice;
        }

        public DescribeItemsResponseBodyItemsItemInfo setBePromotion(Boolean bePromotion) {
            this.bePromotion = bePromotion;
            return this;
        }
        public Boolean getBePromotion() {
            return this.bePromotion;
        }

        public DescribeItemsResponseBodyItemsItemInfo setBeSourceCode(Boolean beSourceCode) {
            this.beSourceCode = beSourceCode;
            return this;
        }
        public Boolean getBeSourceCode() {
            return this.beSourceCode;
        }

        public DescribeItemsResponseBodyItemsItemInfo setBrandName(String brandName) {
            this.brandName = brandName;
            return this;
        }
        public String getBrandName() {
            return this.brandName;
        }

        public DescribeItemsResponseBodyItemsItemInfo setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeItemsResponseBodyItemsItemInfo setCompanyId(String companyId) {
            this.companyId = companyId;
            return this;
        }
        public String getCompanyId() {
            return this.companyId;
        }

        public DescribeItemsResponseBodyItemsItemInfo setCustomizeFeatureA(String customizeFeatureA) {
            this.customizeFeatureA = customizeFeatureA;
            return this;
        }
        public String getCustomizeFeatureA() {
            return this.customizeFeatureA;
        }

        public DescribeItemsResponseBodyItemsItemInfo setCustomizeFeatureB(String customizeFeatureB) {
            this.customizeFeatureB = customizeFeatureB;
            return this;
        }
        public String getCustomizeFeatureB() {
            return this.customizeFeatureB;
        }

        public DescribeItemsResponseBodyItemsItemInfo setCustomizeFeatureC(String customizeFeatureC) {
            this.customizeFeatureC = customizeFeatureC;
            return this;
        }
        public String getCustomizeFeatureC() {
            return this.customizeFeatureC;
        }

        public DescribeItemsResponseBodyItemsItemInfo setCustomizeFeatureD(String customizeFeatureD) {
            this.customizeFeatureD = customizeFeatureD;
            return this;
        }
        public String getCustomizeFeatureD() {
            return this.customizeFeatureD;
        }

        public DescribeItemsResponseBodyItemsItemInfo setCustomizeFeatureE(String customizeFeatureE) {
            this.customizeFeatureE = customizeFeatureE;
            return this;
        }
        public String getCustomizeFeatureE() {
            return this.customizeFeatureE;
        }

        public DescribeItemsResponseBodyItemsItemInfo setCustomizeFeatureF(String customizeFeatureF) {
            this.customizeFeatureF = customizeFeatureF;
            return this;
        }
        public String getCustomizeFeatureF() {
            return this.customizeFeatureF;
        }

        public DescribeItemsResponseBodyItemsItemInfo setCustomizeFeatureG(String customizeFeatureG) {
            this.customizeFeatureG = customizeFeatureG;
            return this;
        }
        public String getCustomizeFeatureG() {
            return this.customizeFeatureG;
        }

        public DescribeItemsResponseBodyItemsItemInfo setCustomizeFeatureH(String customizeFeatureH) {
            this.customizeFeatureH = customizeFeatureH;
            return this;
        }
        public String getCustomizeFeatureH() {
            return this.customizeFeatureH;
        }

        public DescribeItemsResponseBodyItemsItemInfo setCustomizeFeatureI(String customizeFeatureI) {
            this.customizeFeatureI = customizeFeatureI;
            return this;
        }
        public String getCustomizeFeatureI() {
            return this.customizeFeatureI;
        }

        public DescribeItemsResponseBodyItemsItemInfo setCustomizeFeatureJ(String customizeFeatureJ) {
            this.customizeFeatureJ = customizeFeatureJ;
            return this;
        }
        public String getCustomizeFeatureJ() {
            return this.customizeFeatureJ;
        }

        public DescribeItemsResponseBodyItemsItemInfo setEnergyEfficiency(String energyEfficiency) {
            this.energyEfficiency = energyEfficiency;
            return this;
        }
        public String getEnergyEfficiency() {
            return this.energyEfficiency;
        }

        public DescribeItemsResponseBodyItemsItemInfo setExtraAttribute(String extraAttribute) {
            this.extraAttribute = extraAttribute;
            return this;
        }
        public String getExtraAttribute() {
            return this.extraAttribute;
        }

        public DescribeItemsResponseBodyItemsItemInfo setForestFirstId(String forestFirstId) {
            this.forestFirstId = forestFirstId;
            return this;
        }
        public String getForestFirstId() {
            return this.forestFirstId;
        }

        public DescribeItemsResponseBodyItemsItemInfo setForestSecondId(String forestSecondId) {
            this.forestSecondId = forestSecondId;
            return this;
        }
        public String getForestSecondId() {
            return this.forestSecondId;
        }

        public DescribeItemsResponseBodyItemsItemInfo setItemBarCode(String itemBarCode) {
            this.itemBarCode = itemBarCode;
            return this;
        }
        public String getItemBarCode() {
            return this.itemBarCode;
        }

        public DescribeItemsResponseBodyItemsItemInfo setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public DescribeItemsResponseBodyItemsItemInfo setItemInfoIndex(Integer itemInfoIndex) {
            this.itemInfoIndex = itemInfoIndex;
            return this;
        }
        public Integer getItemInfoIndex() {
            return this.itemInfoIndex;
        }

        public DescribeItemsResponseBodyItemsItemInfo setItemQrCode(String itemQrCode) {
            this.itemQrCode = itemQrCode;
            return this;
        }
        public String getItemQrCode() {
            return this.itemQrCode;
        }

        public DescribeItemsResponseBodyItemsItemInfo setItemShortTitle(String itemShortTitle) {
            this.itemShortTitle = itemShortTitle;
            return this;
        }
        public String getItemShortTitle() {
            return this.itemShortTitle;
        }

        public DescribeItemsResponseBodyItemsItemInfo setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public DescribeItemsResponseBodyItemsItemInfo setMemberPrice(Integer memberPrice) {
            this.memberPrice = memberPrice;
            return this;
        }
        public Integer getMemberPrice() {
            return this.memberPrice;
        }

        public DescribeItemsResponseBodyItemsItemInfo setModelNumber(String modelNumber) {
            this.modelNumber = modelNumber;
            return this;
        }
        public String getModelNumber() {
            return this.modelNumber;
        }

        public DescribeItemsResponseBodyItemsItemInfo setOptionGroups(String optionGroups) {
            this.optionGroups = optionGroups;
            return this;
        }
        public String getOptionGroups() {
            return this.optionGroups;
        }

        public DescribeItemsResponseBodyItemsItemInfo setOriginalPrice(Integer originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Integer getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeItemsResponseBodyItemsItemInfo setPriceUnit(String priceUnit) {
            this.priceUnit = priceUnit;
            return this;
        }
        public String getPriceUnit() {
            return this.priceUnit;
        }

        public DescribeItemsResponseBodyItemsItemInfo setProductionPlace(String productionPlace) {
            this.productionPlace = productionPlace;
            return this;
        }
        public String getProductionPlace() {
            return this.productionPlace;
        }

        public DescribeItemsResponseBodyItemsItemInfo setPromotionEnd(String promotionEnd) {
            this.promotionEnd = promotionEnd;
            return this;
        }
        public String getPromotionEnd() {
            return this.promotionEnd;
        }

        public DescribeItemsResponseBodyItemsItemInfo setPromotionReason(String promotionReason) {
            this.promotionReason = promotionReason;
            return this;
        }
        public String getPromotionReason() {
            return this.promotionReason;
        }

        public DescribeItemsResponseBodyItemsItemInfo setPromotionStart(String promotionStart) {
            this.promotionStart = promotionStart;
            return this;
        }
        public String getPromotionStart() {
            return this.promotionStart;
        }

        public DescribeItemsResponseBodyItemsItemInfo setPromotionText(String promotionText) {
            this.promotionText = promotionText;
            return this;
        }
        public String getPromotionText() {
            return this.promotionText;
        }

        public DescribeItemsResponseBodyItemsItemInfo setRank(String rank) {
            this.rank = rank;
            return this;
        }
        public String getRank() {
            return this.rank;
        }

        public DescribeItemsResponseBodyItemsItemInfo setSaleSpec(String saleSpec) {
            this.saleSpec = saleSpec;
            return this;
        }
        public String getSaleSpec() {
            return this.saleSpec;
        }

        public DescribeItemsResponseBodyItemsItemInfo setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public DescribeItemsResponseBodyItemsItemInfo setSourceCode(String sourceCode) {
            this.sourceCode = sourceCode;
            return this;
        }
        public String getSourceCode() {
            return this.sourceCode;
        }

        public DescribeItemsResponseBodyItemsItemInfo setStoreId(String storeId) {
            this.storeId = storeId;
            return this;
        }
        public String getStoreId() {
            return this.storeId;
        }

        public DescribeItemsResponseBodyItemsItemInfo setSuggestPrice(Integer suggestPrice) {
            this.suggestPrice = suggestPrice;
            return this;
        }
        public Integer getSuggestPrice() {
            return this.suggestPrice;
        }

    }

    public static class DescribeItemsResponseBodyItems extends TeaModel {
        @NameInMap("ItemInfo")
        public java.util.List<DescribeItemsResponseBodyItemsItemInfo> itemInfo;

        public static DescribeItemsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeItemsResponseBodyItems self = new DescribeItemsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeItemsResponseBodyItems setItemInfo(java.util.List<DescribeItemsResponseBodyItemsItemInfo> itemInfo) {
            this.itemInfo = itemInfo;
            return this;
        }
        public java.util.List<DescribeItemsResponseBodyItemsItemInfo> getItemInfo() {
            return this.itemInfo;
        }

    }

}
