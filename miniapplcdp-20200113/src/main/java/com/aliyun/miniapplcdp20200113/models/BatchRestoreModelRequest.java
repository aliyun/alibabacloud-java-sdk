// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class BatchRestoreModelRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ModelIdList")
    public String modelIdList;

    @NameInMap("ModuleId")
    public String moduleId;

    @NameInMap("SchemaVersion")
    public String schemaVersion;

    @NameInMap("Source")
    public String source;

    public static BatchRestoreModelRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchRestoreModelRequest self = new BatchRestoreModelRequest();
        return TeaModel.build(map, self);
    }

    public BatchRestoreModelRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BatchRestoreModelRequest setModelIdList(String modelIdList) {
        this.modelIdList = modelIdList;
        return this;
    }
    public String getModelIdList() {
        return this.modelIdList;
    }

    public BatchRestoreModelRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public BatchRestoreModelRequest setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public BatchRestoreModelRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
