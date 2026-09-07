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
     * <p>The list of granted permissions.</p>
     */
    @NameInMap("AccountPrivileges")
    public java.util.List<ModifyAccountPrivilegesRequestAccountPrivileges> accountPrivileges;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The cluster ID of the Enterprise Edition, Basic Edition, or Data Lakehouse Edition cluster.
     * &lt;props=&quot;intl&quot;&gt;The cluster ID of the Data Lakehouse Edition cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1k5p066e1a****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("PromqlInsertPrivileges")
    public java.util.List<String> promqlInsertPrivileges;

    @NameInMap("PromqlSelectNodePercentage")
    public Double promqlSelectNodePercentage;

    @NameInMap("PromqlSelectPrivileges")
    public java.util.List<String> promqlSelectPrivileges;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

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

    public ModifyAccountPrivilegesRequest setPromqlInsertPrivileges(java.util.List<String> promqlInsertPrivileges) {
        this.promqlInsertPrivileges = promqlInsertPrivileges;
        return this;
    }
    public java.util.List<String> getPromqlInsertPrivileges() {
        return this.promqlInsertPrivileges;
    }

    public ModifyAccountPrivilegesRequest setPromqlSelectNodePercentage(Double promqlSelectNodePercentage) {
        this.promqlSelectNodePercentage = promqlSelectNodePercentage;
        return this;
    }
    public Double getPromqlSelectNodePercentage() {
        return this.promqlSelectNodePercentage;
    }

    public ModifyAccountPrivilegesRequest setPromqlSelectPrivileges(java.util.List<String> promqlSelectPrivileges) {
        this.promqlSelectPrivileges = promqlSelectPrivileges;
        return this;
    }
    public java.util.List<String> getPromqlSelectPrivileges() {
        return this.promqlSelectPrivileges;
    }

    public ModifyAccountPrivilegesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyAccountPrivilegesRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public static class ModifyAccountPrivilegesRequestAccountPrivilegesPrivilegeObject extends TeaModel {
        /**
         * <p>The column to which permissions are granted. This parameter is required when the privilege level is column.</p>
         * 
         * <strong>example:</strong>
         * <p>column1</p>
         */
        @NameInMap("Column")
        public String column;

        /**
         * <p>The database to which permissions are granted. This parameter is required when the privilege level is database, table, or column.</p>
         * 
         * <strong>example:</strong>
         * <p>tsdb1</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The table to which permissions are granted. This parameter is required when the privilege level is table or column.</p>
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
         * <p>The privilege object, which is a tuple of database, table, and column.</p>
         */
        @NameInMap("PrivilegeObject")
        public ModifyAccountPrivilegesRequestAccountPrivilegesPrivilegeObject privilegeObject;

        /**
         * <p>The privilege level, obtained from the <code>DescribeEnabledPrivileges</code> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Global</p>
         */
        @NameInMap("PrivilegeType")
        public String privilegeType;

        /**
         * <p>The list of granted permissions.</p>
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
