// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListTablesRequest extends TeaModel {
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
     * <p>\&quot;\&quot;</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the data table, which is matched by a regular expression.</p>
     * 
     * <strong>example:</strong>
     * <p>.*</p>
     */
    @NameInMap("TableNamePattern")
    public String tableNamePattern;

    /**
     * <p>The type of the data table. Valid values:</p>
     * <ul>
     * <li>MANAGED_TABLE: internal table</li>
     * <li>EXTERNAL_TABLE: foreign table</li>
     * <li>VIRTUAL_VIEW: virtual view</li>
     * <li>INDEX_TABLE: index table</li>
     * <li>MATERIALIZED_VIEW: materialized view.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MANAGED_TABLE</p>
     */
    @NameInMap("TableType")
    public String tableType;

    public static ListTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTablesRequest self = new ListTablesRequest();
        return TeaModel.build(map, self);
    }

    public ListTablesRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public ListTablesRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public ListTablesRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListTablesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTablesRequest setTableNamePattern(String tableNamePattern) {
        this.tableNamePattern = tableNamePattern;
        return this;
    }
    public String getTableNamePattern() {
        return this.tableNamePattern;
    }

    public ListTablesRequest setTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }
    public String getTableType() {
        return this.tableType;
    }

}
