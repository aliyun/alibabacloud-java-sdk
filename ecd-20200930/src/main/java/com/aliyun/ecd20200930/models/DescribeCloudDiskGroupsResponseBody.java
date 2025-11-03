// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCloudDiskGroupsResponseBody extends TeaModel {
    @NameInMap("CloudDriveGroups")
    public java.util.List<DescribeCloudDiskGroupsResponseBodyCloudDriveGroups> cloudDriveGroups;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>D648DBF7-9476-53D6-98AB-674836021DFB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeCloudDiskGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudDiskGroupsResponseBody self = new DescribeCloudDiskGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudDiskGroupsResponseBody setCloudDriveGroups(java.util.List<DescribeCloudDiskGroupsResponseBodyCloudDriveGroups> cloudDriveGroups) {
        this.cloudDriveGroups = cloudDriveGroups;
        return this;
    }
    public java.util.List<DescribeCloudDiskGroupsResponseBodyCloudDriveGroups> getCloudDriveGroups() {
        return this.cloudDriveGroups;
    }

    public DescribeCloudDiskGroupsResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public DescribeCloudDiskGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCloudDiskGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudDiskGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCloudDiskGroupsResponseBodyCloudDriveGroups extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-04-11T07:44:21Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-959593****</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("DriveId")
        public String driveId;

        /**
         * <strong>example:</strong>
         * <p>cg-e70ga4ixp30ur****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>org-aliyun-wy-org-id</p>
         */
        @NameInMap("OrgId")
        public String orgId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>5368709120</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        /**
         * <strong>example:</strong>
         * <p>1024000000</p>
         */
        @NameInMap("UsedSize")
        public String usedSize;

        public static DescribeCloudDiskGroupsResponseBodyCloudDriveGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudDiskGroupsResponseBodyCloudDriveGroups self = new DescribeCloudDiskGroupsResponseBodyCloudDriveGroups();
            return TeaModel.build(map, self);
        }

        public DescribeCloudDiskGroupsResponseBodyCloudDriveGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeCloudDiskGroupsResponseBodyCloudDriveGroups setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public DescribeCloudDiskGroupsResponseBodyCloudDriveGroups setDriveId(String driveId) {
            this.driveId = driveId;
            return this;
        }
        public String getDriveId() {
            return this.driveId;
        }

        public DescribeCloudDiskGroupsResponseBodyCloudDriveGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeCloudDiskGroupsResponseBodyCloudDriveGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeCloudDiskGroupsResponseBodyCloudDriveGroups setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
        }

        public DescribeCloudDiskGroupsResponseBodyCloudDriveGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCloudDiskGroupsResponseBodyCloudDriveGroups setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

        public DescribeCloudDiskGroupsResponseBodyCloudDriveGroups setUsedSize(String usedSize) {
            this.usedSize = usedSize;
            return this;
        }
        public String getUsedSize() {
            return this.usedSize;
        }

    }

}
