// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAccountsResponseBody extends TeaModel {
    /**
     * <p>The details of the account.</p>
     */
    @NameInMap("Accounts")
    public DescribeAccountsResponseBodyAccounts accounts;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B562A65B-39AB-4EE8-8635-5A222054FB35</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public DescribeAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAccountsResponseBodyAccountsAccount extends TeaModel {
        /**
         * <p>The description of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>Admin</p>
         */
        @NameInMap("AccountDescription")
        public String accountDescription;

        /**
         * <p>The name of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The status of the account. Valid values:</p>
         * <ul>
         * <li><strong>Unavailable</strong></li>
         * <li><strong>Available</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("AccountStatus")
        public String accountStatus;

        /**
         * <p>The role of the account. Valid values:</p>
         * <ul>
         * <li><strong>db</strong>: shard node</li>
         * <li><strong>cs</strong>: Configserver node</li>
         * <li><strong>mongos</strong>: mongos node</li>
         * <li><strong>logic</strong>: sharded cluster instance</li>
         * <li><strong>normal</strong>: replica set instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mongos</p>
         */
        @NameInMap("CharacterType")
        public String characterType;

        /**
         * <p>The ID of the instance to which the account belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-bp1fd530f271****</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

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

        public DescribeAccountsResponseBodyAccountsAccount setCharacterType(String characterType) {
            this.characterType = characterType;
            return this;
        }
        public String getCharacterType() {
            return this.characterType;
        }

        public DescribeAccountsResponseBodyAccountsAccount setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
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
