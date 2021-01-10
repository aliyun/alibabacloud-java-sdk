// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ImportThingModelTslRequest extends TeaModel {
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

    @NameInMap("TslStr")
    public String tslStr;

    @NameInMap("TslUrl")
    public String tslUrl;

    @NameInMap("FunctionBlockId")
    public String functionBlockId;

    @NameInMap("FunctionBlockName")
    public String functionBlockName;

    @NameInMap("RealTenantId")
    public String realTenantId;

    @NameInMap("RealTripartiteKey")
    public String realTripartiteKey;

    public static ImportThingModelTslRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportThingModelTslRequest self = new ImportThingModelTslRequest();
        return TeaModel.build(map, self);
    }

    public ImportThingModelTslRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public ImportThingModelTslRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public ImportThingModelTslRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ImportThingModelTslRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ImportThingModelTslRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public ImportThingModelTslRequest setTslStr(String tslStr) {
        this.tslStr = tslStr;
        return this;
    }
    public String getTslStr() {
        return this.tslStr;
    }

    public ImportThingModelTslRequest setTslUrl(String tslUrl) {
        this.tslUrl = tslUrl;
        return this;
    }
    public String getTslUrl() {
        return this.tslUrl;
    }

    public ImportThingModelTslRequest setFunctionBlockId(String functionBlockId) {
        this.functionBlockId = functionBlockId;
        return this;
    }
    public String getFunctionBlockId() {
        return this.functionBlockId;
    }

    public ImportThingModelTslRequest setFunctionBlockName(String functionBlockName) {
        this.functionBlockName = functionBlockName;
        return this;
    }
    public String getFunctionBlockName() {
        return this.functionBlockName;
    }

    public ImportThingModelTslRequest setRealTenantId(String realTenantId) {
        this.realTenantId = realTenantId;
        return this;
    }
    public String getRealTenantId() {
        return this.realTenantId;
    }

    public ImportThingModelTslRequest setRealTripartiteKey(String realTripartiteKey) {
        this.realTripartiteKey = realTripartiteKey;
        return this;
    }
    public String getRealTripartiteKey() {
        return this.realTripartiteKey;
    }

}
