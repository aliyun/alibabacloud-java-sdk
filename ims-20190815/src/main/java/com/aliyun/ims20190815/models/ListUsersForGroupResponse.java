// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListUsersForGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Marker")
    @Validation(required = true)
    public String marker;

    @NameInMap("IsTruncated")
    @Validation(required = true)
    public Boolean isTruncated;

    @NameInMap("Users")
    @Validation(required = true)
    public ListUsersForGroupResponseUsers users;

    public static ListUsersForGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUsersForGroupResponse self = new ListUsersForGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListUsersForGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersForGroupResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListUsersForGroupResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListUsersForGroupResponse setUsers(ListUsersForGroupResponseUsers users) {
        this.users = users;
        return this;
    }
    public ListUsersForGroupResponseUsers getUsers() {
        return this.users;
    }

    public static class ListUsersForGroupResponseUsersUser extends TeaModel {
        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("UserPrincipalName")
        @Validation(required = true)
        public String userPrincipalName;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("JoinDate")
        @Validation(required = true)
        public String joinDate;

        public static ListUsersForGroupResponseUsersUser build(java.util.Map<String, ?> map) throws Exception {
            ListUsersForGroupResponseUsersUser self = new ListUsersForGroupResponseUsersUser();
            return TeaModel.build(map, self);
        }

        public ListUsersForGroupResponseUsersUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListUsersForGroupResponseUsersUser setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

        public ListUsersForGroupResponseUsersUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListUsersForGroupResponseUsersUser setJoinDate(String joinDate) {
            this.joinDate = joinDate;
            return this;
        }
        public String getJoinDate() {
            return this.joinDate;
        }

    }

    public static class ListUsersForGroupResponseUsers extends TeaModel {
        @NameInMap("User")
        @Validation(required = true)
        public java.util.List<ListUsersForGroupResponseUsersUser> user;

        public static ListUsersForGroupResponseUsers build(java.util.Map<String, ?> map) throws Exception {
            ListUsersForGroupResponseUsers self = new ListUsersForGroupResponseUsers();
            return TeaModel.build(map, self);
        }

        public ListUsersForGroupResponseUsers setUser(java.util.List<ListUsersForGroupResponseUsersUser> user) {
            this.user = user;
            return this;
        }
        public java.util.List<ListUsersForGroupResponseUsersUser> getUser() {
            return this.user;
        }

    }

}
