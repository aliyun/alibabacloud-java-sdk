// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTAModuleRequest extends TeaModel {
    /**
     * <p>The alias of the OTA module. The alias must be 1 to 64 characters in length, and can contain letters, digits, periods(.), hyphens (-), and underscores (\_).</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>The description of the OTA module. The description can be up to 100 characters in length.</p>
     */
    @NameInMap("Desc")
    public String desc;

    /**
     * <p>The ID of the instance. You can view the instance **ID** on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</p>
     * <p>>*   If your instance has no **Overview** page or ID, you do not need to set this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The name of the OTA module. The name is unique in a product and cannot be modified. The name can contain letters, digits, periods (.), hyphens (-), and underscores (\_). The name must be 1 to 64 characters in length.</p>
     * <br>
     * <p>>  Letters are not case-sensitive. For example, you cannot use the module names scanner and Scanner at the same time.</p>
     */
    @NameInMap("ModuleName")
    public String moduleName;

    /**
     * <p>The ProductKey of the product to which the OTA module belongs.</p>
     */
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
