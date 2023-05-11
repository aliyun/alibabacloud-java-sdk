// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateThingScriptRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can view the **ID** of the instance on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must specify this parameter. Otherwise, the call fails.</p>
     * <p>>*   If the **Overview** page does not appear in the console or no ID is generated for your instance, you do not need to specify this parameter.</p>
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
     * <p>The language of the script. Valid values:</p>
     * <br>
     * <p>*   JavaScript</p>
     * <p>*   Python\_27: Python 2.7</p>
     * <p>*   PHP\_72: PHP 7.2</p>
     */
    @NameInMap("ScriptType")
    public String scriptType;

    public static CreateThingScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateThingScriptRequest self = new CreateThingScriptRequest();
        return TeaModel.build(map, self);
    }

    public CreateThingScriptRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateThingScriptRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateThingScriptRequest setScriptContent(String scriptContent) {
        this.scriptContent = scriptContent;
        return this;
    }
    public String getScriptContent() {
        return this.scriptContent;
    }

    public CreateThingScriptRequest setScriptType(String scriptType) {
        this.scriptType = scriptType;
        return this;
    }
    public String getScriptType() {
        return this.scriptType;
    }

}
