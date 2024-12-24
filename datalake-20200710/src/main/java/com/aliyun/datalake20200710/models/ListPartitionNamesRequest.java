// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListPartitionNamesRequest extends TeaModel {
    /**
     * <p>The ID of the data directory.</p>
     * 
     * <strong>example:</strong>
     * <p>1344371</p>
     */
    @NameInMap("CatalogId")
    public String catalogId;

    /**
     * <p>The name of a database.</p>
     * 
     * <strong>example:</strong>
     * <p>database_test</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The pagination token, which is returned from the returned result. If none is returned, an empty string or \&quot;\&quot;is passed.</p>
     * 
     * <strong>example:</strong>
     * <p>2cb472ec1bf84f8d92f9c4baa0d21c19aa</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The size of each page. The maximum value is 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The list of partition values. You can specify only the values of some partitions. Partition names of all lower-level partitions are queried.</p>
     */
    @NameInMap("PartialPartValues")
    public java.util.List<String> partialPartValues;

    /**
     * <p>The name of the data table.</p>
     * 
     * <strong>example:</strong>
     * <p>test_table_20200715162543389</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static ListPartitionNamesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPartitionNamesRequest self = new ListPartitionNamesRequest();
        return TeaModel.build(map, self);
    }

    public ListPartitionNamesRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public ListPartitionNamesRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public ListPartitionNamesRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListPartitionNamesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPartitionNamesRequest setPartialPartValues(java.util.List<String> partialPartValues) {
        this.partialPartValues = partialPartValues;
        return this;
    }
    public java.util.List<String> getPartialPartValues() {
        return this.partialPartValues;
    }

    public ListPartitionNamesRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
