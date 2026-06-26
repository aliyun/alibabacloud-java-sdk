// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListIcebergNamespaceDetailsRequest extends TeaModel {
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
     * <p>The namespace name pattern. Supports right-hand fuzzy matching with the percent sign (%).</p>
     * 
     * <strong>example:</strong>
     * <p>namespace%</p>
     */
    @NameInMap("namespaceNamePattern")
    public String namespaceNamePattern;

    /**
     * <p>The token for the next page of results. If the response does not include this token, pass an empty string (&quot;&quot;).</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("pageToken")
    public String pageToken;

    public static ListIcebergNamespaceDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIcebergNamespaceDetailsRequest self = new ListIcebergNamespaceDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListIcebergNamespaceDetailsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIcebergNamespaceDetailsRequest setNamespaceNamePattern(String namespaceNamePattern) {
        this.namespaceNamePattern = namespaceNamePattern;
        return this;
    }
    public String getNamespaceNamePattern() {
        return this.namespaceNamePattern;
    }

    public ListIcebergNamespaceDetailsRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    public String getPageToken() {
        return this.pageToken;
    }

}
