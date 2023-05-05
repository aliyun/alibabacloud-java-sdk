// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListSubscribeAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListSubscribeAppResponseBodyData> data;

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

    public static ListSubscribeAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubscribeAppResponseBody self = new ListSubscribeAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubscribeAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSubscribeAppResponseBody setData(java.util.List<ListSubscribeAppResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSubscribeAppResponseBodyData> getData() {
        return this.data;
    }

    public ListSubscribeAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSubscribeAppResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListSubscribeAppResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSubscribeAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSubscribeAppResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListSubscribeAppResponseBodyData extends TeaModel {
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

        public static ListSubscribeAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSubscribeAppResponseBodyData self = new ListSubscribeAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSubscribeAppResponseBodyData setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public ListSubscribeAppResponseBodyData setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public ListSubscribeAppResponseBodyData setDeveloper(String developer) {
            this.developer = developer;
            return this;
        }
        public String getDeveloper() {
            return this.developer;
        }

        public ListSubscribeAppResponseBodyData setDiscountPrice(Long discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Long getDiscountPrice() {
            return this.discountPrice;
        }

        public ListSubscribeAppResponseBodyData setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public ListSubscribeAppResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListSubscribeAppResponseBodyData setIsFree(String isFree) {
            this.isFree = isFree;
            return this;
        }
        public String getIsFree() {
            return this.isFree;
        }

        public ListSubscribeAppResponseBodyData setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public ListSubscribeAppResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSubscribeAppResponseBodyData setOriginalPrice(Long originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Long getOriginalPrice() {
            return this.originalPrice;
        }

        public ListSubscribeAppResponseBodyData setPaymentType(Long paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public Long getPaymentType() {
            return this.paymentType;
        }

        public ListSubscribeAppResponseBodyData setPublishDate(String publishDate) {
            this.publishDate = publishDate;
            return this;
        }
        public String getPublishDate() {
            return this.publishDate;
        }

        public ListSubscribeAppResponseBodyData setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListSubscribeAppResponseBodyData setSubscribeCount(Long subscribeCount) {
            this.subscribeCount = subscribeCount;
            return this;
        }
        public Long getSubscribeCount() {
            return this.subscribeCount;
        }

        public ListSubscribeAppResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
