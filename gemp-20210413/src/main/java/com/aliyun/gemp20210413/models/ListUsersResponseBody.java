// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    // data
    @NameInMap("data")
    public java.util.List<ListUsersResponseBodyData> data;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    // id of the request
    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("accountType")
        public Long accountType;

        @NameInMap("appAccount")
        public String appAccount;

        @NameInMap("email")
        public String email;

        @NameInMap("isEditableUser")
        public Long isEditableUser;

        @NameInMap("isOperation")
        public Integer isOperation;

        @NameInMap("isRam")
        public Integer isRam;

        @NameInMap("isRelated")
        public String isRelated;

        @NameInMap("phone")
        public String phone;

        @NameInMap("ramId")
        public Long ramId;

        @NameInMap("synergyChannel")
        public String synergyChannel;

        @NameInMap("userId")
        public Long userId;

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

        public ListUsersResponseBodyData setIsOperation(Integer isOperation) {
            this.isOperation = isOperation;
            return this;
        }
        public Integer getIsOperation() {
            return this.isOperation;
        }

        public ListUsersResponseBodyData setIsRam(Integer isRam) {
            this.isRam = isRam;
            return this;
        }
        public Integer getIsRam() {
            return this.isRam;
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
