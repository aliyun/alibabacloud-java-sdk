// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class CodeVersionReference extends TeaModel {
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

    public static CodeVersionReference build(java.util.Map<String, ?> map) throws Exception {
        CodeVersionReference self = new CodeVersionReference();
        return TeaModel.build(map, self);
    }

    public CodeVersionReference setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public CodeVersionReference setCommitID(String commitID) {
        this.commitID = commitID;
        return this;
    }
    public String getCommitID() {
        return this.commitID;
    }

}
