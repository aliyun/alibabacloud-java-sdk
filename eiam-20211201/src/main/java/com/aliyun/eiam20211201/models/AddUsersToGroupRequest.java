// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AddUsersToGroupRequest extends TeaModel {
    /**
     * <p>The group ID.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The account IDs.</p>
     */
    @NameInMap("UserIds")
    public java.util.List<String> userIds;

    public static AddUsersToGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUsersToGroupRequest self = new AddUsersToGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddUsersToGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public AddUsersToGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddUsersToGroupRequest setUserIds(java.util.List<String> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<String> getUserIds() {
        return this.userIds;
    }

}
