// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateProductResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The product information returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public CreateProductResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ProductKey of the product. A ProductKey is a GUID that is issued by IoT Platform to a product.</p>
     * 
     * <strong>example:</strong>
     * <p>a1FlqIQ****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The type of the product.</p>
         * <ul>
         * <li><strong>iothub_senior</strong>: A TSL model was used.</li>
         * <li><strong>iothub</strong>: No TSL model was used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>iothub_senior</p>
         */
        @NameInMap("AliyunCommodityCode")
        public String aliyunCommodityCode;

        /**
         * <p>The authentication method that is used to connect the devices of the product to IoT Platform. Valid values:</p>
         * <ul>
         * <li><strong>secret</strong>: uses DeviceSecrets to verify the devices.</li>
         * <li><strong>id2</strong>: uses IoT Internet Device ID to verify the devices.</li>
         * <li><strong>x509</strong>: uses X.509 certificates to verify the devices.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>secret</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The data format.</p>
         * <ul>
         * <li><strong>0</strong>: custom data format.</li>
         * <li><strong>1</strong>: Alink JSON format.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only if the AliyunCommodityCode parameter is set to iothub_senior.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DataFormat")
        public Integer dataFormat;

        /**
         * <p>The description of the product.</p>
         * 
         * <strong>example:</strong>
         * <p>Product test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether IoT Internet Device ID was enabled.</p>
         * <ul>
         * <li><strong>true</strong>: IoT Internet Device ID was enabled.</li>
         * <li><strong>false</strong>: IoT Internet Device ID was disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Id2")
        public Boolean id2;

        /**
         * <p>The node type of the product. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: device. Sub-devices cannot be attached to a device. A device can be directly connected to IoT Platform or connected to IoT Platform as a sub-device of a gateway.</li>
         * <li><strong>1</strong>: gateway. Sub-devices can be attached to a gateway. A gateway can manage sub-devices, maintain topological relationships with sub-devices, and synchronize topological relationships to IoT Platform.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is available only if the AliyunCommodityCode parameter is set to iothub_senior.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NodeType")
        public Integer nodeType;

        /**
         * <p>The ProductKey of the product. A ProductKey is a globally unique identifier (GUID) issued by IoT Platform to a new product.</p>
         * <blockquote>
         * <p> Secure the <strong>ProductKey</strong> of the product. The ProductKey is required when you perform specific operations.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>a1FlqIQ****</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The name of the product.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The ProductSecret of the product.</p>
         * 
         * <strong>example:</strong>
         * <p>U5tW7i44uilc****</p>
         */
        @NameInMap("ProductSecret")
        public String productSecret;

        /**
         * <p>The protocol used by the devices of the product to connect to the gateway.</p>
         * <blockquote>
         * <p> This parameter is available only if the AliyunCommodityCode parameter is set to iothub_senior.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>modbus</p>
         */
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
