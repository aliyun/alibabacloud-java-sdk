// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgenticTableIndex extends TeaModel {
    /**
     * <p>The list of fields included in the index. Fields with a specified prefix length include a length expression, such as name(10).</p>
     */
    @NameInMap("ColumnNames")
    public java.util.List<String> columnNames;

    /**
     * <p>The index description.</p>
     * 
     * <strong>example:</strong>
     * <p>Index on user_id</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The index name.</p>
     * 
     * <strong>example:</strong>
     * <p>idx_user_id</p>
     */
    @NameInMap("IndexName")
    public String indexName;

    /**
     * <p>The index type. Valid values:</p>
     * <ul>
     * <li><strong>Primary</strong>: primary key index</li>
     * <li><strong>Unique</strong>: unique index</li>
     * <li><strong>Normal</strong>: normal index</li>
     * <li><strong>FullText</strong>: full-text index</li>
     * <li><strong>Spatial</strong>: spatial index</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("IndexType")
    public String indexType;

    /**
     * <p>Specifies whether the index is a primary key index.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Primary")
    public Boolean primary;

    /**
     * <p>The list of actual field names referenced by the index, with prefix length expressions removed from ColumnNames.</p>
     */
    @NameInMap("RealColumnNames")
    public java.util.List<String> realColumnNames;

    /**
     * <p>Specifies whether the index is a unique index.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
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
