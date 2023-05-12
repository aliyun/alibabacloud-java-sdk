// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListOfficeSiteOverviewRequest extends TeaModel {
    /**
     * <p>The beginning of the time range that you want to query.</p>
     * <br>
     * <p>> The desktop group feature is in invitational preview. If you want to use this feature, submit a ticket.</p>
     */
    @NameInMap("ForceRefresh")
    public Boolean forceRefresh;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Details of the workspaces.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the workspace.</p>
     */
    @NameInMap("OfficeSiteId")
    public java.util.List<String> officeSiteId;

    /**
     * <p>The region ID of the workspace.</p>
     */
    @NameInMap("QueryRange")
    public Integer queryRange;

    /**
     * <p>Details about the IDs of the workspaces. You can specify 1 to 100 workspace IDs.</p>
     */
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
