// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListOfficeSiteUsersResponseBody extends TeaModel {
    /**
     * <p>The token to start the next query. If this parameter is empty, all results have been returned.</p>
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
     * <p>An array that consists of the AD accounts.<br>
     * If the enterprise AD contains only the Administrator and Guest users, an empty Users array is returned.<br></p>
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
         * <p>The display name of the AD account.</p>
         * 
         * <strong>example:</strong>
         * <p>aduser</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("DisplayNameNew")
        public String displayNameNew;

        @NameInMap("Email")
        public String email;

        /**
         * <p>The username of the AD account.</p>
         * 
         * <strong>example:</strong>
         * <p>aduser</p>
         */
        @NameInMap("EndUser")
        public String endUser;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("UserPrincipalName")
        public String userPrincipalName;

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

        public ListOfficeSiteUsersResponseBodyUsers setDisplayNameNew(String displayNameNew) {
            this.displayNameNew = displayNameNew;
            return this;
        }
        public String getDisplayNameNew() {
            return this.displayNameNew;
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

        public ListOfficeSiteUsersResponseBodyUsers setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

    }

}
