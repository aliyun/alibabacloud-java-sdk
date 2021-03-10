// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryProductResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryProductResponseData data;

    public static QueryProductResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProductResponse self = new QueryProductResponse();
        return TeaModel.build(map, self);
    }

    public QueryProductResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProductResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryProductResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryProductResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryProductResponse setData(QueryProductResponseData data) {
        this.data = data;
        return this;
    }
    public QueryProductResponseData getData() {
        return this.data;
    }

    public static class QueryProductResponseData extends TeaModel {
        @NameInMap("GmtCreate")
        @Validation(required = true)
        public Long gmtCreate;

        @NameInMap("DataFormat")
        @Validation(required = true)
        public Integer dataFormat;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("DeviceCount")
        @Validation(required = true)
        public Integer deviceCount;

        @NameInMap("NodeType")
        @Validation(required = true)
        public Integer nodeType;

        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("ProductName")
        @Validation(required = true)
        public String productName;

        @NameInMap("ProductSecret")
        @Validation(required = true)
        public String productSecret;

        @NameInMap("CategoryName")
        @Validation(required = true)
        public String categoryName;

        @NameInMap("CategoryKey")
        @Validation(required = true)
        public String categoryKey;

        @NameInMap("AliyunCommodityCode")
        @Validation(required = true)
        public String aliyunCommodityCode;

        @NameInMap("Id2")
        @Validation(required = true)
        public Boolean id2;

        @NameInMap("ProtocolType")
        @Validation(required = true)
        public String protocolType;

        @NameInMap("ProductStatus")
        @Validation(required = true)
        public String productStatus;

        @NameInMap("Owner")
        @Validation(required = true)
        public Boolean owner;

        @NameInMap("NetType")
        @Validation(required = true)
        public Integer netType;

        @NameInMap("AuthType")
        @Validation(required = true)
        public String authType;

        @NameInMap("ValidateType")
        @Validation(required = true)
        public Integer validateType;

        public static QueryProductResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryProductResponseData self = new QueryProductResponseData();
            return TeaModel.build(map, self);
        }

        public QueryProductResponseData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryProductResponseData setDataFormat(Integer dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }
        public Integer getDataFormat() {
            return this.dataFormat;
        }

        public QueryProductResponseData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryProductResponseData setDeviceCount(Integer deviceCount) {
            this.deviceCount = deviceCount;
            return this;
        }
        public Integer getDeviceCount() {
            return this.deviceCount;
        }

        public QueryProductResponseData setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

        public QueryProductResponseData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryProductResponseData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryProductResponseData setProductSecret(String productSecret) {
            this.productSecret = productSecret;
            return this;
        }
        public String getProductSecret() {
            return this.productSecret;
        }

        public QueryProductResponseData setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public QueryProductResponseData setCategoryKey(String categoryKey) {
            this.categoryKey = categoryKey;
            return this;
        }
        public String getCategoryKey() {
            return this.categoryKey;
        }

        public QueryProductResponseData setAliyunCommodityCode(String aliyunCommodityCode) {
            this.aliyunCommodityCode = aliyunCommodityCode;
            return this;
        }
        public String getAliyunCommodityCode() {
            return this.aliyunCommodityCode;
        }

        public QueryProductResponseData setId2(Boolean id2) {
            this.id2 = id2;
            return this;
        }
        public Boolean getId2() {
            return this.id2;
        }

        public QueryProductResponseData setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public QueryProductResponseData setProductStatus(String productStatus) {
            this.productStatus = productStatus;
            return this;
        }
        public String getProductStatus() {
            return this.productStatus;
        }

        public QueryProductResponseData setOwner(Boolean owner) {
            this.owner = owner;
            return this;
        }
        public Boolean getOwner() {
            return this.owner;
        }

        public QueryProductResponseData setNetType(Integer netType) {
            this.netType = netType;
            return this;
        }
        public Integer getNetType() {
            return this.netType;
        }

        public QueryProductResponseData setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public QueryProductResponseData setValidateType(Integer validateType) {
            this.validateType = validateType;
            return this;
        }
        public Integer getValidateType() {
            return this.validateType;
        }

    }

}
