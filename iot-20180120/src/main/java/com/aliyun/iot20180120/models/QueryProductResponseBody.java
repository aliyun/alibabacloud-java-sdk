// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryProductResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryProductResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryProductResponseBody self = new QueryProductResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryProductResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryProductResponseBody setData(QueryProductResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryProductResponseBodyData getData() {
        return this.data;
    }

    public QueryProductResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProductResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryProductResponseBodyData extends TeaModel {
        @NameInMap("AliyunCommodityCode")
        public String aliyunCommodityCode;

        @NameInMap("AuthType")
        public String authType;

        @NameInMap("CategoryKey")
        public String categoryKey;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("DataFormat")
        public Integer dataFormat;

        @NameInMap("Description")
        public String description;

        @NameInMap("DeviceCount")
        public Integer deviceCount;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Id2")
        public Boolean id2;

        @NameInMap("NetType")
        public Integer netType;

        @NameInMap("NodeType")
        public Integer nodeType;

        @NameInMap("Owner")
        public Boolean owner;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("ProductSecret")
        public String productSecret;

        @NameInMap("ProductStatus")
        public String productStatus;

        @NameInMap("ProtocolType")
        public String protocolType;

        @NameInMap("ValidateType")
        public Integer validateType;

        public static QueryProductResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryProductResponseBodyData self = new QueryProductResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryProductResponseBodyData setAliyunCommodityCode(String aliyunCommodityCode) {
            this.aliyunCommodityCode = aliyunCommodityCode;
            return this;
        }
        public String getAliyunCommodityCode() {
            return this.aliyunCommodityCode;
        }

        public QueryProductResponseBodyData setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public QueryProductResponseBodyData setCategoryKey(String categoryKey) {
            this.categoryKey = categoryKey;
            return this;
        }
        public String getCategoryKey() {
            return this.categoryKey;
        }

        public QueryProductResponseBodyData setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public QueryProductResponseBodyData setDataFormat(Integer dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }
        public Integer getDataFormat() {
            return this.dataFormat;
        }

        public QueryProductResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryProductResponseBodyData setDeviceCount(Integer deviceCount) {
            this.deviceCount = deviceCount;
            return this;
        }
        public Integer getDeviceCount() {
            return this.deviceCount;
        }

        public QueryProductResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryProductResponseBodyData setId2(Boolean id2) {
            this.id2 = id2;
            return this;
        }
        public Boolean getId2() {
            return this.id2;
        }

        public QueryProductResponseBodyData setNetType(Integer netType) {
            this.netType = netType;
            return this;
        }
        public Integer getNetType() {
            return this.netType;
        }

        public QueryProductResponseBodyData setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

        public QueryProductResponseBodyData setOwner(Boolean owner) {
            this.owner = owner;
            return this;
        }
        public Boolean getOwner() {
            return this.owner;
        }

        public QueryProductResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryProductResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryProductResponseBodyData setProductSecret(String productSecret) {
            this.productSecret = productSecret;
            return this;
        }
        public String getProductSecret() {
            return this.productSecret;
        }

        public QueryProductResponseBodyData setProductStatus(String productStatus) {
            this.productStatus = productStatus;
            return this;
        }
        public String getProductStatus() {
            return this.productStatus;
        }

        public QueryProductResponseBodyData setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public QueryProductResponseBodyData setValidateType(Integer validateType) {
            this.validateType = validateType;
            return this;
        }
        public Integer getValidateType() {
            return this.validateType;
        }

    }

}
