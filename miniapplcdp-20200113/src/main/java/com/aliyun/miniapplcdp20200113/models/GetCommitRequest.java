// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetCommitRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("CommitId")
    public String commitId;

    @NameInMap("SchemaVersion")
    public String schemaVersion;

    public static GetCommitRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCommitRequest self = new GetCommitRequest();
        return TeaModel.build(map, self);
    }

    public GetCommitRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetCommitRequest setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public GetCommitRequest setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

}
