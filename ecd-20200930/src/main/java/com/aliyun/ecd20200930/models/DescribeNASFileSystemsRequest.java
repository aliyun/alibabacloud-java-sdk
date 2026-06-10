// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeNASFileSystemsRequest extends TeaModel {
    /**
     * <p>The IDs of the NAS file systems.</p>
     * 
     * <strong>example:</strong>
     * <p>04f314****</p>
     */
    @NameInMap("FileSystemId")
    public java.util.List<String> fileSystemId;

    /**
     * <p>Specifies whether to return only NAS file systems that are compatible with User Profile Management (UPM).</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("MatchCompatibleProfile")
    public Boolean matchCompatibleProfile;

    /**
     * <p>The number of entries to return on each page.</p>
     * <ul>
     * <li><p>Maximum value: 100.</p>
     * </li>
     * <li><p>Default value: 10.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of <code>NextToken</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the office network.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-363353****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the regions where Elastic Desktop Service (EDS) is available.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
