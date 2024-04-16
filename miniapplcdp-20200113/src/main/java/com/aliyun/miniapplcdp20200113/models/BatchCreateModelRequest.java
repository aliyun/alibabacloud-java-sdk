// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class BatchCreateModelRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ModelDataJson")
    public String modelDataJson;

    @NameInMap("ModuleId")
    public String moduleId;

    @NameInMap("SchemaVersion")
    public String schemaVersion;

    @NameInMap("Source")
    public String source;

    @NameInMap("SubType")
    public String subType;

    public static BatchCreateModelRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateModelRequest self = new BatchCreateModelRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateModelRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BatchCreateModelRequest setModelDataJson(String modelDataJson) {
        this.modelDataJson = modelDataJson;
        return this;
    }
    public String getModelDataJson() {
        return this.modelDataJson;
    }

    public BatchCreateModelRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public BatchCreateModelRequest setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public BatchCreateModelRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public BatchCreateModelRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

}
