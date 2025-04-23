// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    /**
     * <p>The page number returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of users.</p>
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
         * <p>The time when the user was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-18T17:46:47</p>
         */
        @NameInMap("AddTime")
        public String addTime;

        /**
         * <p>The name of the permission group. Valid values:</p>
         * <ul>
         * <li>users: an ordinary permission group. It is applicable to ordinary users that need only to submit and debug jobs.</li>
         * <li>wheel: a sudo permission group. It is applicable to the administrator who needs to manage the cluster. In addition to submitting and debugging jobs, users who have sudo permissions can run sudo commands to install software and restart nodes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>wheel</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <p>The username of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        @NameInMap("Name")
        public String name;

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

        public ListUsersResponseBodyUsersUserInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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
