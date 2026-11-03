// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCloudDriveGroupsRequest extends TeaModel {
    /**
     * <p>The ID of the enterprise cloud drive.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai+cds-135515****</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The ID of the office network.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-jedbpr4sl9l37****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The name of the office network.</p>
     * 
     * <strong>example:</strong>
     * <p>testDirectoryName</p>
     */
    @NameInMap("DirectoryName")
    public String directoryName;

    /**
     * <p>The status of the team workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("DriveStatus")
    public String driveStatus;

    /**
     * <p>Specifies whether a workspace is added. By default, this parameter is left empty, which indicates that all workspaces are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>binding</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("DriveType")
    public String driveType;

    /**
     * <p>The IDs of the team workspaces.</p>
     */
    @NameInMap("GroupId")
    public java.util.List<String> groupId;

    /**
     * <p>The name of the team workspace. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>TestTeam1</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The team type. By default, this parameter is left empty, which indicates that all types are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>org</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>The number of entries to return on each page during paging in a paged query.</p>
     * <ul>
     * <li>Maximum value: 100</li>
     * <li>Default value: 20</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Set the value to the <code>NextToken</code> value returned from the last call. You do not need to specify this parameter for the first call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6lY3I2VNHLwy+nIoSXh****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the parent node of the object to be queried. To query the root node, set this parameter to <code>root</code>. By default, this parameter is left empty, which indicates that all objects are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>cg-e70ga4ixp30ur****</p>
     */
    @NameInMap("ParentGroupId")
    public String parentGroupId;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the list of regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeCloudDriveGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudDriveGroupsRequest self = new DescribeCloudDriveGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudDriveGroupsRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public DescribeCloudDriveGroupsRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public DescribeCloudDriveGroupsRequest setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
        return this;
    }
    public String getDirectoryName() {
        return this.directoryName;
    }

    public DescribeCloudDriveGroupsRequest setDriveStatus(String driveStatus) {
        this.driveStatus = driveStatus;
        return this;
    }
    public String getDriveStatus() {
        return this.driveStatus;
    }

    public DescribeCloudDriveGroupsRequest setDriveType(String driveType) {
        this.driveType = driveType;
        return this;
    }
    public String getDriveType() {
        return this.driveType;
    }

    public DescribeCloudDriveGroupsRequest setGroupId(java.util.List<String> groupId) {
        this.groupId = groupId;
        return this;
    }
    public java.util.List<String> getGroupId() {
        return this.groupId;
    }

    public DescribeCloudDriveGroupsRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeCloudDriveGroupsRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public DescribeCloudDriveGroupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeCloudDriveGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCloudDriveGroupsRequest setParentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
        return this;
    }
    public String getParentGroupId() {
        return this.parentGroupId;
    }

    public DescribeCloudDriveGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
