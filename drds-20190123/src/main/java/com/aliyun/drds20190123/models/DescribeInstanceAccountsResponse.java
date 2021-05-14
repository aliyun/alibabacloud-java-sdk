// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeInstanceAccountsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("InstanceAccounts")
    @Validation(required = true)
    public DescribeInstanceAccountsResponseInstanceAccounts instanceAccounts;

    public static DescribeInstanceAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAccountsResponse self = new DescribeInstanceAccountsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAccountsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceAccountsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeInstanceAccountsResponse setInstanceAccounts(DescribeInstanceAccountsResponseInstanceAccounts instanceAccounts) {
        this.instanceAccounts = instanceAccounts;
        return this;
    }
    public DescribeInstanceAccountsResponseInstanceAccounts getInstanceAccounts() {
        return this.instanceAccounts;
    }

    public static class DescribeInstanceAccountsResponseInstanceAccountsInstanceAccountDbPrivilegesDbPrivilege extends TeaModel {
        @NameInMap("DbName")
        @Validation(required = true)
        public String dbName;

        @NameInMap("Privilege")
        @Validation(required = true)
        public String privilege;

        public static DescribeInstanceAccountsResponseInstanceAccountsInstanceAccountDbPrivilegesDbPrivilege build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAccountsResponseInstanceAccountsInstanceAccountDbPrivilegesDbPrivilege self = new DescribeInstanceAccountsResponseInstanceAccountsInstanceAccountDbPrivilegesDbPrivilege();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAccountsResponseInstanceAccountsInstanceAccountDbPrivilegesDbPrivilege setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeInstanceAccountsResponseInstanceAccountsInstanceAccountDbPrivilegesDbPrivilege setPrivilege(String privilege) {
            this.privilege = privilege;
            return this;
        }
        public String getPrivilege() {
            return this.privilege;
        }

    }

    public static class DescribeInstanceAccountsResponseInstanceAccountsInstanceAccountDbPrivileges extends TeaModel {
        @NameInMap("DbPrivilege")
        @Validation(required = true)
        public java.util.List<DescribeInstanceAccountsResponseInstanceAccountsInstanceAccountDbPrivilegesDbPrivilege> dbPrivilege;

        public static DescribeInstanceAccountsResponseInstanceAccountsInstanceAccountDbPrivileges build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAccountsResponseInstanceAccountsInstanceAccountDbPrivileges self = new DescribeInstanceAccountsResponseInstanceAccountsInstanceAccountDbPrivileges();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAccountsResponseInstanceAccountsInstanceAccountDbPrivileges setDbPrivilege(java.util.List<DescribeInstanceAccountsResponseInstanceAccountsInstanceAccountDbPrivilegesDbPrivilege> dbPrivilege) {
            this.dbPrivilege = dbPrivilege;
            return this;
        }
        public java.util.List<DescribeInstanceAccountsResponseInstanceAccountsInstanceAccountDbPrivilegesDbPrivilege> getDbPrivilege() {
            return this.dbPrivilege;
        }

    }

    public static class DescribeInstanceAccountsResponseInstanceAccountsInstanceAccount extends TeaModel {
        @NameInMap("AccountName")
        @Validation(required = true)
        public String accountName;

        @NameInMap("Host")
        @Validation(required = true)
        public String host;

        @NameInMap("AccountType")
        @Validation(required = true)
        public Integer accountType;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("DbPrivileges")
        @Validation(required = true)
        public DescribeInstanceAccountsResponseInstanceAccountsInstanceAccountDbPrivileges dbPrivileges;

        public static DescribeInstanceAccountsResponseInstanceAccountsInstanceAccount build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAccountsResponseInstanceAccountsInstanceAccount self = new DescribeInstanceAccountsResponseInstanceAccountsInstanceAccount();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAccountsResponseInstanceAccountsInstanceAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeInstanceAccountsResponseInstanceAccountsInstanceAccount setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeInstanceAccountsResponseInstanceAccountsInstanceAccount setAccountType(Integer accountType) {
            this.accountType = accountType;
            return this;
        }
        public Integer getAccountType() {
            return this.accountType;
        }

        public DescribeInstanceAccountsResponseInstanceAccountsInstanceAccount setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstanceAccountsResponseInstanceAccountsInstanceAccount setDbPrivileges(DescribeInstanceAccountsResponseInstanceAccountsInstanceAccountDbPrivileges dbPrivileges) {
            this.dbPrivileges = dbPrivileges;
            return this;
        }
        public DescribeInstanceAccountsResponseInstanceAccountsInstanceAccountDbPrivileges getDbPrivileges() {
            return this.dbPrivileges;
        }

    }

    public static class DescribeInstanceAccountsResponseInstanceAccounts extends TeaModel {
        @NameInMap("InstanceAccount")
        @Validation(required = true)
        public java.util.List<DescribeInstanceAccountsResponseInstanceAccountsInstanceAccount> instanceAccount;

        public static DescribeInstanceAccountsResponseInstanceAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAccountsResponseInstanceAccounts self = new DescribeInstanceAccountsResponseInstanceAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAccountsResponseInstanceAccounts setInstanceAccount(java.util.List<DescribeInstanceAccountsResponseInstanceAccountsInstanceAccount> instanceAccount) {
            this.instanceAccount = instanceAccount;
            return this;
        }
        public java.util.List<DescribeInstanceAccountsResponseInstanceAccountsInstanceAccount> getInstanceAccount() {
            return this.instanceAccount;
        }

    }

}
