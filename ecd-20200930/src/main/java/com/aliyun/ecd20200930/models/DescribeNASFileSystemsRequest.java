// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeNASFileSystemsRequest extends TeaModel {
    @NameInMap("FileSystemId")
    public java.util.List<String> fileSystemId;

    @NameInMap("MatchCompatibleProfile")
    public Boolean matchCompatibleProfile;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeNASFileSystemsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNASFileSystemsRequest self = new DescribeNASFileSystemsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNASFileSystemsRequest setFileSystemId(java.util.List<String> fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public java.util.List<String> getFileSystemId() {
        return this.fileSystemId;
    }

    public DescribeNASFileSystemsRequest setMatchCompatibleProfile(Boolean matchCompatibleProfile) {
        this.matchCompatibleProfile = matchCompatibleProfile;
        return this;
    }
    public Boolean getMatchCompatibleProfile() {
        return this.matchCompatibleProfile;
    }

    public DescribeNASFileSystemsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeNASFileSystemsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeNASFileSystemsRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeNASFileSystemsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
