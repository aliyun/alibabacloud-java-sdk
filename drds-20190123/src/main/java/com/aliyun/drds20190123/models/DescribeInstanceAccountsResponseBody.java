// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeInstanceAccountsResponseBody extends TeaModel {
    @NameInMap("InstanceAccounts")
    public DescribeInstanceAccountsResponseBodyInstanceAccounts instanceAccounts;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeInstanceAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAccountsResponseBody self = new DescribeInstanceAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAccountsResponseBody setInstanceAccounts(DescribeInstanceAccountsResponseBodyInstanceAccounts instanceAccounts) {
        this.instanceAccounts = instanceAccounts;
        return this;
    }
    public DescribeInstanceAccountsResponseBodyInstanceAccounts getInstanceAccounts() {
        return this.instanceAccounts;
    }

    public DescribeInstanceAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceAccountsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccountDbPrivilegesDbPrivilege extends TeaModel {
        @NameInMap("DbName")
        public String dbName;

        @NameInMap("Privilege")
        public String privilege;

        public static DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccountDbPrivilegesDbPrivilege build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccountDbPrivilegesDbPrivilege self = new DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccountDbPrivilegesDbPrivilege();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccountDbPrivilegesDbPrivilege setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccountDbPrivilegesDbPrivilege setPrivilege(String privilege) {
            this.privilege = privilege;
            return this;
        }
        public String getPrivilege() {
            return this.privilege;
        }

    }

    public static class DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccountDbPrivileges extends TeaModel {
        @NameInMap("DbPrivilege")
        public java.util.List<DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccountDbPrivilegesDbPrivilege> dbPrivilege;

        public static DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccountDbPrivileges build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccountDbPrivileges self = new DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccountDbPrivileges();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccountDbPrivileges setDbPrivilege(java.util.List<DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccountDbPrivilegesDbPrivilege> dbPrivilege) {
            this.dbPrivilege = dbPrivilege;
            return this;
        }
        public java.util.List<DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccountDbPrivilegesDbPrivilege> getDbPrivilege() {
            return this.dbPrivilege;
        }

    }

    public static class DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccount extends TeaModel {
        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("AccountType")
        public Integer accountType;

        @NameInMap("DbPrivileges")
        public DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccountDbPrivileges dbPrivileges;

        @NameInMap("Description")
        public String description;

        @NameInMap("Host")
        public String host;

        public static DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccount build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccount self = new DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccount();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccount setAccountType(Integer accountType) {
            this.accountType = accountType;
            return this;
        }
        public Integer getAccountType() {
            return this.accountType;
        }

        public DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccount setDbPrivileges(DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccountDbPrivileges dbPrivileges) {
            this.dbPrivileges = dbPrivileges;
            return this;
        }
        public DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccountDbPrivileges getDbPrivileges() {
            return this.dbPrivileges;
        }

        public DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccount setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccount setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

    }

    public static class DescribeInstanceAccountsResponseBodyInstanceAccounts extends TeaModel {
        @NameInMap("InstanceAccount")
        public java.util.List<DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccount> instanceAccount;

        public static DescribeInstanceAccountsResponseBodyInstanceAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAccountsResponseBodyInstanceAccounts self = new DescribeInstanceAccountsResponseBodyInstanceAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAccountsResponseBodyInstanceAccounts setInstanceAccount(java.util.List<DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccount> instanceAccount) {
            this.instanceAccount = instanceAccount;
            return this;
        }
        public java.util.List<DescribeInstanceAccountsResponseBodyInstanceAccountsInstanceAccount> getInstanceAccount() {
            return this.instanceAccount;
        }

    }

}
