// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListOfficeSiteUsersRequest extends TeaModel {
    // The character string for fuzzy search.
    @NameInMap("Filter")
    public String filter;

    // The number of entries to return on each page.
    // 
    // Maximum value: 100
    // 
    // Default value: 10
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that specifies the start point of the next query.
    @NameInMap("NextToken")
    public String nextToken;

    // The organizational unit (OU) in the specified AD domain.
    @NameInMap("OUPath")
    public String OUPath;

    // The ID of the workspace. Only workspaces of the enterprise AD account type are supported.
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    public static ListOfficeSiteUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOfficeSiteUsersRequest self = new ListOfficeSiteUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListOfficeSiteUsersRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListOfficeSiteUsersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListOfficeSiteUsersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOfficeSiteUsersRequest setOUPath(String OUPath) {
        this.OUPath = OUPath;
        return this;
    }
    public String getOUPath() {
        return this.OUPath;
    }

    public ListOfficeSiteUsersRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ListOfficeSiteUsersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
