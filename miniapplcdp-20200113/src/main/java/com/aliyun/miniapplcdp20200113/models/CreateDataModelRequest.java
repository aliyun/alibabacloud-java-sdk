// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateDataModelRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("Description")
    public String description;

    @NameInMap("EncodeType")
    public String encodeType;

    @NameInMap("Attributes")
    public String attributes;

    @NameInMap("Content")
    public String content;

    @NameInMap("ModelId")
    public String modelId;

    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("Permission")
    public String permission;

    @NameInMap("SchemaVersion")
    public String schemaVersion;

    @NameInMap("SubType")
    public String subType;

    public static CreateDataModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataModelRequest self = new CreateDataModelRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataModelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDataModelRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateDataModelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDataModelRequest setEncodeType(String encodeType) {
        this.encodeType = encodeType;
        return this;
    }
    public String getEncodeType() {
        return this.encodeType;
    }

    public CreateDataModelRequest setAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }
    public String getAttributes() {
        return this.attributes;
    }

    public CreateDataModelRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateDataModelRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public CreateDataModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CreateDataModelRequest setPermission(String permission) {
        this.permission = permission;
        return this;
    }
    public String getPermission() {
        return this.permission;
    }

    public CreateDataModelRequest setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public CreateDataModelRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

}
