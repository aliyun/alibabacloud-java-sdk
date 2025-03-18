// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class PatchGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>name001</p>
     */
    @NameInMap("groupName")
    public String groupName;

    public static PatchGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        PatchGroupRequest self = new PatchGroupRequest();
        return TeaModel.build(map, self);
    }

    public PatchGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
