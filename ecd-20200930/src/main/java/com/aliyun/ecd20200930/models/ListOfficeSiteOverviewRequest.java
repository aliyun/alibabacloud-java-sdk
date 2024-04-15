// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListOfficeSiteOverviewRequest extends TeaModel {
    /**
     * <p>Specifies whether to refresh the cache.</p>
     */
    @NameInMap("ForceRefresh")
    public Boolean forceRefresh;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>*   Valid values: 1 to 100</p>
     * <p>*   Default value: 10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the next query. If this is your first query or no next query is to be sent, skip this parameter. If a next query is to be sent, set the parameter to the value of NextToken that is returned from the last call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The office network IDs. You can specify IDs of 1 to 100 office networks.</p>
     */
    @NameInMap("OfficeSiteId")
    public java.util.List<String> officeSiteId;

    /**
     * <p>The query scope. Cloud computers in a cloud computer pool are pooled cloud computers.</p>
     * <br>
     * <p>Default values:</p>
     * <br>
     * <p>*   1 (default): queries non-pooled cloud computers in the office network.</p>
     * <p>*   2: queries pooled cloud computers in the office network.</p>
     * <p>*   3: queries all cloud computers in the office network.</p>
     */
    @NameInMap("QueryRange")
    public Integer queryRange;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
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
