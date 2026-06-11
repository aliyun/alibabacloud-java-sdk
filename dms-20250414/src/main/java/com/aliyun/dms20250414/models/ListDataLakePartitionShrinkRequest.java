// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataLakePartitionShrinkRequest extends TeaModel {
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
     * <p>The number of entries per page. Valid values: 0 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results. Set this parameter to the value of NextToken that is returned in the last response.</p>
     * <ul>
     * <li><p>If <strong>NextToken</strong> is empty, no subsequent query is needed.</p>
     * </li>
     * <li><p>If <strong>NextToken</strong> has a value, that value is the token to start the next query.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>f056501ada12****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of partition names.</p>
     */
    @NameInMap("PartNames")
    public String partNamesShrink;

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
     * <p>The ID of the tenant.</p>
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

    public static ListDataLakePartitionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataLakePartitionShrinkRequest self = new ListDataLakePartitionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDataLakePartitionShrinkRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public ListDataLakePartitionShrinkRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ListDataLakePartitionShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataLakePartitionShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataLakePartitionShrinkRequest setPartNamesShrink(String partNamesShrink) {
        this.partNamesShrink = partNamesShrink;
        return this;
    }
    public String getPartNamesShrink() {
        return this.partNamesShrink;
    }

    public ListDataLakePartitionShrinkRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ListDataLakePartitionShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ListDataLakePartitionShrinkRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
