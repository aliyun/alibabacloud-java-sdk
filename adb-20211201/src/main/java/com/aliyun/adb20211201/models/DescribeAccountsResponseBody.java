// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAccountsResponseBody extends TeaModel {
    /**
     * <p>The queried database accounts.</p>
     */
    @NameInMap("AccountList")
    public DescribeAccountsResponseBodyAccountList accountList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9CCFAAB4-97B7-5800-B9F2-685EB596E3EF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountsResponseBody self = new DescribeAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountsResponseBody setAccountList(DescribeAccountsResponseBodyAccountList accountList) {
        this.accountList = accountList;
        return this;
    }
    public DescribeAccountsResponseBodyAccountList getAccountList() {
        return this.accountList;
    }

    public DescribeAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAccountsResponseBodyAccountListDBAccount extends TeaModel {
        /**
         * <p>The description of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>test_accout_des</p>
         */
        @NameInMap("AccountDescription")
        public String accountDescription;

        /**
         * <p>The name of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>test_accout</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The status of the database account. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong></li>
         * <li><strong>Available</strong></li>
         * <li><strong>Deleting</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("AccountStatus")
        public String accountStatus;

        /**
         * <p>The type of the database account. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: standard account.</li>
         * <li><strong>Super</strong>: privileged account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The ID of the Resource Access Management (RAM) user.</p>
         * 
         * <strong>example:</strong>
         * <p>1958134230****</p>
         */
        @NameInMap("RamUsers")
        public String ramUsers;

        public static DescribeAccountsResponseBodyAccountListDBAccount build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseBodyAccountListDBAccount self = new DescribeAccountsResponseBodyAccountListDBAccount();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseBodyAccountListDBAccount setAccountDescription(String accountDescription) {
            this.accountDescription = accountDescription;
            return this;
        }
        public String getAccountDescription() {
            return this.accountDescription;
        }

        public DescribeAccountsResponseBodyAccountListDBAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeAccountsResponseBodyAccountListDBAccount setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public String getAccountStatus() {
            return this.accountStatus;
        }

        public DescribeAccountsResponseBodyAccountListDBAccount setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public DescribeAccountsResponseBodyAccountListDBAccount setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeAccountsResponseBodyAccountListDBAccount setRamUsers(String ramUsers) {
            this.ramUsers = ramUsers;
            return this;
        }
        public String getRamUsers() {
            return this.ramUsers;
        }

    }

    public static class DescribeAccountsResponseBodyAccountList extends TeaModel {
        @NameInMap("DBAccount")
        public java.util.List<DescribeAccountsResponseBodyAccountListDBAccount> DBAccount;

        public static DescribeAccountsResponseBodyAccountList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseBodyAccountList self = new DescribeAccountsResponseBodyAccountList();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseBodyAccountList setDBAccount(java.util.List<DescribeAccountsResponseBodyAccountListDBAccount> DBAccount) {
            this.DBAccount = DBAccount;
            return this;
        }
        public java.util.List<DescribeAccountsResponseBodyAccountListDBAccount> getDBAccount() {
            return this.DBAccount;
        }

    }

}
