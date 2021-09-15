// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListLogicModelsRequest extends TeaModel {
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

    public static ListLogicModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLogicModelsRequest self = new ListLogicModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListLogicModelsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListLogicModelsRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ListLogicModelsRequest setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public ListLogicModelsRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public ListLogicModelsRequest setWithContent(Boolean withContent) {
        this.withContent = withContent;
        return this;
    }
    public Boolean getWithContent() {
        return this.withContent;
    }

}
