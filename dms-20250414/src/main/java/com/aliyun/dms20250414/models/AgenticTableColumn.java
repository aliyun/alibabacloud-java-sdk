// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgenticTableColumn extends TeaModel {
    /**
     * <p>The name of the column.</p>
     */
    @NameInMap("ColumnName")
    public String columnName;

    /**
     * <p>The data type of the column.</p>
     */
    @NameInMap("ColumnType")
    public String columnType;

    /**
     * <p>The description of the column.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Engine-specific metadata for the column.</p>
     */
    @NameInMap("EngineMeta")
    public AgenticTableColumnEngineMeta engineMeta;

    /**
     * <p>The 1-based ordinal position of the column within the table.</p>
     */
    @NameInMap("Position")
    public Integer position;

    public static AgenticTableColumn build(java.util.Map<String, ?> map) throws Exception {
        AgenticTableColumn self = new AgenticTableColumn();
        return TeaModel.build(map, self);
    }

    public AgenticTableColumn setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }
    public String getColumnName() {
        return this.columnName;
    }

    public AgenticTableColumn setColumnType(String columnType) {
        this.columnType = columnType;
        return this;
    }
    public String getColumnType() {
        return this.columnType;
    }

    public AgenticTableColumn setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AgenticTableColumn setEngineMeta(AgenticTableColumnEngineMeta engineMeta) {
        this.engineMeta = engineMeta;
        return this;
    }
    public AgenticTableColumnEngineMeta getEngineMeta() {
        return this.engineMeta;
    }

    public AgenticTableColumn setPosition(Integer position) {
        this.position = position;
        return this;
    }
    public Integer getPosition() {
        return this.position;
    }

}
