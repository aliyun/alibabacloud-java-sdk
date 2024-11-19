// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteThingModelRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OfflineAlert</p>
     */
    @NameInMap("EventIdentifier")
    public java.util.List<String> eventIdentifier;

    /**
     * <p>The identifier of the custom TSL module. Each identifier is unique in a product.</p>
     * <ul>
     * <li>If you configure the BatteryModule parameter when a value is specified for the <strong>PropertyIdentifier.N</strong>, <strong>ServiceIdentifier.N</strong>, or <strong>EventIdentifier.N</strong> parameter, the operation removes one or more specified features from the specified custom TSL module. If you do not configure the BatteryModule parameter, the operation removes one or more specified features from the default TSL module.</li>
     * <li>If you configure the BatteryModule parameter when the <strong>PropertyIdentifier.N</strong>, <strong>ServiceIdentifier.N</strong>, and <strong>EventIdentifier.N</strong> parameters are empty, the operation removes all features from the specified custom TSL module.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BatteryModule</p>
     */
    @NameInMap("FunctionBlockId")
    public String functionBlockId;

    /**
     * <p>The ID of the instance. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</li>
     * <li>If no <strong>Overview</strong> page or ID is generated for your instance, you do not need to configure this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-0pp1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ProductKey of the product.</p>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <strong>example:</strong>
     * <p>Temperature</p>
     */
    @NameInMap("PropertyIdentifier")
    public java.util.List<String> propertyIdentifier;

    /**
     * <p>The ID of the resource group.</p>
     * <blockquote>
     * <p> You cannot configure this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm4l5tcwd****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>Set</p>
     */
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
