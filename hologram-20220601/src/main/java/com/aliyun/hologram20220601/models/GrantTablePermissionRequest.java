// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GrantTablePermissionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("allTable")
    public Boolean allTable;

    /**
     * <strong>example:</strong>
     * <p>my_db</p>
     */
    @NameInMap("databaseName")
    public String databaseName;

    @NameInMap("privileges")
    public java.util.List<String> privileges;

    /**
     * <strong>example:</strong>
     * <p>my_schema</p>
     */
    @NameInMap("schemaName")
    public String schemaName;

    /**
     * <strong>example:</strong>
     * <p>orders_pay</p>
     */
    @NameInMap("tableName")
    public String tableName;

    /**
     * <strong>example:</strong>
     * <p>p4_1234xxxx</p>
     */
    @NameInMap("userName")
    public String userName;

    public static GrantTablePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantTablePermissionRequest self = new GrantTablePermissionRequest();
        return TeaModel.build(map, self);
    }

    public GrantTablePermissionRequest setAllTable(Boolean allTable) {
        this.allTable = allTable;
        return this;
    }
    public Boolean getAllTable() {
        return this.allTable;
    }

    public GrantTablePermissionRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public GrantTablePermissionRequest setPrivileges(java.util.List<String> privileges) {
        this.privileges = privileges;
        return this;
    }
    public java.util.List<String> getPrivileges() {
        return this.privileges;
    }

    public GrantTablePermissionRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public GrantTablePermissionRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public GrantTablePermissionRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
