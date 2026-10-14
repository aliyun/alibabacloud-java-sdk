// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListAgenticCatalogRequest extends TeaModel {
    /**
     * <p>The catalog type. This parameter is used to filter catalogs by exact type. Valid values:</p>
     * <ul>
     * <li><strong>JDBC</strong>: relational database catalog</li>
     * <li><strong>DataLake</strong>: data lake catalog</li>
     * <li><strong>Dataset</strong>: knowledge base catalog</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>JDBC</p>
     */
    @NameInMap("CatalogType")
    public String catalogType;

    /**
     * <p>The maximum number of entries to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. You do not need to specify this parameter for the first query. To query the next page, set this parameter to the NextToken value returned from the previous query.</p>
     * 
     * <strong>example:</strong>
     * <p>f056501ada12****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The search keyword for the catalog name. Matches catalogs by name prefix.</p>
     * 
     * <strong>example:</strong>
     * <p>prod_</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    public static ListAgenticCatalogRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgenticCatalogRequest self = new ListAgenticCatalogRequest();
        return TeaModel.build(map, self);
    }

    public ListAgenticCatalogRequest setCatalogType(String catalogType) {
        this.catalogType = catalogType;
        return this;
    }
    public String getCatalogType() {
        return this.catalogType;
    }

    public ListAgenticCatalogRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAgenticCatalogRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAgenticCatalogRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

}
