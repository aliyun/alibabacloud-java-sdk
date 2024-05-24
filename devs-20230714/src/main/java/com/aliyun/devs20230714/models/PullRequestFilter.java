// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class PullRequestFilter extends TeaModel {
    @NameInMap("sourceBranch")
    public String sourceBranch;

    @NameInMap("targetBranch")
    public String targetBranch;

    @NameInMap("types")
    public java.util.List<String> types;

    public static PullRequestFilter build(java.util.Map<String, ?> map) throws Exception {
        PullRequestFilter self = new PullRequestFilter();
        return TeaModel.build(map, self);
    }

    public PullRequestFilter setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }
    public String getSourceBranch() {
        return this.sourceBranch;
    }

    public PullRequestFilter setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }
    public String getTargetBranch() {
        return this.targetBranch;
    }

    public PullRequestFilter setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

}
