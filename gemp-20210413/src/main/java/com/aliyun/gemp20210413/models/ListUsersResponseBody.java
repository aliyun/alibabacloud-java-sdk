// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    // data
    @NameInMap("data")
    public java.util.List<ListUsersResponseBodyData> data;

    // 分页
    @NameInMap("pageNumber")
    public Long pageNumber;

    // 分页
    @NameInMap("pageSize")
    public Long pageSize;

    // id of the request
    @NameInMap("requestId")
    public String requestId;

    // 总条数
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersResponseBody self = new ListUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersResponseBody setData(java.util.List<ListUsersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUsersResponseBodyData> getData() {
        return this.data;
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

    public ListUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListUsersResponseBodyData extends TeaModel {
        // 账户类型
        @NameInMap("accountType")
        public Long accountType;

        // 移动应用账户
        @NameInMap("appAccount")
        public String appAccount;

        // 邮箱
        @NameInMap("email")
        public String email;

        // 是否可编辑
        @NameInMap("isEditableUser")
        public Long isEditableUser;

        // 是否关联
        @NameInMap("isRelated")
        public String isRelated;

        // 手机
        @NameInMap("phone")
        public String phone;

        // 子账号ramId
        @NameInMap("ramId")
        public Long ramId;

        // 移动应用协同渠道
        @NameInMap("synergyChannel")
        public String synergyChannel;

        // 用户id
        @NameInMap("userId")
        public Long userId;

        // 用户名
        @NameInMap("username")
        public String username;

        public static ListUsersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyData self = new ListUsersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyData setAccountType(Long accountType) {
            this.accountType = accountType;
            return this;
        }
        public Long getAccountType() {
            return this.accountType;
        }

        public ListUsersResponseBodyData setAppAccount(String appAccount) {
            this.appAccount = appAccount;
            return this;
        }
        public String getAppAccount() {
            return this.appAccount;
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

        public ListUsersResponseBodyData setIsRelated(String isRelated) {
            this.isRelated = isRelated;
            return this;
        }
        public String getIsRelated() {
            return this.isRelated;
        }

        public ListUsersResponseBodyData setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public ListUsersResponseBodyData setRamId(Long ramId) {
            this.ramId = ramId;
            return this;
        }
        public Long getRamId() {
            return this.ramId;
        }

        public ListUsersResponseBodyData setSynergyChannel(String synergyChannel) {
            this.synergyChannel = synergyChannel;
            return this;
        }
        public String getSynergyChannel() {
            return this.synergyChannel;
        }

        public ListUsersResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public ListUsersResponseBodyData setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
