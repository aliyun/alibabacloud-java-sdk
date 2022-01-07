// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteOTAModuleRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ModuleName")
    public String moduleName;

    @NameInMap("ProductKey")
    public String productKey;

    public static DeleteOTAModuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOTAModuleRequest self = new DeleteOTAModuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOTAModuleRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteOTAModuleRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public DeleteOTAModuleRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
