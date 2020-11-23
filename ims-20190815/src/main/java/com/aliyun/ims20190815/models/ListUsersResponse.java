// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListUsersResponse extends TeaModel {
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
    public ListUsersResponseUsers users;

    public static ListUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUsersResponse self = new ListUsersResponse();
        return TeaModel.build(map, self);
    }

    public ListUsersResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListUsersResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListUsersResponse setUsers(ListUsersResponseUsers users) {
        this.users = users;
        return this;
    }
    public ListUsersResponseUsers getUsers() {
        return this.users;
    }

    public static class ListUsersResponseUsersUser extends TeaModel {
        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("UserPrincipalName")
        @Validation(required = true)
        public String userPrincipalName;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("Comments")
        @Validation(required = true)
        public String comments;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("UpdateDate")
        @Validation(required = true)
        public String updateDate;

        @NameInMap("LastLoginDate")
        @Validation(required = true)
        public String lastLoginDate;

        @NameInMap("MobilePhone")
        @Validation(required = true)
        public String mobilePhone;

        @NameInMap("Email")
        @Validation(required = true)
        public String email;

        public static ListUsersResponseUsersUser build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseUsersUser self = new ListUsersResponseUsersUser();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseUsersUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListUsersResponseUsersUser setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

        public ListUsersResponseUsersUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListUsersResponseUsersUser setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public ListUsersResponseUsersUser setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListUsersResponseUsersUser setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public ListUsersResponseUsersUser setLastLoginDate(String lastLoginDate) {
            this.lastLoginDate = lastLoginDate;
            return this;
        }
        public String getLastLoginDate() {
            return this.lastLoginDate;
        }

        public ListUsersResponseUsersUser setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }
        public String getMobilePhone() {
            return this.mobilePhone;
        }

        public ListUsersResponseUsersUser setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

    }

    public static class ListUsersResponseUsers extends TeaModel {
        @NameInMap("User")
        @Validation(required = true)
        public java.util.List<ListUsersResponseUsersUser> user;

        public static ListUsersResponseUsers build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseUsers self = new ListUsersResponseUsers();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseUsers setUser(java.util.List<ListUsersResponseUsersUser> user) {
            this.user = user;
            return this;
        }
        public java.util.List<ListUsersResponseUsersUser> getUser() {
            return this.user;
        }

    }

}
