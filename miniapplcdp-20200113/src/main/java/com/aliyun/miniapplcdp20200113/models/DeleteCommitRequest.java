// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class DeleteCommitRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("CommitId")
    public String commitId;

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

}
