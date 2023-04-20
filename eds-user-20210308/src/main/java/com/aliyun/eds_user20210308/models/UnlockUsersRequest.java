// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class UnlockUsersRequest extends TeaModel {
    /**
     * <p>The usernames of the convenience users that you want to unlock.</p>
     */
    @NameInMap("Users")
    public java.util.List<String> users;

    public static UnlockUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        UnlockUsersRequest self = new UnlockUsersRequest();
        return TeaModel.build(map, self);
    }

    public UnlockUsersRequest setUsers(java.util.List<String> users) {
        this.users = users;
        return this;
    }
    public java.util.List<String> getUsers() {
        return this.users;
    }

}
