// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ChangeColumnSecurityLevelRequest extends TeaModel {
    @NameInMap("ColumnName")
    public String columnName;

    @NameInMap("DbId")
    public Long dbId;

    @NameInMap("IsLogic")
    public Boolean isLogic;

    @NameInMap("NewSensitivityLevel")
    public String newSensitivityLevel;

    @NameInMap("SchemaName")
    public String schemaName;

    @NameInMap("TableName")
    public String tableName;

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
