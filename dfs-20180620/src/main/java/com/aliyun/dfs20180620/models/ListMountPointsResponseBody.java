// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListMountPointsResponseBody extends TeaModel {
    /**
     * <p>The mount point information.</p>
     */
    @NameInMap("MountPoints")
    public java.util.List<ListMountPointsResponseBodyMountPoints> mountPoints;

    /**
     * <p>The token for the next page.</p>
     * <p>If a query does not return all results, a non-empty NextToken is returned. You can include the NextToken in a subsequent query to retrieve the remaining results.</p>
     * 
     * <strong>example:</strong>
     * <p>MYR6sz6qkmauspAy8oxjHP-tOLtD4KSv3DzI7G6iywTx1ZCExO50GtSuiTB9z0JppvYQ2iUa8s4HbcFanMQfDIlds4da87_Ax4UJMva****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>55C5FFD6-BF99-41BD-9C66-FFF39189****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of mount points.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListMountPointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMountPointsResponseBody self = new ListMountPointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMountPointsResponseBody setMountPoints(java.util.List<ListMountPointsResponseBodyMountPoints> mountPoints) {
        this.mountPoints = mountPoints;
        return this;
    }
    public java.util.List<ListMountPointsResponseBodyMountPoints> getMountPoints() {
        return this.mountPoints;
    }

    public ListMountPointsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMountPointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMountPointsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListMountPointsResponseBodyMountPoints extends TeaModel {
        /**
         * <p>The permission group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>acg-e3755fb0-358d-4286-9942-8d461048****</p>
         */
        @NameInMap("AccessGroupId")
        public String accessGroupId;

        /**
         * <p>The time when the mount point was created. The time is displayed in UTC and follows the ISO 8601 standard. Example: 2022-09-19T03:22:32.550267Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-19T03:22:32.550267Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the mount point.</p>
         * 
         * <strong>example:</strong>
         * <p>Mount the production DFS to a vSwitch in the VPC log cluster</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The file system ID.</p>
         * 
         * <strong>example:</strong>
         * <p>37af8f42-2abc-4e74-889d-664f5163****</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The alias of the mount point.</p>
         * 
         * <strong>example:</strong>
         * <p>hdfs1</p>
         */
        @NameInMap("MountPointAlias")
        public String mountPointAlias;

        /**
         * <p>The domain name of the mount point.</p>
         * <p>You can use this domain name to access the Apsara File Storage for HDFS file system within the CIDR block of the VPC to which the mount point is attached.</p>
         * 
         * <strong>example:</strong>
         * <p>f-37af8f42f****.cn-hangzhou.dfs.aliyuncs.com</p>
         */
        @NameInMap("MountPointDomain")
        public String mountPointDomain;

        /**
         * <p>The mount point ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f-37af8f42f****.cn-hangzhou.dfs.aliyuncs.com</p>
         */
        @NameInMap("MountPointId")
        public String mountPointId;

        /**
         * <p>The network type of the mount point.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the mount point.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Inactive: The mount point is disabled.</li>
         * <li>Active: The mount point is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Inactive</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-iq8fymi327krd14mt****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-iq8hhsk3ymzv9m4wn****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListMountPointsResponseBodyMountPoints build(java.util.Map<String, ?> map) throws Exception {
            ListMountPointsResponseBodyMountPoints self = new ListMountPointsResponseBodyMountPoints();
            return TeaModel.build(map, self);
        }

        public ListMountPointsResponseBodyMountPoints setAccessGroupId(String accessGroupId) {
            this.accessGroupId = accessGroupId;
            return this;
        }
        public String getAccessGroupId() {
            return this.accessGroupId;
        }

        public ListMountPointsResponseBodyMountPoints setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListMountPointsResponseBodyMountPoints setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMountPointsResponseBodyMountPoints setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public ListMountPointsResponseBodyMountPoints setMountPointAlias(String mountPointAlias) {
            this.mountPointAlias = mountPointAlias;
            return this;
        }
        public String getMountPointAlias() {
            return this.mountPointAlias;
        }

        public ListMountPointsResponseBodyMountPoints setMountPointDomain(String mountPointDomain) {
            this.mountPointDomain = mountPointDomain;
            return this;
        }
        public String getMountPointDomain() {
            return this.mountPointDomain;
        }

        public ListMountPointsResponseBodyMountPoints setMountPointId(String mountPointId) {
            this.mountPointId = mountPointId;
            return this;
        }
        public String getMountPointId() {
            return this.mountPointId;
        }

        public ListMountPointsResponseBodyMountPoints setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public ListMountPointsResponseBodyMountPoints setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListMountPointsResponseBodyMountPoints setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMountPointsResponseBodyMountPoints setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListMountPointsResponseBodyMountPoints setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
