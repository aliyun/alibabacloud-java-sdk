// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListOneMetaOssieModelsRequest extends TeaModel {
    /**
     * <p>The UUID of the associated folder.</p>
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
     * <p>The maximum number of records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>NesLoKLEdIZrKhDT7I2gS****</p>
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
     * <p>The semantic model tag.</p>
     * 
     * <strong>example:</strong>
     * <p>new_sales</p>
     */
    @NameInMap("Tag")
    public String tag;

    public static ListOneMetaOssieModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOneMetaOssieModelsRequest self = new ListOneMetaOssieModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListOneMetaOssieModelsRequest setCatalogUuid(String catalogUuid) {
        this.catalogUuid = catalogUuid;
        return this;
    }
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    public ListOneMetaOssieModelsRequest setDatabaseUuid(String databaseUuid) {
        this.databaseUuid = databaseUuid;
        return this;
    }
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    public ListOneMetaOssieModelsRequest setEnableVectorSearch(Boolean enableVectorSearch) {
        this.enableVectorSearch = enableVectorSearch;
        return this;
    }
    public Boolean getEnableVectorSearch() {
        return this.enableVectorSearch;
    }

    public ListOneMetaOssieModelsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListOneMetaOssieModelsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOneMetaOssieModelsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListOneMetaOssieModelsRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
