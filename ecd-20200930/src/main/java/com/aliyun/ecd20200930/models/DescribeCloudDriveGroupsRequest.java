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
     * <p>The workspace ID.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The workspace name.</p>
     */
    @NameInMap("DirectoryName")
    public String directoryName;

    /**
     * <p>The team space status. Valid values:</p>
     * <br>
     * <p>*   enabled</p>
     * <p>*   disabled</p>
     * <br>
     * <p>Default value: enabled.</p>
     */
    @NameInMap("DriveStatus")
    public String driveStatus;

    /**
     * <p>Specifies whether the space is increased.</p>
     * <br>
     * <p>*   binding: increased</p>
     * <p>*   unbound: not increased</p>
     * <br>
     * <p>Default value: null. The default value indicates that all spaces are queried.</p>
     */
    @NameInMap("DriveType")
    public String driveType;

    /**
     * <p>The team ID.</p>
     */
    @NameInMap("GroupId")
    public java.util.List<String> groupId;

    /**
     * <p>The team name for fuzzy search.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The team type.</p>
     * <br>
     * <p>*   org: organizational structure</p>
     * <p>*   directory: workspace</p>
     * <br>
     * <p>Default value: null. The default value indicates that all types of teams are queried.</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>*   Valid values: 1 to 100</p>
     * <p>*   Default value: 20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the parent node. If a parent node ID is specified, the subnodes are queried. If you set the value of this parameter to root, the root node is queried.</p>
     * <br>
     * <p>Default value: null. The default value indicates that all nodes are queried.</p>
     */
    @NameInMap("ParentGroupId")
    public String parentGroupId;

    /**
     * <p>The region ID.</p>
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
