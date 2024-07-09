// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListDirectoryUsersResponseBody extends TeaModel {
    /**
     * <p>The token used to start the next query. If the value of this parameter is empty, all results are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The names of users corresponding to the AD directory. If the AD directory contains only Administrator and Guest, an empty Users array is returned.</p>
     */
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
        /**
         * <p>The display name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
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
