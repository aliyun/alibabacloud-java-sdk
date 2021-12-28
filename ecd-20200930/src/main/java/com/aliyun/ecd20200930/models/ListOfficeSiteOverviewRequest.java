// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListOfficeSiteOverviewRequest extends TeaModel {
    @NameInMap("ForceRefresh")
    public Boolean forceRefresh;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OfficeSiteId")
    public java.util.List<String> officeSiteId;

    @NameInMap("QueryRange")
    public Integer queryRange;

    @NameInMap("RegionId")
    public String regionId;

    public static ListOfficeSiteOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOfficeSiteOverviewRequest self = new ListOfficeSiteOverviewRequest();
        return TeaModel.build(map, self);
    }

    public ListOfficeSiteOverviewRequest setForceRefresh(Boolean forceRefresh) {
        this.forceRefresh = forceRefresh;
        return this;
    }
    public Boolean getForceRefresh() {
        return this.forceRefresh;
    }

    public ListOfficeSiteOverviewRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListOfficeSiteOverviewRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOfficeSiteOverviewRequest setOfficeSiteId(java.util.List<String> officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public java.util.List<String> getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ListOfficeSiteOverviewRequest setQueryRange(Integer queryRange) {
        this.queryRange = queryRange;
        return this;
    }
    public Integer getQueryRange() {
        return this.queryRange;
    }

    public ListOfficeSiteOverviewRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
