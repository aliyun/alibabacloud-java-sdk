// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ModifyDesensitizationStrategyRequest extends TeaModel {
    // The name of the field. You can call the [ListSensitiveColumns](~~188103~~) operation to query the field name.
    // 
    // >  You can also call the [ListColumns](~~141870~~) operation to query the field name.
    @NameInMap("ColumnName")
    public String columnName;

    // The ID of the database. You can call the [ListDatabases](~~141873~~) operation to query the ID.
    @NameInMap("DbId")
    public Integer dbId;

    // Specifies whether the database is a logical database. Valid values:
    // 
    // *   **true:** The database is a physical database.
    // *   **false:** The database is a logical database.
    @NameInMap("IsLogic")
    public Boolean isLogic;

    // Specifies whether to reset the masking rule. Valid values:
    // 
    // *   **true**: resets the masking rule.
    // *   **false**: does not reset the masking rule. This is the default value.
    @NameInMap("IsReset")
    public Boolean isReset;

    // The ID of the masking rule.
    @NameInMap("RuleId")
    public Integer ruleId;

    // The name of the database. You can call the [ListSensitiveColumns](~~188103~~) operation to query the database name.
    // 
    // > 
    // *   If the database is a physical database, you can call the [ListDatabases](~~141873~~) or [SearchDatabase](~~141876~~) operation to query the database name.
    // *   If the database is a logical database, you can call the [ListLogicDatabases](~~141874~~) or [SearchDatabase](~~141876~~) operation to query the database name.
    @NameInMap("SchemaName")
    public String schemaName;

    // The name of the table. You can call the [ListSensitiveColumns](~~188103~~) operation to query the table name.
    // 
    // >  You can also call the [ListTables](~~141878~~) operation to query the table name.
    @NameInMap("TableName")
    public String tableName;

    // The ID of the tenant.
    // 
    // >  To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).
    @NameInMap("Tid")
    public Long tid;

    public static ModifyDesensitizationStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesensitizationStrategyRequest self = new ModifyDesensitizationStrategyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDesensitizationStrategyRequest setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }
    public String getColumnName() {
        return this.columnName;
    }

    public ModifyDesensitizationStrategyRequest setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

    public ModifyDesensitizationStrategyRequest setIsLogic(Boolean isLogic) {
        this.isLogic = isLogic;
        return this;
    }
    public Boolean getIsLogic() {
        return this.isLogic;
    }

    public ModifyDesensitizationStrategyRequest setIsReset(Boolean isReset) {
        this.isReset = isReset;
        return this;
    }
    public Boolean getIsReset() {
        return this.isReset;
    }

    public ModifyDesensitizationStrategyRequest setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Integer getRuleId() {
        return this.ruleId;
    }

    public ModifyDesensitizationStrategyRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public ModifyDesensitizationStrategyRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ModifyDesensitizationStrategyRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
