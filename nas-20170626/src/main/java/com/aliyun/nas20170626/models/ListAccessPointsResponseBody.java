// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListAccessPointsResponseBody extends TeaModel {
    @NameInMap("AccessPoints")
    public java.util.List<ListAccessPointsResponseBodyAccessPoints> accessPoints;

    /**
     * <strong>example:</strong>
     * <p>52frCAAAAABoZS90cm****==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>98696EF0-1607-4E9D-B01D-F20930B6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAccessPointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccessPointsResponseBody self = new ListAccessPointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccessPointsResponseBody setAccessPoints(java.util.List<ListAccessPointsResponseBodyAccessPoints> accessPoints) {
        this.accessPoints = accessPoints;
        return this;
    }
    public java.util.List<ListAccessPointsResponseBodyAccessPoints> getAccessPoints() {
        return this.accessPoints;
    }

    public ListAccessPointsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAccessPointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAccessPointsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAccessPointsResponseBodyAccessPointsPosixUser extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PosixGroupId")
        public Integer posixGroupId;

        @NameInMap("PosixSecondaryGroupIds")
        public java.util.List<Integer> posixSecondaryGroupIds;

        /**
         * <strong>example:</strong>
         * <p>156</p>
         */
        @NameInMap("PosixUserId")
        public Integer posixUserId;

        public static ListAccessPointsResponseBodyAccessPointsPosixUser build(java.util.Map<String, ?> map) throws Exception {
            ListAccessPointsResponseBodyAccessPointsPosixUser self = new ListAccessPointsResponseBodyAccessPointsPosixUser();
            return TeaModel.build(map, self);
        }

        public ListAccessPointsResponseBodyAccessPointsPosixUser setPosixGroupId(Integer posixGroupId) {
            this.posixGroupId = posixGroupId;
            return this;
        }
        public Integer getPosixGroupId() {
            return this.posixGroupId;
        }

        public ListAccessPointsResponseBodyAccessPointsPosixUser setPosixSecondaryGroupIds(java.util.List<Integer> posixSecondaryGroupIds) {
            this.posixSecondaryGroupIds = posixSecondaryGroupIds;
            return this;
        }
        public java.util.List<Integer> getPosixSecondaryGroupIds() {
            return this.posixSecondaryGroupIds;
        }

        public ListAccessPointsResponseBodyAccessPointsPosixUser setPosixUserId(Integer posixUserId) {
            this.posixUserId = posixUserId;
            return this;
        }
        public Integer getPosixUserId() {
            return this.posixUserId;
        }

    }

    public static class ListAccessPointsResponseBodyAccessPointsRootPathPermission extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("OwnerGroupId")
        public Long ownerGroupId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OwnerUserId")
        public Long ownerUserId;

        /**
         * <strong>example:</strong>
         * <p>0755</p>
         */
        @NameInMap("Permission")
        public String permission;

        public static ListAccessPointsResponseBodyAccessPointsRootPathPermission build(java.util.Map<String, ?> map) throws Exception {
            ListAccessPointsResponseBodyAccessPointsRootPathPermission self = new ListAccessPointsResponseBodyAccessPointsRootPathPermission();
            return TeaModel.build(map, self);
        }

        public ListAccessPointsResponseBodyAccessPointsRootPathPermission setOwnerGroupId(Long ownerGroupId) {
            this.ownerGroupId = ownerGroupId;
            return this;
        }
        public Long getOwnerGroupId() {
            return this.ownerGroupId;
        }

        public ListAccessPointsResponseBodyAccessPointsRootPathPermission setOwnerUserId(Long ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public Long getOwnerUserId() {
            return this.ownerUserId;
        }

        public ListAccessPointsResponseBodyAccessPointsRootPathPermission setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

    }

    public static class ListAccessPointsResponseBodyAccessPointsTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAccessPointsResponseBodyAccessPointsTags build(java.util.Map<String, ?> map) throws Exception {
            ListAccessPointsResponseBodyAccessPointsTags self = new ListAccessPointsResponseBodyAccessPointsTags();
            return TeaModel.build(map, self);
        }

        public ListAccessPointsResponseBodyAccessPointsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAccessPointsResponseBodyAccessPointsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAccessPointsResponseBodyAccessPoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>acs:nas:cn-hangzhou:178321033379****:accesspoint/ap-ie15yd****</p>
         */
        @NameInMap("ARN")
        public String ARN;

        /**
         * <strong>example:</strong>
         * <p>DEFAULT_VPC_GROUP_NAME</p>
         */
        @NameInMap("AccessGroup")
        public String accessGroup;

        /**
         * <strong>example:</strong>
         * <p>ap-ie15y*****</p>
         */
        @NameInMap("AccessPointId")
        public String accessPointId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AccessPointName")
        public String accessPointName;

        /**
         * <strong>example:</strong>
         * <p>agentic-229oypxjgpau2****</p>
         */
        @NameInMap("AgenticSpaceId")
        public String agenticSpaceId;

        /**
         * <strong>example:</strong>
         * <p>2026-03-28T06:32:14Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2026-06-10T10:08:08Z</p>
         */
        @NameInMap("CreateTimeUtc")
        public String createTimeUtc;

        /**
         * <strong>example:</strong>
         * <p>ap-ie15ydanoz.001014****-w****.cn-hangzhou.nas.aliyuncs.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnabledRam")
        public Boolean enabledRam;

        /**
         * <strong>example:</strong>
         * <p>091yj49baxscll2****</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <strong>example:</strong>
         * <p>2026-06-24T02:10:23Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>2026-06-10T10:08:08Z</p>
         */
        @NameInMap("ModifyTimeUtc")
        public String modifyTimeUtc;

        @NameInMap("PosixUser")
        public ListAccessPointsResponseBodyAccessPointsPosixUser posixUser;

        /**
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("RootPath")
        public String rootPath;

        @NameInMap("RootPathPermission")
        public ListAccessPointsResponseBodyAccessPointsRootPathPermission rootPathPermission;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RootPathStatus")
        public String rootPathStatus;

        /**
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<ListAccessPointsResponseBodyAccessPointsTags> tags;

        /**
         * <strong>example:</strong>
         * <p>vsw-2zevmwkwyztjuoffg****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>vpc-2zesj9afh3y518k9o****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListAccessPointsResponseBodyAccessPoints build(java.util.Map<String, ?> map) throws Exception {
            ListAccessPointsResponseBodyAccessPoints self = new ListAccessPointsResponseBodyAccessPoints();
            return TeaModel.build(map, self);
        }

        public ListAccessPointsResponseBodyAccessPoints setARN(String ARN) {
            this.ARN = ARN;
            return this;
        }
        public String getARN() {
            return this.ARN;
        }

        public ListAccessPointsResponseBodyAccessPoints setAccessGroup(String accessGroup) {
            this.accessGroup = accessGroup;
            return this;
        }
        public String getAccessGroup() {
            return this.accessGroup;
        }

        public ListAccessPointsResponseBodyAccessPoints setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public ListAccessPointsResponseBodyAccessPoints setAccessPointName(String accessPointName) {
            this.accessPointName = accessPointName;
            return this;
        }
        public String getAccessPointName() {
            return this.accessPointName;
        }

        public ListAccessPointsResponseBodyAccessPoints setAgenticSpaceId(String agenticSpaceId) {
            this.agenticSpaceId = agenticSpaceId;
            return this;
        }
        public String getAgenticSpaceId() {
            return this.agenticSpaceId;
        }

        public ListAccessPointsResponseBodyAccessPoints setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAccessPointsResponseBodyAccessPoints setCreateTimeUtc(String createTimeUtc) {
            this.createTimeUtc = createTimeUtc;
            return this;
        }
        public String getCreateTimeUtc() {
            return this.createTimeUtc;
        }

        public ListAccessPointsResponseBodyAccessPoints setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListAccessPointsResponseBodyAccessPoints setEnabledRam(Boolean enabledRam) {
            this.enabledRam = enabledRam;
            return this;
        }
        public Boolean getEnabledRam() {
            return this.enabledRam;
        }

        public ListAccessPointsResponseBodyAccessPoints setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public ListAccessPointsResponseBodyAccessPoints setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListAccessPointsResponseBodyAccessPoints setModifyTimeUtc(String modifyTimeUtc) {
            this.modifyTimeUtc = modifyTimeUtc;
            return this;
        }
        public String getModifyTimeUtc() {
            return this.modifyTimeUtc;
        }

        public ListAccessPointsResponseBodyAccessPoints setPosixUser(ListAccessPointsResponseBodyAccessPointsPosixUser posixUser) {
            this.posixUser = posixUser;
            return this;
        }
        public ListAccessPointsResponseBodyAccessPointsPosixUser getPosixUser() {
            return this.posixUser;
        }

        public ListAccessPointsResponseBodyAccessPoints setRootPath(String rootPath) {
            this.rootPath = rootPath;
            return this;
        }
        public String getRootPath() {
            return this.rootPath;
        }

        public ListAccessPointsResponseBodyAccessPoints setRootPathPermission(ListAccessPointsResponseBodyAccessPointsRootPathPermission rootPathPermission) {
            this.rootPathPermission = rootPathPermission;
            return this;
        }
        public ListAccessPointsResponseBodyAccessPointsRootPathPermission getRootPathPermission() {
            return this.rootPathPermission;
        }

        public ListAccessPointsResponseBodyAccessPoints setRootPathStatus(String rootPathStatus) {
            this.rootPathStatus = rootPathStatus;
            return this;
        }
        public String getRootPathStatus() {
            return this.rootPathStatus;
        }

        public ListAccessPointsResponseBodyAccessPoints setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAccessPointsResponseBodyAccessPoints setTags(java.util.List<ListAccessPointsResponseBodyAccessPointsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListAccessPointsResponseBodyAccessPointsTags> getTags() {
            return this.tags;
        }

        public ListAccessPointsResponseBodyAccessPoints setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListAccessPointsResponseBodyAccessPoints setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
