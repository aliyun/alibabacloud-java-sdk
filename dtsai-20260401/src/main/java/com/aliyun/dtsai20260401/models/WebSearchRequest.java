// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsai20260401.models;

import com.aliyun.tea.*;

public class WebSearchRequest extends TeaModel {
    /**
     * <p>The maximum number of results to return. Default value: 10. Valid values: 1 to 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The search query statement.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Spring Boot</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UrlScopeDomains")
    public String urlScopeDomains;

    @NameInMap("UrlScopeMode")
    public String urlScopeMode;

    public static WebSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        WebSearchRequest self = new WebSearchRequest();
        return TeaModel.build(map, self);
    }

    public WebSearchRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public WebSearchRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public WebSearchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public WebSearchRequest setUrlScopeDomains(String urlScopeDomains) {
        this.urlScopeDomains = urlScopeDomains;
        return this;
    }
    public String getUrlScopeDomains() {
        return this.urlScopeDomains;
    }

    public WebSearchRequest setUrlScopeMode(String urlScopeMode) {
        this.urlScopeMode = urlScopeMode;
        return this;
    }
    public String getUrlScopeMode() {
        return this.urlScopeMode;
    }

}
