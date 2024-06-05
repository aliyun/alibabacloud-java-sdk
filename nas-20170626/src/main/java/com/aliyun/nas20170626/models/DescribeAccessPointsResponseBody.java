// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAccessPointsResponseBody extends TeaModel {
    @NameInMap("AccessPoints")
    public java.util.List<DescribeAccessPointsResponseBodyAccessPoints> accessPoints;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAccessPointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessPointsResponseBody self = new DescribeAccessPointsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccessPointsResponseBody setAccessPoints(java.util.List<DescribeAccessPointsResponseBodyAccessPoints> accessPoints) {
        this.accessPoints = accessPoints;
        return this;
    }
    public java.util.List<DescribeAccessPointsResponseBodyAccessPoints> getAccessPoints() {
        return this.accessPoints;
    }

    public DescribeAccessPointsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeAccessPointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccessPointsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAccessPointsResponseBodyAccessPointsPosixUser extends TeaModel {
        @NameInMap("PosixGroupId")
        public Integer posixGroupId;

        @NameInMap("PosixSecondaryGroupIds")
        public java.util.List<Integer> posixSecondaryGroupIds;

        @NameInMap("PosixUserId")
        public Integer posixUserId;

        public static DescribeAccessPointsResponseBodyAccessPointsPosixUser build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessPointsResponseBodyAccessPointsPosixUser self = new DescribeAccessPointsResponseBodyAccessPointsPosixUser();
            return TeaModel.build(map, self);
        }

        public DescribeAccessPointsResponseBodyAccessPointsPosixUser setPosixGroupId(Integer posixGroupId) {
            this.posixGroupId = posixGroupId;
            return this;
        }
        public Integer getPosixGroupId() {
            return this.posixGroupId;
        }

        public DescribeAccessPointsResponseBodyAccessPointsPosixUser setPosixSecondaryGroupIds(java.util.List<Integer> posixSecondaryGroupIds) {
            this.posixSecondaryGroupIds = posixSecondaryGroupIds;
            return this;
        }
        public java.util.List<Integer> getPosixSecondaryGroupIds() {
            return this.posixSecondaryGroupIds;
        }

        public DescribeAccessPointsResponseBodyAccessPointsPosixUser setPosixUserId(Integer posixUserId) {
            this.posixUserId = posixUserId;
            return this;
        }
        public Integer getPosixUserId() {
            return this.posixUserId;
        }

    }

    public static class DescribeAccessPointsResponseBodyAccessPointsRootPathPermission extends TeaModel {
        @NameInMap("OwnerGroupId")
        public Long ownerGroupId;

        @NameInMap("OwnerUserId")
        public Long ownerUserId;

        @NameInMap("Permission")
        public String permission;

        public static DescribeAccessPointsResponseBodyAccessPointsRootPathPermission build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessPointsResponseBodyAccessPointsRootPathPermission self = new DescribeAccessPointsResponseBodyAccessPointsRootPathPermission();
            return TeaModel.build(map, self);
        }

        public DescribeAccessPointsResponseBodyAccessPointsRootPathPermission setOwnerGroupId(Long ownerGroupId) {
            this.ownerGroupId = ownerGroupId;
            return this;
        }
        public Long getOwnerGroupId() {
            return this.ownerGroupId;
        }

        public DescribeAccessPointsResponseBodyAccessPointsRootPathPermission setOwnerUserId(Long ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public Long getOwnerUserId() {
            return this.ownerUserId;
        }

        public DescribeAccessPointsResponseBodyAccessPointsRootPathPermission setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

    }

    public static class DescribeAccessPointsResponseBodyAccessPoints extends TeaModel {
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
        public DescribeAccessPointsResponseBodyAccessPointsPosixUser posixUser;

        @NameInMap("RootPath")
        public String rootPath;

        @NameInMap("RootPathPermission")
        public DescribeAccessPointsResponseBodyAccessPointsRootPathPermission rootPathPermission;

        @NameInMap("RootPathStatus")
        public String rootPathStatus;

        @NameInMap("Status")
        public String status;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeAccessPointsResponseBodyAccessPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessPointsResponseBodyAccessPoints self = new DescribeAccessPointsResponseBodyAccessPoints();
            return TeaModel.build(map, self);
        }

        public DescribeAccessPointsResponseBodyAccessPoints setARN(String ARN) {
            this.ARN = ARN;
            return this;
        }
        public String getARN() {
            return this.ARN;
        }

        public DescribeAccessPointsResponseBodyAccessPoints setAccessGroup(String accessGroup) {
            this.accessGroup = accessGroup;
            return this;
        }
        public String getAccessGroup() {
            return this.accessGroup;
        }

        public DescribeAccessPointsResponseBodyAccessPoints setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public DescribeAccessPointsResponseBodyAccessPoints setAccessPointName(String accessPointName) {
            this.accessPointName = accessPointName;
            return this;
        }
        public String getAccessPointName() {
            return this.accessPointName;
        }

        public DescribeAccessPointsResponseBodyAccessPoints setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAccessPointsResponseBodyAccessPoints setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeAccessPointsResponseBodyAccessPoints setEnabledRam(Boolean enabledRam) {
            this.enabledRam = enabledRam;
            return this;
        }
        public Boolean getEnabledRam() {
            return this.enabledRam;
        }

        public DescribeAccessPointsResponseBodyAccessPoints setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeAccessPointsResponseBodyAccessPoints setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeAccessPointsResponseBodyAccessPoints setPosixUser(DescribeAccessPointsResponseBodyAccessPointsPosixUser posixUser) {
            this.posixUser = posixUser;
            return this;
        }
        public DescribeAccessPointsResponseBodyAccessPointsPosixUser getPosixUser() {
            return this.posixUser;
        }

        public DescribeAccessPointsResponseBodyAccessPoints setRootPath(String rootPath) {
            this.rootPath = rootPath;
            return this;
        }
        public String getRootPath() {
            return this.rootPath;
        }

        public DescribeAccessPointsResponseBodyAccessPoints setRootPathPermission(DescribeAccessPointsResponseBodyAccessPointsRootPathPermission rootPathPermission) {
            this.rootPathPermission = rootPathPermission;
            return this;
        }
        public DescribeAccessPointsResponseBodyAccessPointsRootPathPermission getRootPathPermission() {
            return this.rootPathPermission;
        }

        public DescribeAccessPointsResponseBodyAccessPoints setRootPathStatus(String rootPathStatus) {
            this.rootPathStatus = rootPathStatus;
            return this;
        }
        public String getRootPathStatus() {
            return this.rootPathStatus;
        }

        public DescribeAccessPointsResponseBodyAccessPoints setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAccessPointsResponseBodyAccessPoints setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeAccessPointsResponseBodyAccessPoints setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
