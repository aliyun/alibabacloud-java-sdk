// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSensitiveColumnsRequest extends TeaModel {
    /**
     * <p>The name of the field. You can call the [ListColumns](https://help.aliyun.com/document_detail/141870.html) operation to query the name of the field.</p>
     */
    @NameInMap("ColumnName")
    public String columnName;

    /**
     * <p>The ID of the database. You can call the [SearchDatabase](https://help.aliyun.com/document_detail/141876.html) operation to query the ID of the database.</p>
     * <br>
     * <p>>  You can also call the [ListDatabases](https://help.aliyun.com/document_detail/141873.html) operation to query the ID of the physical database and the [ListLogicDatabases](https://help.aliyun.com/document_detail/141874.html) operation to query the ID of a logical database.</p>
     */
    @NameInMap("DbId")
    public Long dbId;

    /**
     * <p>Specifies whether the database is a logical database. Valid values:</p>
     * <br>
     * <p>*   true: The database is a logical database.</p>
     * <p>*   false: The database is a physical database.</p>
     */
    @NameInMap("Logic")
    public Boolean logic;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the database. You can call the [SearchDatabase](https://help.aliyun.com/document_detail/141876.html) operation to query the name of the database.</p>
     * <br>
     * <p>>  You can also call the [ListDatabases](https://help.aliyun.com/document_detail/141873.html) operation to query the name of a physical database and the [ListLogicDatabases](https://help.aliyun.com/document_detail/141874.html) operation to query the name of a logical database.</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>The sensitivity level of the field. Valid values:</p>
     * <br>
     * <p>*   SENSITIVE: medium sensitivity level</p>
     * <p>*   CONFIDENTIAL: high sensitivity level</p>
     */
    @NameInMap("SecurityLevel")
    public String securityLevel;

    /**
     * <p>The name of the table. You can call the [ListTables](https://help.aliyun.com/document_detail/141878.html) operation to query the ID of the table.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>>  To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the "View information about the current tenant" section of the [Manage DMS tenants](https://help.aliyun.com/document_detail/181330.html) topic.</p>
     */
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
