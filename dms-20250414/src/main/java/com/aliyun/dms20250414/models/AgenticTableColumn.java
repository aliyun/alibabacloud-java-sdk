// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgenticTableColumn extends TeaModel {
    /**
     * <p>The column name.</p>
     * 
     * <strong>example:</strong>
     * <p>id</p>
     */
    @NameInMap("ColumnName")
    public String columnName;

    /**
     * <p>The column type, which is the native type definition of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>bigint</p>
     */
    @NameInMap("ColumnType")
    public String columnType;

    /**
     * <p>The column description.</p>
     * 
     * <strong>example:</strong>
     * <p>Primary key ID</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The engine metadata of the column.</p>
     */
    @NameInMap("EngineMeta")
    public AgenticTableColumnEngineMeta engineMeta;

    /**
     * <p>The position of the column in the table, starting from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
