// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class LockUsersRequest extends TeaModel {
    @NameInMap("LogoutSession")
    public Boolean logoutSession;

    /**
     * <p>The usernames of the convenience users that you want to lock.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("Users")
    public java.util.List<String> users;

    public static LockUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        LockUsersRequest self = new LockUsersRequest();
        return TeaModel.build(map, self);
    }

    public LockUsersRequest setLogoutSession(Boolean logoutSession) {
        this.logoutSession = logoutSession;
        return this;
    }
    public Boolean getLogoutSession() {
        return this.logoutSession;
    }

    public LockUsersRequest setUsers(java.util.List<String> users) {
        this.users = users;
        return this;
    }
    public java.util.List<String> getUsers() {
        return this.users;
    }

}
