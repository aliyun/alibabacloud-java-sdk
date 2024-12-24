// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListPartitionsByFilterRequest extends TeaModel {
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
     * <p>The expression of the query condition. The following operators are supported:</p>
     * <ul>
     * <li>Comparison operators: =, &lt;&gt;, ! =, &lt;, &lt;=, &gt;, &gt;=. For example: ds &gt; 20240101.</li>
     * <li>Logical operators: AND, OR, and NOT. Example: ds like \&quot;20240%\&quot;.</li>
     * <li>BETWEEN operator: specifies a range. For example: ds BETWEEN 20240101 AND 20241201.</li>
     * <li>IN operator: Used to specify a specific set of values. Example: ds IN (20240101, 20240102).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ds&gt;20201201</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>Specifies whether to share the column information in the SD of the partition. Valid values:</p>
     * <ul>
     * <li>true: shared</li>
     * <li>false: does not share the data.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsShareSd")
    public Boolean isShareSd;

    /**
     * <p>The page turning token, which is used to obtain the next page of data. If not provided in the response result, a string (&quot;&quot;) or empty string (&quot;) is empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>\&quot;\&quot;</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The size of each page. The maximum size is 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Indicates the name of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>test_table_20200715162543389</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static ListPartitionsByFilterRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPartitionsByFilterRequest self = new ListPartitionsByFilterRequest();
        return TeaModel.build(map, self);
    }

    public ListPartitionsByFilterRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public ListPartitionsByFilterRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public ListPartitionsByFilterRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListPartitionsByFilterRequest setIsShareSd(Boolean isShareSd) {
        this.isShareSd = isShareSd;
        return this;
    }
    public Boolean getIsShareSd() {
        return this.isShareSd;
    }

    public ListPartitionsByFilterRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListPartitionsByFilterRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPartitionsByFilterRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
