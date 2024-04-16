// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetModelRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ModelId")
    public String modelId;

    @NameInMap("ModuleId")
    public String moduleId;

    @NameInMap("SchemaVersion")
    public String schemaVersion;

    @NameInMap("Source")
    public String source;

    public static GetModelRequest build(java.util.Map<String, ?> map) throws Exception {
        GetModelRequest self = new GetModelRequest();
        return TeaModel.build(map, self);
    }

    public GetModelRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetModelRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public GetModelRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public GetModelRequest setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public GetModelRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
