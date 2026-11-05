// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class GetMountPointResponseBody extends TeaModel {
    /**
     * <p>The mount point information.</p>
     */
    @NameInMap("MountPoint")
    public GetMountPointResponseBodyMountPoint mountPoint;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>55C5FFD6-BF99-41BD-9C66-FFF39189****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMountPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMountPointResponseBody self = new GetMountPointResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMountPointResponseBody setMountPoint(GetMountPointResponseBodyMountPoint mountPoint) {
        this.mountPoint = mountPoint;
        return this;
    }
    public GetMountPointResponseBodyMountPoint getMountPoint() {
        return this.mountPoint;
    }

    public GetMountPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMountPointResponseBodyMountPoint extends TeaModel {
        /**
         * <p>The ID of the permission group associated with the mount point.</p>
         * 
         * <strong>example:</strong>
         * <p>acg-e3755fb0-358d-4286-9942-8d461048****</p>
         */
        @NameInMap("AccessGroupId")
        public String accessGroupId;

        /**
         * <p>The time when the mount point was created. The time is in UTC and follows the ISO 8601 standard. Example: 2022-09-19T03:22:32.550267Z.</p>
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
         * <p>The status of the mount point. Valid values:</p>
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

        public static GetMountPointResponseBodyMountPoint build(java.util.Map<String, ?> map) throws Exception {
            GetMountPointResponseBodyMountPoint self = new GetMountPointResponseBodyMountPoint();
            return TeaModel.build(map, self);
        }

        public GetMountPointResponseBodyMountPoint setAccessGroupId(String accessGroupId) {
            this.accessGroupId = accessGroupId;
            return this;
        }
        public String getAccessGroupId() {
            return this.accessGroupId;
        }

        public GetMountPointResponseBodyMountPoint setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetMountPointResponseBodyMountPoint setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMountPointResponseBodyMountPoint setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public GetMountPointResponseBodyMountPoint setMountPointAlias(String mountPointAlias) {
            this.mountPointAlias = mountPointAlias;
            return this;
        }
        public String getMountPointAlias() {
            return this.mountPointAlias;
        }

        public GetMountPointResponseBodyMountPoint setMountPointDomain(String mountPointDomain) {
            this.mountPointDomain = mountPointDomain;
            return this;
        }
        public String getMountPointDomain() {
            return this.mountPointDomain;
        }

        public GetMountPointResponseBodyMountPoint setMountPointId(String mountPointId) {
            this.mountPointId = mountPointId;
            return this;
        }
        public String getMountPointId() {
            return this.mountPointId;
        }

        public GetMountPointResponseBodyMountPoint setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public GetMountPointResponseBodyMountPoint setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetMountPointResponseBodyMountPoint setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMountPointResponseBodyMountPoint setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetMountPointResponseBodyMountPoint setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
