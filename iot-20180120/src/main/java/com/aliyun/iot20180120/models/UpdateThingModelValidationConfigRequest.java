// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateThingModelValidationConfigRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("ValidateType")
    public Integer validateType;

    public static UpdateThingModelValidationConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateThingModelValidationConfigRequest self = new UpdateThingModelValidationConfigRequest();
        return TeaModel.build(map, self);
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

    public UpdateThingModelValidationConfigRequest setValidateType(Integer validateType) {
        this.validateType = validateType;
        return this;
    }
    public Integer getValidateType() {
        return this.validateType;
    }

}
