// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataLakePartitionByFilterRequest extends TeaModel {
    /**
     * <p>The name of the data catalog.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hive</p>
     */
    @NameInMap("CatalogName")
    public String catalogName;

    /**
     * <p>The name of the database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>Query conditional expression. Supported operators:</p>
     * <ul>
     * <li><p>Comparison operators: =, &lt;&gt;, !=, &lt;, &lt;=, &gt;, and &gt;=. For example: \<code>ds&gt;20240101\\</code>.</p>
     * </li>
     * <li><p>Logical operators: AND, OR, and NOT. For example: \<code>ds LIKE \\&quot;20240%\\&quot;\\</code>.</p>
     * </li>
     * <li><p>The BETWEEN operator, which specifies a range. For example: \<code>ds BETWEEN 20240101 AND 20241201\\</code>.</p>
     * </li>
     * <li><p>The IN operator, which specifies a set of values. For example: \<code>ds IN (20240101, 20240102)\\</code>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ds&gt;20241201</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The number of entries per page. The maximum value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results. Valid values:</p>
     * <ul>
     * <li><p>If this parameter is left empty, no more results are returned.</p>
     * </li>
     * <li><p>If a value is returned, the value is the token for the next query.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>f056501ada12****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The name of the table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_table</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The tenant ID.</p>
     * <blockquote>
     * <p>Hover over your profile picture in the upper-right corner of the DMS console to obtain the tenant ID. For details, see <a href="https://help.aliyun.com/document_detail/181330.html">View tenant information</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3****</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The ID of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static ListDataLakePartitionByFilterRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataLakePartitionByFilterRequest self = new ListDataLakePartitionByFilterRequest();
        return TeaModel.build(map, self);
    }

    public ListDataLakePartitionByFilterRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public ListDataLakePartitionByFilterRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ListDataLakePartitionByFilterRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListDataLakePartitionByFilterRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataLakePartitionByFilterRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataLakePartitionByFilterRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ListDataLakePartitionByFilterRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ListDataLakePartitionByFilterRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
