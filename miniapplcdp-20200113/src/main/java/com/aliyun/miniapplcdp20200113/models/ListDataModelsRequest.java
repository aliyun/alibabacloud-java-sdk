// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListDataModelsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("SchemaVersion")
    public String schemaVersion;

    @NameInMap("SubType")
    public String subType;

    @NameInMap("WithContent")
    public Boolean withContent;

    public static ListDataModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataModelsRequest self = new ListDataModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataModelsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListDataModelsRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ListDataModelsRequest setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public ListDataModelsRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public ListDataModelsRequest setWithContent(Boolean withContent) {
        this.withContent = withContent;
        return this;
    }
    public Boolean getWithContent() {
        return this.withContent;
    }

}
