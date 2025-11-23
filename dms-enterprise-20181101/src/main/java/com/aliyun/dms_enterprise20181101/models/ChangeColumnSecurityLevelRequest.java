// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ChangeColumnSecurityLevelRequest extends TeaModel {
    /**
     * <p>The name of the field. You can call the <a href="https://help.aliyun.com/document_detail/188103.html">ListSensitiveColumns</a> or <a href="https://help.aliyun.com/document_detail/141870.html">ListColumns</a> operation to query the column name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_column</p>
     */
    @NameInMap("ColumnName")
    public String columnName;

    /**
     * <p>The database ID. The database can be a physical database or a logical database.</p>
     * <ul>
     * <li>The ID of a physical database: You can call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation to obtain the physical database ID.</li>
     * <li>To obtain the ID of a logical database, call the <a href="https://help.aliyun.com/document_detail/141874.html">ListLogicDatabases</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>325**</p>
     */
    @NameInMap("DbId")
    public Long dbId;

    /**
     * <p>Specifies whether the database is a logical database. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The database is a logical database</li>
     * <li><strong>false</strong>: The database is a physical database.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsLogic")
    public Boolean isLogic;

    /**
     * <p>The new security level of the column. The valid values are the same as the sensitivity levels of the classification template that is associated with the instance. You can call the <a href="https://help.aliyun.com/document_detail/2539519.html">ListSensitivityLevel</a> operation to obtain the sensitivity levels of the classification template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>S2</p>
     */
    @NameInMap("NewSensitivityLevel")
    public String newSensitivityLevel;

    /**
     * <p>The database name. You can call the <a href="https://help.aliyun.com/document_detail/188103.html">ListSensitiveColumns</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation to query the database name.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> operation to query the name of a physical database and call the <a href="https://help.aliyun.com/document_detail/141874.html">ListLogicDatabases</a> operation to query the name of a logical database.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_schema</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>The name of the table. You can call the <a href="https://help.aliyun.com/document_detail/188103.html">ListSensitiveColumns</a> or <a href="https://help.aliyun.com/document_detail/141878.html">ListTables</a> operation to query the table name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_table</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>To view the tenant ID, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the &quot;Manage DMS tenants&quot; topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10****</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ChangeColumnSecurityLevelRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeColumnSecurityLevelRequest self = new ChangeColumnSecurityLevelRequest();
        return TeaModel.build(map, self);
    }

    public ChangeColumnSecurityLevelRequest setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }
    public String getColumnName() {
        return this.columnName;
    }

    public ChangeColumnSecurityLevelRequest setDbId(Long dbId) {
        this.dbId = dbId;
        return this;
    }
    public Long getDbId() {
        return this.dbId;
    }

    public ChangeColumnSecurityLevelRequest setIsLogic(Boolean isLogic) {
        this.isLogic = isLogic;
        return this;
    }
    public Boolean getIsLogic() {
        return this.isLogic;
    }

    public ChangeColumnSecurityLevelRequest setNewSensitivityLevel(String newSensitivityLevel) {
        this.newSensitivityLevel = newSensitivityLevel;
        return this;
    }
    public String getNewSensitivityLevel() {
        return this.newSensitivityLevel;
    }

    public ChangeColumnSecurityLevelRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public ChangeColumnSecurityLevelRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ChangeColumnSecurityLevelRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
