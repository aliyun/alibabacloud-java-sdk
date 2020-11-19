// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateInstanceAccountRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("AccountName")
    @Validation(required = true)
    public String accountName;

    @NameInMap("Password")
    @Validation(required = true)
    public String password;

    @NameInMap("DbPrivilege")
    @Validation(required = true)
    public java.util.List<CreateInstanceAccountRequestDbPrivilege> dbPrivilege;

    public static CreateInstanceAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceAccountRequest self = new CreateInstanceAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceAccountRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public CreateInstanceAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateInstanceAccountRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateInstanceAccountRequest setDbPrivilege(java.util.List<CreateInstanceAccountRequestDbPrivilege> dbPrivilege) {
        this.dbPrivilege = dbPrivilege;
        return this;
    }
    public java.util.List<CreateInstanceAccountRequestDbPrivilege> getDbPrivilege() {
        return this.dbPrivilege;
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
