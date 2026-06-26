// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListTableDetailsRequest extends TeaModel {
    /**
     * <p>The maximum number of records to return in a single request.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token to retrieve the next page of results. Pass the token that was returned by the previous request. For the first request, pass an empty string (&quot;&quot;).</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("pageToken")
    public String pageToken;

    /**
     * <p>The pattern used to filter table names.</p>
     * 
     * <strong>example:</strong>
     * <p>table%</p>
     */
    @NameInMap("tableNamePattern")
    public String tableNamePattern;

    /**
     * <p>The type.</p>
     * 
     * <strong>example:</strong>
     * <p>table</p>
     */
    @NameInMap("type")
    public String type;

    public static ListTableDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTableDetailsRequest self = new ListTableDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListTableDetailsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTableDetailsRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    public String getPageToken() {
        return this.pageToken;
    }

    public ListTableDetailsRequest setTableNamePattern(String tableNamePattern) {
        this.tableNamePattern = tableNamePattern;
        return this;
    }
    public String getTableNamePattern() {
        return this.tableNamePattern;
    }

    public ListTableDetailsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
