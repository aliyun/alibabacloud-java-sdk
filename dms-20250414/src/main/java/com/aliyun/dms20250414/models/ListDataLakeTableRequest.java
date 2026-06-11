// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataLakeTableRequest extends TeaModel {
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
     * <p>The number of entries to return on each page. The maximum value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to retrieve the next page of results. To retrieve the next page, set this parameter to the \<code>NextToken\\</code> value from the previous response. If you do not specify this parameter, the first page is returned.</p>
     * <ul>
     * <li><p>If <strong>NextToken</strong> is empty, there are no more queries.</p>
     * </li>
     * <li><p>If <strong>NextToken</strong> has a value, the value is the token to start the next query.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>f056501ada12****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The name of the metadata table. This parameter supports regular expressions.</p>
     * 
     * <strong>example:</strong>
     * <p>.*</p>
     */
    @NameInMap("TableNamePattern")
    public String tableNamePattern;

    /**
     * <p>The type of the table. Valid values:</p>
     * <ul>
     * <li><p>MANAGED_TABLE: Internal table.</p>
     * </li>
     * <li><p>EXTERNAL_TABLE: External table.</p>
     * </li>
     * <li><p>VIRTUAL_VIEW: Virtual view.</p>
     * </li>
     * <li><p>INDEX_TABLE: Index table.</p>
     * </li>
     * <li><p>MATERIALIZED_VIEW: Materialized view.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MANAGED_TABLE</p>
     */
    @NameInMap("TableType")
    public String tableType;

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

    public static ListDataLakeTableRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataLakeTableRequest self = new ListDataLakeTableRequest();
        return TeaModel.build(map, self);
    }

    public ListDataLakeTableRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public ListDataLakeTableRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ListDataLakeTableRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataLakeTableRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataLakeTableRequest setTableNamePattern(String tableNamePattern) {
        this.tableNamePattern = tableNamePattern;
        return this;
    }
    public String getTableNamePattern() {
        return this.tableNamePattern;
    }

    public ListDataLakeTableRequest setTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }
    public String getTableType() {
        return this.tableType;
    }

    public ListDataLakeTableRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ListDataLakeTableRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
