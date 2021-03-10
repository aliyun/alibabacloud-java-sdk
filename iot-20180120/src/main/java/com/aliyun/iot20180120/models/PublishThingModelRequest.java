// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PublishThingModelRequest extends TeaModel {
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

    @NameInMap("ModelVersion")
    public String modelVersion;

    @NameInMap("Description")
    public String description;

    @NameInMap("RealTenantId")
    public String realTenantId;

    @NameInMap("RealTripartiteKey")
    public String realTripartiteKey;

    public static PublishThingModelRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishThingModelRequest self = new PublishThingModelRequest();
        return TeaModel.build(map, self);
    }

    public PublishThingModelRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public PublishThingModelRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public PublishThingModelRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public PublishThingModelRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public PublishThingModelRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public PublishThingModelRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public PublishThingModelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PublishThingModelRequest setRealTenantId(String realTenantId) {
        this.realTenantId = realTenantId;
        return this;
    }
    public String getRealTenantId() {
        return this.realTenantId;
    }

    public PublishThingModelRequest setRealTripartiteKey(String realTripartiteKey) {
        this.realTripartiteKey = realTripartiteKey;
        return this;
    }
    public String getRealTripartiteKey() {
        return this.realTripartiteKey;
    }

}
