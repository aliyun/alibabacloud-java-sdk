// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgenticTableIndex extends TeaModel {
    /**
     * <p>An array of column names included in the index.</p>
     */
    @NameInMap("ColumnNames")
    public java.util.List<String> columnNames;

    /**
     * <p>An optional, user-defined description for the index.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The unique name of the index within the table.</p>
     */
    @NameInMap("IndexName")
    public String indexName;

    /**
     * <p>The type of the index, such as PRIMARY, UNIQUE, or NORMAL.</p>
     */
    @NameInMap("IndexType")
    public String indexType;

    /**
     * <p>Specifies if the index is the primary key. A table can have only one primary key.</p>
     */
    @NameInMap("Primary")
    public Boolean primary;

    /**
     * <p>An array of physical column names from the database. Use this parameter when the names in ColumnNames are aliases or logical names.</p>
     */
    @NameInMap("RealColumnNames")
    public java.util.List<String> realColumnNames;

    /**
     * <p>Specifies if the index enforces a unique constraint, requiring all its values to be unique across rows.</p>
     */
    @NameInMap("Unique")
    public Boolean unique;

    public static AgenticTableIndex build(java.util.Map<String, ?> map) throws Exception {
        AgenticTableIndex self = new AgenticTableIndex();
        return TeaModel.build(map, self);
    }

    public AgenticTableIndex setColumnNames(java.util.List<String> columnNames) {
        this.columnNames = columnNames;
        return this;
    }
    public java.util.List<String> getColumnNames() {
        return this.columnNames;
    }

    public AgenticTableIndex setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AgenticTableIndex setIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }
    public String getIndexName() {
        return this.indexName;
    }

    public AgenticTableIndex setIndexType(String indexType) {
        this.indexType = indexType;
        return this;
    }
    public String getIndexType() {
        return this.indexType;
    }

    public AgenticTableIndex setPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }
    public Boolean getPrimary() {
        return this.primary;
    }

    public AgenticTableIndex setRealColumnNames(java.util.List<String> realColumnNames) {
        this.realColumnNames = realColumnNames;
        return this;
    }
    public java.util.List<String> getRealColumnNames() {
        return this.realColumnNames;
    }

    public AgenticTableIndex setUnique(Boolean unique) {
        this.unique = unique;
        return this;
    }
    public Boolean getUnique() {
        return this.unique;
    }

}
