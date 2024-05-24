// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class GitEventSnapshot extends TeaModel {
    @NameInMap("branch")
    public String branch;

    @NameInMap("commitID")
    public String commitID;

    @NameInMap("tag")
    public String tag;

    public static GitEventSnapshot build(java.util.Map<String, ?> map) throws Exception {
        GitEventSnapshot self = new GitEventSnapshot();
        return TeaModel.build(map, self);
    }

    public GitEventSnapshot setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public GitEventSnapshot setCommitID(String commitID) {
        this.commitID = commitID;
        return this;
    }
    public String getCommitID() {
        return this.commitID;
    }

    public GitEventSnapshot setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
