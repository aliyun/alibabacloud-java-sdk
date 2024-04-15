// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListUserAdOrganizationUnitsRequest extends TeaModel {
    /**
     * <p>The string that you enter for fuzzy search.</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The maximum number of entries to return on each page. Valid values: 1 to 500. Default value: 500.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request or if no next request exists. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The enterprise AD office network ID.</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListUserAdOrganizationUnitsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserAdOrganizationUnitsRequest self = new ListUserAdOrganizationUnitsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserAdOrganizationUnitsRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListUserAdOrganizationUnitsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserAdOrganizationUnitsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserAdOrganizationUnitsRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ListUserAdOrganizationUnitsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
