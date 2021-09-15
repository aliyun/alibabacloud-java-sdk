// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateCommitRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("CommitLog")
    public String commitLog;

    @NameInMap("RollbackToCommitId")
    public String rollbackToCommitId;

    @NameInMap("SchemaVersion")
    public String schemaVersion;

    @NameInMap("CommitType")
    public String commitType;

    public static CreateCommitRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCommitRequest self = new CreateCommitRequest();
        return TeaModel.build(map, self);
    }

    public CreateCommitRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCommitRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateCommitRequest setCommitLog(String commitLog) {
        this.commitLog = commitLog;
        return this;
    }
    public String getCommitLog() {
        return this.commitLog;
    }

    public CreateCommitRequest setRollbackToCommitId(String rollbackToCommitId) {
        this.rollbackToCommitId = rollbackToCommitId;
        return this;
    }
    public String getRollbackToCommitId() {
        return this.rollbackToCommitId;
    }

    public CreateCommitRequest setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public CreateCommitRequest setCommitType(String commitType) {
        this.commitType = commitType;
        return this;
    }
    public String getCommitType() {
        return this.commitType;
    }

}
