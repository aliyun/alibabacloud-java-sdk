// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAccountsResponseBody extends TeaModel {
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

    public static class DescribeAccountsResponseBodyAccountsAccountRolesRole extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <strong>example:</strong>
         * <p>read</p>
         */
        @NameInMap("Role")
        public String role;

        public static DescribeAccountsResponseBodyAccountsAccountRolesRole build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseBodyAccountsAccountRolesRole self = new DescribeAccountsResponseBodyAccountsAccountRolesRole();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseBodyAccountsAccountRolesRole setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeAccountsResponseBodyAccountsAccountRolesRole setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class DescribeAccountsResponseBodyAccountsAccountRoles extends TeaModel {
        @NameInMap("Role")
        public java.util.List<DescribeAccountsResponseBodyAccountsAccountRolesRole> role;

        public static DescribeAccountsResponseBodyAccountsAccountRoles build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseBodyAccountsAccountRoles self = new DescribeAccountsResponseBodyAccountsAccountRoles();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseBodyAccountsAccountRoles setRole(java.util.List<DescribeAccountsResponseBodyAccountsAccountRolesRole> role) {
            this.role = role;
            return this;
        }
        public java.util.List<DescribeAccountsResponseBodyAccountsAccountRolesRole> getRole() {
            return this.role;
        }

    }

    public static class DescribeAccountsResponseBodyAccountsAccount extends TeaModel {
        @NameInMap("AccountDescription")
        public String accountDescription;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("AccountStatus")
        public String accountStatus;

        @NameInMap("CharacterType")
        public String characterType;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("DBName")
        public String DBName;

        @NameInMap("Roles")
        public DescribeAccountsResponseBodyAccountsAccountRoles roles;

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

        public DescribeAccountsResponseBodyAccountsAccount setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeAccountsResponseBodyAccountsAccount setRoles(DescribeAccountsResponseBodyAccountsAccountRoles roles) {
            this.roles = roles;
            return this;
        }
        public DescribeAccountsResponseBodyAccountsAccountRoles getRoles() {
            return this.roles;
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
