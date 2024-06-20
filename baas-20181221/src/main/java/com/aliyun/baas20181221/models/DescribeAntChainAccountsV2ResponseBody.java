// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainAccountsV2ResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D68D66B6-1964-4073-8714-B49F5EF1AEFC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainAccountsV2ResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("ResultMessage")
    public String resultMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeAntChainAccountsV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainAccountsV2ResponseBody self = new DescribeAntChainAccountsV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainAccountsV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainAccountsV2ResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainAccountsV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainAccountsV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainAccountsV2ResponseBody setResult(DescribeAntChainAccountsV2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainAccountsV2ResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainAccountsV2ResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainAccountsV2ResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainAccountsV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainAccountsV2ResponseBodyResultAccounts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <strong>example:</strong>
         * <p>2aa43bae103b6840ce8efdfe6f3fe5e52f8d1db0f44ff762df87ba17eb209979a0e22c934b2728c6c1bab864a6da52de60c5da89793bd839650a1a153e876e32</p>
         */
        @NameInMap("AccountPublicKey")
        public String accountPublicKey;

        /**
         * <strong>example:</strong>
         * <p>5a36312d78681794258bb33372586c676adf150ad69e67dbfcaae61bba3607705950bc9efe1bf4a17ac24b05b1615a410e48d2a005dca251c6173495bb47ae29</p>
         */
        @NameInMap("AccountRecoveryKey")
        public String accountRecoveryKey;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("AccountStatus")
        public String accountStatus;

        /**
         * <strong>example:</strong>
         * <p>8bd720bde18c4b37b0f4a1c7834db163</p>
         */
        @NameInMap("AntChainId")
        public String antChainId;

        public static DescribeAntChainAccountsV2ResponseBodyResultAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainAccountsV2ResponseBodyResultAccounts self = new DescribeAntChainAccountsV2ResponseBodyResultAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainAccountsV2ResponseBodyResultAccounts setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public DescribeAntChainAccountsV2ResponseBodyResultAccounts setAccountPublicKey(String accountPublicKey) {
            this.accountPublicKey = accountPublicKey;
            return this;
        }
        public String getAccountPublicKey() {
            return this.accountPublicKey;
        }

        public DescribeAntChainAccountsV2ResponseBodyResultAccounts setAccountRecoveryKey(String accountRecoveryKey) {
            this.accountRecoveryKey = accountRecoveryKey;
            return this;
        }
        public String getAccountRecoveryKey() {
            return this.accountRecoveryKey;
        }

        public DescribeAntChainAccountsV2ResponseBodyResultAccounts setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public String getAccountStatus() {
            return this.accountStatus;
        }

        public DescribeAntChainAccountsV2ResponseBodyResultAccounts setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

    }

    public static class DescribeAntChainAccountsV2ResponseBodyResultPagination extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeAntChainAccountsV2ResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainAccountsV2ResponseBodyResultPagination self = new DescribeAntChainAccountsV2ResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainAccountsV2ResponseBodyResultPagination setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAntChainAccountsV2ResponseBodyResultPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAntChainAccountsV2ResponseBodyResultPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAntChainAccountsV2ResponseBodyResult extends TeaModel {
        @NameInMap("Accounts")
        public java.util.List<DescribeAntChainAccountsV2ResponseBodyResultAccounts> accounts;

        @NameInMap("Pagination")
        public DescribeAntChainAccountsV2ResponseBodyResultPagination pagination;

        public static DescribeAntChainAccountsV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainAccountsV2ResponseBodyResult self = new DescribeAntChainAccountsV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainAccountsV2ResponseBodyResult setAccounts(java.util.List<DescribeAntChainAccountsV2ResponseBodyResultAccounts> accounts) {
            this.accounts = accounts;
            return this;
        }
        public java.util.List<DescribeAntChainAccountsV2ResponseBodyResultAccounts> getAccounts() {
            return this.accounts;
        }

        public DescribeAntChainAccountsV2ResponseBodyResult setPagination(DescribeAntChainAccountsV2ResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public DescribeAntChainAccountsV2ResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

    }

}
