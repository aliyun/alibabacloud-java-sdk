// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeAccountsResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeAccountsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountsResponseBody self = new DescribeAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountsResponseBody setData(DescribeAccountsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAccountsResponseBodyData getData() {
        return this.data;
    }

    public DescribeAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAccountsResponseBodyDataAccounts extends TeaModel {
        @NameInMap("Account")
        public String account;

        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("Description")
        public String description;

        @NameInMap("Status")
        public String status;

        public static DescribeAccountsResponseBodyDataAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseBodyDataAccounts self = new DescribeAccountsResponseBodyDataAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseBodyDataAccounts setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public DescribeAccountsResponseBodyDataAccounts setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public DescribeAccountsResponseBodyDataAccounts setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAccountsResponseBodyDataAccounts setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeAccountsResponseBodyData extends TeaModel {
        @NameInMap("Accounts")
        public java.util.List<DescribeAccountsResponseBodyDataAccounts> accounts;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeAccountsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseBodyData self = new DescribeAccountsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseBodyData setAccounts(java.util.List<DescribeAccountsResponseBodyDataAccounts> accounts) {
            this.accounts = accounts;
            return this;
        }
        public java.util.List<DescribeAccountsResponseBodyDataAccounts> getAccounts() {
            return this.accounts;
        }

        public DescribeAccountsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAccountsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAccountsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
