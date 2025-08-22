// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListUsersInRecycleBinResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the response is truncated. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The parameter that is used to obtain the truncated part. It takes effect only when <code>IsTruncated</code> is set to <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>EXAMPLE</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3687BD52-49FD-585B-AB14-CD05B7C76963</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the RAM users.</p>
     */
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
        /**
         * <p>The time when the RAM user was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-12T09:12:00Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The time when the RAM user will be permanently deleted from the recycle bin.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-15T09:12:00Z</p>
         */
        @NameInMap("DeleteDate")
        public String deleteDate;

        /**
         * <p>The display name of the RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The time when the RAM user was deleted and moved to the recycle bin.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-15T09:12:00Z</p>
         */
        @NameInMap("RecycleDate")
        public String recycleDate;

        /**
         * <p>The ID of the RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p>20732900249392****</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The logon name of the RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
         */
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
