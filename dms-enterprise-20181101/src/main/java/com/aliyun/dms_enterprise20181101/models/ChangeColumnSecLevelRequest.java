// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ChangeColumnSecLevelRequest extends TeaModel {
    @NameInMap("ColumnName")
    public String columnName;

    @NameInMap("DbId")
    public Long dbId;

    @NameInMap("IsLogic")
    public Boolean isLogic;

    // 新的敏感等级
    @NameInMap("NewLevel")
    public String newLevel;

    @NameInMap("SchemaName")
    public String schemaName;

    @NameInMap("TableName")
    public String tableName;

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
