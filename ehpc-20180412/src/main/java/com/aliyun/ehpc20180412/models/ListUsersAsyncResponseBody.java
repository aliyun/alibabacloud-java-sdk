// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListUsersAsyncResponseBody extends TeaModel {
    @NameInMap("AsyncId")
    public String asyncId;

    @NameInMap("AsyncStatus")
    public String asyncStatus;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

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
        @NameInMap("AddTime")
        public String addTime;

        @NameInMap("Group")
        public String group;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Name")
        public String name;

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
