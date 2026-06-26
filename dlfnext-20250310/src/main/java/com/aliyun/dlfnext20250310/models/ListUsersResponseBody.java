// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    /**
     * <p>The pagination token used to retrieve the next page of results. A null value indicates that this is the last page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>E8ABEB1C3DB893D16576269017992F57</p>
     */
    @NameInMap("nextPageToken")
    public String nextPageToken;

    /**
     * <p>The users.</p>
     */
    @NameInMap("users")
    public java.util.List<User> users;

    public static ListUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersResponseBody self = new ListUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListUsersResponseBody setUsers(java.util.List<User> users) {
        this.users = users;
        return this;
    }
    public java.util.List<User> getUsers() {
        return this.users;
    }

}
