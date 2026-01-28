// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class OneMetaTableColumn extends TeaModel {
    @NameInMap("ColumnName")
    public String columnName;

    @NameInMap("ColumnType")
    public String columnType;

    @NameInMap("Description")
    public String description;

    @NameInMap("EngineMeta")
    public OneMetaTableColumnEngineMeta engineMeta;

    @NameInMap("Position")
    public Integer position;

    public static OneMetaTableColumn build(java.util.Map<String, ?> map) throws Exception {
        OneMetaTableColumn self = new OneMetaTableColumn();
        return TeaModel.build(map, self);
    }

    public OneMetaTableColumn setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }
    public String getColumnName() {
        return this.columnName;
    }

    public OneMetaTableColumn setColumnType(String columnType) {
        this.columnType = columnType;
        return this;
    }
    public String getColumnType() {
        return this.columnType;
    }

    public OneMetaTableColumn setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public OneMetaTableColumn setEngineMeta(OneMetaTableColumnEngineMeta engineMeta) {
        this.engineMeta = engineMeta;
        return this;
    }
    public OneMetaTableColumnEngineMeta getEngineMeta() {
        return this.engineMeta;
    }

    public OneMetaTableColumn setPosition(Integer position) {
        this.position = position;
        return this;
    }
    public Integer getPosition() {
        return this.position;
    }

}
