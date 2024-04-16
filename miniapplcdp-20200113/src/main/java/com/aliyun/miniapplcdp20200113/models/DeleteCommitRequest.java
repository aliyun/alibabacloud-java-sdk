// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class DeleteCommitRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("CommitId")
    public String commitId;

    @NameInMap("ModuleId")
    public String moduleId;

    @NameInMap("Source")
    public String source;

    public static DeleteCommitRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommitRequest self = new DeleteCommitRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCommitRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteCommitRequest setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public DeleteCommitRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public DeleteCommitRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
