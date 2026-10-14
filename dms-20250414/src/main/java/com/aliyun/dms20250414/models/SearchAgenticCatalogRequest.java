// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class SearchAgenticCatalogRequest extends TeaModel {
    /**
     * <p>The catalog type. Filters catalogs by exact type. Valid values:</p>
     * <ul>
     * <li><strong>JDBC</strong>: relational database catalog.</li>
     * <li><strong>DataLake</strong>: data lake catalog.</li>
     * <li><strong>Dataset</strong>: knowledge base catalog.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>JDBC</p>
     */
    @NameInMap("CatalogType")
    public String catalogType;

    /**
     * <p>The list of catalog UUIDs. Filters catalogs exactly by UUID. Separate multiple UUIDs with commas (,). You can specify up to 500 UUIDs, and null values are not allowed. If this parameter is specified along with other filter conditions, the conditions are combined by using the AND logical operator.</p>
     * 
     * <strong>example:</strong>
     * <p>mc-HZ-OfjcNc2z***,mc-HZ-Bq8Lx3wT***</p>
     */
    @NameInMap("CatalogUuids")
    public String catalogUuids;

    /**
     * <p>The database type. Filters catalogs exactly by the database type of the associated data source. The value is the uppercase name of the database type, such as MYSQL.</p>
     * 
     * <strong>example:</strong>
     * <p>MYSQL</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The maximum number of entries to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. This parameter is not required for the first query. To query the next page, set this parameter to the NextToken value returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>f056501ada12****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The search keyword. It matches the catalog name, data source alias, or the prefix of the data source endpoint. A catalog is matched if any of these conditions are met.</p>
     * 
     * <strong>example:</strong>
     * <p>prod_</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    public static SearchAgenticCatalogRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchAgenticCatalogRequest self = new SearchAgenticCatalogRequest();
        return TeaModel.build(map, self);
    }

    public SearchAgenticCatalogRequest setCatalogType(String catalogType) {
        this.catalogType = catalogType;
        return this;
    }
    public String getCatalogType() {
        return this.catalogType;
    }

    public SearchAgenticCatalogRequest setCatalogUuids(String catalogUuids) {
        this.catalogUuids = catalogUuids;
        return this;
    }
    public String getCatalogUuids() {
        return this.catalogUuids;
    }

    public SearchAgenticCatalogRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public SearchAgenticCatalogRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SearchAgenticCatalogRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SearchAgenticCatalogRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

}
