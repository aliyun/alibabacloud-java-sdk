// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateFabricOrganizationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public CreateFabricOrganizationResponseBodyResult result;

    public static CreateFabricOrganizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFabricOrganizationResponseBody self = new CreateFabricOrganizationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFabricOrganizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFabricOrganizationResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CreateFabricOrganizationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateFabricOrganizationResponseBody setResult(CreateFabricOrganizationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateFabricOrganizationResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateFabricOrganizationResponseBodyResult extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("PeerCount")
        public Integer peerCount;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ConsortiumCount")
        public Integer consortiumCount;

        @NameInMap("SpecName")
        public String specName;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("ServiceState")
        public String serviceState;

        @NameInMap("OwnerUid")
        public Long ownerUid;

        @NameInMap("ClusterState")
        public String clusterState;

        @NameInMap("CodeName")
        public String codeName;

        @NameInMap("OwnerBid")
        public String ownerBid;

        @NameInMap("OrganizationDescription")
        public String organizationDescription;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("UserCount")
        public Integer userCount;

        @NameInMap("OrganizationName")
        public String organizationName;

        public static CreateFabricOrganizationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateFabricOrganizationResponseBodyResult self = new CreateFabricOrganizationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateFabricOrganizationResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateFabricOrganizationResponseBodyResult setPeerCount(Integer peerCount) {
            this.peerCount = peerCount;
            return this;
        }
        public Integer getPeerCount() {
            return this.peerCount;
        }

        public CreateFabricOrganizationResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateFabricOrganizationResponseBodyResult setConsortiumCount(Integer consortiumCount) {
            this.consortiumCount = consortiumCount;
            return this;
        }
        public Integer getConsortiumCount() {
            return this.consortiumCount;
        }

        public CreateFabricOrganizationResponseBodyResult setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

        public CreateFabricOrganizationResponseBodyResult setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public CreateFabricOrganizationResponseBodyResult setServiceState(String serviceState) {
            this.serviceState = serviceState;
            return this;
        }
        public String getServiceState() {
            return this.serviceState;
        }

        public CreateFabricOrganizationResponseBodyResult setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        public CreateFabricOrganizationResponseBodyResult setClusterState(String clusterState) {
            this.clusterState = clusterState;
            return this;
        }
        public String getClusterState() {
            return this.clusterState;
        }

        public CreateFabricOrganizationResponseBodyResult setCodeName(String codeName) {
            this.codeName = codeName;
            return this;
        }
        public String getCodeName() {
            return this.codeName;
        }

        public CreateFabricOrganizationResponseBodyResult setOwnerBid(String ownerBid) {
            this.ownerBid = ownerBid;
            return this;
        }
        public String getOwnerBid() {
            return this.ownerBid;
        }

        public CreateFabricOrganizationResponseBodyResult setOrganizationDescription(String organizationDescription) {
            this.organizationDescription = organizationDescription;
            return this;
        }
        public String getOrganizationDescription() {
            return this.organizationDescription;
        }

        public CreateFabricOrganizationResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateFabricOrganizationResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public CreateFabricOrganizationResponseBodyResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateFabricOrganizationResponseBodyResult setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public CreateFabricOrganizationResponseBodyResult setUserCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }
        public Integer getUserCount() {
            return this.userCount;
        }

        public CreateFabricOrganizationResponseBodyResult setOrganizationName(String organizationName) {
            this.organizationName = organizationName;
            return this;
        }
        public String getOrganizationName() {
            return this.organizationName;
        }

    }

}
