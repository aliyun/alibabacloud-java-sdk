// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListPartitionsProfileShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1344371</p>
     */
    @NameInMap("CatalogId")
    public String catalogId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_db</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PartitionNames")
    public String partitionNamesShrink;

    /**
     * <strong>example:</strong>
     * <p>test_tbl</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static ListPartitionsProfileShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPartitionsProfileShrinkRequest self = new ListPartitionsProfileShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPartitionsProfileShrinkRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public ListPartitionsProfileShrinkRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public ListPartitionsProfileShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPartitionsProfileShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPartitionsProfileShrinkRequest setPartitionNamesShrink(String partitionNamesShrink) {
        this.partitionNamesShrink = partitionNamesShrink;
        return this;
    }
    public String getPartitionNamesShrink() {
        return this.partitionNamesShrink;
    }

    public ListPartitionsProfileShrinkRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
