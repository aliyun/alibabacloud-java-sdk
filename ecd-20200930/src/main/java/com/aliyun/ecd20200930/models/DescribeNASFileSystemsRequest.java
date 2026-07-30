// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeNASFileSystemsRequest extends TeaModel {
    /**
     * <p>The list of NAS file system IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>04f314****</p>
     */
    @NameInMap("FileSystemId")
    public java.util.List<String> fileSystemId;

    /**
     * <p>Specifies whether to include only NAS file systems that support UPM in the query results.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("MatchCompatibleProfile")
    public Boolean matchCompatibleProfile;

    /**
     * <p>The number of entries per page for a paged query.    </p>
     * <ul>
     * <li>Maximum value: 100.    </li>
     * <li>Default value: 10.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Set this parameter to the value of NextToken returned in the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The office network ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-363353****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
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
