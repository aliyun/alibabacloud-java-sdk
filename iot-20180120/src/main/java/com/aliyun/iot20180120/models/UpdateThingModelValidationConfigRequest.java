// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateThingModelValidationConfigRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("ValidateType")
    public Integer validateType;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    public static UpdateThingModelValidationConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateThingModelValidationConfigRequest self = new UpdateThingModelValidationConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateThingModelValidationConfigRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public UpdateThingModelValidationConfigRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public UpdateThingModelValidationConfigRequest setValidateType(Integer validateType) {
        this.validateType = validateType;
        return this;
    }
    public Integer getValidateType() {
        return this.validateType;
    }

    public UpdateThingModelValidationConfigRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateThingModelValidationConfigRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
