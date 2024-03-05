// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListUsersAsyncResponseBody extends TeaModel {
    /**
     * <p>The ID of the asynchronous task.</p>
     */
    @NameInMap("AsyncId")
    public String asyncId;

    /**
     * <p>The status of the asynchronous task.</p>
     */
    @NameInMap("AsyncStatus")
    public String asyncStatus;

    /**
     * <p>The number of the page returned. Pages start from page 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of users.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of users.</p>
     */
    @NameInMap("Users")
    public ListUsersAsyncResponseBodyUsers users;

    public static ListUsersAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersAsyncResponseBody self = new ListUsersAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersAsyncResponseBody setAsyncId(String asyncId) {
        this.asyncId = asyncId;
        return this;
    }
    public String getAsyncId() {
        return this.asyncId;
    }

    public ListUsersAsyncResponseBody setAsyncStatus(String asyncStatus) {
        this.asyncStatus = asyncStatus;
        return this;
    }
    public String getAsyncStatus() {
        return this.asyncStatus;
    }

    public ListUsersAsyncResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUsersAsyncResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUsersAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersAsyncResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListUsersAsyncResponseBody setUsers(ListUsersAsyncResponseBodyUsers users) {
        this.users = users;
        return this;
    }
    public ListUsersAsyncResponseBodyUsers getUsers() {
        return this.users;
    }

    public static class ListUsersAsyncResponseBodyUsersUserInfo extends TeaModel {
        /**
         * <p>The time when the user was created.</p>
         */
        @NameInMap("AddTime")
        public String addTime;

        /**
         * <p>The user groups.</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <p>The user group ID.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The username of the account.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The user ID.</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListUsersAsyncResponseBodyUsersUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ListUsersAsyncResponseBodyUsersUserInfo self = new ListUsersAsyncResponseBodyUsersUserInfo();
            return TeaModel.build(map, self);
        }

        public ListUsersAsyncResponseBodyUsersUserInfo setAddTime(String addTime) {
            this.addTime = addTime;
            return this;
        }
        public String getAddTime() {
            return this.addTime;
        }

        public ListUsersAsyncResponseBodyUsersUserInfo setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public ListUsersAsyncResponseBodyUsersUserInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListUsersAsyncResponseBodyUsersUserInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUsersAsyncResponseBodyUsersUserInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListUsersAsyncResponseBodyUsers extends TeaModel {
        @NameInMap("UserInfo")
        public java.util.List<ListUsersAsyncResponseBodyUsersUserInfo> userInfo;

        public static ListUsersAsyncResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListUsersAsyncResponseBodyUsers self = new ListUsersAsyncResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListUsersAsyncResponseBodyUsers setUserInfo(java.util.List<ListUsersAsyncResponseBodyUsersUserInfo> userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public java.util.List<ListUsersAsyncResponseBodyUsersUserInfo> getUserInfo() {
            return this.userInfo;
        }

    }

}
