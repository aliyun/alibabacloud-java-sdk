// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListWorkspaceUsersRequest extends TeaModel {
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The display name of the user that can be added as a workspace member.</p>
     * 
     * <strong>example:</strong>
     * <p>doctest****</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static ListWorkspaceUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspaceUsersRequest self = new ListWorkspaceUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkspaceUsersRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ListWorkspaceUsersRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
