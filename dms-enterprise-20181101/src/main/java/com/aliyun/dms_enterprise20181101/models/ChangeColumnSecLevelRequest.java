// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ChangeColumnSecLevelRequest extends TeaModel {
    // The name of the field. You can call the [ListSensitiveColumns](~~188103~~) operation to query the name of the field.
    // 
    // >  You can also call the [ListColumns](~~141870~~) operation to query the name of the field.
    @NameInMap("ColumnName")
    public String columnName;

    // The ID of the database. You can call the [SearchDatabase](~~141876~~) operation to query the ID of the database.
    // 
    // >  You can also call the [ListDatabases](~~141873~~) operation to query the ID of a physical database and the [ListLogicDatabases](~~141874~~) operation to query the ID of a logical database.
    @NameInMap("DbId")
    public Long dbId;

    // Specifies whether the database is a logical database. Valid values:
    // 
    // *   true: The database is a physical database.
    // *   false: The database is a logical database.
    @NameInMap("IsLogic")
    public Boolean isLogic;

    // The new sensitivity level of the field that you want to specify. Valid values:
    // 
    // *   INNER: low sensitivity level
    // *   SENSITIVE: medium sensitivity level
    // *   CONFIDENTIAL: high sensitivity level
    @NameInMap("NewLevel")
    public String newLevel;

    // The name of the database. You can call the [ListSensitiveColumns](~~188103~~) operation to query the name of the database.
    // 
    // *   You can also call the [SearchDatabase](~~141876~~) operation to query the name of the database.
    // *   You can also call the [ListDatabases](~~141873~~) operation to query the name of a physical database and the [ListLogicDatabases](~~141874~~) operation to query the name of a logical database.
    @NameInMap("SchemaName")
    public String schemaName;

    // The name of the table. You can call the [ListSensitiveColumns](~~188103~~) operation to query the name of the table.
    // 
    // >  You can also call the [ListTables](~~141878~~) operation to query the name of the table.
    @NameInMap("TableName")
    public String tableName;

    // The ID of the tenant.
    // 
    // >  To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the "View information about the current tenant" section of the [Manage DMS tenants](~~181330~~) topic.
    @NameInMap("Tid")
    public Long tid;

    public static ChangeColumnSecLevelRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeColumnSecLevelRequest self = new ChangeColumnSecLevelRequest();
        return TeaModel.build(map, self);
    }

    public ChangeColumnSecLevelRequest setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }
    public String getColumnName() {
        return this.columnName;
    }

    public ChangeColumnSecLevelRequest setDbId(Long dbId) {
        this.dbId = dbId;
        return this;
    }
    public Long getDbId() {
        return this.dbId;
    }

    public ChangeColumnSecLevelRequest setIsLogic(Boolean isLogic) {
        this.isLogic = isLogic;
        return this;
    }
    public Boolean getIsLogic() {
        return this.isLogic;
    }

    public ChangeColumnSecLevelRequest setNewLevel(String newLevel) {
        this.newLevel = newLevel;
        return this;
    }
    public String getNewLevel() {
        return this.newLevel;
    }

    public ChangeColumnSecLevelRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public ChangeColumnSecLevelRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ChangeColumnSecLevelRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
