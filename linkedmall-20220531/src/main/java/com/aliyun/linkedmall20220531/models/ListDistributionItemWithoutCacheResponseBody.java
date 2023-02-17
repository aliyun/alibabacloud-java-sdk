// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ListDistributionItemWithoutCacheResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<ListDistributionItemWithoutCacheResponseBodyModel> model;

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

    public static ListDistributionItemWithoutCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDistributionItemWithoutCacheResponseBody self = new ListDistributionItemWithoutCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDistributionItemWithoutCacheResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDistributionItemWithoutCacheResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public ListDistributionItemWithoutCacheResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDistributionItemWithoutCacheResponseBody setModel(java.util.List<ListDistributionItemWithoutCacheResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<ListDistributionItemWithoutCacheResponseBodyModel> getModel() {
        return this.model;
    }

    public ListDistributionItemWithoutCacheResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDistributionItemWithoutCacheResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDistributionItemWithoutCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDistributionItemWithoutCacheResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public ListDistributionItemWithoutCacheResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public ListDistributionItemWithoutCacheResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDistributionItemWithoutCacheResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDistributionItemWithoutCacheResponseBodyModelSkuModels extends TeaModel {
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

        @NameInMap("IsCanNotBeSoldCode")
        public String isCanNotBeSoldCode;

        @NameInMap("IsCanNotBeSoldMessage")
        public String isCanNotBeSoldMessage;

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

        @NameInMap("SupplierPrice")
        public Long supplierPrice;

        public static ListDistributionItemWithoutCacheResponseBodyModelSkuModels build(java.util.Map<String, ?> map) throws Exception {
            ListDistributionItemWithoutCacheResponseBodyModelSkuModels self = new ListDistributionItemWithoutCacheResponseBodyModelSkuModels();
            return TeaModel.build(map, self);
        }

        public ListDistributionItemWithoutCacheResponseBodyModelSkuModels setCustomizedAttributeMap(java.util.Map<String, String> customizedAttributeMap) {
            this.customizedAttributeMap = customizedAttributeMap;
            return this;
        }
        public java.util.Map<String, String> getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

        public ListDistributionItemWithoutCacheResponseBodyModelSkuModels setDistributionMallId(String distributionMallId) {
            this.distributionMallId = distributionMallId;
            return this;
        }
        public String getDistributionMallId() {
            return this.distributionMallId;
        }

        public ListDistributionItemWithoutCacheResponseBodyModelSkuModels setExtJson(String extJson) {
            this.extJson = extJson;
            return this;
        }
        public String getExtJson() {
            return this.extJson;
        }

        public ListDistributionItemWithoutCacheResponseBodyModelSkuModels setHasQuantity(Boolean hasQuantity) {
            this.hasQuantity = hasQuantity;
            return this;
        }
        public Boolean getHasQuantity() {
            return this.hasQuantity;
        }

        public ListDistributionItemWithoutCacheResponseBodyModelSkuModels setInvoiceType(Integer invoiceType) {
            this.invoiceType = invoiceType;
            return this;
        }
        public Integer getInvoiceType() {
            return this.invoiceType;
        }

        public ListDistributionItemWithoutCacheResponseBodyModelSkuModels setIsCanNotBeSoldCode(String isCanNotBeSoldCode) {
            this.isCanNotBeSoldCode = isCanNotBeSoldCode;
            return this;
        }
        public String getIsCanNotBeSoldCode() {
            return this.isCanNotBeSoldCode;
        }

        public ListDistributionItemWithoutCacheResponseBodyModelSkuModels setIsCanNotBeSoldMessage(String isCanNotBeSoldMessage) {
            this.isCanNotBeSoldMessage = isCanNotBeSoldMessage;
            return this;
        }
        public String getIsCanNotBeSoldMessage() {
            return this.isCanNotBeSoldMessage;
        }

        public ListDistributionItemWithoutCacheResponseBodyModelSkuModels setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public ListDistributionItemWithoutCacheResponseBodyModelSkuModels setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public ListDistributionItemWithoutCacheResponseBodyModelSkuModels setLmSkuAttributeMap(java.util.Map<String, String> lmSkuAttributeMap) {
            this.lmSkuAttributeMap = lmSkuAttributeMap;
            return this;
        }
        public java.util.Map<String, String> getLmSkuAttributeMap() {
            return this.lmSkuAttributeMap;
        }

        public ListDistributionItemWithoutCacheResponseBodyModelSkuModels setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public ListDistributionItemWithoutCacheResponseBodyModelSkuModels setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public ListDistributionItemWithoutCacheResponseBodyModelSkuModels setReservedPrice(Long reservedPrice) {
            this.reservedPrice = reservedPrice;
            return this;
        }
        public Long getReservedPrice() {
            return this.reservedPrice;
        }

        public ListDistributionItemWithoutCacheResponseBodyModelSkuModels setSimpleQuantity(String simpleQuantity) {
            this.simpleQuantity = simpleQuantity;
            return this;
        }
        public String getSimpleQuantity() {
            return this.simpleQuantity;
        }

        public ListDistributionItemWithoutCacheResponseBodyModelSkuModels setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public ListDistributionItemWithoutCacheResponseBodyModelSkuModels setSkuPicUrl(String skuPicUrl) {
            this.skuPicUrl = skuPicUrl;
            return this;
        }
        public String getSkuPicUrl() {
            return this.skuPicUrl;
        }

        public ListDistributionItemWithoutCacheResponseBodyModelSkuModels setSkuPvs(String skuPvs) {
            this.skuPvs = skuPvs;
            return this;
        }
        public String getSkuPvs() {
            return this.skuPvs;
        }

        public ListDistributionItemWithoutCacheResponseBodyModelSkuModels setSkuTitle(String skuTitle) {
            this.skuTitle = skuTitle;
            return this;
        }
        public String getSkuTitle() {
            return this.skuTitle;
        }

        public ListDistributionItemWithoutCacheResponseBodyModelSkuModels setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListDistributionItemWithoutCacheResponseBodyModelSkuModels setSupplierPrice(Long supplierPrice) {
            this.supplierPrice = supplierPrice;
            return this;
        }
        public Long getSupplierPrice() {
            return this.supplierPrice;
        }

    }

    public static class ListDistributionItemWithoutCacheResponseBodyModelSkuPropertysValues extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Text")
        public String text;

        public static ListDistributionItemWithoutCacheResponseBodyModelSkuPropertysValues build(java.util.Map<String, ?> map) throws Exception {
            ListDistributionItemWithoutCacheResponseBodyModelSkuPropertysValues self = new ListDistributionItemWithoutCacheResponseBodyModelSkuPropertysValues();
            return TeaModel.build(map, self);
        }

        public ListDistributionItemWithoutCacheResponseBodyModelSkuPropertysValues setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDistributionItemWithoutCacheResponseBodyModelSkuPropertysValues setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class ListDistributionItemWithoutCacheResponseBodyModelSkuPropertys extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Text")
        public String text;

        @NameInMap("Values")
        public java.util.List<ListDistributionItemWithoutCacheResponseBodyModelSkuPropertysValues> values;

        public static ListDistributionItemWithoutCacheResponseBodyModelSkuPropertys build(java.util.Map<String, ?> map) throws Exception {
            ListDistributionItemWithoutCacheResponseBodyModelSkuPropertys self = new ListDistributionItemWithoutCacheResponseBodyModelSkuPropertys();
            return TeaModel.build(map, self);
        }

        public ListDistributionItemWithoutCacheResponseBodyModelSkuPropertys setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDistributionItemWithoutCacheResponseBodyModelSkuPropertys setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public ListDistributionItemWithoutCacheResponseBodyModelSkuPropertys setValues(java.util.List<ListDistributionItemWithoutCacheResponseBodyModelSkuPropertysValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<ListDistributionItemWithoutCacheResponseBodyModelSkuPropertysValues> getValues() {
            return this.values;
        }

    }

    public static class ListDistributionItemWithoutCacheResponseBodyModel extends TeaModel {
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

        @NameInMap("IsCanNotBeSoldCode")
        public String isCanNotBeSoldCode;

        @NameInMap("IsCanNotBeSoldMessage")
        public String isCanNotBeSoldMessage;

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

        @NameInMap("SecuredTransactions")
        public Integer securedTransactions;

        @NameInMap("SimpleQuantity")
        public String simpleQuantity;

        @NameInMap("SkuModels")
        public java.util.List<ListDistributionItemWithoutCacheResponseBodyModelSkuModels> skuModels;

        @NameInMap("SkuPropertys")
        public java.util.List<ListDistributionItemWithoutCacheResponseBodyModelSkuPropertys> skuPropertys;

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

        public static ListDistributionItemWithoutCacheResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ListDistributionItemWithoutCacheResponseBodyModel self = new ListDistributionItemWithoutCacheResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setCategoryIds(java.util.List<Long> categoryIds) {
            this.categoryIds = categoryIds;
            return this;
        }
        public java.util.List<Long> getCategoryIds() {
            return this.categoryIds;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setCurrent(String current) {
            this.current = current;
            return this;
        }
        public String getCurrent() {
            return this.current;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setCustomizedAttributeMap(java.util.Map<String, String> customizedAttributeMap) {
            this.customizedAttributeMap = customizedAttributeMap;
            return this;
        }
        public java.util.Map<String, String> getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setDescOption(String descOption) {
            this.descOption = descOption;
            return this;
        }
        public String getDescOption() {
            return this.descOption;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setDescPath(String descPath) {
            this.descPath = descPath;
            return this;
        }
        public String getDescPath() {
            return this.descPath;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setDistributionMallId(String distributionMallId) {
            this.distributionMallId = distributionMallId;
            return this;
        }
        public String getDistributionMallId() {
            return this.distributionMallId;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setFeatures(java.util.Map<String, String> features) {
            this.features = features;
            return this;
        }
        public java.util.Map<String, String> getFeatures() {
            return this.features;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setFirstPicUrl(String firstPicUrl) {
            this.firstPicUrl = firstPicUrl;
            return this;
        }
        public String getFirstPicUrl() {
            return this.firstPicUrl;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setHasQuantity(Boolean hasQuantity) {
            this.hasQuantity = hasQuantity;
            return this;
        }
        public Boolean getHasQuantity() {
            return this.hasQuantity;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setIforestProps(java.util.List<java.util.Map<String, String>> iforestProps) {
            this.iforestProps = iforestProps;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getIforestProps() {
            return this.iforestProps;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setInvoiceType(Integer invoiceType) {
            this.invoiceType = invoiceType;
            return this;
        }
        public Integer getInvoiceType() {
            return this.invoiceType;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setIsCanNotBeSoldCode(String isCanNotBeSoldCode) {
            this.isCanNotBeSoldCode = isCanNotBeSoldCode;
            return this;
        }
        public String getIsCanNotBeSoldCode() {
            return this.isCanNotBeSoldCode;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setIsCanNotBeSoldMessage(String isCanNotBeSoldMessage) {
            this.isCanNotBeSoldMessage = isCanNotBeSoldMessage;
            return this;
        }
        public String getIsCanNotBeSoldMessage() {
            return this.isCanNotBeSoldMessage;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setIsCanSell(Boolean isCanSell) {
            this.isCanSell = isCanSell;
            return this;
        }
        public Boolean getIsCanSell() {
            return this.isCanSell;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setIsSellerPayPostfee(Boolean isSellerPayPostfee) {
            this.isSellerPayPostfee = isSellerPayPostfee;
            return this;
        }
        public Boolean getIsSellerPayPostfee() {
            return this.isSellerPayPostfee;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setItemImages(java.util.List<String> itemImages) {
            this.itemImages = itemImages;
            return this;
        }
        public java.util.List<String> getItemImages() {
            return this.itemImages;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setItemTotalSimpleValue(String itemTotalSimpleValue) {
            this.itemTotalSimpleValue = itemTotalSimpleValue;
            return this;
        }
        public String getItemTotalSimpleValue() {
            return this.itemTotalSimpleValue;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setItemTotalValue(Integer itemTotalValue) {
            this.itemTotalValue = itemTotalValue;
            return this;
        }
        public Integer getItemTotalValue() {
            return this.itemTotalValue;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setLmItemAttributeMap(java.util.Map<String, String> lmItemAttributeMap) {
            this.lmItemAttributeMap = lmItemAttributeMap;
            return this;
        }
        public java.util.Map<String, String> getLmItemAttributeMap() {
            return this.lmItemAttributeMap;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setLmItemCategory(String lmItemCategory) {
            this.lmItemCategory = lmItemCategory;
            return this;
        }
        public String getLmItemCategory() {
            return this.lmItemCategory;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setMainPicUrl(String mainPicUrl) {
            this.mainPicUrl = mainPicUrl;
            return this;
        }
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setMinPrice(Long minPrice) {
            this.minPrice = minPrice;
            return this;
        }
        public Long getMinPrice() {
            return this.minPrice;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setProperties(java.util.Map<String, java.util.List<String>> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, java.util.List<String>> getProperties() {
            return this.properties;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setProv(String prov) {
            this.prov = prov;
            return this;
        }
        public String getProv() {
            return this.prov;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setReservedPrice(Long reservedPrice) {
            this.reservedPrice = reservedPrice;
            return this;
        }
        public Long getReservedPrice() {
            return this.reservedPrice;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setSecuredTransactions(Integer securedTransactions) {
            this.securedTransactions = securedTransactions;
            return this;
        }
        public Integer getSecuredTransactions() {
            return this.securedTransactions;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setSimpleQuantity(String simpleQuantity) {
            this.simpleQuantity = simpleQuantity;
            return this;
        }
        public String getSimpleQuantity() {
            return this.simpleQuantity;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setSkuModels(java.util.List<ListDistributionItemWithoutCacheResponseBodyModelSkuModels> skuModels) {
            this.skuModels = skuModels;
            return this;
        }
        public java.util.List<ListDistributionItemWithoutCacheResponseBodyModelSkuModels> getSkuModels() {
            return this.skuModels;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setSkuPropertys(java.util.List<ListDistributionItemWithoutCacheResponseBodyModelSkuPropertys> skuPropertys) {
            this.skuPropertys = skuPropertys;
            return this;
        }
        public java.util.List<ListDistributionItemWithoutCacheResponseBodyModelSkuPropertys> getSkuPropertys() {
            return this.skuPropertys;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setThirdPartyItemId(String thirdPartyItemId) {
            this.thirdPartyItemId = thirdPartyItemId;
            return this;
        }
        public String getThirdPartyItemId() {
            return this.thirdPartyItemId;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setThirdPartyName(String thirdPartyName) {
            this.thirdPartyName = thirdPartyName;
            return this;
        }
        public String getThirdPartyName() {
            return this.thirdPartyName;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setVideoPicUrl(String videoPicUrl) {
            this.videoPicUrl = videoPicUrl;
            return this;
        }
        public String getVideoPicUrl() {
            return this.videoPicUrl;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

        public ListDistributionItemWithoutCacheResponseBodyModel setVirtualItemType(String virtualItemType) {
            this.virtualItemType = virtualItemType;
            return this;
        }
        public String getVirtualItemType() {
            return this.virtualItemType;
        }

    }

}
