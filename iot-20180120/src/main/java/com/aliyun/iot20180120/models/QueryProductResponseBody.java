// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryProductResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The product information returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public QueryProductResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E4F94B97-1D64-4080-BFD2-67461667AA43</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
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
        /**
         * <p>The type of the product. This parameter indicates whether a Thing Specification Language (TSL) model was used.</p>
         * <p>Valid values:</p>
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
         * <p>The authentication method that was used to connect the devices of the product to IoT Platform. Valid values:</p>
         * <ul>
         * <li><strong>secret</strong>: DeviceSecrets were used to authenticate the devices.</li>
         * <li><strong>id2</strong>: IoT Internet Device ID was used to authenticate the devices.</li>
         * <li><strong>x509</strong>: X.509 certificates were used to authenticate the devices.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>secret</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The identifier of the category to which the product belongs.</p>
         * <p>This parameter is returned if the product uses the TSL model of a standard category that is pre-defined by IoT Platform.</p>
         * <p>This parameter is available if the AliyunCommodityCode parameter is set to iothub_senior.</p>
         * 
         * <strong>example:</strong>
         * <p>Lighting</p>
         */
        @NameInMap("CategoryKey")
        public String categoryKey;

        /**
         * <p>The name of the product category.</p>
         * <p>This parameter is returned if the product uses the TSL model of a standard category that is pre-defined by IoT Platform.</p>
         * <p>This parameter is available if the AliyunCommodityCode parameter is set to iothub_senior.</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The data format that was used by a communication protocol to transmit data between the devices and IoT Platform. This parameter is available if the AliyunCommodityCode parameter is set to iothub_senior.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: custom. A custom serial data format was used. In this case, the device can submit raw data, such as binary data streams. IoT Platform converts the raw data into standard Alink JSON data by using a specified data parsing script.</li>
         * <li><strong>1</strong>: Alink JSON. Alink JSON data is transmitted between the devices and IoT Platform. Alink is a data exchange protocol that is pre-defined by IoT Platform.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DataFormat")
        public Integer dataFormat;

        /**
         * <p>The description of the product.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The number of devices under the product.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeviceCount")
        public Integer deviceCount;

        /**
         * <p>The time when the product was created. The value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1581595942000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>Indicates whether IoT Internet Device ID was enabled. Valid values:</p>
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
         * <p>The network connection method. Valid values:</p>
         * <ul>
         * <li><strong>3</strong>: Wi-Fi.</li>
         * <li><strong>6</strong>: cellular network (2G/3G/4G/5G).</li>
         * <li><strong>7</strong>: Ethernet.</li>
         * <li><strong>8</strong>: others.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("NetType")
        public Integer netType;

        /**
         * <p>The node type of the product. This parameter is available if the AliyunCommodityCode parameter is set to iothub_senior. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: device. Sub-devices cannot be attached to a device. A device can connect to IoT Platform directly or as a sub-device of a gateway.</li>
         * <li><strong>1</strong>: gateway. Sub-devices can be attached to a gateway. A gateway can manage sub-devices, maintain the topological relationships with sub-devices, and synchronize the topological relationships to IoT Platform.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NodeType")
        public Integer nodeType;

        /**
         * <p>Indicates whether the operation was called by the owner of the product.</p>
         * <ul>
         * <li><strong>true</strong>: yes.</li>
         * <li><strong>false</strong>: no.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Owner")
        public Boolean owner;

        /**
         * <p>The ProductKey of the product. When you create a product, a ProductKey is the globally unique identifier (GUID) that is issued by IoT Platform to the product.</p>
         * 
         * <strong>example:</strong>
         * <p>a1T27vz****</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The name of the product.</p>
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
         * <p>The status of the product.</p>
         * <ul>
         * <li><strong>DEVELOPMENT_STATUS</strong>: The product is being developed.</li>
         * <li><strong>RELEASE_STATUS</strong>: The product was published.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DEVELOPMENT_STATUS</p>
         */
        @NameInMap("ProductStatus")
        public String productStatus;

        /**
         * <p>The type of the protocol that was used by the sub-devices to connect with a gateway.</p>
         * <p>This parameter is available if the AliyunCommodityCode parameter is set to iothub_senior and the NodeType parameter is set to 1. Valid values:</p>
         * <ul>
         * <li><strong>modbus</strong>: Modbus.</li>
         * <li><strong>opc-ua</strong>: OPC UA.</li>
         * <li><strong>customize</strong>: custom protocol.</li>
         * <li><strong>ble</strong>: BLE.</li>
         * <li><strong>zigbee</strong>: ZigBee.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>modbus</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The level of the data verification. Valid values:</p>
         * <ul>
         * <li><p><strong>2</strong>: no verification. IoT Platform does not verify the data. All data is forwarded.</p>
         * <p>In the IoT Platform console, the data is not displayed on the TSL Data tab of the Device Details page.</p>
         * </li>
         * <li><p><strong>1</strong>: low-level verification. IoT Platform verifies only the identifier and dataType fields of the data. All data is forwarded.</p>
         * </li>
         * <li><p><strong>0</strong>: high-level verification. IoT Platform verifies all fields of the data. Only the data that passes the verification is forwarded.</p>
         * <p>The products that were created before October 14, 2020 support only high-level verification.</p>
         * </li>
         * </ul>
         * <p>The products that were created on October 14, 2020 or later support low-level verification or no verification.</p>
         * <p>After verification, you can view the data that passes or fails the verification.</p>
         * <ul>
         * <li>In the IoT Platform console, the data is displayed on the <strong>TSL Data</strong> tab of the <strong>Device Details</strong> page. The data that fails the verification is not displayed.</li>
         * <li>You can view the data that fails the verification in the <strong>checkFailedData</strong> parameter of the forwarded data. For more information, see <a href="https://help.aliyun.com/document_detail/73736.html">Data formats</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
