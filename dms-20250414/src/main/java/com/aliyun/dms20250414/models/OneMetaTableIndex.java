// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class OneMetaTableIndex extends TeaModel {
    @NameInMap("ColumnNames")
    public java.util.List<String> columnNames;

    @NameInMap("Description")
    public String description;

    @NameInMap("IndexName")
    public String indexName;

    @NameInMap("IndexType")
    public String indexType;

    public static OneMetaTableIndex build(java.util.Map<String, ?> map) throws Exception {
        OneMetaTableIndex self = new OneMetaTableIndex();
        return TeaModel.build(map, self);
    }

    public OneMetaTableIndex setColumnNames(java.util.List<String> columnNames) {
        this.columnNames = columnNames;
        return this;
    }
    public java.util.List<String> getColumnNames() {
        return this.columnNames;
    }

    public OneMetaTableIndex setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public OneMetaTableIndex setIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }
    public String getIndexName() {
        return this.indexName;
    }

    public OneMetaTableIndex setIndexType(String indexType) {
        this.indexType = indexType;
        return this;
    }
    public String getIndexType() {
        return this.indexType;
    }

}
