// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class ListProductResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListProductResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Long total;

    public static ListProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductResponseBody self = new ListProductResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProductResponseBody setData(java.util.List<ListProductResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListProductResponseBodyData> getData() {
        return this.data;
    }

    public ListProductResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListProductResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProductResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListProductResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProductResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListProductResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListProductResponseBodyData extends TeaModel {
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

        public static ListProductResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProductResponseBodyData self = new ListProductResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProductResponseBodyData setChineseName(String chineseName) {
            this.chineseName = chineseName;
            return this;
        }
        public String getChineseName() {
            return this.chineseName;
        }

        public ListProductResponseBodyData setCurrentPrice(String currentPrice) {
            this.currentPrice = currentPrice;
            return this;
        }
        public String getCurrentPrice() {
            return this.currentPrice;
        }

        public ListProductResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProductResponseBodyData setEnglishName(String englishName) {
            this.englishName = englishName;
            return this;
        }
        public String getEnglishName() {
            return this.englishName;
        }

        public ListProductResponseBodyData setIconText(String iconText) {
            this.iconText = iconText;
            return this;
        }
        public String getIconText() {
            return this.iconText;
        }

        public ListProductResponseBodyData setOriginalPrice(String originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public String getOriginalPrice() {
            return this.originalPrice;
        }

        public ListProductResponseBodyData setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ListProductResponseBodyData setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public ListProductResponseBodyData setTemperature(String temperature) {
            this.temperature = temperature;
            return this;
        }
        public String getTemperature() {
            return this.temperature;
        }

    }

}
