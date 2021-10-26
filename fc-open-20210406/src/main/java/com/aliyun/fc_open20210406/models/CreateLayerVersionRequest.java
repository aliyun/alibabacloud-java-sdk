// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateLayerVersionRequest extends TeaModel {
    @NameInMap("Code")
    public Code code;

    @NameInMap("compatibleRuntime")
    public java.util.List<String> compatibleRuntime;

    @NameInMap("description")
    public String description;

    public static CreateLayerVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLayerVersionRequest self = new CreateLayerVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateLayerVersionRequest setCode(Code code) {
        this.code = code;
        return this;
    }
    public Code getCode() {
        return this.code;
    }

    public CreateLayerVersionRequest setCompatibleRuntime(java.util.List<String> compatibleRuntime) {
        this.compatibleRuntime = compatibleRuntime;
        return this;
    }
    public java.util.List<String> getCompatibleRuntime() {
        return this.compatibleRuntime;
    }

    public CreateLayerVersionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
