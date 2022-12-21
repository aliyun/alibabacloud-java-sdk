// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSensitiveColumnsRequest extends TeaModel {
    // The name of the field. You can call the [ListColumns](~~141870~~) operation to query the name of the field.
    @NameInMap("ColumnName")
    public String columnName;

    // The ID of the database. You can call the [SearchDatabase](~~141876~~) operation to query the ID of the database.
    // 
    // >  You can also call the [ListDatabases](~~141873~~) operation to query the ID of the physical database and the [ListLogicDatabases](~~141874~~) operation to query the ID of a logical database.
    @NameInMap("DbId")
    public Long dbId;

    // Specifies whether the database is a logical database. Valid values:
    // 
    // *   true: The database is a logical database.
    // *   false: The database is a physical database.
    @NameInMap("Logic")
    public Boolean logic;

    // The number of the page to return.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The name of the database. You can call the [SearchDatabase](~~141876~~) operation to query the name of the database.
    // 
    // >  You can also call the [ListDatabases](~~141873~~) operation to query the name of a physical database and the [ListLogicDatabases](~~141874~~) operation to query the name of a logical database.
    @NameInMap("SchemaName")
    public String schemaName;

    // The sensitivity level of the field. Valid values:
    // 
    // *   SENSITIVE: medium sensitivity level
    // *   CONFIDENTIAL: high sensitivity level
    @NameInMap("SecurityLevel")
    public String securityLevel;

    // The name of the table. You can call the [ListTables](~~141878~~) operation to query the ID of the table.
    @NameInMap("TableName")
    public String tableName;

    // The ID of the tenant.
    // 
    // >  To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the "View information about the current tenant" section of the [Manage DMS tenants](~~181330~~) topic.
    @NameInMap("Tid")
    public Long tid;

    public static ListSensitiveColumnsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSensitiveColumnsRequest self = new ListSensitiveColumnsRequest();
        return TeaModel.build(map, self);
    }

    public ListSensitiveColumnsRequest setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }
    public String getColumnName() {
        return this.columnName;
    }

    public ListSensitiveColumnsRequest setDbId(Long dbId) {
        this.dbId = dbId;
        return this;
    }
    public Long getDbId() {
        return this.dbId;
    }

    public ListSensitiveColumnsRequest setLogic(Boolean logic) {
        this.logic = logic;
        return this;
    }
    public Boolean getLogic() {
        return this.logic;
    }

    public ListSensitiveColumnsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSensitiveColumnsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSensitiveColumnsRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public ListSensitiveColumnsRequest setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
        return this;
    }
    public String getSecurityLevel() {
        return this.securityLevel;
    }

    public ListSensitiveColumnsRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ListSensitiveColumnsRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
