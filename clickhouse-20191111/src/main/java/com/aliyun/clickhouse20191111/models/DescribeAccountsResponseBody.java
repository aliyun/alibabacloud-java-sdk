// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeAccountsResponseBody extends TeaModel {
    /**
     * <p>The database accounts.</p>
     */
    @NameInMap("Accounts")
    public DescribeAccountsResponseBodyAccounts accounts;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F5178C10-1407-4987-9133-DE4DC9119F75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountsResponseBody self = new DescribeAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountsResponseBody setAccounts(DescribeAccountsResponseBodyAccounts accounts) {
        this.accounts = accounts;
        return this;
    }
    public DescribeAccountsResponseBodyAccounts getAccounts() {
        return this.accounts;
    }

    public DescribeAccountsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAccountsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccountsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAccountsResponseBodyAccountsAccount extends TeaModel {
        /**
         * <p>The description of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AccountDescription")
        public String accountDescription;

        /**
         * <p>The name of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The state of the database account. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong></li>
         * <li><strong>Available</strong></li>
         * <li><strong>AuthorityModifying</strong></li>
         * <li><strong>Deleting</strong></li>
         * </ul>
         * <blockquote>
         * <p> Only XML-configured database accounts can be in the <strong>AuthorityModifying</strong> state.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        @NameInMap("AccountStatus")
        public String accountStatus;

        /**
         * <p>The type of the database account. Valid values:</p>
         * <ul>
         * <li><strong>Super</strong>: privileged account</li>
         * <li><strong>Normal</strong>: standard account</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Super</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The configuration mode of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL</p>
         */
        @NameInMap("ConfigType")
        public String configType;

        public static DescribeAccountsResponseBodyAccountsAccount build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseBodyAccountsAccount self = new DescribeAccountsResponseBodyAccountsAccount();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseBodyAccountsAccount setAccountDescription(String accountDescription) {
            this.accountDescription = accountDescription;
            return this;
        }
        public String getAccountDescription() {
            return this.accountDescription;
        }

        public DescribeAccountsResponseBodyAccountsAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeAccountsResponseBodyAccountsAccount setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public String getAccountStatus() {
            return this.accountStatus;
        }

        public DescribeAccountsResponseBodyAccountsAccount setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public DescribeAccountsResponseBodyAccountsAccount setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

    }

    public static class DescribeAccountsResponseBodyAccounts extends TeaModel {
        @NameInMap("Account")
        public java.util.List<DescribeAccountsResponseBodyAccountsAccount> account;

        public static DescribeAccountsResponseBodyAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseBodyAccounts self = new DescribeAccountsResponseBodyAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseBodyAccounts setAccount(java.util.List<DescribeAccountsResponseBodyAccountsAccount> account) {
            this.account = account;
            return this;
        }
        public java.util.List<DescribeAccountsResponseBodyAccountsAccount> getAccount() {
            return this.account;
        }

    }

}
