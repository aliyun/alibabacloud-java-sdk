// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateInstanceAccountRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("DbPrivilege")
    public java.util.List<CreateInstanceAccountRequestDbPrivilege> dbPrivilege;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

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
        @NameInMap("DbName")
        public String dbName;

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
