// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListProductByTagsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("ProductInfos")
    public ListProductByTagsResponseBodyProductInfos productInfos;

    public static ListProductByTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductByTagsResponseBody self = new ListProductByTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductByTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProductByTagsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListProductByTagsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListProductByTagsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProductByTagsResponseBody setProductInfos(ListProductByTagsResponseBodyProductInfos productInfos) {
        this.productInfos = productInfos;
        return this;
    }
    public ListProductByTagsResponseBodyProductInfos getProductInfos() {
        return this.productInfos;
    }

    public static class ListProductByTagsResponseBodyProductInfosProductInfo extends TeaModel {
        @NameInMap("ProductName")
        public String productName;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("NodeType")
        public Integer nodeType;

        public static ListProductByTagsResponseBodyProductInfosProductInfo build(java.util.Map<String, ?> map) throws Exception {
            ListProductByTagsResponseBodyProductInfosProductInfo self = new ListProductByTagsResponseBodyProductInfosProductInfo();
            return TeaModel.build(map, self);
        }

        public ListProductByTagsResponseBodyProductInfosProductInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListProductByTagsResponseBodyProductInfosProductInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListProductByTagsResponseBodyProductInfosProductInfo setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListProductByTagsResponseBodyProductInfosProductInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProductByTagsResponseBodyProductInfosProductInfo setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

    }

    public static class ListProductByTagsResponseBodyProductInfos extends TeaModel {
        @NameInMap("ProductInfo")
        public java.util.List<ListProductByTagsResponseBodyProductInfosProductInfo> productInfo;

        public static ListProductByTagsResponseBodyProductInfos build(java.util.Map<String, ?> map) throws Exception {
            ListProductByTagsResponseBodyProductInfos self = new ListProductByTagsResponseBodyProductInfos();
            return TeaModel.build(map, self);
        }

        public ListProductByTagsResponseBodyProductInfos setProductInfo(java.util.List<ListProductByTagsResponseBodyProductInfosProductInfo> productInfo) {
            this.productInfo = productInfo;
            return this;
        }
        public java.util.List<ListProductByTagsResponseBodyProductInfosProductInfo> getProductInfo() {
            return this.productInfo;
        }

    }

}
