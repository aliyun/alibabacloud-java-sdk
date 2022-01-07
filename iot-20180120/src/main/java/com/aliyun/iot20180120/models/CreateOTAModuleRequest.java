// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTAModuleRequest extends TeaModel {
    @NameInMap("AliasName")
    public String aliasName;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ModuleName")
    public String moduleName;

    @NameInMap("ProductKey")
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

    public CreateOTAModuleRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
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

    public CreateOTAModuleRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
