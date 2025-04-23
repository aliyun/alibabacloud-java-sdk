// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListWorkspaceUsersRequest extends TeaModel {
    /**
     * <p>The display names of users who can be added to the workspace as members.</p>
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

    public ListWorkspaceUsersRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
