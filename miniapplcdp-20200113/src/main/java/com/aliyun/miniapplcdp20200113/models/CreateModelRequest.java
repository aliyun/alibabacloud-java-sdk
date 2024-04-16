// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateModelRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Content")
    public String content;

    @NameInMap("Description")
    public String description;

    @NameInMap("EncodeType")
    public String encodeType;

    @NameInMap("LinkModelId")
    public String linkModelId;

    @NameInMap("LinkModuleId")
    public String linkModuleId;

    @NameInMap("Linked")
    public Boolean linked;

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

    @NameInMap("Visibility")
    public String visibility;

    public static CreateModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelRequest self = new CreateModelRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateModelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateModelRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateModelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateModelRequest setEncodeType(String encodeType) {
        this.encodeType = encodeType;
        return this;
    }
    public String getEncodeType() {
        return this.encodeType;
    }

    public CreateModelRequest setLinkModelId(String linkModelId) {
        this.linkModelId = linkModelId;
        return this;
    }
    public String getLinkModelId() {
        return this.linkModelId;
    }

    public CreateModelRequest setLinkModuleId(String linkModuleId) {
        this.linkModuleId = linkModuleId;
        return this;
    }
    public String getLinkModuleId() {
        return this.linkModuleId;
    }

    public CreateModelRequest setLinked(Boolean linked) {
        this.linked = linked;
        return this;
    }
    public Boolean getLinked() {
        return this.linked;
    }

    public CreateModelRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public CreateModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CreateModelRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public CreateModelRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public CreateModelRequest setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public CreateModelRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateModelRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public CreateModelRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

}
