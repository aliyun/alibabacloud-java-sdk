// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class UnlockUsersRequest extends TeaModel {
    @NameInMap("AutoLockTime")
    public String autoLockTime;

    @NameInMap("Users")
    public java.util.List<String> users;

    public static UnlockUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        UnlockUsersRequest self = new UnlockUsersRequest();
        return TeaModel.build(map, self);
    }

    public UnlockUsersRequest setAutoLockTime(String autoLockTime) {
        this.autoLockTime = autoLockTime;
        return this;
    }
    public String getAutoLockTime() {
        return this.autoLockTime;
    }

    public UnlockUsersRequest setUsers(java.util.List<String> users) {
        this.users = users;
        return this;
    }
    public java.util.List<String> getUsers() {
        return this.users;
    }

}
