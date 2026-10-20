// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListDatabaseDetailsRequest extends TeaModel {
    /**
     * <p>The SQL-style right fuzzy match pattern for database names. The percent sign (%) is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>database%</p>
     */
    @NameInMap("databaseNamePattern")
    public String databaseNamePattern;

    /**
     * <p>The page size.
     * Default value:
     *     1000
     * Maximum value:
     *     1000</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token used to retrieve the next page of results. If no token is provided in the response, pass an empty string (&quot;&quot;) or an empty character (\&quot;\&quot;).</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("pageToken")
    public String pageToken;

    /**
     * <p>The filter for the database deletion status. active indicates a normal database, and retained indicates a soft-deleted database that is still retained in the recycle bin.</p>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("status")
    public String status;

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

    public ListDatabaseDetailsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
