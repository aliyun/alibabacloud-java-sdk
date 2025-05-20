// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListRoleUsersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>token!</p>
     */
    @NameInMap("nextPageToken")
    public String nextPageToken;

    @NameInMap("users")
    public java.util.List<User> users;

    public static ListRoleUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRoleUsersResponseBody self = new ListRoleUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRoleUsersResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListRoleUsersResponseBody setUsers(java.util.List<User> users) {
        this.users = users;
        return this;
    }
    public java.util.List<User> getUsers() {
        return this.users;
    }

}
