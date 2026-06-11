// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataLakeFunctionNameRequest extends TeaModel {
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
     * <p>A regular expression used to filter function names.</p>
     * 
     * <strong>example:</strong>
     * <p>.*</p>
     */
    @NameInMap("FunctionNamePattern")
    public String functionNamePattern;

    /**
     * <p>The page size. The maximum value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to page through results. Set this parameter to the \<code>NextToken\\</code> value that is returned in the last response to retrieve the next page of results. You do not need to specify this parameter for the first request.</p>
     * <ul>
     * <li><p>If <strong>NextToken</strong> is empty, there is no subsequent query.</p>
     * </li>
     * <li><p>If <strong>NextToken</strong> returns a value, it is the token for the next query.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>f056501ada12****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

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

    public static ListDataLakeFunctionNameRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataLakeFunctionNameRequest self = new ListDataLakeFunctionNameRequest();
        return TeaModel.build(map, self);
    }

    public ListDataLakeFunctionNameRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public ListDataLakeFunctionNameRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ListDataLakeFunctionNameRequest setFunctionNamePattern(String functionNamePattern) {
        this.functionNamePattern = functionNamePattern;
        return this;
    }
    public String getFunctionNamePattern() {
        return this.functionNamePattern;
    }

    public ListDataLakeFunctionNameRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataLakeFunctionNameRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataLakeFunctionNameRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ListDataLakeFunctionNameRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
