// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAccessPointsResponseBody extends TeaModel {
    /**
     * <p>The information about the access point.</p>
     */
    @NameInMap("AccessPoints")
    public java.util.List<DescribeAccessPointsResponseBodyAccessPoints> accessPoints;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>MTY4NzcxOTcwMjAzMDk2Nzc0MyM4MDM4****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6299428C-3861-435D-AE54-9B330A00****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of access points.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
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
        /**
         * <p>The ID of the owner group.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("OwnerGroupId")
        public Long ownerGroupId;

        /**
         * <p>The owner ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OwnerUserId")
        public Long ownerUserId;

        /**
         * <p>The POSIX permission.</p>
         * 
         * <strong>example:</strong>
         * <p>0755</p>
         */
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

    public static class DescribeAccessPointsResponseBodyAccessPointsTags extends TeaModel {
        /**
         * <p>The key of the tag that is added to the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Tag value</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAccessPointsResponseBodyAccessPointsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessPointsResponseBodyAccessPointsTags self = new DescribeAccessPointsResponseBodyAccessPointsTags();
            return TeaModel.build(map, self);
        }

        public DescribeAccessPointsResponseBodyAccessPointsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAccessPointsResponseBodyAccessPointsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAccessPointsResponseBodyAccessPoints extends TeaModel {
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
         * <p>ap-ie15y*****</p>
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
         * <p>Indicates whether the Resource Access Management (RAM) policy is enabled.</p>
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
         * <p>The Portable Operating System Interface for UNIX (POSIX) user.</p>
         */
        @NameInMap("PosixUser")
        public DescribeAccessPointsResponseBodyAccessPointsPosixUser posixUser;

        /**
         * <p>The root directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("RootPath")
        public String rootPath;

        /**
         * <p>The permissions on the root directory.</p>
         */
        @NameInMap("RootPathPermission")
        public DescribeAccessPointsResponseBodyAccessPointsRootPathPermission rootPathPermission;

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
         * <blockquote>
         * <p> You can mount a file system only if the access point is in the Active state.</p>
         * </blockquote>
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
        public java.util.List<DescribeAccessPointsResponseBodyAccessPointsTags> tags;

        /**
         * <p>Switch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zevmwkwyztjuoffg****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zesj9afh3y518k9o****</p>
         */
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

        public DescribeAccessPointsResponseBodyAccessPoints setTags(java.util.List<DescribeAccessPointsResponseBodyAccessPointsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeAccessPointsResponseBodyAccessPointsTags> getTags() {
            return this.tags;
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
