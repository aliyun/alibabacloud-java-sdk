// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class EventFilterConfig extends TeaModel {
    @NameInMap("branch")
    public BranchFilter branch;

    public static EventFilterConfig build(java.util.Map<String, ?> map) throws Exception {
        EventFilterConfig self = new EventFilterConfig();
        return TeaModel.build(map, self);
    }

    public EventFilterConfig setBranch(BranchFilter branch) {
        this.branch = branch;
        return this;
    }
    public BranchFilter getBranch() {
        return this.branch;
    }

}
