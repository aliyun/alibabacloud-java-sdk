// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListDistributeAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListDistributeAppResponseBodyData> data;

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

    public static ListDistributeAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDistributeAppResponseBody self = new ListDistributeAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDistributeAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDistributeAppResponseBody setData(java.util.List<ListDistributeAppResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDistributeAppResponseBodyData> getData() {
        return this.data;
    }

    public ListDistributeAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDistributeAppResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDistributeAppResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDistributeAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDistributeAppResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDistributeAppResponseBodyData extends TeaModel {
        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("CateName")
        public String cateName;

        @NameInMap("Developer")
        public String developer;

        @NameInMap("DiscountPrice")
        public Long discountPrice;

        @NameInMap("IconUrl")
        public String iconUrl;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsFree")
        public String isFree;

        @NameInMap("Labels")
        public String labels;

        @NameInMap("Name")
        public String name;

        @NameInMap("OriginAppType")
        public String originAppType;

        @NameInMap("OriginalPrice")
        public Long originalPrice;

        @NameInMap("PaymentType")
        public Long paymentType;

        @NameInMap("PublishDate")
        public String publishDate;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Status")
        public String status;

        @NameInMap("Version")
        public String version;

        @NameInMap("WebUrl")
        public String webUrl;

        public static ListDistributeAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDistributeAppResponseBodyData self = new ListDistributeAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDistributeAppResponseBodyData setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public ListDistributeAppResponseBodyData setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public ListDistributeAppResponseBodyData setDeveloper(String developer) {
            this.developer = developer;
            return this;
        }
        public String getDeveloper() {
            return this.developer;
        }

        public ListDistributeAppResponseBodyData setDiscountPrice(Long discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Long getDiscountPrice() {
            return this.discountPrice;
        }

        public ListDistributeAppResponseBodyData setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public ListDistributeAppResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDistributeAppResponseBodyData setIsFree(String isFree) {
            this.isFree = isFree;
            return this;
        }
        public String getIsFree() {
            return this.isFree;
        }

        public ListDistributeAppResponseBodyData setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public ListDistributeAppResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDistributeAppResponseBodyData setOriginAppType(String originAppType) {
            this.originAppType = originAppType;
            return this;
        }
        public String getOriginAppType() {
            return this.originAppType;
        }

        public ListDistributeAppResponseBodyData setOriginalPrice(Long originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Long getOriginalPrice() {
            return this.originalPrice;
        }

        public ListDistributeAppResponseBodyData setPaymentType(Long paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public Long getPaymentType() {
            return this.paymentType;
        }

        public ListDistributeAppResponseBodyData setPublishDate(String publishDate) {
            this.publishDate = publishDate;
            return this;
        }
        public String getPublishDate() {
            return this.publishDate;
        }

        public ListDistributeAppResponseBodyData setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListDistributeAppResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDistributeAppResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListDistributeAppResponseBodyData setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

}
