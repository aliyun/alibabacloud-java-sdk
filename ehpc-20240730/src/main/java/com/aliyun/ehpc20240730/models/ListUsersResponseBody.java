// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The information about the users.</p>
     */
    @NameInMap("Users")
    public ListUsersResponseBodyUsers users;

    public static ListUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersResponseBody self = new ListUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUsersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListUsersResponseBody setUsers(ListUsersResponseBodyUsers users) {
        this.users = users;
        return this;
    }
    public ListUsersResponseBodyUsers getUsers() {
        return this.users;
    }

    public static class ListUsersResponseBodyUsersUserInfo extends TeaModel {
        /**
         * <p>The time when the user was first added.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-08-22T17:46:47</p>
         */
        @NameInMap("AddTime")
        public String addTime;

        /**
         * <p>The name of the permission group. Valid values:</p>
         * <p>users: ordinary permissions, which are suitable for regular users that need only to submit and debug jobs.</p>
         * <p>wheel: sudo permissions, which are suitable for administrators who need to manage clusters. In addition to submitting and debugging jobs, you can also run sudo commands to install software and restart nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>users</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <p>The permission group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>testuser</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static ListUsersResponseBodyUsersUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUsersUserInfo self = new ListUsersResponseBodyUsersUserInfo();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUsersUserInfo setAddTime(String addTime) {
            this.addTime = addTime;
            return this;
        }
        public String getAddTime() {
            return this.addTime;
        }

        public ListUsersResponseBodyUsersUserInfo setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public ListUsersResponseBodyUsersUserInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListUsersResponseBodyUsersUserInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListUsersResponseBodyUsersUserInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ListUsersResponseBodyUsers extends TeaModel {
        @NameInMap("UserInfo")
        public java.util.List<ListUsersResponseBodyUsersUserInfo> userInfo;

        public static ListUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUsers self = new ListUsersResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUsers setUserInfo(java.util.List<ListUsersResponseBodyUsersUserInfo> userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public java.util.List<ListUsersResponseBodyUsersUserInfo> getUserInfo() {
            return this.userInfo;
        }

    }

}
