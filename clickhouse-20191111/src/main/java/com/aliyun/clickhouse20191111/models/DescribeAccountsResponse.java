// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeAccountsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Accounts")
    @Validation(required = true)
    public DescribeAccountsResponseAccounts accounts;

    public static DescribeAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountsResponse self = new DescribeAccountsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccountsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccountsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAccountsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAccountsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAccountsResponse setAccounts(DescribeAccountsResponseAccounts accounts) {
        this.accounts = accounts;
        return this;
    }
    public DescribeAccountsResponseAccounts getAccounts() {
        return this.accounts;
    }

    public static class DescribeAccountsResponseAccountsAccount extends TeaModel {
        @NameInMap("AccountName")
        @Validation(required = true)
        public String accountName;

        @NameInMap("AccountStatus")
        @Validation(required = true)
        public String accountStatus;

        @NameInMap("AccountDescription")
        @Validation(required = true)
        public String accountDescription;

        @NameInMap("AccountType")
        @Validation(required = true)
        public String accountType;

        public static DescribeAccountsResponseAccountsAccount build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseAccountsAccount self = new DescribeAccountsResponseAccountsAccount();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseAccountsAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeAccountsResponseAccountsAccount setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public String getAccountStatus() {
            return this.accountStatus;
        }

        public DescribeAccountsResponseAccountsAccount setAccountDescription(String accountDescription) {
            this.accountDescription = accountDescription;
            return this;
        }
        public String getAccountDescription() {
            return this.accountDescription;
        }

        public DescribeAccountsResponseAccountsAccount setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

    }

    public static class DescribeAccountsResponseAccounts extends TeaModel {
        @NameInMap("Account")
        @Validation(required = true)
        public java.util.List<DescribeAccountsResponseAccountsAccount> account;

        public static DescribeAccountsResponseAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseAccounts self = new DescribeAccountsResponseAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseAccounts setAccount(java.util.List<DescribeAccountsResponseAccountsAccount> account) {
            this.account = account;
            return this;
        }
        public java.util.List<DescribeAccountsResponseAccountsAccount> getAccount() {
            return this.account;
        }

    }

}
