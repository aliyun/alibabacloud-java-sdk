// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainAccountsNewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainAccountsNewResponseBodyResult result;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAntChainAccountsNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainAccountsNewResponseBody self = new DescribeAntChainAccountsNewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainAccountsNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainAccountsNewResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainAccountsNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainAccountsNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainAccountsNewResponseBody setResult(DescribeAntChainAccountsNewResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainAccountsNewResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainAccountsNewResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainAccountsNewResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainAccountsNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainAccountsNewResponseBodyResultAccounts extends TeaModel {
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

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("MemberName")
        public String memberName;

        public static DescribeAntChainAccountsNewResponseBodyResultAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainAccountsNewResponseBodyResultAccounts self = new DescribeAntChainAccountsNewResponseBodyResultAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainAccountsNewResponseBodyResultAccounts setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public DescribeAntChainAccountsNewResponseBodyResultAccounts setAccountPublicKey(String accountPublicKey) {
            this.accountPublicKey = accountPublicKey;
            return this;
        }
        public String getAccountPublicKey() {
            return this.accountPublicKey;
        }

        public DescribeAntChainAccountsNewResponseBodyResultAccounts setAccountRecoveryKey(String accountRecoveryKey) {
            this.accountRecoveryKey = accountRecoveryKey;
            return this;
        }
        public String getAccountRecoveryKey() {
            return this.accountRecoveryKey;
        }

        public DescribeAntChainAccountsNewResponseBodyResultAccounts setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public String getAccountStatus() {
            return this.accountStatus;
        }

        public DescribeAntChainAccountsNewResponseBodyResultAccounts setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

        public DescribeAntChainAccountsNewResponseBodyResultAccounts setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeAntChainAccountsNewResponseBodyResultAccounts setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

    }

    public static class DescribeAntChainAccountsNewResponseBodyResultPagination extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeAntChainAccountsNewResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainAccountsNewResponseBodyResultPagination self = new DescribeAntChainAccountsNewResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainAccountsNewResponseBodyResultPagination setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAntChainAccountsNewResponseBodyResultPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAntChainAccountsNewResponseBodyResultPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAntChainAccountsNewResponseBodyResult extends TeaModel {
        @NameInMap("Accounts")
        public java.util.List<DescribeAntChainAccountsNewResponseBodyResultAccounts> accounts;

        @NameInMap("ConsortiumAdmin")
        public Boolean consortiumAdmin;

        @NameInMap("Pagination")
        public DescribeAntChainAccountsNewResponseBodyResultPagination pagination;

        public static DescribeAntChainAccountsNewResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainAccountsNewResponseBodyResult self = new DescribeAntChainAccountsNewResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainAccountsNewResponseBodyResult setAccounts(java.util.List<DescribeAntChainAccountsNewResponseBodyResultAccounts> accounts) {
            this.accounts = accounts;
            return this;
        }
        public java.util.List<DescribeAntChainAccountsNewResponseBodyResultAccounts> getAccounts() {
            return this.accounts;
        }

        public DescribeAntChainAccountsNewResponseBodyResult setConsortiumAdmin(Boolean consortiumAdmin) {
            this.consortiumAdmin = consortiumAdmin;
            return this;
        }
        public Boolean getConsortiumAdmin() {
            return this.consortiumAdmin;
        }

        public DescribeAntChainAccountsNewResponseBodyResult setPagination(DescribeAntChainAccountsNewResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public DescribeAntChainAccountsNewResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

    }

}
