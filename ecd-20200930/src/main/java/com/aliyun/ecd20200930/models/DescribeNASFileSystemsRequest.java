// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeNASFileSystemsRequest extends TeaModel {
    /**
     * <p>The IDs of the NAS file system.</p>
     */
    @NameInMap("FileSystemId")
    public java.util.List<String> fileSystemId;

    /**
     * <p>Specifies whether to filter NAS file systems that only support the user profile management (UPM) feature.</p>
     */
    @NameInMap("MatchCompatibleProfile")
    public Boolean matchCompatibleProfile;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Maximum value: 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the workspace.</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The ID of the region.</p>
     */
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
