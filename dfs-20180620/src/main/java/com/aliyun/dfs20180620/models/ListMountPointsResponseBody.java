// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListMountPointsResponseBody extends TeaModel {
    @NameInMap("MountPoints")
    public java.util.List<ListMountPointsResponseBodyMountPoints> mountPoints;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AccessGroupId")
        public String accessGroupId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("FileSystemId")
        public String fileSystemId;

        @NameInMap("MountPointDomain")
        public String mountPointDomain;

        @NameInMap("MountPointId")
        public String mountPointId;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("VSwitchId")
        public String vSwitchId;

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
