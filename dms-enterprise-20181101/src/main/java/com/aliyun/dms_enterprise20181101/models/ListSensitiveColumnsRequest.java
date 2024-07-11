// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSensitiveColumnsRequest extends TeaModel {
    /**
     * <p>The name of the field. You can call the <a href="https://help.aliyun.com/document_detail/141870.html">ListColumns</a> operation to query the name of the field.</p>
     * 
     * <strong>example:</strong>
     * <p>test_column</p>
     */
    @NameInMap("ColumnName")
    public String columnName;

    /**
     * <p>The ID of the database. You can call the <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation to query the ID of the database.</p>
     * <blockquote>
     * <p> You can also call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> operation to query the ID of the physical database and the <a href="https://help.aliyun.com/document_detail/141874.html">ListLogicDatabases</a> operation to query the ID of a logical database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1860</p>
     */
    @NameInMap("DbId")
    public Long dbId;

    /**
     * <p>Specifies whether the database is a logical database. Valid values:</p>
     * <ul>
     * <li>true: The database is a logical database.</li>
     * <li>false: The database is a physical database.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Logic")
    public Boolean logic;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the database. You can call the <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation to query the name of the database.</p>
     * <blockquote>
     * <p> You can also call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> operation to query the name of a physical database and the <a href="https://help.aliyun.com/document_detail/141874.html">ListLogicDatabases</a> operation to query the name of a logical database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test_schema</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>The sensitivity level of the field. Valid values:</p>
     * <ul>
     * <li>SENSITIVE: medium sensitivity level</li>
     * <li>CONFIDENTIAL: high sensitivity level</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SENSITIVE</p>
     */
    @NameInMap("SecurityLevel")
    public String securityLevel;

    /**
     * <p>The name of the table. You can call the <a href="https://help.aliyun.com/document_detail/141878.html">ListTables</a> operation to query the ID of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>test_table</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p> To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the &quot;View information about the current tenant&quot; section of the <a href="https://help.aliyun.com/document_detail/181330.html">Manage DMS tenants</a> topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
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
