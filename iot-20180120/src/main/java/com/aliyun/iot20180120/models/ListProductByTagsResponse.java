// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListProductByTagsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ProductInfos")
    @Validation(required = true)
    public ListProductByTagsResponseProductInfos productInfos;

    public static ListProductByTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductByTagsResponse self = new ListProductByTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListProductByTagsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProductByTagsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListProductByTagsResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListProductByTagsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProductByTagsResponse setProductInfos(ListProductByTagsResponseProductInfos productInfos) {
        this.productInfos = productInfos;
        return this;
    }
    public ListProductByTagsResponseProductInfos getProductInfos() {
        return this.productInfos;
    }

    public static class ListProductByTagsResponseProductInfosProductInfo extends TeaModel {
        @NameInMap("ProductName")
        @Validation(required = true)
        public String productName;

        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("NodeType")
        @Validation(required = true)
        public Integer nodeType;

        public static ListProductByTagsResponseProductInfosProductInfo build(java.util.Map<String, ?> map) throws Exception {
            ListProductByTagsResponseProductInfosProductInfo self = new ListProductByTagsResponseProductInfosProductInfo();
            return TeaModel.build(map, self);
        }

        public ListProductByTagsResponseProductInfosProductInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListProductByTagsResponseProductInfosProductInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListProductByTagsResponseProductInfosProductInfo setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListProductByTagsResponseProductInfosProductInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProductByTagsResponseProductInfosProductInfo setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

    }

    public static class ListProductByTagsResponseProductInfos extends TeaModel {
        @NameInMap("ProductInfo")
        @Validation(required = true)
        public java.util.List<ListProductByTagsResponseProductInfosProductInfo> productInfo;

        public static ListProductByTagsResponseProductInfos build(java.util.Map<String, ?> map) throws Exception {
            ListProductByTagsResponseProductInfos self = new ListProductByTagsResponseProductInfos();
            return TeaModel.build(map, self);
        }

        public ListProductByTagsResponseProductInfos setProductInfo(java.util.List<ListProductByTagsResponseProductInfosProductInfo> productInfo) {
            this.productInfo = productInfo;
            return this;
        }
        public java.util.List<ListProductByTagsResponseProductInfosProductInfo> getProductInfo() {
            return this.productInfo;
        }

    }

}
