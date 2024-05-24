// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class FetchRepositoryCheckoutRequest extends TeaModel {
    @NameInMap("branch")
    public String branch;

    @NameInMap("commit")
    public String commit;

    @NameInMap("tag")
    public String tag;

    public static FetchRepositoryCheckoutRequest build(java.util.Map<String, ?> map) throws Exception {
        FetchRepositoryCheckoutRequest self = new FetchRepositoryCheckoutRequest();
        return TeaModel.build(map, self);
    }

    public FetchRepositoryCheckoutRequest setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public FetchRepositoryCheckoutRequest setCommit(String commit) {
        this.commit = commit;
        return this;
    }
    public String getCommit() {
        return this.commit;
    }

    public FetchRepositoryCheckoutRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
