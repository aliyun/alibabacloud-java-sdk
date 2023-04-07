// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListOfficeSiteUsersResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The usernames of AD users.</p>
     * <br>
     * <p>This parameter is empty if the AD users include only Administrator and Guest.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The usernames of AD users.</p>
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
        /**
         * <p>The display name of the AD user.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The username of the AD user.</p>
         */
        @NameInMap("EndUser")
        public String endUser;

        public static ListOfficeSiteUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListOfficeSiteUsersResponseBodyUsers self = new ListOfficeSiteUsersResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListOfficeSiteUsersResponseBodyUsers setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListOfficeSiteUsersResponseBodyUsers setEndUser(String endUser) {
            this.endUser = endUser;
            return this;
        }
        public String getEndUser() {
            return this.endUser;
        }

    }

}
