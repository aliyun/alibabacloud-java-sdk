// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateInstanceAccountRequest extends TeaModel {
    /**
     * <p>The username of the account you want to create.</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("DbPrivilege")
    public java.util.List<CreateInstanceAccountRequestDbPrivilege> dbPrivilege;

    /**
     * <p>The ID of the PolarDB-X 1.0 instance for which you want to create the account.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The password of the account you want to create.</p>
     */
    @NameInMap("Password")
    public String password;

    public static CreateInstanceAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceAccountRequest self = new CreateInstanceAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateInstanceAccountRequest setDbPrivilege(java.util.List<CreateInstanceAccountRequestDbPrivilege> dbPrivilege) {
        this.dbPrivilege = dbPrivilege;
        return this;
    }
    public java.util.List<CreateInstanceAccountRequestDbPrivilege> getDbPrivilege() {
        return this.dbPrivilege;
    }

    public CreateInstanceAccountRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public CreateInstanceAccountRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public static class CreateInstanceAccountRequestDbPrivilege extends TeaModel {
        /**
         * <p>The name of the database that you want to manage by using the account to create.</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>The permissions that you want to grant to the account to manage the database.</p>
         */
        @NameInMap("Privilege")
        public String privilege;

        public static CreateInstanceAccountRequestDbPrivilege build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceAccountRequestDbPrivilege self = new CreateInstanceAccountRequestDbPrivilege();
            return TeaModel.build(map, self);
        }

        public CreateInstanceAccountRequestDbPrivilege setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public CreateInstanceAccountRequestDbPrivilege setPrivilege(String privilege) {
            this.privilege = privilege;
            return this;
        }
        public String getPrivilege() {
            return this.privilege;
        }

    }

}
