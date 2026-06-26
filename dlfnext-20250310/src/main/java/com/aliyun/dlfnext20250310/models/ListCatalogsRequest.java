// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListCatalogsRequest extends TeaModel {
    /**
     * <p>The pattern of the catalog name.</p>
     * 
     * <strong>example:</strong>
     * <p>mi</p>
     */
    @NameInMap("catalogNamePattern")
    public String catalogNamePattern;

    /**
     * <p>The maximum number of records to return in a single request.</p>
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

    public static ListCatalogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCatalogsRequest self = new ListCatalogsRequest();
        return TeaModel.build(map, self);
    }

    public ListCatalogsRequest setCatalogNamePattern(String catalogNamePattern) {
        this.catalogNamePattern = catalogNamePattern;
        return this;
    }
    public String getCatalogNamePattern() {
        return this.catalogNamePattern;
    }

    public ListCatalogsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCatalogsRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    public String getPageToken() {
        return this.pageToken;
    }

}
