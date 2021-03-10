// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTAModuleRequest extends TeaModel {
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

    public static CreateOTAModuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOTAModuleRequest self = new CreateOTAModuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateOTAModuleRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public CreateOTAModuleRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateOTAModuleRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public CreateOTAModuleRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateOTAModuleRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
