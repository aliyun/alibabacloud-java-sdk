// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteSnapshotRepoRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("repoPath")
    public String repoPath;

    public static DeleteSnapshotRepoRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnapshotRepoRequest self = new DeleteSnapshotRepoRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSnapshotRepoRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public DeleteSnapshotRepoRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteSnapshotRepoRequest setRepoPath(String repoPath) {
        this.repoPath = repoPath;
        return this;
    }
    public String getRepoPath() {
        return this.repoPath;
    }

}
