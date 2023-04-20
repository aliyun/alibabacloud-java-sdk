// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class LockUsersRequest extends TeaModel {
    /**
     * <p>The usernames of the convenience users that you want to lock.</p>
     */
    @NameInMap("Users")
    public java.util.List<String> users;

    public static LockUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        LockUsersRequest self = new LockUsersRequest();
        return TeaModel.build(map, self);
    }

    public LockUsersRequest setUsers(java.util.List<String> users) {
        this.users = users;
        return this;
    }
    public java.util.List<String> getUsers() {
        return this.users;
    }

}
