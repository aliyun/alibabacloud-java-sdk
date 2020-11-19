// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ModifyAccountPrivilegeRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("AccountName")
    @Validation(required = true)
    public String accountName;

    @NameInMap("DbPrivilege")
    @Validation(required = true)
    public java.util.List<ModifyAccountPrivilegeRequestDbPrivilege> dbPrivilege;

    public static ModifyAccountPrivilegeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountPrivilegeRequest self = new ModifyAccountPrivilegeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccountPrivilegeRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public ModifyAccountPrivilegeRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ModifyAccountPrivilegeRequest setDbPrivilege(java.util.List<ModifyAccountPrivilegeRequestDbPrivilege> dbPrivilege) {
        this.dbPrivilege = dbPrivilege;
        return this;
    }
    public java.util.List<ModifyAccountPrivilegeRequestDbPrivilege> getDbPrivilege() {
        return this.dbPrivilege;
    }

    public static class ModifyAccountPrivilegeRequestDbPrivilege extends TeaModel {
        @NameInMap("DbName")
        public String dbName;

        @NameInMap("Privilege")
        public String privilege;

        public static ModifyAccountPrivilegeRequestDbPrivilege build(java.util.Map<String, ?> map) throws Exception {
            ModifyAccountPrivilegeRequestDbPrivilege self = new ModifyAccountPrivilegeRequestDbPrivilege();
            return TeaModel.build(map, self);
        }

        public ModifyAccountPrivilegeRequestDbPrivilege setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public ModifyAccountPrivilegeRequestDbPrivilege setPrivilege(String privilege) {
            this.privilege = privilege;
            return this;
        }
        public String getPrivilege() {
            return this.privilege;
        }

    }

}
