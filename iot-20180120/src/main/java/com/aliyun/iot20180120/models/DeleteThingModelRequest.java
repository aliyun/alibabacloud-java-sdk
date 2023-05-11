// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteThingModelRequest extends TeaModel {
    @NameInMap("EventIdentifier")
    public java.util.List<String> eventIdentifier;

    /**
     * <p>The identifier of the custom TSL module. Each identifier is unique in a product.</p>
     * <br>
     * <p>*   If you configure the BatteryModule parameter when a value is specified for the **PropertyIdentifier.N**, **ServiceIdentifier.N**, or **EventIdentifier.N** parameter, the operation removes one or more specified features from the specified custom TSL module. If you do not configure the BatteryModule parameter, the operation removes one or more specified features from the default TSL module.</p>
     * <p>*   If you configure the BatteryModule parameter when the **PropertyIdentifier.N**, **ServiceIdentifier.N**, and **EventIdentifier.N** parameters are empty, the operation removes all features from the specified custom TSL module.</p>
     */
    @NameInMap("FunctionBlockId")
    public String functionBlockId;

    /**
     * <p>The ID of the instance. You can view the **ID** of the instance on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</p>
     * <p>>*   If no **Overview** page or ID is generated for your instance, you do not need to configure this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ProductKey of the product.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("PropertyIdentifier")
    public java.util.List<String> propertyIdentifier;

    /**
     * <p>The ID of the resource group.</p>
     * <br>
     * <p>>  You cannot configure this parameter.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ServiceIdentifier")
    public java.util.List<String> serviceIdentifier;

    public static DeleteThingModelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteThingModelRequest self = new DeleteThingModelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteThingModelRequest setEventIdentifier(java.util.List<String> eventIdentifier) {
        this.eventIdentifier = eventIdentifier;
        return this;
    }
    public java.util.List<String> getEventIdentifier() {
        return this.eventIdentifier;
    }

    public DeleteThingModelRequest setFunctionBlockId(String functionBlockId) {
        this.functionBlockId = functionBlockId;
        return this;
    }
    public String getFunctionBlockId() {
        return this.functionBlockId;
    }

    public DeleteThingModelRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteThingModelRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public DeleteThingModelRequest setPropertyIdentifier(java.util.List<String> propertyIdentifier) {
        this.propertyIdentifier = propertyIdentifier;
        return this;
    }
    public java.util.List<String> getPropertyIdentifier() {
        return this.propertyIdentifier;
    }

    public DeleteThingModelRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DeleteThingModelRequest setServiceIdentifier(java.util.List<String> serviceIdentifier) {
        this.serviceIdentifier = serviceIdentifier;
        return this;
    }
    public java.util.List<String> getServiceIdentifier() {
        return this.serviceIdentifier;
    }

}
