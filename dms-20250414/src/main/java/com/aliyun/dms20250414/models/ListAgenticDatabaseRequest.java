// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListAgenticDatabaseRequest extends TeaModel {
    /**
     * <p>The UUID of the catalog to which the database belongs. You can obtain the UUID by calling ListAgenticCatalog or SearchAgenticCatalog.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mc-HZ-OfjcNc2z***</p>
     */
    @NameInMap("CatalogUuid")
    public String catalogUuid;

    /**
     * <p>The maximum number of entries to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. You do not need to specify this parameter for the first query. When you query the next page, set this parameter to the NextToken value returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>f056501ada12****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The search keyword used to match the database name or the prefix of the fully qualified name.</p>
     * 
     * <strong>example:</strong>
     * <p>order</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The field used for sorting. This parameter is case-sensitive. Valid values:</p>
     * <ul>
     * <li><strong>name</strong>: Sorts by database name.</li>
     * <li><strong>qualifiedName</strong>: Sorts by the fully qualified name of the database.</li>
     * </ul>
     * <p>If you specify other values, the request fails. If you do not specify this parameter, the results are returned in the default order, and the SortOrder parameter does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("SortFieldName")
    public String sortFieldName;

    /**
     * <p>The sort order. This parameter takes effect only when SortFieldName is specified. This parameter is case-insensitive. Valid values:</p>
     * <ul>
     * <li><strong>ASC</strong> (default): Ascending order.</li>
     * <li><strong>DESC</strong>: Descending order.</li>
     * </ul>
     * <p>If you specify other values, the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    public static ListAgenticDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgenticDatabaseRequest self = new ListAgenticDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public ListAgenticDatabaseRequest setCatalogUuid(String catalogUuid) {
        this.catalogUuid = catalogUuid;
        return this;
    }
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    public ListAgenticDatabaseRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAgenticDatabaseRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAgenticDatabaseRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListAgenticDatabaseRequest setSortFieldName(String sortFieldName) {
        this.sortFieldName = sortFieldName;
        return this;
    }
    public String getSortFieldName() {
        return this.sortFieldName;
    }

    public ListAgenticDatabaseRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

}
