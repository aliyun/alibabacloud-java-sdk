// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetClusterDetailsResponseBody extends TeaModel {
    @NameInMap("Details")
    public GetClusterDetailsResponseBodyDetails details;

    @NameInMap("RequestId")
    public String requestId;

    public static GetClusterDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterDetailsResponseBody self = new GetClusterDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterDetailsResponseBody setDetails(GetClusterDetailsResponseBodyDetails details) {
        this.details = details;
        return this;
    }
    public GetClusterDetailsResponseBodyDetails getDetails() {
        return this.details;
    }

    public GetClusterDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetClusterDetailsResponseBodyDetails extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Description")
        public String description;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("InstanceInfos")
        public String instanceInfos;

        @NameInMap("IsMixDeploy")
        public Boolean isMixDeploy;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("State")
        public String state;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("UserOssInfo")
        public String userOssInfo;

        @NameInMap("UserSGId")
        public String userSGId;

        @NameInMap("UserVSwitchList")
        public String userVSwitchList;

        /**
         * <p>VPC ID。</p>
         */
        @NameInMap("UserVpcId")
        public String userVpcId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static GetClusterDetailsResponseBodyDetails build(java.util.Map<String, ?> map) throws Exception {
            GetClusterDetailsResponseBodyDetails self = new GetClusterDetailsResponseBodyDetails();
            return TeaModel.build(map, self);
        }

        public GetClusterDetailsResponseBodyDetails setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetClusterDetailsResponseBodyDetails setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetClusterDetailsResponseBodyDetails setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetClusterDetailsResponseBodyDetails setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetClusterDetailsResponseBodyDetails setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetClusterDetailsResponseBodyDetails setInstanceInfos(String instanceInfos) {
            this.instanceInfos = instanceInfos;
            return this;
        }
        public String getInstanceInfos() {
            return this.instanceInfos;
        }

        public GetClusterDetailsResponseBodyDetails setIsMixDeploy(Boolean isMixDeploy) {
            this.isMixDeploy = isMixDeploy;
            return this;
        }
        public Boolean getIsMixDeploy() {
            return this.isMixDeploy;
        }

        public GetClusterDetailsResponseBodyDetails setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetClusterDetailsResponseBodyDetails setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetClusterDetailsResponseBodyDetails setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetClusterDetailsResponseBodyDetails setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetClusterDetailsResponseBodyDetails setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public GetClusterDetailsResponseBodyDetails setUserOssInfo(String userOssInfo) {
            this.userOssInfo = userOssInfo;
            return this;
        }
        public String getUserOssInfo() {
            return this.userOssInfo;
        }

        public GetClusterDetailsResponseBodyDetails setUserSGId(String userSGId) {
            this.userSGId = userSGId;
            return this;
        }
        public String getUserSGId() {
            return this.userSGId;
        }

        public GetClusterDetailsResponseBodyDetails setUserVSwitchList(String userVSwitchList) {
            this.userVSwitchList = userVSwitchList;
            return this;
        }
        public String getUserVSwitchList() {
            return this.userVSwitchList;
        }

        public GetClusterDetailsResponseBodyDetails setUserVpcId(String userVpcId) {
            this.userVpcId = userVpcId;
            return this;
        }
        public String getUserVpcId() {
            return this.userVpcId;
        }

        public GetClusterDetailsResponseBodyDetails setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
