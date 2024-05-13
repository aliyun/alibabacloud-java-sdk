// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ChangeColumnSecLevelRequest extends TeaModel {
    /**
     * <p>The name of the field. You can call the [ListSensitiveColumns](https://help.aliyun.com/document_detail/188103.html) operation to obtain the name of the field.</p>
     * <br>
     * <p>> You can also call the [ListColumns](https://help.aliyun.com/document_detail/141870.html) operation to obtain the name of the field.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ColumnName")
    public String columnName;

    /**
     * <p>The ID of the database. You can call the [SearchDatabase](https://help.aliyun.com/document_detail/141876.html) operation to obtain the ID of the database.</p>
     * <br>
     * <p>> You can also call the [ListDatabases](https://help.aliyun.com/document_detail/141873.html) operation to obtain the ID of a physical database and the [ListLogicDatabases](https://help.aliyun.com/document_detail/141874.html) operation to obtain the ID of a logical database.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DbId")
    public Long dbId;

    /**
     * <p>Specifies whether the database is a logical database. Valid values:</p>
     * <br>
     * <p>*   true: The database is a physical database.</p>
     * <p>*   false: The database is a logical database.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IsLogic")
    public Boolean isLogic;

    /**
     * <p>The new sensitivity level of the field that you want to specify. Valid values:</p>
     * <br>
     * <p>*   INNER: low sensitivity level</p>
     * <p>*   SENSITIVE: medium sensitivity level</p>
     * <p>*   CONFIDENTIAL: high sensitivity level</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NewLevel")
    public String newLevel;

    /**
     * <p>The name of the database. You can call the [ListSensitiveColumns](https://help.aliyun.com/document_detail/188103.html) operation to obtain the name of the database.</p>
     * <br>
     * <p>*   You can also call the [SearchDatabase](https://help.aliyun.com/document_detail/141876.html) operation to obtain the name of the database.</p>
     * <p>*   You can also call the [ListDatabases](https://help.aliyun.com/document_detail/141873.html) operation to obtain the name of a physical database and the [ListLogicDatabases](https://help.aliyun.com/document_detail/141874.html) operation to obtain the name of a logical database.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>The name of the table. You can call the [ListSensitiveColumns](https://help.aliyun.com/document_detail/188103.html) operation to obtain the name of the table.</p>
     * <br>
     * <p>> You can also call the [ListTables](https://help.aliyun.com/document_detail/141878.html) operation to obtain the name of the table.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](https://help.aliyun.com/document_detail/181330.html).</p>
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
