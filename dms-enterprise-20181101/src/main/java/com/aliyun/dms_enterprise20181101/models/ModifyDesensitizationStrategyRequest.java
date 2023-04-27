// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ModifyDesensitizationStrategyRequest extends TeaModel {
    /**
     * <p>The ID of the masking rule.</p>
     */
    @NameInMap("ColumnName")
    public String columnName;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("DbId")
    public Integer dbId;

    /**
     * <p>The operation that you want to perform. Set the value to **ModifyDesensitizationStrategy**.</p>
     */
    @NameInMap("IsLogic")
    public Boolean isLogic;

    /**
     * <p>The name of the table. You can call the [ListSensitiveColumns](~~188103~~) operation to query the table name.</p>
     * <br>
     * <p>>  You can also call the [ListTables](~~141878~~) operation to query the table name.</p>
     */
    @NameInMap("IsReset")
    public Boolean isReset;

    /**
     * <p>The ID of the database. You can call the [ListDatabases](~~141873~~) operation to query the ID.</p>
     */
    @NameInMap("RuleId")
    public Integer ruleId;

    /**
     * <p>The name of the field. You can call the [ListSensitiveColumns](~~188103~~) operation to query the field name.</p>
     * <br>
     * <p>>  You can also call the [ListColumns](~~141870~~) operation to query the field name.</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The ID of the request.</p>
     */
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
