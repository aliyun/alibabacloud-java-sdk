// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateProductRequest extends TeaModel {
    /**
     * <p>The edition of the product.</p>
     * <ul>
     * <li>If you do not configure this parameter, a product of the Basic Edition is automatically created. You cannot use a TSL model to define the product.</li>
     * <li>If you want to configure this parameter, set the value to <strong>iothub_senior</strong>. A product that supports TSL models is created. You must also configure the <strong>DataFormat</strong> parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>iothub_senior</p>
     */
    @NameInMap("AliyunCommodityCode")
    public String aliyunCommodityCode;

    /**
     * <p>The verification method that is used to connect the devices of the product to IoT Platform.</p>
     * <p>You do not need to configure this parameter. <strong>secret</strong>: uses DeviceSecrets to verify the devices. Default value: secret. For more information, see <a href="https://help.aliyun.com/document_detail/73742.html">MQTT connections over TCP</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>secret</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>The identifier of the product category. If you configure this parameter, a TSL model of the product category is used. Otherwise, no TSL model is used.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/150316.html">ListThingTemplates</a> operation to query the details of product categories that are predefined by IoT Platform and obtain category keys.</p>
     * 
     * <strong>example:</strong>
     * <p>Lighting</p>
     */
    @NameInMap("CategoryKey")
    public String categoryKey;

    /**
     * <p>The data format.</p>
     * <p>If the <strong>AliyunCommodityCode</strong> parameter is set to <strong>iothub_senior</strong>, you must configure this parameter.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: custom data format.</li>
     * <li><strong>1</strong>: Alink JSON format.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DataFormat")
    public Integer dataFormat;

    /**
     * <p>The description of the product. The description can be up to 100 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Product test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>You do not need to configure this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Id2")
    public Boolean id2;

    /**
     * <p>The ID of the instance. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <p><strong>Important</strong></p>
     * <ul>
     * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</li>
     * <li>If no <strong>Overview</strong> page or ID is generated for your instance, you do not need to configure this parameter.</li>
     * </ul>
     * <p>For more information about the instance, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-<em><strong>-v64</strong></em></p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>You do not need to configure this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>8***</p>
     */
    @NameInMap("JoinPermissionId")
    public String joinPermissionId;

    /**
     * <p>The network connection method.</p>
     * <p>If the <strong>AliyunCommodityCode</strong> parameter is set to <strong>iothub_senior</strong> and the devices of the product are directly connected devices or gateways, you must configure this parameter.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>WIFI</strong>: Wi-Fi.</li>
     * <li><strong>CELLULAR</strong>: cellular network.</li>
     * <li><strong>ETHERNET</strong>: Ethernet.</li>
     * <li><strong>OTHER</strong>: other networks.</li>
     * </ul>
     * <p>Default value: WIFI.</p>
     * 
     * <strong>example:</strong>
     * <p>WIFI</p>
     */
    @NameInMap("NetType")
    public String netType;

    /**
     * <p>The node type of the product. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: device. Sub-devices cannot be attached to a device. A device can be directly connected to IoT Platform or connected to IoT Platform as a sub-device of a gateway. If you use the device as a sub-device, you must also configure the <strong>ProtocolType</strong> parameter.</li>
     * <li><strong>1</strong>: gateway. Sub-devices can be attached to a gateway. A gateway can manage sub-devices, maintain topological relationships with sub-devices, and synchronize topological relationships to IoT Platform.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NodeType")
    public Integer nodeType;

    /**
     * <p>The name of the product.</p>
     * <p>The name must be 4 to 30 characters in length, and can contain letters, digits, and underscores (_).</p>
     * <p><strong>Important</strong> Each product name must be unique within the current instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Light</p>
     */
    @NameInMap("ProductName")
    public String productName;

    /**
     * <p>The protocol used by the devices of the product to connect to the gateway.</p>
     * <p>If the <strong>AliyunCommodityCode</strong> parameter is set to <strong>iothub_senior</strong> and a gateway is required to connect the devices of the product to IoT Platform, you must configure this parameter.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>modbus</strong>: Modbus.</li>
     * <li><strong>opc-ua</strong>: Open Platform Communication Unified Architecture (OPC UA).</li>
     * <li><strong>customize</strong>: custom protocol.</li>
     * <li><strong>ble</strong>: Bluetooth Low Energy (BLE).</li>
     * <li><strong>zigbee</strong>: ZigBee.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>modbus</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>Specifies whether to publish the TSL model after the product is created.</p>
     * <ul>
     * <li><strong>true</strong>: publishes the TSL model after the product is created.</li>
     * <li><strong>false</strong>: does not publish the TSL model after the product is created.</li>
     * </ul>
     * <p>Default value: <strong>true</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PublishAuto")
    public Boolean publishAuto;

    /**
     * <p>The ID of the resource group to which the product belongs. If you specify a value for this parameter, the product is added to the resource group.</p>
     * <p>You can log on to the <a href="https://resourcemanager.console.aliyun.com/resource-groups">Resource Management console</a> to view the ID of the resource group.</p>
     * <p><strong>Important</strong></p>
     * <p>You can specify a value for this parameter only if you have activated Resource Management.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph***</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The level of data verification. If you do not configure this parameter, the default value is used. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: weak verification. Default value: 1. IoT Platform verifies only the identifier and dataType fields of the data. All data is forwarded.</p>
     * <p>In the IoT Platform console, the data is displayed on the <strong>TSL Data</strong> tab of the <strong>Device Details</strong> page. The data that fails to be verified is not displayed.</p>
     * <p>You can view the data that failed to be verified in the <strong>checkFailedData</strong> parameter of the forwarded data. For more information, see <a href="https://help.aliyun.com/document_detail/73736.html">Data formats</a>.</p>
     * </li>
     * <li><p><strong>2</strong>: no verification. IoT Platform does not verify the data. All data is forwarded.</p>
     * <p>In the IoT Platform console, the data is not displayed on the <strong>TSL Data</strong> tab of the <strong>Device Details</strong> page.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ValidateType")
    public Integer validateType;

    public static CreateProductRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductRequest self = new CreateProductRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductRequest setAliyunCommodityCode(String aliyunCommodityCode) {
        this.aliyunCommodityCode = aliyunCommodityCode;
        return this;
    }
    public String getAliyunCommodityCode() {
        return this.aliyunCommodityCode;
    }

    public CreateProductRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public CreateProductRequest setCategoryKey(String categoryKey) {
        this.categoryKey = categoryKey;
        return this;
    }
    public String getCategoryKey() {
        return this.categoryKey;
    }

    public CreateProductRequest setDataFormat(Integer dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public Integer getDataFormat() {
        return this.dataFormat;
    }

    public CreateProductRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProductRequest setId2(Boolean id2) {
        this.id2 = id2;
        return this;
    }
    public Boolean getId2() {
        return this.id2;
    }

    public CreateProductRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateProductRequest setJoinPermissionId(String joinPermissionId) {
        this.joinPermissionId = joinPermissionId;
        return this;
    }
    public String getJoinPermissionId() {
        return this.joinPermissionId;
    }

    public CreateProductRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public CreateProductRequest setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public Integer getNodeType() {
        return this.nodeType;
    }

    public CreateProductRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public CreateProductRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public CreateProductRequest setPublishAuto(Boolean publishAuto) {
        this.publishAuto = publishAuto;
        return this;
    }
    public Boolean getPublishAuto() {
        return this.publishAuto;
    }

    public CreateProductRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateProductRequest setValidateType(Integer validateType) {
        this.validateType = validateType;
        return this;
    }
    public Integer getValidateType() {
        return this.validateType;
    }

}
