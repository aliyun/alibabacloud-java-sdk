// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListOneMetaSqlTemplatesRequest extends TeaModel {
    @NameInMap("CatalogUuid")
    public String catalogUuid;

    @NameInMap("DatabaseUuid")
    public String databaseUuid;

    @NameInMap("EnableVectorSearch")
    public Boolean enableVectorSearch;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Query")
    public String query;

    @NameInMap("Tag")
    public String tag;

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
