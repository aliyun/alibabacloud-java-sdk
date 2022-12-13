// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeOfficeSitesRequest extends TeaModel {
    // The number of entries to return on each page.
    // 
    // *   Maximum value: 100.
    // *   Default value: 10.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that determines the start point of the next query.
    @NameInMap("NextToken")
    public String nextToken;

    // The IDs of the workspaces. You can specify 1 to 100 workspace IDs.
    @NameInMap("OfficeSiteId")
    public java.util.List<String> officeSiteId;

    // The account type of the workspace.
    @NameInMap("OfficeSiteType")
    public String officeSiteType;

    // The ID of the region
    @NameInMap("RegionId")
    public String regionId;

    // The status of the workspace.
    @NameInMap("Status")
    public String status;

    public static DescribeOfficeSitesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOfficeSitesRequest self = new DescribeOfficeSitesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOfficeSitesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeOfficeSitesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeOfficeSitesRequest setOfficeSiteId(java.util.List<String> officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public java.util.List<String> getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeOfficeSitesRequest setOfficeSiteType(String officeSiteType) {
        this.officeSiteType = officeSiteType;
        return this;
    }
    public String getOfficeSiteType() {
        return this.officeSiteType;
    }

    public DescribeOfficeSitesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeOfficeSitesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
