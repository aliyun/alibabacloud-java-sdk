// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListUsersForGroupResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the response is truncated. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The `marker`. This parameter is returned only if the value of `IsTruncated` is `true`. If the parameter is returned, you can call this operation again and set this parameter to obtain the truncated part.</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of RAM users.</p>
     */
    @NameInMap("Users")
    public ListUsersForGroupResponseBodyUsers users;

    public static ListUsersForGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersForGroupResponseBody self = new ListUsersForGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersForGroupResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListUsersForGroupResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListUsersForGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersForGroupResponseBody setUsers(ListUsersForGroupResponseBodyUsers users) {
        this.users = users;
        return this;
    }
    public ListUsersForGroupResponseBodyUsers getUsers() {
        return this.users;
    }

    public static class ListUsersForGroupResponseBodyUsersUser extends TeaModel {
        /**
         * <p>The display name of the RAM user.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The time when the RAM user was added.</p>
         */
        @NameInMap("JoinDate")
        public String joinDate;

        /**
         * <p>The ID of the RAM user.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The logon name of the RAM user.</p>
         */
        @NameInMap("UserPrincipalName")
        public String userPrincipalName;

        public static ListUsersForGroupResponseBodyUsersUser build(java.util.Map<String, ?> map) throws Exception {
            ListUsersForGroupResponseBodyUsersUser self = new ListUsersForGroupResponseBodyUsersUser();
            return TeaModel.build(map, self);
        }

        public ListUsersForGroupResponseBodyUsersUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListUsersForGroupResponseBodyUsersUser setJoinDate(String joinDate) {
            this.joinDate = joinDate;
            return this;
        }
        public String getJoinDate() {
            return this.joinDate;
        }

        public ListUsersForGroupResponseBodyUsersUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListUsersForGroupResponseBodyUsersUser setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

    }

    public static class ListUsersForGroupResponseBodyUsers extends TeaModel {
        @NameInMap("User")
        public java.util.List<ListUsersForGroupResponseBodyUsersUser> user;

        public static ListUsersForGroupResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListUsersForGroupResponseBodyUsers self = new ListUsersForGroupResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListUsersForGroupResponseBodyUsers setUser(java.util.List<ListUsersForGroupResponseBodyUsersUser> user) {
            this.user = user;
            return this;
        }
        public java.util.List<ListUsersForGroupResponseBodyUsersUser> getUser() {
            return this.user;
        }

    }

}
