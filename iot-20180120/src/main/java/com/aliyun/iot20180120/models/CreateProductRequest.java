// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateProductRequest extends TeaModel {
    /**
     * <p>The edition of the product.</p>
     * <br>
     * <p>*   If you do not configure this parameter, a product of the Basic Edition is automatically created. You cannot use a TSL model to define the product.</p>
     * <p>*   If you want to configure this parameter, set the value to **iothub_senior**. A product that supports TSL models is created. You must also configure the **DataFormat** parameter.</p>
     */
    @NameInMap("AliyunCommodityCode")
    public String aliyunCommodityCode;

    /**
     * <p>The verification method that is used to connect the devices of the product to IoT Platform.</p>
     * <br>
     * <p>You do not need to configure this parameter. **secret**: uses DeviceSecrets to verify the devices. Default value: secret. For more information, see [MQTT connections over TCP](~~73742~~).</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>The identifier of the product category. If you configure this parameter, a TSL model of the product category is used. Otherwise, no TSL model is used.</p>
     * <br>
     * <p>You can call the [ListThingTemplates](~~150316~~) operation to query the details of product categories that are predefined by IoT Platform and obtain category keys.</p>
     */
    @NameInMap("CategoryKey")
    public String categoryKey;

    /**
     * <p>The data format.</p>
     * <br>
     * <p>If the **AliyunCommodityCode** parameter is set to **iothub_senior**, you must configure this parameter.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   **0**: custom data format.</p>
     * <p>*   **1**: Alink JSON format.</p>
     */
    @NameInMap("DataFormat")
    public Integer dataFormat;

    /**
     * <p>The description of the product. The description can be up to 100 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>You do not need to configure this parameter.</p>
     */
    @NameInMap("Id2")
    public Boolean id2;

    /**
     * <p>The ID of the instance. You can view the **ID** of the instance on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <br>
     * <p>**Important**</p>
     * <br>
     * <p>*   If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</p>
     * <p>*   If no **Overview** page or ID is generated for your instance, you do not need to configure this parameter.</p>
     * <br>
     * <p>For more information about the instance, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>You do not need to configure this parameter.</p>
     */
    @NameInMap("JoinPermissionId")
    public String joinPermissionId;

    /**
     * <p>The network connection method.</p>
     * <br>
     * <p>If the **AliyunCommodityCode** parameter is set to **iothub_senior** and the devices of the product are directly connected devices or gateways, you must configure this parameter.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   **WIFI**: Wi-Fi.</p>
     * <p>*   **CELLULAR**: cellular network.</p>
     * <p>*   **ETHERNET**: Ethernet.</p>
     * <p>*   **OTHER**: other networks.</p>
     * <br>
     * <p>Default value: WIFI.</p>
     */
    @NameInMap("NetType")
    public String netType;

    /**
     * <p>The node type of the product. Valid values:</p>
     * <br>
     * <p>*   **0**: device. Sub-devices cannot be attached to a device. A device can be directly connected to IoT Platform or connected to IoT Platform as a sub-device of a gateway. If you use the device as a sub-device, you must also configure the **ProtocolType** parameter.</p>
     * <p>*   **1**: gateway. Sub-devices can be attached to a gateway. A gateway can manage sub-devices, maintain topological relationships with sub-devices, and synchronize topological relationships to IoT Platform.</p>
     */
    @NameInMap("NodeType")
    public Integer nodeType;

    /**
     * <p>The name of the product.</p>
     * <br>
     * <p>The name must be 4 to 30 characters in length, and can contain letters, digits, and underscores (\_).</p>
     * <br>
     * <br>
     * <p>**Important** Each product name must be unique within the current instance.</p>
     */
    @NameInMap("ProductName")
    public String productName;

    /**
     * <p>The protocol used by the devices of the product to connect to the gateway.</p>
     * <br>
     * <p>If the **AliyunCommodityCode** parameter is set to **iothub_senior** and a gateway is required to connect the devices of the product to IoT Platform, you must configure this parameter.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   **modbus**: Modbus.</p>
     * <p>*   **opc-ua**: Open Platform Communication Unified Architecture (OPC UA).</p>
     * <p>*   **customize**: custom protocol.</p>
     * <p>*   **ble**: Bluetooth Low Energy (BLE).</p>
     * <p>*   **zigbee**: ZigBee.</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>Specifies whether to publish the TSL model after the product is created.</p>
     * <br>
     * <p>*   **true**: publishes the TSL model after the product is created.</p>
     * <p>*   **false**: does not publish the TSL model after the product is created.</p>
     * <br>
     * <p>Default value: **true**.</p>
     */
    @NameInMap("PublishAuto")
    public Boolean publishAuto;

    /**
     * <p>The ID of the resource group to which the product belongs. If you specify a value for this parameter, the product is added to the resource group.</p>
     * <br>
     * <p>You can log on to the [Resource Management console](https://resourcemanager.console.aliyun.com/resource-groups) to view the ID of the resource group.</p>
     * <br>
     * <br>
     * <p>**Important**</p>
     * <br>
     * <p>You can specify a value for this parameter only if you have activated Resource Management.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The level of data verification. If you do not configure this parameter, the default value is used. Valid values:</p>
     * <br>
     * <p>*   **1**: weak verification. Default value: 1. IoT Platform verifies only the identifier and dataType fields of the data. All data is forwarded.</p>
     * <br>
     * <p>    In the IoT Platform console, the data is displayed on the **TSL Data** tab of the **Device Details** page. The data that fails to be verified is not displayed.</p>
     * <br>
     * <p>    You can view the data that failed to be verified in the **checkFailedData** parameter of the forwarded data. For more information, see [Data formats](~~73736~~).</p>
     * <br>
     * <p>*   **2**: no verification. IoT Platform does not verify the data. All data is forwarded.</p>
     * <br>
     * <p>    In the IoT Platform console, the data is not displayed on the **TSL Data** tab of the **Device Details** page.</p>
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
