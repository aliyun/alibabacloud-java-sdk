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
     * <p>The usernames corresponding to the AD directory. If the AD directory contains only the Administrator and Guest accounts, the Users array will be empty.</p>
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
         * <p>The number of assigned cloud computers.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AssignedDesktopNumber")
        public Integer assignedDesktopNumber;

        /**
         * <p>The display name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("DisplayNameNew")
        public String displayNameNew;

        /**
         * <p>The email address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:user@example.com">user@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        @NameInMap("EndUser")
        public String endUser;

        /**
         * <p>The mobile number.</p>
         * 
         * <strong>example:</strong>
         * <p>130********</p>
         */
        @NameInMap("Phone")
        public String phone;

        @NameInMap("UserPrincipalName")
        public String userPrincipalName;

        public static ListDirectoryUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListDirectoryUsersResponseBodyUsers self = new ListDirectoryUsersResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListDirectoryUsersResponseBodyUsers setAssignedDesktopNumber(Integer assignedDesktopNumber) {
            this.assignedDesktopNumber = assignedDesktopNumber;
            return this;
        }
        public Integer getAssignedDesktopNumber() {
            return this.assignedDesktopNumber;
        }

        public ListDirectoryUsersResponseBodyUsers setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListDirectoryUsersResponseBodyUsers setDisplayNameNew(String displayNameNew) {
            this.displayNameNew = displayNameNew;
            return this;
        }
        public String getDisplayNameNew() {
            return this.displayNameNew;
        }

        public ListDirectoryUsersResponseBodyUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListDirectoryUsersResponseBodyUsers setEndUser(String endUser) {
            this.endUser = endUser;
            return this;
        }
        public String getEndUser() {
            return this.endUser;
        }

        public ListDirectoryUsersResponseBodyUsers setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public ListDirectoryUsersResponseBodyUsers setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

    }

}
