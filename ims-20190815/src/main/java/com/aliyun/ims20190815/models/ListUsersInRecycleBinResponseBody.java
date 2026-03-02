// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListUsersInRecycleBinResponseBody extends TeaModel {
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    @NameInMap("Marker")
    public String marker;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Users")
    public ListUsersInRecycleBinResponseBodyUsers users;

    public static ListUsersInRecycleBinResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersInRecycleBinResponseBody self = new ListUsersInRecycleBinResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersInRecycleBinResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListUsersInRecycleBinResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListUsersInRecycleBinResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersInRecycleBinResponseBody setUsers(ListUsersInRecycleBinResponseBodyUsers users) {
        this.users = users;
        return this;
    }
    public ListUsersInRecycleBinResponseBodyUsers getUsers() {
        return this.users;
    }

    public static class ListUsersInRecycleBinResponseBodyUsersUser extends TeaModel {
        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("DeleteDate")
        public String deleteDate;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("RecycleDate")
        public String recycleDate;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserPrincipalName")
        public String userPrincipalName;

        public static ListUsersInRecycleBinResponseBodyUsersUser build(java.util.Map<String, ?> map) throws Exception {
            ListUsersInRecycleBinResponseBodyUsersUser self = new ListUsersInRecycleBinResponseBodyUsersUser();
            return TeaModel.build(map, self);
        }

        public ListUsersInRecycleBinResponseBodyUsersUser setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListUsersInRecycleBinResponseBodyUsersUser setDeleteDate(String deleteDate) {
            this.deleteDate = deleteDate;
            return this;
        }
        public String getDeleteDate() {
            return this.deleteDate;
        }

        public ListUsersInRecycleBinResponseBodyUsersUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListUsersInRecycleBinResponseBodyUsersUser setRecycleDate(String recycleDate) {
            this.recycleDate = recycleDate;
            return this;
        }
        public String getRecycleDate() {
            return this.recycleDate;
        }

        public ListUsersInRecycleBinResponseBodyUsersUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListUsersInRecycleBinResponseBodyUsersUser setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

    }

    public static class ListUsersInRecycleBinResponseBodyUsers extends TeaModel {
        @NameInMap("User")
        public java.util.List<ListUsersInRecycleBinResponseBodyUsersUser> user;

        public static ListUsersInRecycleBinResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListUsersInRecycleBinResponseBodyUsers self = new ListUsersInRecycleBinResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListUsersInRecycleBinResponseBodyUsers setUser(java.util.List<ListUsersInRecycleBinResponseBodyUsersUser> user) {
            this.user = user;
            return this;
        }
        public java.util.List<ListUsersInRecycleBinResponseBodyUsersUser> getUser() {
            return this.user;
        }

    }

}
