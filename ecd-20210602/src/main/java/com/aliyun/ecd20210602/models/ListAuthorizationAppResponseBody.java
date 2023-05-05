// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListAuthorizationAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAuthorizationAppResponseBodyData> data;

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

    public static ListAuthorizationAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationAppResponseBody self = new ListAuthorizationAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAuthorizationAppResponseBody setData(java.util.List<ListAuthorizationAppResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAuthorizationAppResponseBodyData> getData() {
        return this.data;
    }

    public ListAuthorizationAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAuthorizationAppResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthorizationAppResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAuthorizationAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthorizationAppResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAuthorizationAppResponseBodyData extends TeaModel {
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

        @NameInMap("OriginalPrice")
        public Long originalPrice;

        @NameInMap("PaymentType")
        public Long paymentType;

        @NameInMap("PublishDate")
        public String publishDate;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("SubscribeCount")
        public Long subscribeCount;

        @NameInMap("Version")
        public String version;

        public static ListAuthorizationAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizationAppResponseBodyData self = new ListAuthorizationAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAuthorizationAppResponseBodyData setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public ListAuthorizationAppResponseBodyData setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public ListAuthorizationAppResponseBodyData setDeveloper(String developer) {
            this.developer = developer;
            return this;
        }
        public String getDeveloper() {
            return this.developer;
        }

        public ListAuthorizationAppResponseBodyData setDiscountPrice(Long discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Long getDiscountPrice() {
            return this.discountPrice;
        }

        public ListAuthorizationAppResponseBodyData setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public ListAuthorizationAppResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAuthorizationAppResponseBodyData setIsFree(String isFree) {
            this.isFree = isFree;
            return this;
        }
        public String getIsFree() {
            return this.isFree;
        }

        public ListAuthorizationAppResponseBodyData setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public ListAuthorizationAppResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAuthorizationAppResponseBodyData setOriginalPrice(Long originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Long getOriginalPrice() {
            return this.originalPrice;
        }

        public ListAuthorizationAppResponseBodyData setPaymentType(Long paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public Long getPaymentType() {
            return this.paymentType;
        }

        public ListAuthorizationAppResponseBodyData setPublishDate(String publishDate) {
            this.publishDate = publishDate;
            return this;
        }
        public String getPublishDate() {
            return this.publishDate;
        }

        public ListAuthorizationAppResponseBodyData setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListAuthorizationAppResponseBodyData setSubscribeCount(Long subscribeCount) {
            this.subscribeCount = subscribeCount;
            return this;
        }
        public Long getSubscribeCount() {
            return this.subscribeCount;
        }

        public ListAuthorizationAppResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
