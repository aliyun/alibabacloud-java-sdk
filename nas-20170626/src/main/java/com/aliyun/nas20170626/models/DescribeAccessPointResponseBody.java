// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAccessPointResponseBody extends TeaModel {
    /**
     * <p>The information about the access point.</p>
     */
    @NameInMap("AccessPoint")
    public DescribeAccessPointResponseBodyAccessPoint accessPoint;

    /**
     * <p>The request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
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
        /**
         * <p>The ID of the POSIX user group.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("PosixGroupId")
        public Integer posixGroupId;

        /**
         * <p>The IDs of the secondary user groups.</p>
         */
        @NameInMap("PosixSecondaryGroupIds")
        public java.util.List<Integer> posixSecondaryGroupIds;

        /**
         * <p>The ID of the POSIX user.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
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
        /**
         * <p>The ID of the owner group.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OwnerGroupId")
        public Integer ownerGroupId;

        /**
         * <p>The owner ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OwnerUserId")
        public Integer ownerUserId;

        /**
         * <p>The POSIX permission.</p>
         * 
         * <strong>example:</strong>
         * <p>0755</p>
         */
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

    public static class DescribeAccessPointResponseBodyAccessPointTags extends TeaModel {
        /**
         * <p>The key of a tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of a tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAccessPointResponseBodyAccessPointTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessPointResponseBodyAccessPointTags self = new DescribeAccessPointResponseBodyAccessPointTags();
            return TeaModel.build(map, self);
        }

        public DescribeAccessPointResponseBodyAccessPointTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAccessPointResponseBodyAccessPointTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAccessPointResponseBodyAccessPoint extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the access point.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:nas:cn-hangzhou:178321033379****:accesspoint/ap-ie15yd****</p>
         */
        @NameInMap("ARN")
        public String ARN;

        /**
         * <p>The name of the permission group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AccessGroup")
        public String accessGroup;

        /**
         * <p>The ID of the access point.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-ie15yd****</p>
         */
        @NameInMap("AccessPointId")
        public String accessPointId;

        /**
         * <p>The name of the access point.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AccessPointName")
        public String accessPointName;

        /**
         * <p>The time when the access point was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1709619668276167</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The domain name of the access point.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-ie15ydanoz.001014****-w****.cn-hangzhou.nas.aliyuncs.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>Indicates whether the RAM policy is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnabledRam")
        public Boolean enabledRam;

        /**
         * <p>The ID of the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>31a8e4****</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The time when the access point was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1709619668276167</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The POSIX user.</p>
         */
        @NameInMap("PosixUser")
        public DescribeAccessPointResponseBodyAccessPointPosixUser posixUser;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The root directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("RootPath")
        public String rootPath;

        /**
         * <p>The permissions to create the root directory.</p>
         */
        @NameInMap("RootPathPermission")
        public DescribeAccessPointResponseBodyAccessPointRootPathPermission rootPathPermission;

        /**
         * <p>The status of the root directory.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>0: The rootpath status is unknown.</li>
         * <li>1: The rootpath does not exist and may be deleted.</li>
         * <li>2: The rootpath is normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RootPathStatus")
        public String rootPathStatus;

        /**
         * <p>The status of the access point.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Active: The access point is available.</li>
         * <li>Inactive: The access point is unavailable.</li>
         * <li>Pending: The access point is being created.</li>
         * <li>Deleting: The access point is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags of the access point.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeAccessPointResponseBodyAccessPointTags> tags;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zevmwkwyztjuoffg****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * <p>You must select the VPC of the Elastic Compute Service (ECS) instance on which you want to mount the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zesj9afh3y518k9o****</p>
         */
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

        public DescribeAccessPointResponseBodyAccessPoint setTags(java.util.List<DescribeAccessPointResponseBodyAccessPointTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeAccessPointResponseBodyAccessPointTags> getTags() {
            return this.tags;
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
