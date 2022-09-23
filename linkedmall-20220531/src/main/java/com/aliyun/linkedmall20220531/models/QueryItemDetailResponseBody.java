// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryItemDetailResponseBody extends TeaModel {
    @NameInMap("BizViewData")
    public java.util.Map<String, ?> bizViewData;

    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QueryItemDetailResponseBodyModel model;

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

    public static QueryItemDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryItemDetailResponseBody self = new QueryItemDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryItemDetailResponseBody setBizViewData(java.util.Map<String, ?> bizViewData) {
        this.bizViewData = bizViewData;
        return this;
    }
    public java.util.Map<String, ?> getBizViewData() {
        return this.bizViewData;
    }

    public QueryItemDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryItemDetailResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryItemDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryItemDetailResponseBody setModel(QueryItemDetailResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryItemDetailResponseBodyModel getModel() {
        return this.model;
    }

    public QueryItemDetailResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryItemDetailResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryItemDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryItemDetailResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryItemDetailResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryItemDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryItemDetailResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryItemDetailResponseBodyModelSkuModels extends TeaModel {
        @NameInMap("CanNotBeSoldCode")
        public String canNotBeSoldCode;

        @NameInMap("CanNotBeSoldMessage")
        public String canNotBeSoldMessage;

        @NameInMap("CustomizedAttributeMap")
        public java.util.Map<String, String> customizedAttributeMap;

        @NameInMap("DistributionMallId")
        public String distributionMallId;

        @NameInMap("ExtJson")
        public String extJson;

        @NameInMap("HasQuantity")
        public Boolean hasQuantity;

        @NameInMap("InvoiceType")
        public Integer invoiceType;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("LmSkuAttributeMap")
        public java.util.Map<String, String> lmSkuAttributeMap;

        @NameInMap("PriceCent")
        public Long priceCent;

        @NameInMap("Quantity")
        public Integer quantity;

        @NameInMap("ReservedPrice")
        public Long reservedPrice;

        @NameInMap("SimpleQuantity")
        public String simpleQuantity;

        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("SkuPicUrl")
        public String skuPicUrl;

        @NameInMap("SkuPvs")
        public String skuPvs;

        @NameInMap("SkuTitle")
        public String skuTitle;

        @NameInMap("Status")
        public Integer status;

        public static QueryItemDetailResponseBodyModelSkuModels build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailResponseBodyModelSkuModels self = new QueryItemDetailResponseBodyModelSkuModels();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailResponseBodyModelSkuModels setCanNotBeSoldCode(String canNotBeSoldCode) {
            this.canNotBeSoldCode = canNotBeSoldCode;
            return this;
        }
        public String getCanNotBeSoldCode() {
            return this.canNotBeSoldCode;
        }

        public QueryItemDetailResponseBodyModelSkuModels setCanNotBeSoldMessage(String canNotBeSoldMessage) {
            this.canNotBeSoldMessage = canNotBeSoldMessage;
            return this;
        }
        public String getCanNotBeSoldMessage() {
            return this.canNotBeSoldMessage;
        }

        public QueryItemDetailResponseBodyModelSkuModels setCustomizedAttributeMap(java.util.Map<String, String> customizedAttributeMap) {
            this.customizedAttributeMap = customizedAttributeMap;
            return this;
        }
        public java.util.Map<String, String> getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

        public QueryItemDetailResponseBodyModelSkuModels setDistributionMallId(String distributionMallId) {
            this.distributionMallId = distributionMallId;
            return this;
        }
        public String getDistributionMallId() {
            return this.distributionMallId;
        }

        public QueryItemDetailResponseBodyModelSkuModels setExtJson(String extJson) {
            this.extJson = extJson;
            return this;
        }
        public String getExtJson() {
            return this.extJson;
        }

        public QueryItemDetailResponseBodyModelSkuModels setHasQuantity(Boolean hasQuantity) {
            this.hasQuantity = hasQuantity;
            return this;
        }
        public Boolean getHasQuantity() {
            return this.hasQuantity;
        }

        public QueryItemDetailResponseBodyModelSkuModels setInvoiceType(Integer invoiceType) {
            this.invoiceType = invoiceType;
            return this;
        }
        public Integer getInvoiceType() {
            return this.invoiceType;
        }

        public QueryItemDetailResponseBodyModelSkuModels setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryItemDetailResponseBodyModelSkuModels setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryItemDetailResponseBodyModelSkuModels setLmSkuAttributeMap(java.util.Map<String, String> lmSkuAttributeMap) {
            this.lmSkuAttributeMap = lmSkuAttributeMap;
            return this;
        }
        public java.util.Map<String, String> getLmSkuAttributeMap() {
            return this.lmSkuAttributeMap;
        }

        public QueryItemDetailResponseBodyModelSkuModels setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryItemDetailResponseBodyModelSkuModels setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public QueryItemDetailResponseBodyModelSkuModels setReservedPrice(Long reservedPrice) {
            this.reservedPrice = reservedPrice;
            return this;
        }
        public Long getReservedPrice() {
            return this.reservedPrice;
        }

        public QueryItemDetailResponseBodyModelSkuModels setSimpleQuantity(String simpleQuantity) {
            this.simpleQuantity = simpleQuantity;
            return this;
        }
        public String getSimpleQuantity() {
            return this.simpleQuantity;
        }

        public QueryItemDetailResponseBodyModelSkuModels setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryItemDetailResponseBodyModelSkuModels setSkuPicUrl(String skuPicUrl) {
            this.skuPicUrl = skuPicUrl;
            return this;
        }
        public String getSkuPicUrl() {
            return this.skuPicUrl;
        }

        public QueryItemDetailResponseBodyModelSkuModels setSkuPvs(String skuPvs) {
            this.skuPvs = skuPvs;
            return this;
        }
        public String getSkuPvs() {
            return this.skuPvs;
        }

        public QueryItemDetailResponseBodyModelSkuModels setSkuTitle(String skuTitle) {
            this.skuTitle = skuTitle;
            return this;
        }
        public String getSkuTitle() {
            return this.skuTitle;
        }

        public QueryItemDetailResponseBodyModelSkuModels setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class QueryItemDetailResponseBodyModelSkuPropertysValues extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Text")
        public String text;

        public static QueryItemDetailResponseBodyModelSkuPropertysValues build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailResponseBodyModelSkuPropertysValues self = new QueryItemDetailResponseBodyModelSkuPropertysValues();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailResponseBodyModelSkuPropertysValues setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryItemDetailResponseBodyModelSkuPropertysValues setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class QueryItemDetailResponseBodyModelSkuPropertys extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Text")
        public String text;

        @NameInMap("Values")
        public java.util.List<QueryItemDetailResponseBodyModelSkuPropertysValues> values;

        public static QueryItemDetailResponseBodyModelSkuPropertys build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailResponseBodyModelSkuPropertys self = new QueryItemDetailResponseBodyModelSkuPropertys();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailResponseBodyModelSkuPropertys setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryItemDetailResponseBodyModelSkuPropertys setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QueryItemDetailResponseBodyModelSkuPropertys setValues(java.util.List<QueryItemDetailResponseBodyModelSkuPropertysValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<QueryItemDetailResponseBodyModelSkuPropertysValues> getValues() {
            return this.values;
        }

    }

    public static class QueryItemDetailResponseBodyModel extends TeaModel {
        @NameInMap("CanNotBeSoldCode")
        public String canNotBeSoldCode;

        @NameInMap("CanNotBeSoldMessage")
        public String canNotBeSoldMessage;

        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("CategoryIds")
        public java.util.List<Long> categoryIds;

        @NameInMap("City")
        public String city;

        @NameInMap("Current")
        public String current;

        @NameInMap("CustomizedAttributeMap")
        public java.util.Map<String, String> customizedAttributeMap;

        @NameInMap("DescOption")
        public String descOption;

        @NameInMap("DescPath")
        public String descPath;

        @NameInMap("DistributionMallId")
        public String distributionMallId;

        @NameInMap("Features")
        public java.util.Map<String, String> features;

        @NameInMap("FirstPicUrl")
        public String firstPicUrl;

        @NameInMap("HasQuantity")
        public Boolean hasQuantity;

        @NameInMap("IforestProps")
        public java.util.List<java.util.Map<String, String>> iforestProps;

        @NameInMap("InvoiceType")
        public Integer invoiceType;

        @NameInMap("IsCanSell")
        public Boolean isCanSell;

        @NameInMap("IsSellerPayPostfee")
        public Boolean isSellerPayPostfee;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("ItemImages")
        public java.util.List<String> itemImages;

        @NameInMap("ItemTitle")
        public String itemTitle;

        @NameInMap("ItemTotalSimpleValue")
        public String itemTotalSimpleValue;

        @NameInMap("ItemTotalValue")
        public Integer itemTotalValue;

        @NameInMap("LmItemAttributeMap")
        public java.util.Map<String, String> lmItemAttributeMap;

        @NameInMap("LmItemCategory")
        public String lmItemCategory;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("MainPicUrl")
        public String mainPicUrl;

        @NameInMap("MinPrice")
        public Long minPrice;

        @NameInMap("Properties")
        public java.util.Map<String, java.util.List<String>> properties;

        @NameInMap("Prov")
        public String prov;

        @NameInMap("Quantity")
        public Integer quantity;

        @NameInMap("ReservedPrice")
        public Long reservedPrice;

        @NameInMap("SimpleQuantity")
        public String simpleQuantity;

        @NameInMap("SkuModels")
        public java.util.List<QueryItemDetailResponseBodyModelSkuModels> skuModels;

        @NameInMap("SkuPropertys")
        public java.util.List<QueryItemDetailResponseBodyModelSkuPropertys> skuPropertys;

        @NameInMap("ThirdPartyItemId")
        public String thirdPartyItemId;

        @NameInMap("ThirdPartyName")
        public String thirdPartyName;

        @NameInMap("VideoPicUrl")
        public String videoPicUrl;

        @NameInMap("VideoUrl")
        public String videoUrl;

        @NameInMap("VirtualItemType")
        public String virtualItemType;

        public static QueryItemDetailResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailResponseBodyModel self = new QueryItemDetailResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailResponseBodyModel setCanNotBeSoldCode(String canNotBeSoldCode) {
            this.canNotBeSoldCode = canNotBeSoldCode;
            return this;
        }
        public String getCanNotBeSoldCode() {
            return this.canNotBeSoldCode;
        }

        public QueryItemDetailResponseBodyModel setCanNotBeSoldMessage(String canNotBeSoldMessage) {
            this.canNotBeSoldMessage = canNotBeSoldMessage;
            return this;
        }
        public String getCanNotBeSoldMessage() {
            return this.canNotBeSoldMessage;
        }

        public QueryItemDetailResponseBodyModel setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public QueryItemDetailResponseBodyModel setCategoryIds(java.util.List<Long> categoryIds) {
            this.categoryIds = categoryIds;
            return this;
        }
        public java.util.List<Long> getCategoryIds() {
            return this.categoryIds;
        }

        public QueryItemDetailResponseBodyModel setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public QueryItemDetailResponseBodyModel setCurrent(String current) {
            this.current = current;
            return this;
        }
        public String getCurrent() {
            return this.current;
        }

        public QueryItemDetailResponseBodyModel setCustomizedAttributeMap(java.util.Map<String, String> customizedAttributeMap) {
            this.customizedAttributeMap = customizedAttributeMap;
            return this;
        }
        public java.util.Map<String, String> getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

        public QueryItemDetailResponseBodyModel setDescOption(String descOption) {
            this.descOption = descOption;
            return this;
        }
        public String getDescOption() {
            return this.descOption;
        }

        public QueryItemDetailResponseBodyModel setDescPath(String descPath) {
            this.descPath = descPath;
            return this;
        }
        public String getDescPath() {
            return this.descPath;
        }

        public QueryItemDetailResponseBodyModel setDistributionMallId(String distributionMallId) {
            this.distributionMallId = distributionMallId;
            return this;
        }
        public String getDistributionMallId() {
            return this.distributionMallId;
        }

        public QueryItemDetailResponseBodyModel setFeatures(java.util.Map<String, String> features) {
            this.features = features;
            return this;
        }
        public java.util.Map<String, String> getFeatures() {
            return this.features;
        }

        public QueryItemDetailResponseBodyModel setFirstPicUrl(String firstPicUrl) {
            this.firstPicUrl = firstPicUrl;
            return this;
        }
        public String getFirstPicUrl() {
            return this.firstPicUrl;
        }

        public QueryItemDetailResponseBodyModel setHasQuantity(Boolean hasQuantity) {
            this.hasQuantity = hasQuantity;
            return this;
        }
        public Boolean getHasQuantity() {
            return this.hasQuantity;
        }

        public QueryItemDetailResponseBodyModel setIforestProps(java.util.List<java.util.Map<String, String>> iforestProps) {
            this.iforestProps = iforestProps;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getIforestProps() {
            return this.iforestProps;
        }

        public QueryItemDetailResponseBodyModel setInvoiceType(Integer invoiceType) {
            this.invoiceType = invoiceType;
            return this;
        }
        public Integer getInvoiceType() {
            return this.invoiceType;
        }

        public QueryItemDetailResponseBodyModel setIsCanSell(Boolean isCanSell) {
            this.isCanSell = isCanSell;
            return this;
        }
        public Boolean getIsCanSell() {
            return this.isCanSell;
        }

        public QueryItemDetailResponseBodyModel setIsSellerPayPostfee(Boolean isSellerPayPostfee) {
            this.isSellerPayPostfee = isSellerPayPostfee;
            return this;
        }
        public Boolean getIsSellerPayPostfee() {
            return this.isSellerPayPostfee;
        }

        public QueryItemDetailResponseBodyModel setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryItemDetailResponseBodyModel setItemImages(java.util.List<String> itemImages) {
            this.itemImages = itemImages;
            return this;
        }
        public java.util.List<String> getItemImages() {
            return this.itemImages;
        }

        public QueryItemDetailResponseBodyModel setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryItemDetailResponseBodyModel setItemTotalSimpleValue(String itemTotalSimpleValue) {
            this.itemTotalSimpleValue = itemTotalSimpleValue;
            return this;
        }
        public String getItemTotalSimpleValue() {
            return this.itemTotalSimpleValue;
        }

        public QueryItemDetailResponseBodyModel setItemTotalValue(Integer itemTotalValue) {
            this.itemTotalValue = itemTotalValue;
            return this;
        }
        public Integer getItemTotalValue() {
            return this.itemTotalValue;
        }

        public QueryItemDetailResponseBodyModel setLmItemAttributeMap(java.util.Map<String, String> lmItemAttributeMap) {
            this.lmItemAttributeMap = lmItemAttributeMap;
            return this;
        }
        public java.util.Map<String, String> getLmItemAttributeMap() {
            return this.lmItemAttributeMap;
        }

        public QueryItemDetailResponseBodyModel setLmItemCategory(String lmItemCategory) {
            this.lmItemCategory = lmItemCategory;
            return this;
        }
        public String getLmItemCategory() {
            return this.lmItemCategory;
        }

        public QueryItemDetailResponseBodyModel setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryItemDetailResponseBodyModel setMainPicUrl(String mainPicUrl) {
            this.mainPicUrl = mainPicUrl;
            return this;
        }
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        public QueryItemDetailResponseBodyModel setMinPrice(Long minPrice) {
            this.minPrice = minPrice;
            return this;
        }
        public Long getMinPrice() {
            return this.minPrice;
        }

        public QueryItemDetailResponseBodyModel setProperties(java.util.Map<String, java.util.List<String>> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, java.util.List<String>> getProperties() {
            return this.properties;
        }

        public QueryItemDetailResponseBodyModel setProv(String prov) {
            this.prov = prov;
            return this;
        }
        public String getProv() {
            return this.prov;
        }

        public QueryItemDetailResponseBodyModel setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public QueryItemDetailResponseBodyModel setReservedPrice(Long reservedPrice) {
            this.reservedPrice = reservedPrice;
            return this;
        }
        public Long getReservedPrice() {
            return this.reservedPrice;
        }

        public QueryItemDetailResponseBodyModel setSimpleQuantity(String simpleQuantity) {
            this.simpleQuantity = simpleQuantity;
            return this;
        }
        public String getSimpleQuantity() {
            return this.simpleQuantity;
        }

        public QueryItemDetailResponseBodyModel setSkuModels(java.util.List<QueryItemDetailResponseBodyModelSkuModels> skuModels) {
            this.skuModels = skuModels;
            return this;
        }
        public java.util.List<QueryItemDetailResponseBodyModelSkuModels> getSkuModels() {
            return this.skuModels;
        }

        public QueryItemDetailResponseBodyModel setSkuPropertys(java.util.List<QueryItemDetailResponseBodyModelSkuPropertys> skuPropertys) {
            this.skuPropertys = skuPropertys;
            return this;
        }
        public java.util.List<QueryItemDetailResponseBodyModelSkuPropertys> getSkuPropertys() {
            return this.skuPropertys;
        }

        public QueryItemDetailResponseBodyModel setThirdPartyItemId(String thirdPartyItemId) {
            this.thirdPartyItemId = thirdPartyItemId;
            return this;
        }
        public String getThirdPartyItemId() {
            return this.thirdPartyItemId;
        }

        public QueryItemDetailResponseBodyModel setThirdPartyName(String thirdPartyName) {
            this.thirdPartyName = thirdPartyName;
            return this;
        }
        public String getThirdPartyName() {
            return this.thirdPartyName;
        }

        public QueryItemDetailResponseBodyModel setVideoPicUrl(String videoPicUrl) {
            this.videoPicUrl = videoPicUrl;
            return this;
        }
        public String getVideoPicUrl() {
            return this.videoPicUrl;
        }

        public QueryItemDetailResponseBodyModel setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

        public QueryItemDetailResponseBodyModel setVirtualItemType(String virtualItemType) {
            this.virtualItemType = virtualItemType;
            return this;
        }
        public String getVirtualItemType() {
            return this.virtualItemType;
        }

    }

}
