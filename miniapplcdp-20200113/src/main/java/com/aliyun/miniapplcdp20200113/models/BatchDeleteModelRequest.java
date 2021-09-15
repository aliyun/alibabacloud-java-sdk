// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class BatchDeleteModelRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ModelIdList")
    public String modelIdList;

    @NameInMap("SchemaVersion")
    public String schemaVersion;

    public static BatchDeleteModelRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteModelRequest self = new BatchDeleteModelRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteModelRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BatchDeleteModelRequest setModelIdList(String modelIdList) {
        this.modelIdList = modelIdList;
        return this;
    }
    public String getModelIdList() {
        return this.modelIdList;
    }

    public BatchDeleteModelRequest setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

}
