// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class RemoveGroupRequest extends TeaModel {
    /**
     * <p>The ID of the user group to be deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>ug-12341234****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The IDs of the user groups to be deleted.</p>
     */
    @NameInMap("GroupIds")
    public java.util.List<String> groupIds;

    public static RemoveGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveGroupRequest self = new RemoveGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RemoveGroupRequest setGroupIds(java.util.List<String> groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public java.util.List<String> getGroupIds() {
        return this.groupIds;
    }

}
