// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateProductResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateProductResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProductResponseBody self = new CreateProductResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProductResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateProductResponseBody setData(CreateProductResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateProductResponseBodyData getData() {
        return this.data;
    }

    public CreateProductResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateProductResponseBody setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateProductResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateProductResponseBodyData extends TeaModel {
        @NameInMap("AliyunCommodityCode")
        public String aliyunCommodityCode;

        @NameInMap("AuthType")
        public String authType;

        @NameInMap("DataFormat")
        public Integer dataFormat;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id2")
        public Boolean id2;

        @NameInMap("NodeType")
        public Integer nodeType;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("ProductSecret")
        public String productSecret;

        @NameInMap("ProtocolType")
        public String protocolType;

        public static CreateProductResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateProductResponseBodyData self = new CreateProductResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateProductResponseBodyData setAliyunCommodityCode(String aliyunCommodityCode) {
            this.aliyunCommodityCode = aliyunCommodityCode;
            return this;
        }
        public String getAliyunCommodityCode() {
            return this.aliyunCommodityCode;
        }

        public CreateProductResponseBodyData setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public CreateProductResponseBodyData setDataFormat(Integer dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }
        public Integer getDataFormat() {
            return this.dataFormat;
        }

        public CreateProductResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateProductResponseBodyData setId2(Boolean id2) {
            this.id2 = id2;
            return this;
        }
        public Boolean getId2() {
            return this.id2;
        }

        public CreateProductResponseBodyData setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

        public CreateProductResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public CreateProductResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public CreateProductResponseBodyData setProductSecret(String productSecret) {
            this.productSecret = productSecret;
            return this;
        }
        public String getProductSecret() {
            return this.productSecret;
        }

        public CreateProductResponseBodyData setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

    }

}
