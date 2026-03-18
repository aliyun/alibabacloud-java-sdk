// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    @NameInMap("data")
    public ListUsersResponseBodyData data;

    @NameInMap("requestId")
    public String requestId;

    public static ListUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersResponseBody self = new ListUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersResponseBody setData(ListUsersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListUsersResponseBodyData getData() {
        return this.data;
    }

    public ListUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUsersResponseBodyDataUsers extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        @NameInMap("accountName")
        public String accountName;

        @NameInMap("accountType")
        public String accountType;

        @NameInMap("displayName")
        public String displayName;

        @NameInMap("tenantId")
        public String tenantId;

        public static ListUsersResponseBodyDataUsers build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyDataUsers self = new ListUsersResponseBodyDataUsers();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyDataUsers setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListUsersResponseBodyDataUsers setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ListUsersResponseBodyDataUsers setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public ListUsersResponseBodyDataUsers setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListUsersResponseBodyDataUsers setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class ListUsersResponseBodyData extends TeaModel {
        @NameInMap("pageNumber")
        public Integer pageNumber;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("totalCount")
        public Integer totalCount;

        @NameInMap("users")
        public java.util.List<ListUsersResponseBodyDataUsers> users;

        public static ListUsersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyData self = new ListUsersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListUsersResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListUsersResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListUsersResponseBodyData setUsers(java.util.List<ListUsersResponseBodyDataUsers> users) {
            this.users = users;
            return this;
        }
        public java.util.List<ListUsersResponseBodyDataUsers> getUsers() {
            return this.users;
        }

    }

}
