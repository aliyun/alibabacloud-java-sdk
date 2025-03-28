// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class GitEventSnapshot extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>main</p>
     */
    @NameInMap("branch")
    public String branch;

    /**
     * <strong>example:</strong>
     * <p>12721ec262d03a93809ba2bbc717963cb298ceca</p>
     */
    @NameInMap("commitID")
    public String commitID;

    /**
     * <strong>example:</strong>
     * <p>1.0</p>
     */
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
