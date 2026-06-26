// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListIcebergTableDetailsRequest extends TeaModel {
    /**
     * <p>The maximum number of records to return in a single request.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token to retrieve the next page of results. If this parameter is not returned in the response, pass an empty string (&quot;&quot;).</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("pageToken")
    public String pageToken;

    /**
     * <p>The pattern to filter table names.</p>
     * 
     * <strong>example:</strong>
     * <p>table%</p>
     */
    @NameInMap("tableNamePattern")
    public String tableNamePattern;

    public static ListIcebergTableDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIcebergTableDetailsRequest self = new ListIcebergTableDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListIcebergTableDetailsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIcebergTableDetailsRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    public String getPageToken() {
        return this.pageToken;
    }

    public ListIcebergTableDetailsRequest setTableNamePattern(String tableNamePattern) {
        this.tableNamePattern = tableNamePattern;
        return this;
    }
    public String getTableNamePattern() {
        return this.tableNamePattern;
    }

}
