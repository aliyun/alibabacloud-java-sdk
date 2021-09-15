// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetLogicModelRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ModelId")
    public String modelId;

    @NameInMap("SchemaVersion")
    public String schemaVersion;

    public static GetLogicModelRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogicModelRequest self = new GetLogicModelRequest();
        return TeaModel.build(map, self);
    }

    public GetLogicModelRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetLogicModelRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public GetLogicModelRequest setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

}
