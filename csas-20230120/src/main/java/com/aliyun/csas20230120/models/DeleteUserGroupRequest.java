// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteUserGroupRequest extends TeaModel {
    /**
     * <p>The ID of the user group. You can get this value from:</p>
     * <ul>
     * <li><p><a href="~~ListUserGroups~~">ListUserGroups</a>: Query user groups.</p>
     * </li>
     * <li><p><a href="~~CreateUserGroup~~">CreateUserGroup</a>: Create a user group.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>usergroup-6f1ef2fc56b6****</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    public static DeleteUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserGroupRequest self = new DeleteUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
