// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateOTAModuleRequest extends TeaModel {
    /**
     * <p>The new alias of the OTA module. The alias must be 1 to 64 characters in length, and can contain letters, digits, periods(.), hyphens (-), and underscores (_).</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>The new description of the OTA module. The description can be up to 100 characters in length.</p>
     */
    @NameInMap("Desc")
    public String desc;

    /**
     * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
     * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-0pp1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The name of the OTA module.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>barcodeScanner</p>
     */
    @NameInMap("ModuleName")
    public String moduleName;

    /**
     * <p>The <strong>ProductKey</strong> of the product to which the OTA module belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1Le6d0****</p>
     */
    @NameInMap("ProductKey")
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

    public UpdateOTAModuleRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
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

    public UpdateOTAModuleRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
