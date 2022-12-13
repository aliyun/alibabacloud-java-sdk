// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListDirectoryUsersResponseBody extends TeaModel {
    // The token used to start the next query. If the value of this parameter is empty, all results are returned.
    @NameInMap("NextToken")
    public String nextToken;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The names of users corresponding to the AD directory. If the AD directory corresponds only to the `Administrator` and `Guest` users, the returned `Users` value is empty.
    @NameInMap("Users")
    public java.util.List<ListDirectoryUsersResponseBodyUsers> users;

    public static ListDirectoryUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDirectoryUsersResponseBody self = new ListDirectoryUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDirectoryUsersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDirectoryUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDirectoryUsersResponseBody setUsers(java.util.List<ListDirectoryUsersResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ListDirectoryUsersResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class ListDirectoryUsersResponseBodyUsers extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        // The name of the user.
        @NameInMap("EndUser")
        public String endUser;

        public static ListDirectoryUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListDirectoryUsersResponseBodyUsers self = new ListDirectoryUsersResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListDirectoryUsersResponseBodyUsers setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListDirectoryUsersResponseBodyUsers setEndUser(String endUser) {
            this.endUser = endUser;
            return this;
        }
        public String getEndUser() {
            return this.endUser;
        }

    }

}
