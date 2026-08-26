// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListOneMetaSqlTemplatesRequest extends TeaModel {
    /**
     * <p>The UUID of the associated catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>mc-HZ-OfjcNc2z***</p>
     */
    @NameInMap("CatalogUuid")
    public String catalogUuid;

    /**
     * <p>The UUID of the associated database.</p>
     * 
     * <strong>example:</strong>
     * <p>md-HZ-fp9K7r***</p>
     */
    @NameInMap("DatabaseUuid")
    public String databaseUuid;

    /**
     * <p>Specifies whether to use semantic search.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableVectorSearch")
    public Boolean enableVectorSearch;

    /**
     * <p>The maximum number of entries to return in this response.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>f056501ada12****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The search keyword.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sale</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The SQL template tag.</p>
     * 
     * <strong>example:</strong>
     * <p>new_sales</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The UUIDs of knowledge instances. Separate multiple UUIDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>86c5c290052147c***,56c5c2900dasqw***</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static ListOneMetaSqlTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOneMetaSqlTemplatesRequest self = new ListOneMetaSqlTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListOneMetaSqlTemplatesRequest setCatalogUuid(String catalogUuid) {
        this.catalogUuid = catalogUuid;
        return this;
    }
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    public ListOneMetaSqlTemplatesRequest setDatabaseUuid(String databaseUuid) {
        this.databaseUuid = databaseUuid;
        return this;
    }
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    public ListOneMetaSqlTemplatesRequest setEnableVectorSearch(Boolean enableVectorSearch) {
        this.enableVectorSearch = enableVectorSearch;
        return this;
    }
    public Boolean getEnableVectorSearch() {
        return this.enableVectorSearch;
    }

    public ListOneMetaSqlTemplatesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListOneMetaSqlTemplatesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOneMetaSqlTemplatesRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListOneMetaSqlTemplatesRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public ListOneMetaSqlTemplatesRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
