// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class ListMenuDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListMenuDataResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

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
    public Long totalCount;

    public static ListMenuDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMenuDataResponseBody self = new ListMenuDataResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMenuDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMenuDataResponseBody setData(java.util.List<ListMenuDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMenuDataResponseBodyData> getData() {
        return this.data;
    }

    public ListMenuDataResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListMenuDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMenuDataResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMenuDataResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMenuDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMenuDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMenuDataResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListMenuDataResponseBodyDataProductCombineListProductItemListProductInfo extends TeaModel {
        @NameInMap("ChineseName")
        public String chineseName;

        @NameInMap("CurrentPrice")
        public String currentPrice;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnglishName")
        public String englishName;

        @NameInMap("IconText")
        public String iconText;

        @NameInMap("OriginalPrice")
        public String originalPrice;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("Temperature")
        public String temperature;

        public static ListMenuDataResponseBodyDataProductCombineListProductItemListProductInfo build(java.util.Map<String, ?> map) throws Exception {
            ListMenuDataResponseBodyDataProductCombineListProductItemListProductInfo self = new ListMenuDataResponseBodyDataProductCombineListProductItemListProductInfo();
            return TeaModel.build(map, self);
        }

        public ListMenuDataResponseBodyDataProductCombineListProductItemListProductInfo setChineseName(String chineseName) {
            this.chineseName = chineseName;
            return this;
        }
        public String getChineseName() {
            return this.chineseName;
        }

        public ListMenuDataResponseBodyDataProductCombineListProductItemListProductInfo setCurrentPrice(String currentPrice) {
            this.currentPrice = currentPrice;
            return this;
        }
        public String getCurrentPrice() {
            return this.currentPrice;
        }

        public ListMenuDataResponseBodyDataProductCombineListProductItemListProductInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMenuDataResponseBodyDataProductCombineListProductItemListProductInfo setEnglishName(String englishName) {
            this.englishName = englishName;
            return this;
        }
        public String getEnglishName() {
            return this.englishName;
        }

        public ListMenuDataResponseBodyDataProductCombineListProductItemListProductInfo setIconText(String iconText) {
            this.iconText = iconText;
            return this;
        }
        public String getIconText() {
            return this.iconText;
        }

        public ListMenuDataResponseBodyDataProductCombineListProductItemListProductInfo setOriginalPrice(String originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public String getOriginalPrice() {
            return this.originalPrice;
        }

        public ListMenuDataResponseBodyDataProductCombineListProductItemListProductInfo setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ListMenuDataResponseBodyDataProductCombineListProductItemListProductInfo setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public ListMenuDataResponseBodyDataProductCombineListProductItemListProductInfo setTemperature(String temperature) {
            this.temperature = temperature;
            return this;
        }
        public String getTemperature() {
            return this.temperature;
        }

    }

    public static class ListMenuDataResponseBodyDataProductCombineListProductItemList extends TeaModel {
        @NameInMap("Order")
        public Integer order;

        @NameInMap("ProductInfo")
        public ListMenuDataResponseBodyDataProductCombineListProductItemListProductInfo productInfo;

        public static ListMenuDataResponseBodyDataProductCombineListProductItemList build(java.util.Map<String, ?> map) throws Exception {
            ListMenuDataResponseBodyDataProductCombineListProductItemList self = new ListMenuDataResponseBodyDataProductCombineListProductItemList();
            return TeaModel.build(map, self);
        }

        public ListMenuDataResponseBodyDataProductCombineListProductItemList setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public ListMenuDataResponseBodyDataProductCombineListProductItemList setProductInfo(ListMenuDataResponseBodyDataProductCombineListProductItemListProductInfo productInfo) {
            this.productInfo = productInfo;
            return this;
        }
        public ListMenuDataResponseBodyDataProductCombineListProductItemListProductInfo getProductInfo() {
            return this.productInfo;
        }

    }

    public static class ListMenuDataResponseBodyDataProductCombineList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("ProductItemList")
        public java.util.List<ListMenuDataResponseBodyDataProductCombineListProductItemList> productItemList;

        public static ListMenuDataResponseBodyDataProductCombineList build(java.util.Map<String, ?> map) throws Exception {
            ListMenuDataResponseBodyDataProductCombineList self = new ListMenuDataResponseBodyDataProductCombineList();
            return TeaModel.build(map, self);
        }

        public ListMenuDataResponseBodyDataProductCombineList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMenuDataResponseBodyDataProductCombineList setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public ListMenuDataResponseBodyDataProductCombineList setProductItemList(java.util.List<ListMenuDataResponseBodyDataProductCombineListProductItemList> productItemList) {
            this.productItemList = productItemList;
            return this;
        }
        public java.util.List<ListMenuDataResponseBodyDataProductCombineListProductItemList> getProductItemList() {
            return this.productItemList;
        }

    }

    public static class ListMenuDataResponseBodyData extends TeaModel {
        @NameInMap("BatchId")
        public String batchId;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("ProductCombineList")
        public java.util.List<ListMenuDataResponseBodyDataProductCombineList> productCombineList;

        @NameInMap("ProductContainerId")
        public String productContainerId;

        @NameInMap("ShopGroupId")
        public String shopGroupId;

        @NameInMap("ShopIdList")
        public java.util.List<String> shopIdList;

        @NameInMap("Type")
        public String type;

        public static ListMenuDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMenuDataResponseBodyData self = new ListMenuDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMenuDataResponseBodyData setBatchId(String batchId) {
            this.batchId = batchId;
            return this;
        }
        public String getBatchId() {
            return this.batchId;
        }

        public ListMenuDataResponseBodyData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListMenuDataResponseBodyData setProductCombineList(java.util.List<ListMenuDataResponseBodyDataProductCombineList> productCombineList) {
            this.productCombineList = productCombineList;
            return this;
        }
        public java.util.List<ListMenuDataResponseBodyDataProductCombineList> getProductCombineList() {
            return this.productCombineList;
        }

        public ListMenuDataResponseBodyData setProductContainerId(String productContainerId) {
            this.productContainerId = productContainerId;
            return this;
        }
        public String getProductContainerId() {
            return this.productContainerId;
        }

        public ListMenuDataResponseBodyData setShopGroupId(String shopGroupId) {
            this.shopGroupId = shopGroupId;
            return this;
        }
        public String getShopGroupId() {
            return this.shopGroupId;
        }

        public ListMenuDataResponseBodyData setShopIdList(java.util.List<String> shopIdList) {
            this.shopIdList = shopIdList;
            return this;
        }
        public java.util.List<String> getShopIdList() {
            return this.shopIdList;
        }

        public ListMenuDataResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
