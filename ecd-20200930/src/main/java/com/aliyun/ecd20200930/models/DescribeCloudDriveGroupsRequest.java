// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCloudDriveGroupsRequest extends TeaModel {
    /**
     * <p>The ID of the cloud disk in Cloud Drive Service.</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The ID of the workspace.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The name of the workspace.</p>
     */
    @NameInMap("DirectoryName")
    public String directoryName;

    /**
     * <p>The status of the team space. Default value: enabled. Valid values:</p>
     * <br>
     * <p>*   Enabled: available</p>
     * <p>*   disabled: unavailable</p>
     */
    @NameInMap("DriveStatus")
    public String driveStatus;

    /**
     * <p>Specifies whether one or more spaces are added.</p>
     * <br>
     * <p>*   binding: One or more spaces are added.</p>
     * <p>*   unbound: One or more spaces are not added.</p>
     * <br>
     * <p>Default value: null. This value indicates that all results are queried.</p>
     */
    @NameInMap("DriveType")
    public String driveType;

    /**
     * <p>The ID of the team.</p>
     */
    @NameInMap("GroupId")
    public java.util.List<String> groupId;

    /**
     * <p>The name of a team for fuzzy search.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The type of the team.</p>
     * <br>
     * <p>*   org: organizational structure</p>
     * <p>*   directory: workspace</p>
     * <br>
     * <p>Default value: null. This value indicates that all results are queried.</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * <br>
     * <p>*   Maximum value: 100</p>
     * <p>*   Default value: 20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the parent ID. If a parent node ID is specified, the subnode list is queried. If you set the value of this parameter to root, the root nodes are queried. Default value: null. This value indicates that all results are queried.</p>
     */
    @NameInMap("ParentGroupId")
    public String parentGroupId;

    /**
     * <p>The ID of the region.</p>
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
