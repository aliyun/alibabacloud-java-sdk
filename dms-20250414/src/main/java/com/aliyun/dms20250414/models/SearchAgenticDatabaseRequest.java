// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class SearchAgenticDatabaseRequest extends TeaModel {
    /**
     * <p>The UUID of the catalog that limits the search scope. If you do not specify this parameter, the search is performed across all catalogs.</p>
     * 
     * <strong>example:</strong>
     * <p>mc-HZ-OfjcNc2z***</p>
     */
    @NameInMap("CatalogUuid")
    public String catalogUuid;

    /**
     * <p>The database type. This parameter filters the results exactly by the database type of the data source associated with the catalog. The value is the uppercase name of the database type, such as MYSQL.</p>
     * 
     * <strong>example:</strong>
     * <p>MYSQL</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The environment type. This parameter filters the results exactly by the environment of the associated data source. Valid values: product, pre, dev, test, sit, uat, pet, and stag.</p>
     * 
     * <strong>example:</strong>
     * <p>product</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The maximum number of entries to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. You do not need to specify this parameter for the first query. When you query the next page, set this parameter to the NextToken value returned from the previous query.</p>
     * 
     * <strong>example:</strong>
     * <p>f056501ada12****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The search keyword. It matches the name, fully qualified name, and search name of the database, as well as the name or data source alias of the associated catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>order</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    public static SearchAgenticDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchAgenticDatabaseRequest self = new SearchAgenticDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public SearchAgenticDatabaseRequest setCatalogUuid(String catalogUuid) {
        this.catalogUuid = catalogUuid;
        return this;
    }
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    public SearchAgenticDatabaseRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public SearchAgenticDatabaseRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public SearchAgenticDatabaseRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SearchAgenticDatabaseRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SearchAgenticDatabaseRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

}
