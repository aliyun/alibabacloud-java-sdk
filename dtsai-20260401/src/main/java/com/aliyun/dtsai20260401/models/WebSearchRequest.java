// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsai20260401.models;

import com.aliyun.tea.*;

public class WebSearchRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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

}
