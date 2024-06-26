// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainAccountsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainAccountsResponseBodyResult result;

    public static DescribeAntChainAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainAccountsResponseBody self = new DescribeAntChainAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainAccountsResponseBody setResult(DescribeAntChainAccountsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainAccountsResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAntChainAccountsResponseBodyResultAccounts extends TeaModel {
        @NameInMap("Account")
        public String account;

        @NameInMap("AccountPublicKey")
        public String accountPublicKey;

        @NameInMap("AccountRecoveryKey")
        public String accountRecoveryKey;

        @NameInMap("AccountStatus")
        public String accountStatus;

        @NameInMap("AntChainId")
        public String antChainId;

        public static DescribeAntChainAccountsResponseBodyResultAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainAccountsResponseBodyResultAccounts self = new DescribeAntChainAccountsResponseBodyResultAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainAccountsResponseBodyResultAccounts setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public DescribeAntChainAccountsResponseBodyResultAccounts setAccountPublicKey(String accountPublicKey) {
            this.accountPublicKey = accountPublicKey;
            return this;
        }
        public String getAccountPublicKey() {
            return this.accountPublicKey;
        }

        public DescribeAntChainAccountsResponseBodyResultAccounts setAccountRecoveryKey(String accountRecoveryKey) {
            this.accountRecoveryKey = accountRecoveryKey;
            return this;
        }
        public String getAccountRecoveryKey() {
            return this.accountRecoveryKey;
        }

        public DescribeAntChainAccountsResponseBodyResultAccounts setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public String getAccountStatus() {
            return this.accountStatus;
        }

        public DescribeAntChainAccountsResponseBodyResultAccounts setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

    }

    public static class DescribeAntChainAccountsResponseBodyResultPagination extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeAntChainAccountsResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainAccountsResponseBodyResultPagination self = new DescribeAntChainAccountsResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainAccountsResponseBodyResultPagination setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAntChainAccountsResponseBodyResultPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAntChainAccountsResponseBodyResultPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAntChainAccountsResponseBodyResult extends TeaModel {
        @NameInMap("Accounts")
        public java.util.List<DescribeAntChainAccountsResponseBodyResultAccounts> accounts;

        @NameInMap("Pagination")
        public DescribeAntChainAccountsResponseBodyResultPagination pagination;

        public static DescribeAntChainAccountsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainAccountsResponseBodyResult self = new DescribeAntChainAccountsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainAccountsResponseBodyResult setAccounts(java.util.List<DescribeAntChainAccountsResponseBodyResultAccounts> accounts) {
            this.accounts = accounts;
            return this;
        }
        public java.util.List<DescribeAntChainAccountsResponseBodyResultAccounts> getAccounts() {
            return this.accounts;
        }

        public DescribeAntChainAccountsResponseBodyResult setPagination(DescribeAntChainAccountsResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public DescribeAntChainAccountsResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

    }

}
