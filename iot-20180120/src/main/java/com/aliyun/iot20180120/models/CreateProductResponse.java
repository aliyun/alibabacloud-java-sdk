// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateProductResponse extends TeaModel {
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

    @NameInMap("ProductKey")
    @Validation(required = true)
    public String productKey;

    @NameInMap("Data")
    @Validation(required = true)
    public CreateProductResponseData data;

    public static CreateProductResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProductResponse self = new CreateProductResponse();
        return TeaModel.build(map, self);
    }

    public CreateProductResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateProductResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateProductResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateProductResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateProductResponse setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateProductResponse setData(CreateProductResponseData data) {
        this.data = data;
        return this;
    }
    public CreateProductResponseData getData() {
        return this.data;
    }

    public static class CreateProductResponseData extends TeaModel {
        @NameInMap("DataFormat")
        @Validation(required = true)
        public Integer dataFormat;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("NodeType")
        @Validation(required = true)
        public Integer nodeType;

        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("ProductName")
        @Validation(required = true)
        public String productName;

        @NameInMap("AliyunCommodityCode")
        @Validation(required = true)
        public String aliyunCommodityCode;

        @NameInMap("Id2")
        @Validation(required = true)
        public Boolean id2;

        @NameInMap("ProtocolType")
        @Validation(required = true)
        public String protocolType;

        @NameInMap("AuthType")
        @Validation(required = true)
        public String authType;

        @NameInMap("ProductSecret")
        @Validation(required = true)
        public String productSecret;

        public static CreateProductResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateProductResponseData self = new CreateProductResponseData();
            return TeaModel.build(map, self);
        }

        public CreateProductResponseData setDataFormat(Integer dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }
        public Integer getDataFormat() {
            return this.dataFormat;
        }

        public CreateProductResponseData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateProductResponseData setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

        public CreateProductResponseData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public CreateProductResponseData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public CreateProductResponseData setAliyunCommodityCode(String aliyunCommodityCode) {
            this.aliyunCommodityCode = aliyunCommodityCode;
            return this;
        }
        public String getAliyunCommodityCode() {
            return this.aliyunCommodityCode;
        }

        public CreateProductResponseData setId2(Boolean id2) {
            this.id2 = id2;
            return this;
        }
        public Boolean getId2() {
            return this.id2;
        }

        public CreateProductResponseData setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public CreateProductResponseData setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public CreateProductResponseData setProductSecret(String productSecret) {
            this.productSecret = productSecret;
            return this;
        }
        public String getProductSecret() {
            return this.productSecret;
        }

    }

}
