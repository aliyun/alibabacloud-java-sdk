// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListDirectoryUsersResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
