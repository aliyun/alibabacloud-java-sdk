// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateThingScriptRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("ScriptContent")
    public String scriptContent;

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
