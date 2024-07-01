// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyAccountPrivilegesRequest extends TeaModel {
    /**
     * <p>The name of the database account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>account1</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The permissions that you want to grant to the database account.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccountPrivileges")
    public java.util.List<ModifyAccountPrivilegesRequestAccountPrivileges> accountPrivileges;

    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1k5p066e1a****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
        /**
         * <p>The columns on which you want to grant permissions. This parameter must be specified when the PrivilegeType parameter is set to Column.</p>
         * 
         * <strong>example:</strong>
         * <p>column1</p>
         */
        @NameInMap("Column")
        public String column;

        /**
         * <p>The databases on which you want to grant permissions. This parameter must be specified when the PrivilegeType parameter is set to Database, Table, or Column.</p>
         * 
         * <strong>example:</strong>
         * <p>tsdb1</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The tables on which you want to grant permissions. This parameter must be specified when the PrivilegeType parameter is set to Table or Column.</p>
         * 
         * <strong>example:</strong>
         * <p>table1</p>
         */
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
        /**
         * <p>The objects on which you want to grant permissions, including databases, tables, and columns.</p>
         */
        @NameInMap("PrivilegeObject")
        public ModifyAccountPrivilegesRequestAccountPrivilegesPrivilegeObject privilegeObject;

        /**
         * <p>The permission level that you want to assign to the database account. You can call the <code>DescribeEnabledPrivileges</code> operation to query the permission level that can be assigned to the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>Global</p>
         */
        @NameInMap("PrivilegeType")
        public String privilegeType;

        /**
         * <p>The permissions that you want to grant to the database account.</p>
         */
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
