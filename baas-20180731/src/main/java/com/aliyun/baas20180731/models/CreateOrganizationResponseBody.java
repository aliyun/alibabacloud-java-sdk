// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateOrganizationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>1890FA4F-067A-4CE9-AC9B-2BD2E58FB5D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateOrganizationResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateOrganizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrganizationResponseBody self = new CreateOrganizationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrganizationResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CreateOrganizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOrganizationResponseBody setResult(CreateOrganizationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateOrganizationResponseBodyResult getResult() {
        return this.result;
    }

    public CreateOrganizationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateOrganizationResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("ClusterState")
        public String clusterState;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("CodeName")
        public String codeName;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ConsortiumCount")
        public Integer consortiumCount;

        /**
         * <strong>example:</strong>
         * <p>1533025590</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>Domain</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>Name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>peers-aaaaaa2-1eqnj5o5w9dt3</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        /**
         * <strong>example:</strong>
         * <p>2544</p>
         */
        @NameInMap("OwnerBid")
        public String ownerBid;

        /**
         * <strong>example:</strong>
         * <p>uid-23434</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <strong>example:</strong>
         * <p>23434</p>
         */
        @NameInMap("OwnerUid")
        public Integer ownerUid;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PeerCount")
        public Integer peerCount;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>1890FA4F-067A-4CE9-AC9B-2BD2E58FB5D3</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("ServiceState")
        public String serviceState;

        /**
         * <strong>example:</strong>
         * <p>basic</p>
         */
        @NameInMap("SpecName")
        public String specName;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("UserCount")
        public Integer userCount;

        /**
         * <strong>example:</strong>
         * <p>zone</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateOrganizationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateOrganizationResponseBodyResult self = new CreateOrganizationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateOrganizationResponseBodyResult setClusterState(String clusterState) {
            this.clusterState = clusterState;
            return this;
        }
        public String getClusterState() {
            return this.clusterState;
        }

        public CreateOrganizationResponseBodyResult setCodeName(String codeName) {
            this.codeName = codeName;
            return this;
        }
        public String getCodeName() {
            return this.codeName;
        }

        public CreateOrganizationResponseBodyResult setConsortiumCount(Integer consortiumCount) {
            this.consortiumCount = consortiumCount;
            return this;
        }
        public Integer getConsortiumCount() {
            return this.consortiumCount;
        }

        public CreateOrganizationResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateOrganizationResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateOrganizationResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateOrganizationResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateOrganizationResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public CreateOrganizationResponseBodyResult setOwnerBid(String ownerBid) {
            this.ownerBid = ownerBid;
            return this;
        }
        public String getOwnerBid() {
            return this.ownerBid;
        }

        public CreateOrganizationResponseBodyResult setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public CreateOrganizationResponseBodyResult setOwnerUid(Integer ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Integer getOwnerUid() {
            return this.ownerUid;
        }

        public CreateOrganizationResponseBodyResult setPeerCount(Integer peerCount) {
            this.peerCount = peerCount;
            return this;
        }
        public Integer getPeerCount() {
            return this.peerCount;
        }

        public CreateOrganizationResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateOrganizationResponseBodyResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateOrganizationResponseBodyResult setServiceState(String serviceState) {
            this.serviceState = serviceState;
            return this;
        }
        public String getServiceState() {
            return this.serviceState;
        }

        public CreateOrganizationResponseBodyResult setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

        public CreateOrganizationResponseBodyResult setUserCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }
        public Integer getUserCount() {
            return this.userCount;
        }

        public CreateOrganizationResponseBodyResult setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
