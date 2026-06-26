// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListDatabasesRequest extends TeaModel {
    /**
     * <p>The database name pattern for fuzzy matching.</p>
     * 
     * <strong>example:</strong>
     * <p>database%</p>
     */
    @NameInMap("databaseNamePattern")
    public String databaseNamePattern;

    /**
     * <p>The maximum number of records to return in a single request.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page of results. If the response does not provide a token, pass an empty string (&quot;&quot;).</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("pageToken")
    public String pageToken;

    public static ListDatabasesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatabasesRequest self = new ListDatabasesRequest();
        return TeaModel.build(map, self);
    }

    public ListDatabasesRequest setDatabaseNamePattern(String databaseNamePattern) {
        this.databaseNamePattern = databaseNamePattern;
        return this;
    }
    public String getDatabaseNamePattern() {
        return this.databaseNamePattern;
    }

    public ListDatabasesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDatabasesRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    public String getPageToken() {
        return this.pageToken;
    }

}
