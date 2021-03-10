// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateOTAModuleRequest extends TeaModel {
    @NameInMap("AliasName")
    public String aliasName;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ModuleName")
    @Validation(required = true)
    public String moduleName;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("ProductKey")
    @Validation(required = true)
    public String productKey;

    public static UpdateOTAModuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOTAModuleRequest self = new UpdateOTAModuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOTAModuleRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public UpdateOTAModuleRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateOTAModuleRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public UpdateOTAModuleRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public UpdateOTAModuleRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
