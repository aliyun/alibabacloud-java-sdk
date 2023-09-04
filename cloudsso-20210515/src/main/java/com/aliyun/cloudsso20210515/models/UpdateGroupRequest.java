// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateGroupRequest extends TeaModel {
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
     * <p>The new description of the group.</p>
     */
    @NameInMap("NewDescription")
    public String newDescription;

    /**
     * <p>The new name of the group.</p>
     */
    @NameInMap("NewGroupName")
    public String newGroupName;

    public static UpdateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupRequest self = new UpdateGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGroupRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public UpdateGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateGroupRequest setNewDescription(String newDescription) {
        this.newDescription = newDescription;
        return this;
    }
    public String getNewDescription() {
        return this.newDescription;
    }

    public UpdateGroupRequest setNewGroupName(String newGroupName) {
        this.newGroupName = newGroupName;
        return this;
    }
    public String getNewGroupName() {
        return this.newGroupName;
    }

}
