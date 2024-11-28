// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListOfficeSiteUsersResponseBody extends TeaModel {
    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>269BDB16-2CD8-4865-84BD-11C40BC21DB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The usernames of AD users.\
     * If the only Administrator and Guest users exist in the enterprise AD, an empty User array is returned.</p>
     */
    @NameInMap("Users")
    public java.util.List<ListOfficeSiteUsersResponseBodyUsers> users;

    public static ListOfficeSiteUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOfficeSiteUsersResponseBody self = new ListOfficeSiteUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOfficeSiteUsersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOfficeSiteUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOfficeSiteUsersResponseBody setUsers(java.util.List<ListOfficeSiteUsersResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ListOfficeSiteUsersResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class ListOfficeSiteUsersResponseBodyUsers extends TeaModel {
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

        @NameInMap("Email")
        public String email;

        /**
         * <p>The name of the AD user.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        @NameInMap("EndUser")
        public String endUser;

        @NameInMap("Phone")
        public String phone;

        public static ListOfficeSiteUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListOfficeSiteUsersResponseBodyUsers self = new ListOfficeSiteUsersResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListOfficeSiteUsersResponseBodyUsers setAssignedDesktopNumber(Integer assignedDesktopNumber) {
            this.assignedDesktopNumber = assignedDesktopNumber;
            return this;
        }
        public Integer getAssignedDesktopNumber() {
            return this.assignedDesktopNumber;
        }

        public ListOfficeSiteUsersResponseBodyUsers setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListOfficeSiteUsersResponseBodyUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListOfficeSiteUsersResponseBodyUsers setEndUser(String endUser) {
            this.endUser = endUser;
            return this;
        }
        public String getEndUser() {
            return this.endUser;
        }

        public ListOfficeSiteUsersResponseBodyUsers setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

}
