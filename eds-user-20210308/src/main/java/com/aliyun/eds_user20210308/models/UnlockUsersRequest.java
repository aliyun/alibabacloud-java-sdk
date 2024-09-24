// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class UnlockUsersRequest extends TeaModel {
    /**
     * <p>The date on which the convenience users are automatically locked.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-03-03</p>
     */
    @NameInMap("AutoLockTime")
    public String autoLockTime;

    /**
     * <p>The usernames of the convenience users that you want to unlock.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
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
