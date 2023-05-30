// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateLayerVersionRequest extends TeaModel {
    /**
     * <p>The name of the layer.</p>
     */
    @NameInMap("Code")
    public Code code;

    /**
     * <p>The name of the runtime. Valid values: **nodejs14**, **nodejs12**, **nodejs10**, **nodejs8**, **nodejs6**, **python3.9**, **python3**, **python2.7**, **java11**, **java8**, **php7.2**, **go1**, **dotnetcore2.1** and **custom**.</p>
     */
    @NameInMap("compatibleRuntime")
    public java.util.List<String> compatibleRuntime;

    /**
     * <p>The name of the layer.</p>
     */
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
