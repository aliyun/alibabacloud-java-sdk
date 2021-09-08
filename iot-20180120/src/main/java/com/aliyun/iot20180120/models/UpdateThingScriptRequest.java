// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateThingScriptRequest extends TeaModel {
    @NameInMap("ScriptContent")
    @Validation(required = true)
    public String scriptContent;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    @Validation(required = true)
    public String productKey;

    @NameInMap("ScriptType")
    @Validation(required = true)
    public String scriptType;

    public static UpdateThingScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateThingScriptRequest self = new UpdateThingScriptRequest();
        return TeaModel.build(map, self);
    }

    public UpdateThingScriptRequest setScriptContent(String scriptContent) {
        this.scriptContent = scriptContent;
        return this;
    }
    public String getScriptContent() {
        return this.scriptContent;
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

    public UpdateThingScriptRequest setScriptType(String scriptType) {
        this.scriptType = scriptType;
        return this;
    }
    public String getScriptType() {
        return this.scriptType;
    }

}
