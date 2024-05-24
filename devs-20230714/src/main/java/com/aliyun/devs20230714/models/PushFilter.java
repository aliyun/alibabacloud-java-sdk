// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class PushFilter extends TeaModel {
    @NameInMap("branch")
    public String branch;

    @NameInMap("tag")
    public String tag;

    public static PushFilter build(java.util.Map<String, ?> map) throws Exception {
        PushFilter self = new PushFilter();
        return TeaModel.build(map, self);
    }

    public PushFilter setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public PushFilter setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
