// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ModifyDesensitizationStrategyRequest extends TeaModel {
    /**
     * <p>The name of the field. You can call the [ListSensitiveColumns](~~188103~~) operation to obtain the field name.</p>
     * <br>
     * <p>>  You can also call the [ListColumns](~~141870~~) operation to obtain the field name.</p>
     */
    @NameInMap("ColumnName")
    public String columnName;

    /**
     * <p>The ID of the database. You can call the [ListDatabases](~~141873~~) operation to obtain the ID.</p>
     */
    @NameInMap("DbId")
    public Integer dbId;

    /**
     * <p>The desensitization algorithm of the field setting. The default value is false. The values are as follows:</p>
     * <br>
     * <p>- **true**: default desensitization algorithm.</p>
     * <br>
     * <p>- **false** :semi-desensitization algorithm.</p>
     */
    @NameInMap("IsDefault")
    public Boolean isDefault;

    /**
     * <p>Specifies whether the database is a logical database. Valid values:</p>
     * <br>
     * <p>*   **true**: The database is a physical database.</p>
     * <p>*   **false**: The database is a logical database.</p>
     */
    @NameInMap("IsLogic")
    public Boolean isLogic;

    /**
     * <p>Specifies whether to reset the masking rule. Valid value:</p>
     * <br>
     * <p>*   **true**: Reset the masking rule.</p>
     * <p>*   **false**: Do not reset the masking rule. This is the default value.</p>
     */
    @NameInMap("IsReset")
    public Boolean isReset;

    /**
     * <p>The ID of the masking rule.</p>
     */
    @NameInMap("RuleId")
    public Integer ruleId;

    /**
     * <p>The name of the database. You can call the [ListSensitiveColumns](~~188103~~) operation to obtain the database name.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If the database is a physical database, you can call the [ListDatabases](~~141873~~) or [SearchDatabase](~~141876~~) operation to obtain the database name.</p>
     * <br>
     * <p>*   If the database is a logical database, you can call the [ListLogicDatabases](~~141874~~) or [SearchDatabase](~~141876~~) operation to obtain the name of the database.</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>The name of the table. You can call the [ListSensitiveColumns](~~188103~~) operation to obtain the table name.</p>
     * <br>
     * <p>>  You can also call the [ListTables](~~141878~~) operation to obtain the table name.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>>  To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~) in the topic "Manage DMS tenants."</p>
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

    public ModifyDesensitizationStrategyRequest setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
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
