// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class RemoveUsersRequest extends TeaModel {
    @NameInMap("Users")
    public java.util.List<String> users;

    public static RemoveUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUsersRequest self = new RemoveUsersRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUsersRequest setUsers(java.util.List<String> users) {
        this.users = users;
        return this;
    }
    public java.util.List<String> getUsers() {
        return this.users;
    }

}
