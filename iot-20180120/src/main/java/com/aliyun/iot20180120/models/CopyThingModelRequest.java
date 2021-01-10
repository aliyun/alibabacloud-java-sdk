// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CopyThingModelRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SourceProductKey")
    public String sourceProductKey;

    @NameInMap("TargetProductKey")
    public String targetProductKey;

    @NameInMap("SourceModelVersion")
    public String sourceModelVersion;

    @NameInMap("RealTenantId")
    public String realTenantId;

    @NameInMap("RealTripartiteKey")
    public String realTripartiteKey;

    public static CopyThingModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyThingModelRequest self = new CopyThingModelRequest();
        return TeaModel.build(map, self);
    }

    public CopyThingModelRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public CopyThingModelRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public CopyThingModelRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CopyThingModelRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CopyThingModelRequest setSourceProductKey(String sourceProductKey) {
        this.sourceProductKey = sourceProductKey;
        return this;
    }
    public String getSourceProductKey() {
        return this.sourceProductKey;
    }

    public CopyThingModelRequest setTargetProductKey(String targetProductKey) {
        this.targetProductKey = targetProductKey;
        return this;
    }
    public String getTargetProductKey() {
        return this.targetProductKey;
    }

    public CopyThingModelRequest setSourceModelVersion(String sourceModelVersion) {
        this.sourceModelVersion = sourceModelVersion;
        return this;
    }
    public String getSourceModelVersion() {
        return this.sourceModelVersion;
    }

    public CopyThingModelRequest setRealTenantId(String realTenantId) {
        this.realTenantId = realTenantId;
        return this;
    }
    public String getRealTenantId() {
        return this.realTenantId;
    }

    public CopyThingModelRequest setRealTripartiteKey(String realTripartiteKey) {
        this.realTripartiteKey = realTripartiteKey;
        return this;
    }
    public String getRealTripartiteKey() {
        return this.realTripartiteKey;
    }

}
