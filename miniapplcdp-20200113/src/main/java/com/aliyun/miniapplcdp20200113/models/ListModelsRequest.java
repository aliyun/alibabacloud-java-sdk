// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListModelsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ModelId")
    public String modelId;

    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("ModelType")
    public String modelType;

    @NameInMap("ModuleId")
    public String moduleId;

    @NameInMap("SchemaVersion")
    public String schemaVersion;

    @NameInMap("Source")
    public String source;

    @NameInMap("SubType")
    public String subType;

    @NameInMap("WithContent")
    public Boolean withContent;

    public static ListModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelsRequest self = new ListModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListModelsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListModelsRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public ListModelsRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ListModelsRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public ListModelsRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public ListModelsRequest setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public ListModelsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListModelsRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public ListModelsRequest setWithContent(Boolean withContent) {
        this.withContent = withContent;
        return this;
    }
    public Boolean getWithContent() {
        return this.withContent;
    }

}
