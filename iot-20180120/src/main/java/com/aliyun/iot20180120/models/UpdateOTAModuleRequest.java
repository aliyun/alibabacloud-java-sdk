// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateOTAModuleRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("AliasName")
    public String aliasName;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ModuleName")
    public String moduleName;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("ProductKey")
    public String productKey;

    public static UpdateOTAModuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOTAModuleRequest self = new UpdateOTAModuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOTAModuleRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public UpdateOTAModuleRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
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
