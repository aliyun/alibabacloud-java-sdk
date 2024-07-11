// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ChangeColumnSecLevelRequest extends TeaModel {
    /**
     * <p>The name of the field. You can call the <a href="https://help.aliyun.com/document_detail/188103.html">ListSensitiveColumns</a> operation to obtain the name of the field.</p>
     * <blockquote>
     * <p>You can also call the <a href="https://help.aliyun.com/document_detail/141870.html">ListColumns</a> operation to obtain the name of the field.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_column</p>
     */
    @NameInMap("ColumnName")
    public String columnName;

    /**
     * <p>The ID of the database. You can call the <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation to obtain the ID of the database.</p>
     * <blockquote>
     * <p>You can also call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> operation to obtain the ID of a physical database and the <a href="https://help.aliyun.com/document_detail/141874.html">ListLogicDatabases</a> operation to obtain the ID of a logical database.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>325</p>
     */
    @NameInMap("DbId")
    public Long dbId;

    /**
     * <p>Specifies whether the database is a logical database. Valid values:</p>
     * <ul>
     * <li>true: The database is a physical database.</li>
     * <li>false: The database is a logical database.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsLogic")
    public Boolean isLogic;

    /**
     * <p>The new sensitivity level of the field that you want to specify. Valid values:</p>
     * <ul>
     * <li>INNER: low sensitivity level</li>
     * <li>SENSITIVE: medium sensitivity level</li>
     * <li>CONFIDENTIAL: high sensitivity level</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SENSITIVE</p>
     */
    @NameInMap("NewLevel")
    public String newLevel;

    /**
     * <p>The name of the database. You can call the <a href="https://help.aliyun.com/document_detail/188103.html">ListSensitiveColumns</a> operation to obtain the name of the database.</p>
     * <ul>
     * <li>You can also call the <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation to obtain the name of the database.</li>
     * <li>You can also call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> operation to obtain the name of a physical database and the <a href="https://help.aliyun.com/document_detail/141874.html">ListLogicDatabases</a> operation to obtain the name of a logical database.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_schema</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>The name of the table. You can call the <a href="https://help.aliyun.com/document_detail/188103.html">ListSensitiveColumns</a> operation to obtain the name of the table.</p>
     * <blockquote>
     * <p>You can also call the <a href="https://help.aliyun.com/document_detail/141878.html">ListTables</a> operation to obtain the name of the table.</p>
     * </blockquote>
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
     * <p>To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>43253</p>
     */
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
