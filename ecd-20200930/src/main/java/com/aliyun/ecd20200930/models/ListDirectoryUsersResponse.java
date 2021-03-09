// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListDirectoryUsersResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("Users")
    @Validation(required = true)
    public java.util.List<ListDirectoryUsersResponseUsers> users;

    public static ListDirectoryUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDirectoryUsersResponse self = new ListDirectoryUsersResponse();
        return TeaModel.build(map, self);
    }

    public ListDirectoryUsersResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDirectoryUsersResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDirectoryUsersResponse setUsers(java.util.List<ListDirectoryUsersResponseUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ListDirectoryUsersResponseUsers> getUsers() {
        return this.users;
    }

    public static class ListDirectoryUsersResponseUsers extends TeaModel {
        @NameInMap("EndUser")
        @Validation(required = true)
        public String endUser;

        public static ListDirectoryUsersResponseUsers build(java.util.Map<String, ?> map) throws Exception {
            ListDirectoryUsersResponseUsers self = new ListDirectoryUsersResponseUsers();
            return TeaModel.build(map, self);
        }

        public ListDirectoryUsersResponseUsers setEndUser(String endUser) {
            this.endUser = endUser;
            return this;
        }
        public String getEndUser() {
            return this.endUser;
        }

    }

}
