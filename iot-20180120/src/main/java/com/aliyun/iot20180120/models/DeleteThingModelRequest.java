// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteThingModelRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("PropertyIdentifier")
    public java.util.List<String> propertyIdentifier;

    @NameInMap("ServiceIdentifier")
    public java.util.List<String> serviceIdentifier;

    @NameInMap("EventIdentifier")
    public java.util.List<String> eventIdentifier;

    @NameInMap("FunctionBlockId")
    public String functionBlockId;

    @NameInMap("IsClearAllFunction")
    public Boolean isClearAllFunction;

    @NameInMap("RealTenantId")
    public String realTenantId;

    @NameInMap("RealTripartiteKey")
    public String realTripartiteKey;

    public static DeleteThingModelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteThingModelRequest self = new DeleteThingModelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteThingModelRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public DeleteThingModelRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public DeleteThingModelRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteThingModelRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public DeleteThingModelRequest setServiceIdentifier(java.util.List<String> serviceIdentifier) {
        this.serviceIdentifier = serviceIdentifier;
        return this;
    }
    public java.util.List<String> getServiceIdentifier() {
        return this.serviceIdentifier;
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

    public DeleteThingModelRequest setIsClearAllFunction(Boolean isClearAllFunction) {
        this.isClearAllFunction = isClearAllFunction;
        return this;
    }
    public Boolean getIsClearAllFunction() {
        return this.isClearAllFunction;
    }

    public DeleteThingModelRequest setRealTenantId(String realTenantId) {
        this.realTenantId = realTenantId;
        return this;
    }
    public String getRealTenantId() {
        return this.realTenantId;
    }

    public DeleteThingModelRequest setRealTripartiteKey(String realTripartiteKey) {
        this.realTripartiteKey = realTripartiteKey;
        return this;
    }
    public String getRealTripartiteKey() {
        return this.realTripartiteKey;
    }

}
