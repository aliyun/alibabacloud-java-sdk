// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetUserGroupRequest extends TeaModel {
    /**
     * <p>The ID of the user group. You can obtain the ID from the following sources:</p>
     * <ul>
     * <li><p><a href="~~ListUserGroups~~">ListUserGroups</a>: Queries a list of user groups.</p>
     * </li>
     * <li><p><a href="~~CreateUserGroup~~">CreateUserGroup</a>: Creates a user group.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>usergroup-6f1ef2fc56b6****</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    public static GetUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserGroupRequest self = new GetUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
