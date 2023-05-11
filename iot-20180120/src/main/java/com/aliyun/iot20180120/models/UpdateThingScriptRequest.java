// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateThingScriptRequest extends TeaModel {
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
     * <p>The **ProductKey** of the product.</p>
     * <br>
     * <p>You can view the **ProductKey** on the Product Details page of the IoT Platform console. You can also obtain the ProductKey by calling the [QueryProductList](~~69271~~) operation.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The content of the script. You must specify this parameter.</p>
     * <br>
     * <p>For more information about script examples, see [What is data parsing](~~68702~~).</p>
     */
    @NameInMap("ScriptContent")
    public String scriptContent;

    /**
     * <p>The type of the script. Valid values:</p>
     * <br>
     * <p>*   JavaScript</p>
     * <p>*   Python\_27: Python 2.7</p>
     * <p>*   PHP\_72: PHP 7.2</p>
     */
    @NameInMap("ScriptType")
    public String scriptType;

    public static UpdateThingScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateThingScriptRequest self = new UpdateThingScriptRequest();
        return TeaModel.build(map, self);
    }

    public UpdateThingScriptRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateThingScriptRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public UpdateThingScriptRequest setScriptContent(String scriptContent) {
        this.scriptContent = scriptContent;
        return this;
    }
    public String getScriptContent() {
        return this.scriptContent;
    }

    public UpdateThingScriptRequest setScriptType(String scriptType) {
        this.scriptType = scriptType;
        return this;
    }
    public String getScriptType() {
        return this.scriptType;
    }

}
