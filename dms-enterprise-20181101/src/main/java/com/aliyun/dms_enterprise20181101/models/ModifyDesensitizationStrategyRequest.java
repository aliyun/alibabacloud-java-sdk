// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ModifyDesensitizationStrategyRequest extends TeaModel {
    @NameInMap("ColumnName")
    public String columnName;

    @NameInMap("DbId")
    public Integer dbId;

    @NameInMap("IsLogic")
    public Boolean isLogic;

    @NameInMap("IsReset")
    public Boolean isReset;

    @NameInMap("RuleId")
    public Integer ruleId;

    @NameInMap("SchemaName")
    public String schemaName;

    @NameInMap("TableName")
    public String tableName;

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
