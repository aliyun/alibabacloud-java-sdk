// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class UpdatePageModelContentRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Content")
    public String content;

    @NameInMap("EncodeType")
    public String encodeType;

    @NameInMap("ModelId")
    public String modelId;

    @NameInMap("SchemaVersion")
    public String schemaVersion;

    public static UpdatePageModelContentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePageModelContentRequest self = new UpdatePageModelContentRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePageModelContentRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdatePageModelContentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdatePageModelContentRequest setEncodeType(String encodeType) {
        this.encodeType = encodeType;
        return this;
    }
    public String getEncodeType() {
        return this.encodeType;
    }

    public UpdatePageModelContentRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public UpdatePageModelContentRequest setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

}
