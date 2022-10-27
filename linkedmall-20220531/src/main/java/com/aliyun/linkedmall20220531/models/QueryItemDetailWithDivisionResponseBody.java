// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryItemDetailWithDivisionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QueryItemDetailWithDivisionResponseBodyModel model;

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

    public static QueryItemDetailWithDivisionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryItemDetailWithDivisionResponseBody self = new QueryItemDetailWithDivisionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryItemDetailWithDivisionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryItemDetailWithDivisionResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryItemDetailWithDivisionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryItemDetailWithDivisionResponseBody setModel(QueryItemDetailWithDivisionResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryItemDetailWithDivisionResponseBodyModel getModel() {
        return this.model;
    }

    public QueryItemDetailWithDivisionResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryItemDetailWithDivisionResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryItemDetailWithDivisionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryItemDetailWithDivisionResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryItemDetailWithDivisionResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryItemDetailWithDivisionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryItemDetailWithDivisionResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryItemDetailWithDivisionResponseBodyModelSkuModels extends TeaModel {
        @NameInMap("CanNotBeSoldCode")
        public String canNotBeSoldCode;

        @NameInMap("CanNotBeSoldMassage")
        public String canNotBeSoldMassage;

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

        @NameInMap("ReservePrice")
        public Long reservePrice;

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

        @NameInMap("SupplierPrice")
        public Long supplierPrice;

        public static QueryItemDetailWithDivisionResponseBodyModelSkuModels build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailWithDivisionResponseBodyModelSkuModels self = new QueryItemDetailWithDivisionResponseBodyModelSkuModels();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailWithDivisionResponseBodyModelSkuModels setCanNotBeSoldCode(String canNotBeSoldCode) {
            this.canNotBeSoldCode = canNotBeSoldCode;
            return this;
        }
        public String getCanNotBeSoldCode() {
            return this.canNotBeSoldCode;
        }

        public QueryItemDetailWithDivisionResponseBodyModelSkuModels setCanNotBeSoldMassage(String canNotBeSoldMassage) {
            this.canNotBeSoldMassage = canNotBeSoldMassage;
            return this;
        }
        public String getCanNotBeSoldMassage() {
            return this.canNotBeSoldMassage;
        }

        public QueryItemDetailWithDivisionResponseBodyModelSkuModels setCustomizedAttributeMap(java.util.Map<String, String> customizedAttributeMap) {
            this.customizedAttributeMap = customizedAttributeMap;
            return this;
        }
        public java.util.Map<String, String> getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

        public QueryItemDetailWithDivisionResponseBodyModelSkuModels setDistributionMallId(String distributionMallId) {
            this.distributionMallId = distributionMallId;
            return this;
        }
        public String getDistributionMallId() {
            return this.distributionMallId;
        }

        public QueryItemDetailWithDivisionResponseBodyModelSkuModels setExtJson(String extJson) {
            this.extJson = extJson;
            return this;
        }
        public String getExtJson() {
            return this.extJson;
        }

        public QueryItemDetailWithDivisionResponseBodyModelSkuModels setHasQuantity(Boolean hasQuantity) {
            this.hasQuantity = hasQuantity;
            return this;
        }
        public Boolean getHasQuantity() {
            return this.hasQuantity;
        }

        public QueryItemDetailWithDivisionResponseBodyModelSkuModels setInvoiceType(Integer invoiceType) {
            this.invoiceType = invoiceType;
            return this;
        }
        public Integer getInvoiceType() {
            return this.invoiceType;
        }

        public QueryItemDetailWithDivisionResponseBodyModelSkuModels setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryItemDetailWithDivisionResponseBodyModelSkuModels setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryItemDetailWithDivisionResponseBodyModelSkuModels setLmSkuAttributeMap(java.util.Map<String, String> lmSkuAttributeMap) {
            this.lmSkuAttributeMap = lmSkuAttributeMap;
            return this;
        }
        public java.util.Map<String, String> getLmSkuAttributeMap() {
            return this.lmSkuAttributeMap;
        }

        public QueryItemDetailWithDivisionResponseBodyModelSkuModels setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryItemDetailWithDivisionResponseBodyModelSkuModels setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public QueryItemDetailWithDivisionResponseBodyModelSkuModels setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public QueryItemDetailWithDivisionResponseBodyModelSkuModels setSimpleQuantity(String simpleQuantity) {
            this.simpleQuantity = simpleQuantity;
            return this;
        }
        public String getSimpleQuantity() {
            return this.simpleQuantity;
        }

        public QueryItemDetailWithDivisionResponseBodyModelSkuModels setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryItemDetailWithDivisionResponseBodyModelSkuModels setSkuPicUrl(String skuPicUrl) {
            this.skuPicUrl = skuPicUrl;
            return this;
        }
        public String getSkuPicUrl() {
            return this.skuPicUrl;
        }

        public QueryItemDetailWithDivisionResponseBodyModelSkuModels setSkuPvs(String skuPvs) {
            this.skuPvs = skuPvs;
            return this;
        }
        public String getSkuPvs() {
            return this.skuPvs;
        }

        public QueryItemDetailWithDivisionResponseBodyModelSkuModels setSkuTitle(String skuTitle) {
            this.skuTitle = skuTitle;
            return this;
        }
        public String getSkuTitle() {
            return this.skuTitle;
        }

        public QueryItemDetailWithDivisionResponseBodyModelSkuModels setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryItemDetailWithDivisionResponseBodyModelSkuModels setSupplierPrice(Long supplierPrice) {
            this.supplierPrice = supplierPrice;
            return this;
        }
        public Long getSupplierPrice() {
            return this.supplierPrice;
        }

    }

    public static class QueryItemDetailWithDivisionResponseBodyModelSkuPropertysValues extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Text")
        public String text;

        public static QueryItemDetailWithDivisionResponseBodyModelSkuPropertysValues build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailWithDivisionResponseBodyModelSkuPropertysValues self = new QueryItemDetailWithDivisionResponseBodyModelSkuPropertysValues();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailWithDivisionResponseBodyModelSkuPropertysValues setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryItemDetailWithDivisionResponseBodyModelSkuPropertysValues setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class QueryItemDetailWithDivisionResponseBodyModelSkuPropertys extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Text")
        public String text;

        @NameInMap("Values")
        public java.util.List<QueryItemDetailWithDivisionResponseBodyModelSkuPropertysValues> values;

        public static QueryItemDetailWithDivisionResponseBodyModelSkuPropertys build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailWithDivisionResponseBodyModelSkuPropertys self = new QueryItemDetailWithDivisionResponseBodyModelSkuPropertys();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailWithDivisionResponseBodyModelSkuPropertys setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryItemDetailWithDivisionResponseBodyModelSkuPropertys setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QueryItemDetailWithDivisionResponseBodyModelSkuPropertys setValues(java.util.List<QueryItemDetailWithDivisionResponseBodyModelSkuPropertysValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<QueryItemDetailWithDivisionResponseBodyModelSkuPropertysValues> getValues() {
            return this.values;
        }

    }

    public static class QueryItemDetailWithDivisionResponseBodyModel extends TeaModel {
        @NameInMap("CanNotBeSoldCode")
        public String canNotBeSoldCode;

        @NameInMap("CanNotBeSoldMassage")
        public String canNotBeSoldMassage;

        @NameInMap("CanSell")
        public Boolean canSell;

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

        @NameInMap("ReservePrice")
        public Long reservePrice;

        @NameInMap("SecuredTransactions")
        public Integer securedTransactions;

        @NameInMap("SellerPayPostfee")
        public Boolean sellerPayPostfee;

        @NameInMap("SimpleQuantity")
        public String simpleQuantity;

        @NameInMap("SkuModels")
        public java.util.List<QueryItemDetailWithDivisionResponseBodyModelSkuModels> skuModels;

        @NameInMap("SkuPropertys")
        public java.util.List<QueryItemDetailWithDivisionResponseBodyModelSkuPropertys> skuPropertys;

        @NameInMap("ThirdPartyItemId")
        public String thirdPartyItemId;

        @NameInMap("ThirdPartyName")
        public String thirdPartyName;

        @NameInMap("UserType")
        public Integer userType;

        @NameInMap("VideoPicUrl")
        public String videoPicUrl;

        @NameInMap("VideoUrl")
        public String videoUrl;

        @NameInMap("VirtualItemType")
        public String virtualItemType;

        public static QueryItemDetailWithDivisionResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailWithDivisionResponseBodyModel self = new QueryItemDetailWithDivisionResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailWithDivisionResponseBodyModel setCanNotBeSoldCode(String canNotBeSoldCode) {
            this.canNotBeSoldCode = canNotBeSoldCode;
            return this;
        }
        public String getCanNotBeSoldCode() {
            return this.canNotBeSoldCode;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setCanNotBeSoldMassage(String canNotBeSoldMassage) {
            this.canNotBeSoldMassage = canNotBeSoldMassage;
            return this;
        }
        public String getCanNotBeSoldMassage() {
            return this.canNotBeSoldMassage;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setCategoryIds(java.util.List<Long> categoryIds) {
            this.categoryIds = categoryIds;
            return this;
        }
        public java.util.List<Long> getCategoryIds() {
            return this.categoryIds;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setCurrent(String current) {
            this.current = current;
            return this;
        }
        public String getCurrent() {
            return this.current;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setCustomizedAttributeMap(java.util.Map<String, String> customizedAttributeMap) {
            this.customizedAttributeMap = customizedAttributeMap;
            return this;
        }
        public java.util.Map<String, String> getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setDescOption(String descOption) {
            this.descOption = descOption;
            return this;
        }
        public String getDescOption() {
            return this.descOption;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setDescPath(String descPath) {
            this.descPath = descPath;
            return this;
        }
        public String getDescPath() {
            return this.descPath;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setDistributionMallId(String distributionMallId) {
            this.distributionMallId = distributionMallId;
            return this;
        }
        public String getDistributionMallId() {
            return this.distributionMallId;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setFeatures(java.util.Map<String, String> features) {
            this.features = features;
            return this;
        }
        public java.util.Map<String, String> getFeatures() {
            return this.features;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setFirstPicUrl(String firstPicUrl) {
            this.firstPicUrl = firstPicUrl;
            return this;
        }
        public String getFirstPicUrl() {
            return this.firstPicUrl;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setHasQuantity(Boolean hasQuantity) {
            this.hasQuantity = hasQuantity;
            return this;
        }
        public Boolean getHasQuantity() {
            return this.hasQuantity;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setIforestProps(java.util.List<java.util.Map<String, String>> iforestProps) {
            this.iforestProps = iforestProps;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getIforestProps() {
            return this.iforestProps;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setInvoiceType(Integer invoiceType) {
            this.invoiceType = invoiceType;
            return this;
        }
        public Integer getInvoiceType() {
            return this.invoiceType;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setItemImages(java.util.List<String> itemImages) {
            this.itemImages = itemImages;
            return this;
        }
        public java.util.List<String> getItemImages() {
            return this.itemImages;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setItemTotalSimpleValue(String itemTotalSimpleValue) {
            this.itemTotalSimpleValue = itemTotalSimpleValue;
            return this;
        }
        public String getItemTotalSimpleValue() {
            return this.itemTotalSimpleValue;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setItemTotalValue(Integer itemTotalValue) {
            this.itemTotalValue = itemTotalValue;
            return this;
        }
        public Integer getItemTotalValue() {
            return this.itemTotalValue;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setLmItemAttributeMap(java.util.Map<String, String> lmItemAttributeMap) {
            this.lmItemAttributeMap = lmItemAttributeMap;
            return this;
        }
        public java.util.Map<String, String> getLmItemAttributeMap() {
            return this.lmItemAttributeMap;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setLmItemCategory(String lmItemCategory) {
            this.lmItemCategory = lmItemCategory;
            return this;
        }
        public String getLmItemCategory() {
            return this.lmItemCategory;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setMainPicUrl(String mainPicUrl) {
            this.mainPicUrl = mainPicUrl;
            return this;
        }
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setMinPrice(Long minPrice) {
            this.minPrice = minPrice;
            return this;
        }
        public Long getMinPrice() {
            return this.minPrice;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setProperties(java.util.Map<String, java.util.List<String>> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, java.util.List<String>> getProperties() {
            return this.properties;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setProv(String prov) {
            this.prov = prov;
            return this;
        }
        public String getProv() {
            return this.prov;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setSecuredTransactions(Integer securedTransactions) {
            this.securedTransactions = securedTransactions;
            return this;
        }
        public Integer getSecuredTransactions() {
            return this.securedTransactions;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setSellerPayPostfee(Boolean sellerPayPostfee) {
            this.sellerPayPostfee = sellerPayPostfee;
            return this;
        }
        public Boolean getSellerPayPostfee() {
            return this.sellerPayPostfee;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setSimpleQuantity(String simpleQuantity) {
            this.simpleQuantity = simpleQuantity;
            return this;
        }
        public String getSimpleQuantity() {
            return this.simpleQuantity;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setSkuModels(java.util.List<QueryItemDetailWithDivisionResponseBodyModelSkuModels> skuModels) {
            this.skuModels = skuModels;
            return this;
        }
        public java.util.List<QueryItemDetailWithDivisionResponseBodyModelSkuModels> getSkuModels() {
            return this.skuModels;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setSkuPropertys(java.util.List<QueryItemDetailWithDivisionResponseBodyModelSkuPropertys> skuPropertys) {
            this.skuPropertys = skuPropertys;
            return this;
        }
        public java.util.List<QueryItemDetailWithDivisionResponseBodyModelSkuPropertys> getSkuPropertys() {
            return this.skuPropertys;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setThirdPartyItemId(String thirdPartyItemId) {
            this.thirdPartyItemId = thirdPartyItemId;
            return this;
        }
        public String getThirdPartyItemId() {
            return this.thirdPartyItemId;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setThirdPartyName(String thirdPartyName) {
            this.thirdPartyName = thirdPartyName;
            return this;
        }
        public String getThirdPartyName() {
            return this.thirdPartyName;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setVideoPicUrl(String videoPicUrl) {
            this.videoPicUrl = videoPicUrl;
            return this;
        }
        public String getVideoPicUrl() {
            return this.videoPicUrl;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

        public QueryItemDetailWithDivisionResponseBodyModel setVirtualItemType(String virtualItemType) {
            this.virtualItemType = virtualItemType;
            return this;
        }
        public String getVirtualItemType() {
            return this.virtualItemType;
        }

    }

}
