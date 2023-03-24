// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyAccountPrivilegesRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("AccountPrivileges")
    public java.util.List<ModifyAccountPrivilegesRequestAccountPrivileges> accountPrivileges;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyAccountPrivilegesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountPrivilegesRequest self = new ModifyAccountPrivilegesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccountPrivilegesRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ModifyAccountPrivilegesRequest setAccountPrivileges(java.util.List<ModifyAccountPrivilegesRequestAccountPrivileges> accountPrivileges) {
        this.accountPrivileges = accountPrivileges;
        return this;
    }
    public java.util.List<ModifyAccountPrivilegesRequestAccountPrivileges> getAccountPrivileges() {
        return this.accountPrivileges;
    }

    public ModifyAccountPrivilegesRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyAccountPrivilegesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ModifyAccountPrivilegesRequestAccountPrivilegesPrivilegeObject extends TeaModel {
        @NameInMap("Column")
        public String column;

        @NameInMap("Database")
        public String database;

        @NameInMap("Table")
        public String table;

        public static ModifyAccountPrivilegesRequestAccountPrivilegesPrivilegeObject build(java.util.Map<String, ?> map) throws Exception {
            ModifyAccountPrivilegesRequestAccountPrivilegesPrivilegeObject self = new ModifyAccountPrivilegesRequestAccountPrivilegesPrivilegeObject();
            return TeaModel.build(map, self);
        }

        public ModifyAccountPrivilegesRequestAccountPrivilegesPrivilegeObject setColumn(String column) {
            this.column = column;
            return this;
        }
        public String getColumn() {
            return this.column;
        }

        public ModifyAccountPrivilegesRequestAccountPrivilegesPrivilegeObject setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public ModifyAccountPrivilegesRequestAccountPrivilegesPrivilegeObject setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

    public static class ModifyAccountPrivilegesRequestAccountPrivileges extends TeaModel {
        @NameInMap("PrivilegeObject")
        public ModifyAccountPrivilegesRequestAccountPrivilegesPrivilegeObject privilegeObject;

        @NameInMap("PrivilegeType")
        public String privilegeType;

        @NameInMap("Privileges")
        public java.util.List<String> privileges;

        public static ModifyAccountPrivilegesRequestAccountPrivileges build(java.util.Map<String, ?> map) throws Exception {
            ModifyAccountPrivilegesRequestAccountPrivileges self = new ModifyAccountPrivilegesRequestAccountPrivileges();
            return TeaModel.build(map, self);
        }

        public ModifyAccountPrivilegesRequestAccountPrivileges setPrivilegeObject(ModifyAccountPrivilegesRequestAccountPrivilegesPrivilegeObject privilegeObject) {
            this.privilegeObject = privilegeObject;
            return this;
        }
        public ModifyAccountPrivilegesRequestAccountPrivilegesPrivilegeObject getPrivilegeObject() {
            return this.privilegeObject;
        }

        public ModifyAccountPrivilegesRequestAccountPrivileges setPrivilegeType(String privilegeType) {
            this.privilegeType = privilegeType;
            return this;
        }
        public String getPrivilegeType() {
            return this.privilegeType;
        }

        public ModifyAccountPrivilegesRequestAccountPrivileges setPrivileges(java.util.List<String> privileges) {
            this.privileges = privileges;
            return this;
        }
        public java.util.List<String> getPrivileges() {
            return this.privileges;
        }

    }

}
