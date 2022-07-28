// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ListDistributionItemResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<ListDistributionItemResponseBodyModel> model;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDistributionItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDistributionItemResponseBody self = new ListDistributionItemResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDistributionItemResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDistributionItemResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public ListDistributionItemResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDistributionItemResponseBody setModel(java.util.List<ListDistributionItemResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<ListDistributionItemResponseBodyModel> getModel() {
        return this.model;
    }

    public ListDistributionItemResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDistributionItemResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDistributionItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDistributionItemResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public ListDistributionItemResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public ListDistributionItemResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDistributionItemResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDistributionItemResponseBodyModelCategoryChain extends TeaModel {
        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("Leaf")
        public Boolean leaf;

        @NameInMap("Level")
        public Integer level;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentId")
        public Long parentId;

        public static ListDistributionItemResponseBodyModelCategoryChain build(java.util.Map<String, ?> map) throws Exception {
            ListDistributionItemResponseBodyModelCategoryChain self = new ListDistributionItemResponseBodyModelCategoryChain();
            return TeaModel.build(map, self);
        }

        public ListDistributionItemResponseBodyModelCategoryChain setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public ListDistributionItemResponseBodyModelCategoryChain setLeaf(Boolean leaf) {
            this.leaf = leaf;
            return this;
        }
        public Boolean getLeaf() {
            return this.leaf;
        }

        public ListDistributionItemResponseBodyModelCategoryChain setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public ListDistributionItemResponseBodyModelCategoryChain setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDistributionItemResponseBodyModelCategoryChain setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

    }

    public static class ListDistributionItemResponseBodyModelLmAttributeModels extends TeaModel {
        @NameInMap("AttrId")
        public Long attrId;

        @NameInMap("Category")
        public Integer category;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Restriction")
        public String restriction;

        @NameInMap("ScopeList")
        public java.util.List<String> scopeList;

        @NameInMap("Value")
        public String value;

        public static ListDistributionItemResponseBodyModelLmAttributeModels build(java.util.Map<String, ?> map) throws Exception {
            ListDistributionItemResponseBodyModelLmAttributeModels self = new ListDistributionItemResponseBodyModelLmAttributeModels();
            return TeaModel.build(map, self);
        }

        public ListDistributionItemResponseBodyModelLmAttributeModels setAttrId(Long attrId) {
            this.attrId = attrId;
            return this;
        }
        public Long getAttrId() {
            return this.attrId;
        }

        public ListDistributionItemResponseBodyModelLmAttributeModels setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public ListDistributionItemResponseBodyModelLmAttributeModels setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ListDistributionItemResponseBodyModelLmAttributeModels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDistributionItemResponseBodyModelLmAttributeModels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDistributionItemResponseBodyModelLmAttributeModels setRestriction(String restriction) {
            this.restriction = restriction;
            return this;
        }
        public String getRestriction() {
            return this.restriction;
        }

        public ListDistributionItemResponseBodyModelLmAttributeModels setScopeList(java.util.List<String> scopeList) {
            this.scopeList = scopeList;
            return this;
        }
        public java.util.List<String> getScopeList() {
            return this.scopeList;
        }

        public ListDistributionItemResponseBodyModelLmAttributeModels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDistributionItemResponseBodyModelSkuListLmAttributeModels extends TeaModel {
        @NameInMap("AttrId")
        public Long attrId;

        @NameInMap("Category")
        public Integer category;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Restriction")
        public String restriction;

        @NameInMap("ScopeList")
        public java.util.List<String> scopeList;

        @NameInMap("Value")
        public String value;

        public static ListDistributionItemResponseBodyModelSkuListLmAttributeModels build(java.util.Map<String, ?> map) throws Exception {
            ListDistributionItemResponseBodyModelSkuListLmAttributeModels self = new ListDistributionItemResponseBodyModelSkuListLmAttributeModels();
            return TeaModel.build(map, self);
        }

        public ListDistributionItemResponseBodyModelSkuListLmAttributeModels setAttrId(Long attrId) {
            this.attrId = attrId;
            return this;
        }
        public Long getAttrId() {
            return this.attrId;
        }

        public ListDistributionItemResponseBodyModelSkuListLmAttributeModels setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public ListDistributionItemResponseBodyModelSkuListLmAttributeModels setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ListDistributionItemResponseBodyModelSkuListLmAttributeModels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDistributionItemResponseBodyModelSkuListLmAttributeModels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDistributionItemResponseBodyModelSkuListLmAttributeModels setRestriction(String restriction) {
            this.restriction = restriction;
            return this;
        }
        public String getRestriction() {
            return this.restriction;
        }

        public ListDistributionItemResponseBodyModelSkuListLmAttributeModels setScopeList(java.util.List<String> scopeList) {
            this.scopeList = scopeList;
            return this;
        }
        public java.util.List<String> getScopeList() {
            return this.scopeList;
        }

        public ListDistributionItemResponseBodyModelSkuListLmAttributeModels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDistributionItemResponseBodyModelSkuListStepPrices extends TeaModel {
        @NameInMap("Max")
        public Integer max;

        @NameInMap("Min")
        public Integer min;

        @NameInMap("PriceCent")
        public Long priceCent;

        public static ListDistributionItemResponseBodyModelSkuListStepPrices build(java.util.Map<String, ?> map) throws Exception {
            ListDistributionItemResponseBodyModelSkuListStepPrices self = new ListDistributionItemResponseBodyModelSkuListStepPrices();
            return TeaModel.build(map, self);
        }

        public ListDistributionItemResponseBodyModelSkuListStepPrices setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public ListDistributionItemResponseBodyModelSkuListStepPrices setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

        public ListDistributionItemResponseBodyModelSkuListStepPrices setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

    }

    public static class ListDistributionItemResponseBodyModelSkuList extends TeaModel {
        @NameInMap("AdminStatus")
        public Integer adminStatus;

        @NameInMap("AliyunPriceCent")
        public Long aliyunPriceCent;

        @NameInMap("BenefitId")
        public String benefitId;

        @NameInMap("CanSell")
        public Boolean canSell;

        @NameInMap("CustomerStatus")
        public Integer customerStatus;

        @NameInMap("CustomizedAttributeMap")
        public java.util.Map<String, String> customizedAttributeMap;

        @NameInMap("DiscountRate")
        public Double discountRate;

        @NameInMap("DisparityPrice")
        public Long disparityPrice;

        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("IcStatus")
        public Integer icStatus;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("LmAttributeModels")
        public java.util.List<ListDistributionItemResponseBodyModelSkuListLmAttributeModels> lmAttributeModels;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("MainPriceCent")
        public Long mainPriceCent;

        @NameInMap("MaxAllowedCount")
        public Integer maxAllowedCount;

        @NameInMap("OriginalPriceCent")
        public Long originalPriceCent;

        @NameInMap("PointPrice")
        public Long pointPrice;

        @NameInMap("Points")
        public Long points;

        @NameInMap("PointsAmount")
        public Long pointsAmount;

        @NameInMap("PointsInfo")
        public String pointsInfo;

        @NameInMap("PointsKey")
        public String pointsKey;

        @NameInMap("PremiumRate")
        public Double premiumRate;

        @NameInMap("PriceCent")
        public Long priceCent;

        @NameInMap("Quantity")
        public Long quantity;

        @NameInMap("ReservePrice")
        public Long reservePrice;

        @NameInMap("SkuDesc")
        public String skuDesc;

        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("SkuPicUrl")
        public String skuPicUrl;

        @NameInMap("SkuProperties")
        public java.util.Map<String, String> skuProperties;

        @NameInMap("SkuPropertiesJson")
        public String skuPropertiesJson;

        @NameInMap("SkuTitle")
        public String skuTitle;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("StepPrices")
        public java.util.List<ListDistributionItemResponseBodyModelSkuListStepPrices> stepPrices;

        @NameInMap("SupplierStatus")
        public Integer supplierStatus;

        @NameInMap("SupplyPriceCent")
        public Long supplyPriceCent;

        @NameInMap("TaoBaoCurrentPrice")
        public Long taoBaoCurrentPrice;

        @NameInMap("Tips")
        public String tips;

        @NameInMap("UserLabel")
        public java.util.List<String> userLabel;

        public static ListDistributionItemResponseBodyModelSkuList build(java.util.Map<String, ?> map) throws Exception {
            ListDistributionItemResponseBodyModelSkuList self = new ListDistributionItemResponseBodyModelSkuList();
            return TeaModel.build(map, self);
        }

        public ListDistributionItemResponseBodyModelSkuList setAdminStatus(Integer adminStatus) {
            this.adminStatus = adminStatus;
            return this;
        }
        public Integer getAdminStatus() {
            return this.adminStatus;
        }

        public ListDistributionItemResponseBodyModelSkuList setAliyunPriceCent(Long aliyunPriceCent) {
            this.aliyunPriceCent = aliyunPriceCent;
            return this;
        }
        public Long getAliyunPriceCent() {
            return this.aliyunPriceCent;
        }

        public ListDistributionItemResponseBodyModelSkuList setBenefitId(String benefitId) {
            this.benefitId = benefitId;
            return this;
        }
        public String getBenefitId() {
            return this.benefitId;
        }

        public ListDistributionItemResponseBodyModelSkuList setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public ListDistributionItemResponseBodyModelSkuList setCustomerStatus(Integer customerStatus) {
            this.customerStatus = customerStatus;
            return this;
        }
        public Integer getCustomerStatus() {
            return this.customerStatus;
        }

        public ListDistributionItemResponseBodyModelSkuList setCustomizedAttributeMap(java.util.Map<String, String> customizedAttributeMap) {
            this.customizedAttributeMap = customizedAttributeMap;
            return this;
        }
        public java.util.Map<String, String> getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

        public ListDistributionItemResponseBodyModelSkuList setDiscountRate(Double discountRate) {
            this.discountRate = discountRate;
            return this;
        }
        public Double getDiscountRate() {
            return this.discountRate;
        }

        public ListDistributionItemResponseBodyModelSkuList setDisparityPrice(Long disparityPrice) {
            this.disparityPrice = disparityPrice;
            return this;
        }
        public Long getDisparityPrice() {
            return this.disparityPrice;
        }

        public ListDistributionItemResponseBodyModelSkuList setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public ListDistributionItemResponseBodyModelSkuList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDistributionItemResponseBodyModelSkuList setIcStatus(Integer icStatus) {
            this.icStatus = icStatus;
            return this;
        }
        public Integer getIcStatus() {
            return this.icStatus;
        }

        public ListDistributionItemResponseBodyModelSkuList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public ListDistributionItemResponseBodyModelSkuList setLmAttributeModels(java.util.List<ListDistributionItemResponseBodyModelSkuListLmAttributeModels> lmAttributeModels) {
            this.lmAttributeModels = lmAttributeModels;
            return this;
        }
        public java.util.List<ListDistributionItemResponseBodyModelSkuListLmAttributeModels> getLmAttributeModels() {
            return this.lmAttributeModels;
        }

        public ListDistributionItemResponseBodyModelSkuList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public ListDistributionItemResponseBodyModelSkuList setMainPriceCent(Long mainPriceCent) {
            this.mainPriceCent = mainPriceCent;
            return this;
        }
        public Long getMainPriceCent() {
            return this.mainPriceCent;
        }

        public ListDistributionItemResponseBodyModelSkuList setMaxAllowedCount(Integer maxAllowedCount) {
            this.maxAllowedCount = maxAllowedCount;
            return this;
        }
        public Integer getMaxAllowedCount() {
            return this.maxAllowedCount;
        }

        public ListDistributionItemResponseBodyModelSkuList setOriginalPriceCent(Long originalPriceCent) {
            this.originalPriceCent = originalPriceCent;
            return this;
        }
        public Long getOriginalPriceCent() {
            return this.originalPriceCent;
        }

        public ListDistributionItemResponseBodyModelSkuList setPointPrice(Long pointPrice) {
            this.pointPrice = pointPrice;
            return this;
        }
        public Long getPointPrice() {
            return this.pointPrice;
        }

        public ListDistributionItemResponseBodyModelSkuList setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public ListDistributionItemResponseBodyModelSkuList setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public ListDistributionItemResponseBodyModelSkuList setPointsInfo(String pointsInfo) {
            this.pointsInfo = pointsInfo;
            return this;
        }
        public String getPointsInfo() {
            return this.pointsInfo;
        }

        public ListDistributionItemResponseBodyModelSkuList setPointsKey(String pointsKey) {
            this.pointsKey = pointsKey;
            return this;
        }
        public String getPointsKey() {
            return this.pointsKey;
        }

        public ListDistributionItemResponseBodyModelSkuList setPremiumRate(Double premiumRate) {
            this.premiumRate = premiumRate;
            return this;
        }
        public Double getPremiumRate() {
            return this.premiumRate;
        }

        public ListDistributionItemResponseBodyModelSkuList setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public ListDistributionItemResponseBodyModelSkuList setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }
        public Long getQuantity() {
            return this.quantity;
        }

        public ListDistributionItemResponseBodyModelSkuList setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public ListDistributionItemResponseBodyModelSkuList setSkuDesc(String skuDesc) {
            this.skuDesc = skuDesc;
            return this;
        }
        public String getSkuDesc() {
            return this.skuDesc;
        }

        public ListDistributionItemResponseBodyModelSkuList setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public ListDistributionItemResponseBodyModelSkuList setSkuPicUrl(String skuPicUrl) {
            this.skuPicUrl = skuPicUrl;
            return this;
        }
        public String getSkuPicUrl() {
            return this.skuPicUrl;
        }

        public ListDistributionItemResponseBodyModelSkuList setSkuProperties(java.util.Map<String, String> skuProperties) {
            this.skuProperties = skuProperties;
            return this;
        }
        public java.util.Map<String, String> getSkuProperties() {
            return this.skuProperties;
        }

        public ListDistributionItemResponseBodyModelSkuList setSkuPropertiesJson(String skuPropertiesJson) {
            this.skuPropertiesJson = skuPropertiesJson;
            return this;
        }
        public String getSkuPropertiesJson() {
            return this.skuPropertiesJson;
        }

        public ListDistributionItemResponseBodyModelSkuList setSkuTitle(String skuTitle) {
            this.skuTitle = skuTitle;
            return this;
        }
        public String getSkuTitle() {
            return this.skuTitle;
        }

        public ListDistributionItemResponseBodyModelSkuList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListDistributionItemResponseBodyModelSkuList setStepPrices(java.util.List<ListDistributionItemResponseBodyModelSkuListStepPrices> stepPrices) {
            this.stepPrices = stepPrices;
            return this;
        }
        public java.util.List<ListDistributionItemResponseBodyModelSkuListStepPrices> getStepPrices() {
            return this.stepPrices;
        }

        public ListDistributionItemResponseBodyModelSkuList setSupplierStatus(Integer supplierStatus) {
            this.supplierStatus = supplierStatus;
            return this;
        }
        public Integer getSupplierStatus() {
            return this.supplierStatus;
        }

        public ListDistributionItemResponseBodyModelSkuList setSupplyPriceCent(Long supplyPriceCent) {
            this.supplyPriceCent = supplyPriceCent;
            return this;
        }
        public Long getSupplyPriceCent() {
            return this.supplyPriceCent;
        }

        public ListDistributionItemResponseBodyModelSkuList setTaoBaoCurrentPrice(Long taoBaoCurrentPrice) {
            this.taoBaoCurrentPrice = taoBaoCurrentPrice;
            return this;
        }
        public Long getTaoBaoCurrentPrice() {
            return this.taoBaoCurrentPrice;
        }

        public ListDistributionItemResponseBodyModelSkuList setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

        public ListDistributionItemResponseBodyModelSkuList setUserLabel(java.util.List<String> userLabel) {
            this.userLabel = userLabel;
            return this;
        }
        public java.util.List<String> getUserLabel() {
            return this.userLabel;
        }

    }

    public static class ListDistributionItemResponseBodyModel extends TeaModel {
        @NameInMap("AuctionStatus")
        public Integer auctionStatus;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("BizTotalSaleNum")
        public Long bizTotalSaleNum;

        @NameInMap("Category")
        public String category;

        @NameInMap("CategoryChain")
        public java.util.List<ListDistributionItemResponseBodyModelCategoryChain> categoryChain;

        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("CumulativeSaleNum")
        public Long cumulativeSaleNum;

        @NameInMap("DescOption")
        public String descOption;

        @NameInMap("DiscountRateScope")
        public String discountRateScope;

        @NameInMap("DisparityPriceScope")
        public String disparityPriceScope;

        @NameInMap("DistributionMallId")
        public String distributionMallId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("IcQuantity")
        public Long icQuantity;

        @NameInMap("IsCanSell")
        public Boolean isCanSell;

        @NameInMap("IsInventoryZero")
        public Boolean isInventoryZero;

        @NameInMap("ItemDesc")
        public String itemDesc;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("ItemIdStr")
        public String itemIdStr;

        @NameInMap("ItemImages")
        public java.util.List<String> itemImages;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("ItemTitle")
        public String itemTitle;

        @NameInMap("LinkRatio")
        public String linkRatio;

        @NameInMap("LmAttributeModels")
        public java.util.List<ListDistributionItemResponseBodyModelLmAttributeModels> lmAttributeModels;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("LmShopId")
        public Long lmShopId;

        @NameInMap("MainBizStatus")
        public Integer mainBizStatus;

        @NameInMap("MainBizTotalSaleNum")
        public Long mainBizTotalSaleNum;

        @NameInMap("MainPicUrl")
        public String mainPicUrl;

        @NameInMap("MainPriceCentScope")
        public String mainPriceCentScope;

        @NameInMap("MaxAllowedCount")
        public Integer maxAllowedCount;

        @NameInMap("MonthSaleNum")
        public Long monthSaleNum;

        @NameInMap("PicUrl")
        public String picUrl;

        @NameInMap("PremiumRateScope")
        public String premiumRateScope;

        @NameInMap("PriceCentScope")
        public String priceCentScope;

        @NameInMap("PropertiesJson")
        public String propertiesJson;

        @NameInMap("Quantity")
        public Integer quantity;

        @NameInMap("ReservedPrice")
        public Long reservedPrice;

        @NameInMap("ReservedPriceScope")
        public String reservedPriceScope;

        @NameInMap("SellerId")
        public Long sellerId;

        @NameInMap("SessionQuantity")
        public Long sessionQuantity;

        @NameInMap("ShopId")
        public Long shopId;

        @NameInMap("SkuList")
        public java.util.List<ListDistributionItemResponseBodyModelSkuList> skuList;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SupplyPriceCentScope")
        public String supplyPriceCentScope;

        @NameInMap("TaoBaoCurrentPriceScope")
        public String taoBaoCurrentPriceScope;

        @NameInMap("TbShopName")
        public String tbShopName;

        @NameInMap("Tips")
        public String tips;

        @NameInMap("TotalSoldQuantity")
        public Integer totalSoldQuantity;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("UserCashPointsScope")
        public String userCashPointsScope;

        public static ListDistributionItemResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ListDistributionItemResponseBodyModel self = new ListDistributionItemResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ListDistributionItemResponseBodyModel setAuctionStatus(Integer auctionStatus) {
            this.auctionStatus = auctionStatus;
            return this;
        }
        public Integer getAuctionStatus() {
            return this.auctionStatus;
        }

        public ListDistributionItemResponseBodyModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ListDistributionItemResponseBodyModel setBizTotalSaleNum(Long bizTotalSaleNum) {
            this.bizTotalSaleNum = bizTotalSaleNum;
            return this;
        }
        public Long getBizTotalSaleNum() {
            return this.bizTotalSaleNum;
        }

        public ListDistributionItemResponseBodyModel setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListDistributionItemResponseBodyModel setCategoryChain(java.util.List<ListDistributionItemResponseBodyModelCategoryChain> categoryChain) {
            this.categoryChain = categoryChain;
            return this;
        }
        public java.util.List<ListDistributionItemResponseBodyModelCategoryChain> getCategoryChain() {
            return this.categoryChain;
        }

        public ListDistributionItemResponseBodyModel setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public ListDistributionItemResponseBodyModel setCumulativeSaleNum(Long cumulativeSaleNum) {
            this.cumulativeSaleNum = cumulativeSaleNum;
            return this;
        }
        public Long getCumulativeSaleNum() {
            return this.cumulativeSaleNum;
        }

        public ListDistributionItemResponseBodyModel setDescOption(String descOption) {
            this.descOption = descOption;
            return this;
        }
        public String getDescOption() {
            return this.descOption;
        }

        public ListDistributionItemResponseBodyModel setDiscountRateScope(String discountRateScope) {
            this.discountRateScope = discountRateScope;
            return this;
        }
        public String getDiscountRateScope() {
            return this.discountRateScope;
        }

        public ListDistributionItemResponseBodyModel setDisparityPriceScope(String disparityPriceScope) {
            this.disparityPriceScope = disparityPriceScope;
            return this;
        }
        public String getDisparityPriceScope() {
            return this.disparityPriceScope;
        }

        public ListDistributionItemResponseBodyModel setDistributionMallId(String distributionMallId) {
            this.distributionMallId = distributionMallId;
            return this;
        }
        public String getDistributionMallId() {
            return this.distributionMallId;
        }

        public ListDistributionItemResponseBodyModel setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDistributionItemResponseBodyModel setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDistributionItemResponseBodyModel setIcQuantity(Long icQuantity) {
            this.icQuantity = icQuantity;
            return this;
        }
        public Long getIcQuantity() {
            return this.icQuantity;
        }

        public ListDistributionItemResponseBodyModel setIsCanSell(Boolean isCanSell) {
            this.isCanSell = isCanSell;
            return this;
        }
        public Boolean getIsCanSell() {
            return this.isCanSell;
        }

        public ListDistributionItemResponseBodyModel setIsInventoryZero(Boolean isInventoryZero) {
            this.isInventoryZero = isInventoryZero;
            return this;
        }
        public Boolean getIsInventoryZero() {
            return this.isInventoryZero;
        }

        public ListDistributionItemResponseBodyModel setItemDesc(String itemDesc) {
            this.itemDesc = itemDesc;
            return this;
        }
        public String getItemDesc() {
            return this.itemDesc;
        }

        public ListDistributionItemResponseBodyModel setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public ListDistributionItemResponseBodyModel setItemIdStr(String itemIdStr) {
            this.itemIdStr = itemIdStr;
            return this;
        }
        public String getItemIdStr() {
            return this.itemIdStr;
        }

        public ListDistributionItemResponseBodyModel setItemImages(java.util.List<String> itemImages) {
            this.itemImages = itemImages;
            return this;
        }
        public java.util.List<String> getItemImages() {
            return this.itemImages;
        }

        public ListDistributionItemResponseBodyModel setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public ListDistributionItemResponseBodyModel setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public ListDistributionItemResponseBodyModel setLinkRatio(String linkRatio) {
            this.linkRatio = linkRatio;
            return this;
        }
        public String getLinkRatio() {
            return this.linkRatio;
        }

        public ListDistributionItemResponseBodyModel setLmAttributeModels(java.util.List<ListDistributionItemResponseBodyModelLmAttributeModels> lmAttributeModels) {
            this.lmAttributeModels = lmAttributeModels;
            return this;
        }
        public java.util.List<ListDistributionItemResponseBodyModelLmAttributeModels> getLmAttributeModels() {
            return this.lmAttributeModels;
        }

        public ListDistributionItemResponseBodyModel setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public ListDistributionItemResponseBodyModel setLmShopId(Long lmShopId) {
            this.lmShopId = lmShopId;
            return this;
        }
        public Long getLmShopId() {
            return this.lmShopId;
        }

        public ListDistributionItemResponseBodyModel setMainBizStatus(Integer mainBizStatus) {
            this.mainBizStatus = mainBizStatus;
            return this;
        }
        public Integer getMainBizStatus() {
            return this.mainBizStatus;
        }

        public ListDistributionItemResponseBodyModel setMainBizTotalSaleNum(Long mainBizTotalSaleNum) {
            this.mainBizTotalSaleNum = mainBizTotalSaleNum;
            return this;
        }
        public Long getMainBizTotalSaleNum() {
            return this.mainBizTotalSaleNum;
        }

        public ListDistributionItemResponseBodyModel setMainPicUrl(String mainPicUrl) {
            this.mainPicUrl = mainPicUrl;
            return this;
        }
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        public ListDistributionItemResponseBodyModel setMainPriceCentScope(String mainPriceCentScope) {
            this.mainPriceCentScope = mainPriceCentScope;
            return this;
        }
        public String getMainPriceCentScope() {
            return this.mainPriceCentScope;
        }

        public ListDistributionItemResponseBodyModel setMaxAllowedCount(Integer maxAllowedCount) {
            this.maxAllowedCount = maxAllowedCount;
            return this;
        }
        public Integer getMaxAllowedCount() {
            return this.maxAllowedCount;
        }

        public ListDistributionItemResponseBodyModel setMonthSaleNum(Long monthSaleNum) {
            this.monthSaleNum = monthSaleNum;
            return this;
        }
        public Long getMonthSaleNum() {
            return this.monthSaleNum;
        }

        public ListDistributionItemResponseBodyModel setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public ListDistributionItemResponseBodyModel setPremiumRateScope(String premiumRateScope) {
            this.premiumRateScope = premiumRateScope;
            return this;
        }
        public String getPremiumRateScope() {
            return this.premiumRateScope;
        }

        public ListDistributionItemResponseBodyModel setPriceCentScope(String priceCentScope) {
            this.priceCentScope = priceCentScope;
            return this;
        }
        public String getPriceCentScope() {
            return this.priceCentScope;
        }

        public ListDistributionItemResponseBodyModel setPropertiesJson(String propertiesJson) {
            this.propertiesJson = propertiesJson;
            return this;
        }
        public String getPropertiesJson() {
            return this.propertiesJson;
        }

        public ListDistributionItemResponseBodyModel setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public ListDistributionItemResponseBodyModel setReservedPrice(Long reservedPrice) {
            this.reservedPrice = reservedPrice;
            return this;
        }
        public Long getReservedPrice() {
            return this.reservedPrice;
        }

        public ListDistributionItemResponseBodyModel setReservedPriceScope(String reservedPriceScope) {
            this.reservedPriceScope = reservedPriceScope;
            return this;
        }
        public String getReservedPriceScope() {
            return this.reservedPriceScope;
        }

        public ListDistributionItemResponseBodyModel setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public ListDistributionItemResponseBodyModel setSessionQuantity(Long sessionQuantity) {
            this.sessionQuantity = sessionQuantity;
            return this;
        }
        public Long getSessionQuantity() {
            return this.sessionQuantity;
        }

        public ListDistributionItemResponseBodyModel setShopId(Long shopId) {
            this.shopId = shopId;
            return this;
        }
        public Long getShopId() {
            return this.shopId;
        }

        public ListDistributionItemResponseBodyModel setSkuList(java.util.List<ListDistributionItemResponseBodyModelSkuList> skuList) {
            this.skuList = skuList;
            return this;
        }
        public java.util.List<ListDistributionItemResponseBodyModelSkuList> getSkuList() {
            return this.skuList;
        }

        public ListDistributionItemResponseBodyModel setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListDistributionItemResponseBodyModel setSupplyPriceCentScope(String supplyPriceCentScope) {
            this.supplyPriceCentScope = supplyPriceCentScope;
            return this;
        }
        public String getSupplyPriceCentScope() {
            return this.supplyPriceCentScope;
        }

        public ListDistributionItemResponseBodyModel setTaoBaoCurrentPriceScope(String taoBaoCurrentPriceScope) {
            this.taoBaoCurrentPriceScope = taoBaoCurrentPriceScope;
            return this;
        }
        public String getTaoBaoCurrentPriceScope() {
            return this.taoBaoCurrentPriceScope;
        }

        public ListDistributionItemResponseBodyModel setTbShopName(String tbShopName) {
            this.tbShopName = tbShopName;
            return this;
        }
        public String getTbShopName() {
            return this.tbShopName;
        }

        public ListDistributionItemResponseBodyModel setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

        public ListDistributionItemResponseBodyModel setTotalSoldQuantity(Integer totalSoldQuantity) {
            this.totalSoldQuantity = totalSoldQuantity;
            return this;
        }
        public Integer getTotalSoldQuantity() {
            return this.totalSoldQuantity;
        }

        public ListDistributionItemResponseBodyModel setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListDistributionItemResponseBodyModel setUserCashPointsScope(String userCashPointsScope) {
            this.userCashPointsScope = userCashPointsScope;
            return this;
        }
        public String getUserCashPointsScope() {
            return this.userCashPointsScope;
        }

    }

}
