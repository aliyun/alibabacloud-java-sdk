// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class GetMountPointResponseBody extends TeaModel {
    @NameInMap("MountPoint")
    public GetMountPointResponseBodyMountPoint mountPoint;

    /**
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
         * <strong>example:</strong>
         * <p>acg-e3755fb0-358d-4286-9942-8d461048****</p>
         */
        @NameInMap("AccessGroupId")
        public String accessGroupId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("FileSystemId")
        public String fileSystemId;

        @NameInMap("MountPointAlias")
        public String mountPointAlias;

        @NameInMap("MountPointDomain")
        public String mountPointDomain;

        @NameInMap("MountPointId")
        public String mountPointId;

        /**
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>Inactive</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>vsw-iq8fymi327krd14mt****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
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
