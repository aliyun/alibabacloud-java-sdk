// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListViewsRequest extends TeaModel {
    /**
     * <p>The maximum number of records to return.</p>
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

    /**
     * <p>The pattern used to filter view names.</p>
     * 
     * <strong>example:</strong>
     * <p>view%</p>
     */
    @NameInMap("viewNamePattern")
    public String viewNamePattern;

    public static ListViewsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListViewsRequest self = new ListViewsRequest();
        return TeaModel.build(map, self);
    }

    public ListViewsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListViewsRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    public String getPageToken() {
        return this.pageToken;
    }

    public ListViewsRequest setViewNamePattern(String viewNamePattern) {
        this.viewNamePattern = viewNamePattern;
        return this;
    }
    public String getViewNamePattern() {
        return this.viewNamePattern;
    }

}
