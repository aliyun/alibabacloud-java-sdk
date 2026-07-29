// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class RevokeTablePermissionRequest extends TeaModel {
    /**
     * <p>Specifies whether this operation applies to all tables in the schema. If true, permissions are revoked from all tables. If false or not specified, permissions are revoked only from the table specified by tableName.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("allTable")
    public Boolean allTable;

    /**
     * <p>The columns from which you want to revoke permissions. This is required only for column-level permissions.</p>
     */
    @NameInMap("columnNames")
    public java.util.List<String> columnNames;

    /**
     * <p>The database name.</p>
     * 
     * <strong>example:</strong>
     * <p>test_db</p>
     */
    @NameInMap("databaseName")
    public String databaseName;

    /**
     * <p>The permissions to revoke.</p>
     */
    @NameInMap("privileges")
    public java.util.List<String> privileges;

    /**
     * <p>The schema name.</p>
     * 
     * <strong>example:</strong>
     * <p>my_schema</p>
     */
    @NameInMap("schemaName")
    public String schemaName;

    /**
     * <p>The table name.</p>
     * 
     * <strong>example:</strong>
     * <p>my_table</p>
     */
    @NameInMap("tableName")
    public String tableName;

    /**
     * <p>The user ID. For more information, see <a href="https://help.aliyun.com/document_detail/130393.html">Hologres account overview</a>.</p>
     * 
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

    public RevokeTablePermissionRequest setColumnNames(java.util.List<String> columnNames) {
        this.columnNames = columnNames;
        return this;
    }
    public java.util.List<String> getColumnNames() {
        return this.columnNames;
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
