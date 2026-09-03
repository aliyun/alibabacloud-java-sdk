// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCloudDiskGroupDrivesResponseBody extends TeaModel {
    /**
     * <p>The list of cloud disk team spaces.</p>
     */
    @NameInMap("CloudDriveGroups")
    public java.util.List<DescribeCloudDiskGroupDrivesResponseBodyCloudDriveGroups> cloudDriveGroups;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>The token for the next query. If NextToken is empty, no more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>MTA0MjA=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B9F9CBBE-8A9F-5FE5-8A72-0E81C2401A91</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeCloudDiskGroupDrivesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudDiskGroupDrivesResponseBody self = new DescribeCloudDiskGroupDrivesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudDiskGroupDrivesResponseBody setCloudDriveGroups(java.util.List<DescribeCloudDiskGroupDrivesResponseBodyCloudDriveGroups> cloudDriveGroups) {
        this.cloudDriveGroups = cloudDriveGroups;
        return this;
    }
    public java.util.List<DescribeCloudDiskGroupDrivesResponseBodyCloudDriveGroups> getCloudDriveGroups() {
        return this.cloudDriveGroups;
    }

    public DescribeCloudDiskGroupDrivesResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public DescribeCloudDiskGroupDrivesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCloudDiskGroupDrivesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudDiskGroupDrivesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCloudDiskGroupDrivesResponseBodyCloudDriveGroups extends TeaModel {
        /**
         * <p>The creation time. The time is in the ISO 8601 standard in the UTC format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-11T07:44:21Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The office network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-959593****</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The space ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("DriveId")
        public String driveId;

        /**
         * <p>The team space ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cg-e70ga4ixp30ur****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The team space name.</p>
         * 
         * <strong>example:</strong>
         * <p>TestTeam1</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The organization ID of the team.</p>
         * 
         * <strong>example:</strong>
         * <p>org-aliyun-wy-org-id</p>
         */
        @NameInMap("OrgId")
        public String orgId;

        /**
         * <p>The team space status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The total capacity of the cloud disk team space.</p>
         * 
         * <strong>example:</strong>
         * <p>5368709120</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        /**
         * <p>The used space size. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1024000000</p>
         */
        @NameInMap("UsedSize")
        public String usedSize;

        public static DescribeCloudDiskGroupDrivesResponseBodyCloudDriveGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudDiskGroupDrivesResponseBodyCloudDriveGroups self = new DescribeCloudDiskGroupDrivesResponseBodyCloudDriveGroups();
            return TeaModel.build(map, self);
        }

        public DescribeCloudDiskGroupDrivesResponseBodyCloudDriveGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeCloudDiskGroupDrivesResponseBodyCloudDriveGroups setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public DescribeCloudDiskGroupDrivesResponseBodyCloudDriveGroups setDriveId(String driveId) {
            this.driveId = driveId;
            return this;
        }
        public String getDriveId() {
            return this.driveId;
        }

        public DescribeCloudDiskGroupDrivesResponseBodyCloudDriveGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeCloudDiskGroupDrivesResponseBodyCloudDriveGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeCloudDiskGroupDrivesResponseBodyCloudDriveGroups setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
        }

        public DescribeCloudDiskGroupDrivesResponseBodyCloudDriveGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCloudDiskGroupDrivesResponseBodyCloudDriveGroups setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

        public DescribeCloudDiskGroupDrivesResponseBodyCloudDriveGroups setUsedSize(String usedSize) {
            this.usedSize = usedSize;
            return this;
        }
        public String getUsedSize() {
            return this.usedSize;
        }

    }

}
