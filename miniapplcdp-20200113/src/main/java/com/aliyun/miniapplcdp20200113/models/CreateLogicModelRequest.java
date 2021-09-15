// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateLogicModelRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("Description")
    public String description;

    @NameInMap("EncodeType")
    public String encodeType;

    @NameInMap("Content")
    public String content;

    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("SchemaVersion")
    public String schemaVersion;

    @NameInMap("SubType")
    public String subType;

    public static CreateLogicModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLogicModelRequest self = new CreateLogicModelRequest();
        return TeaModel.build(map, self);
    }

    public CreateLogicModelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateLogicModelRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateLogicModelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLogicModelRequest setEncodeType(String encodeType) {
        this.encodeType = encodeType;
        return this;
    }
    public String getEncodeType() {
        return this.encodeType;
    }

    public CreateLogicModelRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateLogicModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CreateLogicModelRequest setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public CreateLogicModelRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

}
