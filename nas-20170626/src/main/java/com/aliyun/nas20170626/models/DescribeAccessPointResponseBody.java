// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAccessPointResponseBody extends TeaModel {
    @NameInMap("AccessPoint")
    public DescribeAccessPointResponseBodyAccessPoint accessPoint;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAccessPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessPointResponseBody self = new DescribeAccessPointResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccessPointResponseBody setAccessPoint(DescribeAccessPointResponseBodyAccessPoint accessPoint) {
        this.accessPoint = accessPoint;
        return this;
    }
    public DescribeAccessPointResponseBodyAccessPoint getAccessPoint() {
        return this.accessPoint;
    }

    public DescribeAccessPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAccessPointResponseBodyAccessPointPosixUser extends TeaModel {
        @NameInMap("PosixGroupId")
        public Integer posixGroupId;

        @NameInMap("PosixSecondaryGroupIds")
        public java.util.List<Integer> posixSecondaryGroupIds;

        @NameInMap("PosixUserId")
        public Integer posixUserId;

        public static DescribeAccessPointResponseBodyAccessPointPosixUser build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessPointResponseBodyAccessPointPosixUser self = new DescribeAccessPointResponseBodyAccessPointPosixUser();
            return TeaModel.build(map, self);
        }

        public DescribeAccessPointResponseBodyAccessPointPosixUser setPosixGroupId(Integer posixGroupId) {
            this.posixGroupId = posixGroupId;
            return this;
        }
        public Integer getPosixGroupId() {
            return this.posixGroupId;
        }

        public DescribeAccessPointResponseBodyAccessPointPosixUser setPosixSecondaryGroupIds(java.util.List<Integer> posixSecondaryGroupIds) {
            this.posixSecondaryGroupIds = posixSecondaryGroupIds;
            return this;
        }
        public java.util.List<Integer> getPosixSecondaryGroupIds() {
            return this.posixSecondaryGroupIds;
        }

        public DescribeAccessPointResponseBodyAccessPointPosixUser setPosixUserId(Integer posixUserId) {
            this.posixUserId = posixUserId;
            return this;
        }
        public Integer getPosixUserId() {
            return this.posixUserId;
        }

    }

    public static class DescribeAccessPointResponseBodyAccessPointRootPathPermission extends TeaModel {
        @NameInMap("OwnerGroupId")
        public Integer ownerGroupId;

        @NameInMap("OwnerUserId")
        public Integer ownerUserId;

        @NameInMap("Permission")
        public String permission;

        public static DescribeAccessPointResponseBodyAccessPointRootPathPermission build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessPointResponseBodyAccessPointRootPathPermission self = new DescribeAccessPointResponseBodyAccessPointRootPathPermission();
            return TeaModel.build(map, self);
        }

        public DescribeAccessPointResponseBodyAccessPointRootPathPermission setOwnerGroupId(Integer ownerGroupId) {
            this.ownerGroupId = ownerGroupId;
            return this;
        }
        public Integer getOwnerGroupId() {
            return this.ownerGroupId;
        }

        public DescribeAccessPointResponseBodyAccessPointRootPathPermission setOwnerUserId(Integer ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public Integer getOwnerUserId() {
            return this.ownerUserId;
        }

        public DescribeAccessPointResponseBodyAccessPointRootPathPermission setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

    }

    public static class DescribeAccessPointResponseBodyAccessPoint extends TeaModel {
        @NameInMap("ARN")
        public String ARN;

        @NameInMap("AccessGroup")
        public String accessGroup;

        @NameInMap("AccessPointId")
        public String accessPointId;

        @NameInMap("AccessPointName")
        public String accessPointName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("EnabledRam")
        public Boolean enabledRam;

        @NameInMap("FileSystemId")
        public String fileSystemId;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("PosixUser")
        public DescribeAccessPointResponseBodyAccessPointPosixUser posixUser;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RootPath")
        public String rootPath;

        @NameInMap("RootPathPermission")
        public DescribeAccessPointResponseBodyAccessPointRootPathPermission rootPathPermission;

        @NameInMap("RootPathStatus")
        public String rootPathStatus;

        @NameInMap("Status")
        public String status;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeAccessPointResponseBodyAccessPoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessPointResponseBodyAccessPoint self = new DescribeAccessPointResponseBodyAccessPoint();
            return TeaModel.build(map, self);
        }

        public DescribeAccessPointResponseBodyAccessPoint setARN(String ARN) {
            this.ARN = ARN;
            return this;
        }
        public String getARN() {
            return this.ARN;
        }

        public DescribeAccessPointResponseBodyAccessPoint setAccessGroup(String accessGroup) {
            this.accessGroup = accessGroup;
            return this;
        }
        public String getAccessGroup() {
            return this.accessGroup;
        }

        public DescribeAccessPointResponseBodyAccessPoint setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public DescribeAccessPointResponseBodyAccessPoint setAccessPointName(String accessPointName) {
            this.accessPointName = accessPointName;
            return this;
        }
        public String getAccessPointName() {
            return this.accessPointName;
        }

        public DescribeAccessPointResponseBodyAccessPoint setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAccessPointResponseBodyAccessPoint setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeAccessPointResponseBodyAccessPoint setEnabledRam(Boolean enabledRam) {
            this.enabledRam = enabledRam;
            return this;
        }
        public Boolean getEnabledRam() {
            return this.enabledRam;
        }

        public DescribeAccessPointResponseBodyAccessPoint setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeAccessPointResponseBodyAccessPoint setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeAccessPointResponseBodyAccessPoint setPosixUser(DescribeAccessPointResponseBodyAccessPointPosixUser posixUser) {
            this.posixUser = posixUser;
            return this;
        }
        public DescribeAccessPointResponseBodyAccessPointPosixUser getPosixUser() {
            return this.posixUser;
        }

        public DescribeAccessPointResponseBodyAccessPoint setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAccessPointResponseBodyAccessPoint setRootPath(String rootPath) {
            this.rootPath = rootPath;
            return this;
        }
        public String getRootPath() {
            return this.rootPath;
        }

        public DescribeAccessPointResponseBodyAccessPoint setRootPathPermission(DescribeAccessPointResponseBodyAccessPointRootPathPermission rootPathPermission) {
            this.rootPathPermission = rootPathPermission;
            return this;
        }
        public DescribeAccessPointResponseBodyAccessPointRootPathPermission getRootPathPermission() {
            return this.rootPathPermission;
        }

        public DescribeAccessPointResponseBodyAccessPoint setRootPathStatus(String rootPathStatus) {
            this.rootPathStatus = rootPathStatus;
            return this;
        }
        public String getRootPathStatus() {
            return this.rootPathStatus;
        }

        public DescribeAccessPointResponseBodyAccessPoint setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAccessPointResponseBodyAccessPoint setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeAccessPointResponseBodyAccessPoint setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
