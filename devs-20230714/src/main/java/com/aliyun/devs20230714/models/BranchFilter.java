// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class BranchFilter extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>master</p>
     */
    @NameInMap("name")
    public String name;

    public static BranchFilter build(java.util.Map<String, ?> map) throws Exception {
        BranchFilter self = new BranchFilter();
        return TeaModel.build(map, self);
    }

    public BranchFilter setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
