// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSensitiveColumnsRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to **ListSensitiveColumns**.</p>
     */
    @NameInMap("ColumnName")
    public String columnName;

    /**
     * <p>1860</p>
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
     * <p>The error message.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The number of entries to return on each page.</p>
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
     * <p>The error code.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The name of the table. You can call the [ListTables](~~141878~~) operation to query the ID of the table.</p>
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
