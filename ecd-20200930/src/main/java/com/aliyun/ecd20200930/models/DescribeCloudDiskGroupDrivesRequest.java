// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCloudDiskGroupDrivesRequest extends TeaModel {
    /**
     * <p>The enterprise cloud disk ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+cds-6805637***</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The team drive name.</p>
     * 
     * <strong>example:</strong>
     * <p>Team 1</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The number of entries per page for paged queries.</p>
     * <ul>
     * <li><p>Maximum: 100</p>
     * </li>
     * <li><p>Default: 20</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the start of the next query. An empty NextToken means no more results.</p>
     * 
     * <strong>example:</strong>
     * <p>MTA0MjA=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeCloudDiskGroupDrivesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudDiskGroupDrivesRequest self = new DescribeCloudDiskGroupDrivesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudDiskGroupDrivesRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public DescribeCloudDiskGroupDrivesRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeCloudDiskGroupDrivesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeCloudDiskGroupDrivesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCloudDiskGroupDrivesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
