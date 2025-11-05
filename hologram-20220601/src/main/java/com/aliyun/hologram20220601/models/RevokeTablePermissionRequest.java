// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class RevokeTablePermissionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("allTable")
    public Boolean allTable;

    /**
     * <strong>example:</strong>
     * <p>test_db</p>
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
     * <p>my_table</p>
     */
    @NameInMap("tableName")
    public String tableName;

    /**
     * <strong>example:</strong>
     * <p>p4_1234xxxx</p>
     */
    @NameInMap("userName")
    public String userName;

    public static RevokeTablePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeTablePermissionRequest self = new RevokeTablePermissionRequest();
        return TeaModel.build(map, self);
    }

    public RevokeTablePermissionRequest setAllTable(Boolean allTable) {
        this.allTable = allTable;
        return this;
    }
    public Boolean getAllTable() {
        return this.allTable;
    }

    public RevokeTablePermissionRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public RevokeTablePermissionRequest setPrivileges(java.util.List<String> privileges) {
        this.privileges = privileges;
        return this;
    }
    public java.util.List<String> getPrivileges() {
        return this.privileges;
    }

    public RevokeTablePermissionRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public RevokeTablePermissionRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public RevokeTablePermissionRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
