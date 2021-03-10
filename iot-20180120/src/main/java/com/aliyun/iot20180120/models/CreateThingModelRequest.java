// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateThingModelRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("ThingModelJson")
    public String thingModelJson;

    @NameInMap("FunctionBlockId")
    public String functionBlockId;

    @NameInMap("FunctionBlockName")
    public String functionBlockName;

    @NameInMap("RealTenantId")
    public String realTenantId;

    @NameInMap("RealTripartiteKey")
    public String realTripartiteKey;

    public static CreateThingModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateThingModelRequest self = new CreateThingModelRequest();
        return TeaModel.build(map, self);
    }

    public CreateThingModelRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public CreateThingModelRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public CreateThingModelRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateThingModelRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateThingModelRequest setThingModelJson(String thingModelJson) {
        this.thingModelJson = thingModelJson;
        return this;
    }
    public String getThingModelJson() {
        return this.thingModelJson;
    }

    public CreateThingModelRequest setFunctionBlockId(String functionBlockId) {
        this.functionBlockId = functionBlockId;
        return this;
    }
    public String getFunctionBlockId() {
        return this.functionBlockId;
    }

    public CreateThingModelRequest setFunctionBlockName(String functionBlockName) {
        this.functionBlockName = functionBlockName;
        return this;
    }
    public String getFunctionBlockName() {
        return this.functionBlockName;
    }

    public CreateThingModelRequest setRealTenantId(String realTenantId) {
        this.realTenantId = realTenantId;
        return this;
    }
    public String getRealTenantId() {
        return this.realTenantId;
    }

    public CreateThingModelRequest setRealTripartiteKey(String realTripartiteKey) {
        this.realTripartiteKey = realTripartiteKey;
        return this;
    }
    public String getRealTripartiteKey() {
        return this.realTripartiteKey;
    }

}
