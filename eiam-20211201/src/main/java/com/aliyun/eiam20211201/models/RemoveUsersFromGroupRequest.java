// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RemoveUsersFromGroupRequest extends TeaModel {
    /**
     * <p>组ID。</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>账户ID列表，列表最大元素限制为100</p>
     */
    @NameInMap("UserIds")
    public java.util.List<String> userIds;

    public static RemoveUsersFromGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUsersFromGroupRequest self = new RemoveUsersFromGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUsersFromGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RemoveUsersFromGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemoveUsersFromGroupRequest setUserIds(java.util.List<String> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<String> getUserIds() {
        return this.userIds;
    }

}
