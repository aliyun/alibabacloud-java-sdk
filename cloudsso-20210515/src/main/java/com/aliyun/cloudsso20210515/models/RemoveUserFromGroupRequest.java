// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class RemoveUserFromGroupRequest extends TeaModel {
    /**
     * <p>The ID of the directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The ID of the group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the user.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static RemoveUserFromGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserFromGroupRequest self = new RemoveUserFromGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUserFromGroupRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public RemoveUserFromGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RemoveUserFromGroupRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
