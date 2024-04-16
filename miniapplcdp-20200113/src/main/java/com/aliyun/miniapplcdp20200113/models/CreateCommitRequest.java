// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateCommitRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CommitLog")
    public String commitLog;

    @NameInMap("CommitType")
    public String commitType;

    @NameInMap("MainModuleCommitId")
    public String mainModuleCommitId;

    @NameInMap("ModuleId")
    public String moduleId;

    @NameInMap("RollbackToCommitId")
    public String rollbackToCommitId;

    @NameInMap("RollbackType")
    public String rollbackType;

    @NameInMap("SchemaVersion")
    public String schemaVersion;

    @NameInMap("Source")
    public String source;

    public static CreateCommitRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCommitRequest self = new CreateCommitRequest();
        return TeaModel.build(map, self);
    }

    public CreateCommitRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateCommitRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCommitRequest setCommitLog(String commitLog) {
        this.commitLog = commitLog;
        return this;
    }
    public String getCommitLog() {
        return this.commitLog;
    }

    public CreateCommitRequest setCommitType(String commitType) {
        this.commitType = commitType;
        return this;
    }
    public String getCommitType() {
        return this.commitType;
    }

    public CreateCommitRequest setMainModuleCommitId(String mainModuleCommitId) {
        this.mainModuleCommitId = mainModuleCommitId;
        return this;
    }
    public String getMainModuleCommitId() {
        return this.mainModuleCommitId;
    }

    public CreateCommitRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public CreateCommitRequest setRollbackToCommitId(String rollbackToCommitId) {
        this.rollbackToCommitId = rollbackToCommitId;
        return this;
    }
    public String getRollbackToCommitId() {
        return this.rollbackToCommitId;
    }

    public CreateCommitRequest setRollbackType(String rollbackType) {
        this.rollbackType = rollbackType;
        return this;
    }
    public String getRollbackType() {
        return this.rollbackType;
    }

    public CreateCommitRequest setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public CreateCommitRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
