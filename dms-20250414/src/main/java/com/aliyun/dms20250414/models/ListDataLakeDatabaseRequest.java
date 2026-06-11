// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataLakeDatabaseRequest extends TeaModel {
    /**
     * <p>The name of the catalog. To find the catelog name, go to the <a href="https://dlf.console.aliyun.com/cn-hangzhou/metadata/catalog?spm=a2c4g.11186623.0.0.5a225658pT4Dkr">Data Lake console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hive</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("CatalogName")
    public String catalogName;

    /**
     * <p>The number of entries to return on each page. The maximum value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results. Valid values:</p>
     * <ul>
     * <li><p>If <strong>NextToken</strong> is empty, no more results are available.</p>
     * </li>
     * <li><p>If <strong>NextToken</strong> has a value, it is the token for the next query.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>f056501ada12****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>A keyword to search for database names.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

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
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static ListDataLakeDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataLakeDatabaseRequest self = new ListDataLakeDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public ListDataLakeDatabaseRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public ListDataLakeDatabaseRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataLakeDatabaseRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataLakeDatabaseRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListDataLakeDatabaseRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ListDataLakeDatabaseRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
