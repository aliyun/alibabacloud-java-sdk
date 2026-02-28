// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteThingModelRequest extends TeaModel {
    @NameInMap("EventIdentifier")
    public java.util.List<String> eventIdentifier;

    @NameInMap("FunctionBlockId")
    public String functionBlockId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("PropertyIdentifier")
    public java.util.List<String> propertyIdentifier;

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
