// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertServiceGroupRequest extends TeaModel {
    /**
     * <p>The name of the service group that you want to create.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    public static InsertServiceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertServiceGroupRequest self = new InsertServiceGroupRequest();
        return TeaModel.build(map, self);
    }

    public InsertServiceGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
