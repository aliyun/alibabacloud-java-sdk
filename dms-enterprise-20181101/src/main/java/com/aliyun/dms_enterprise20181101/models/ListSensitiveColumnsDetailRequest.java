// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSensitiveColumnsDetailRequest extends TeaModel {
    // The name of the field. You can call the [ListSensitiveColumns](~~188103~~) operation to obtain the name of the field.
    // 
    // >  You can also call the [ListColumns](~~141870~~) operation to obtain the name of the field.
    @NameInMap("ColumnName")
    public String columnName;

    // The ID of the database. The database can be a physical database or a logical database.
    // 
    // *   To obtain the ID of a physical database, call the [ListDatabases](~~141873~~) or [SearchDatabase](~~141876~~) operation.
    // *   To obtain the ID of a logical database, call the [ListLogicDatabases](~~141874~~) or [SearchDatabase](~~141876~~) operation.
    @NameInMap("DbId")
    public Long dbId;

    // Specifies whether the database is a logical database. Valid values:
    // 
    // *   **true**: The database is a logical database.
    // *   **false**: The database is a physical database.
    @NameInMap("Logic")
    public Boolean logic;

    // The name of the database. You can call the [ListSensitiveColumns](~~188103~~) operation to obtain the name of the database.
    // 
    // > 
    // *   You can also call the [ListDatabases](~~141873~~) or [SearchDatabase](~~141876~~) operation to obtain the name of a physical database.
    // *   You can also call the [ListLogicDatabases](~~141874~~) or [SearchDatabase](~~141876~~) operation to obtain the name of a logical database.
    @NameInMap("SchemaName")
    public String schemaName;

    // The name of the table. You can call the [ListSensitiveColumns](~~188103~~) operation to obtain the name of the table.
    // 
    // >  You can also call the [ListTables](~~141878~~) operation to obtain the name of the table.
    @NameInMap("TableName")
    public String tableName;

    // The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.
    @NameInMap("Tid")
    public Long tid;

    public static ListSensitiveColumnsDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSensitiveColumnsDetailRequest self = new ListSensitiveColumnsDetailRequest();
        return TeaModel.build(map, self);
    }

    public ListSensitiveColumnsDetailRequest setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }
    public String getColumnName() {
        return this.columnName;
    }

    public ListSensitiveColumnsDetailRequest setDbId(Long dbId) {
        this.dbId = dbId;
        return this;
    }
    public Long getDbId() {
        return this.dbId;
    }

    public ListSensitiveColumnsDetailRequest setLogic(Boolean logic) {
        this.logic = logic;
        return this;
    }
    public Boolean getLogic() {
        return this.logic;
    }

    public ListSensitiveColumnsDetailRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public ListSensitiveColumnsDetailRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ListSensitiveColumnsDetailRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
