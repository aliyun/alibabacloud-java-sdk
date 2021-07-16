// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    // id of the request
    @NameInMap("requestId")
    public String requestId;

    // data
    @NameInMap("data")
    public java.util.List<ListUsersResponseBodyData> data;

    // 总条数
    @NameInMap("totalCount")
    public Long totalCount;

    // 分页
    @NameInMap("pageNumber")
    public Long pageNumber;

    // 分页
    @NameInMap("pageSize")
    public Long pageSize;

    public static ListUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersResponseBody self = new ListUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersResponseBody setData(java.util.List<ListUsersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUsersResponseBodyData> getData() {
        return this.data;
    }

    public ListUsersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListUsersResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListUsersResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public static class ListUsersResponseBodyData extends TeaModel {
        // 用户id
        @NameInMap("userId")
        public Long userId;

        // 子账号ramId
        @NameInMap("ramId")
        public Long ramId;

        // 用户名
        @NameInMap("username")
        public String username;

        // 手机
        @NameInMap("phone")
        public String phone;

        // 邮箱
        @NameInMap("email")
        public String email;

        // 是否可编辑
        @NameInMap("isEditableUser")
        public Long isEditableUser;

        // 账户类型
        @NameInMap("accountType")
        public Long accountType;

        public static ListUsersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyData self = new ListUsersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public ListUsersResponseBodyData setRamId(Long ramId) {
            this.ramId = ramId;
            return this;
        }
        public Long getRamId() {
            return this.ramId;
        }

        public ListUsersResponseBodyData setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ListUsersResponseBodyData setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public ListUsersResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListUsersResponseBodyData setIsEditableUser(Long isEditableUser) {
            this.isEditableUser = isEditableUser;
            return this;
        }
        public Long getIsEditableUser() {
            return this.isEditableUser;
        }

        public ListUsersResponseBodyData setAccountType(Long accountType) {
            this.accountType = accountType;
            return this;
        }
        public Long getAccountType() {
            return this.accountType;
        }

    }

}
