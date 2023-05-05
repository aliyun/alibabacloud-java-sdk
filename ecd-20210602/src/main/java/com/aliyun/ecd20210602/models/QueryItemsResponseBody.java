// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class QueryItemsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryItemsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryItemsResponseBody self = new QueryItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryItemsResponseBody setData(java.util.List<QueryItemsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryItemsResponseBodyData> getData() {
        return this.data;
    }

    public QueryItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryItemsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryItemsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryItemsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryItemsResponseBodyDataAppDTO extends TeaModel {
        @NameInMap("CateName")
        public String cateName;

        @NameInMap("Developer")
        public String developer;

        @NameInMap("IconUrl")
        public String iconUrl;

        @NameInMap("LicenseType")
        public Long licenseType;

        @NameInMap("ModifyDate")
        public String modifyDate;

        @NameInMap("Name")
        public String name;

        @NameInMap("PublishDate")
        public String publishDate;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Version")
        public String version;

        public static QueryItemsResponseBodyDataAppDTO build(java.util.Map<String, ?> map) throws Exception {
            QueryItemsResponseBodyDataAppDTO self = new QueryItemsResponseBodyDataAppDTO();
            return TeaModel.build(map, self);
        }

        public QueryItemsResponseBodyDataAppDTO setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public QueryItemsResponseBodyDataAppDTO setDeveloper(String developer) {
            this.developer = developer;
            return this;
        }
        public String getDeveloper() {
            return this.developer;
        }

        public QueryItemsResponseBodyDataAppDTO setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public QueryItemsResponseBodyDataAppDTO setLicenseType(Long licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public Long getLicenseType() {
            return this.licenseType;
        }

        public QueryItemsResponseBodyDataAppDTO setModifyDate(String modifyDate) {
            this.modifyDate = modifyDate;
            return this;
        }
        public String getModifyDate() {
            return this.modifyDate;
        }

        public QueryItemsResponseBodyDataAppDTO setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryItemsResponseBodyDataAppDTO setPublishDate(String publishDate) {
            this.publishDate = publishDate;
            return this;
        }
        public String getPublishDate() {
            return this.publishDate;
        }

        public QueryItemsResponseBodyDataAppDTO setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public QueryItemsResponseBodyDataAppDTO setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryItemsResponseBodyData extends TeaModel {
        @NameInMap("AppDTO")
        public QueryItemsResponseBodyDataAppDTO appDTO;

        @NameInMap("AppId")
        public Long appId;

        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ItemCode")
        public String itemCode;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("Labels")
        public String labels;

        @NameInMap("PaymentType")
        public Long paymentType;

        @NameInMap("PicUrl")
        public String picUrl;

        @NameInMap("Price")
        public String price;

        @NameInMap("RawPrice")
        public String rawPrice;

        @NameInMap("SellerId")
        public Long sellerId;

        public static QueryItemsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryItemsResponseBodyData self = new QueryItemsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryItemsResponseBodyData setAppDTO(QueryItemsResponseBodyDataAppDTO appDTO) {
            this.appDTO = appDTO;
            return this;
        }
        public QueryItemsResponseBodyDataAppDTO getAppDTO() {
            return this.appDTO;
        }

        public QueryItemsResponseBodyData setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public QueryItemsResponseBodyData setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public QueryItemsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryItemsResponseBodyData setItemCode(String itemCode) {
            this.itemCode = itemCode;
            return this;
        }
        public String getItemCode() {
            return this.itemCode;
        }

        public QueryItemsResponseBodyData setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public QueryItemsResponseBodyData setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public QueryItemsResponseBodyData setPaymentType(Long paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public Long getPaymentType() {
            return this.paymentType;
        }

        public QueryItemsResponseBodyData setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public QueryItemsResponseBodyData setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public QueryItemsResponseBodyData setRawPrice(String rawPrice) {
            this.rawPrice = rawPrice;
            return this;
        }
        public String getRawPrice() {
            return this.rawPrice;
        }

        public QueryItemsResponseBodyData setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

    }

}
