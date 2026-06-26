// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListDatabaseDetailsRequest extends TeaModel {
    /**
     * <p>The database name pattern for fuzzy matching. Supports the percent sign (%).</p>
     * 
     * <strong>example:</strong>
     * <p>database%</p>
     */
    @NameInMap("databaseNamePattern")
    public String databaseNamePattern;

    /**
     * <p>The number of entries to return on each page.
     * Default value: 1000.
     * Maximum value: 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token to retrieve the next page of results. If the response does not include this token, pass an empty string (&quot;&quot;).</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("pageToken")
    public String pageToken;

    public static ListDatabaseDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatabaseDetailsRequest self = new ListDatabaseDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListDatabaseDetailsRequest setDatabaseNamePattern(String databaseNamePattern) {
        this.databaseNamePattern = databaseNamePattern;
        return this;
    }
    public String getDatabaseNamePattern() {
        return this.databaseNamePattern;
    }

    public ListDatabaseDetailsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDatabaseDetailsRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    public String getPageToken() {
        return this.pageToken;
    }

}
