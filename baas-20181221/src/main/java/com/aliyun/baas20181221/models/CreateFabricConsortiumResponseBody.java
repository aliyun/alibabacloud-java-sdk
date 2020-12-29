// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateFabricConsortiumResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public CreateFabricConsortiumResponseBodyResult result;

    public static CreateFabricConsortiumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFabricConsortiumResponseBody self = new CreateFabricConsortiumResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFabricConsortiumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFabricConsortiumResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CreateFabricConsortiumResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateFabricConsortiumResponseBody setResult(CreateFabricConsortiumResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateFabricConsortiumResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateFabricConsortiumResponseBodyResult extends TeaModel {
        @NameInMap("ChannelCount")
        public Integer channelCount;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("SpecName")
        public String specName;

        @NameInMap("OrdererCount")
        public Integer ordererCount;

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

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("MemberCount")
        public Integer memberCount;

        @NameInMap("ChannelPolicy")
        public String channelPolicy;

        @NameInMap("OrdererType")
        public String ordererType;

        @NameInMap("Description")
        public String description;

        @NameInMap("ConsortiumId")
        public String consortiumId;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("ConsortiumName")
        public String consortiumName;

        public static CreateFabricConsortiumResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateFabricConsortiumResponseBodyResult self = new CreateFabricConsortiumResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateFabricConsortiumResponseBodyResult setChannelCount(Integer channelCount) {
            this.channelCount = channelCount;
            return this;
        }
        public Integer getChannelCount() {
            return this.channelCount;
        }

        public CreateFabricConsortiumResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateFabricConsortiumResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateFabricConsortiumResponseBodyResult setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

        public CreateFabricConsortiumResponseBodyResult setOrdererCount(Integer ordererCount) {
            this.ordererCount = ordererCount;
            return this;
        }
        public Integer getOrdererCount() {
            return this.ordererCount;
        }

        public CreateFabricConsortiumResponseBodyResult setServiceState(String serviceState) {
            this.serviceState = serviceState;
            return this;
        }
        public String getServiceState() {
            return this.serviceState;
        }

        public CreateFabricConsortiumResponseBodyResult setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        public CreateFabricConsortiumResponseBodyResult setClusterState(String clusterState) {
            this.clusterState = clusterState;
            return this;
        }
        public String getClusterState() {
            return this.clusterState;
        }

        public CreateFabricConsortiumResponseBodyResult setCodeName(String codeName) {
            this.codeName = codeName;
            return this;
        }
        public String getCodeName() {
            return this.codeName;
        }

        public CreateFabricConsortiumResponseBodyResult setOwnerBid(String ownerBid) {
            this.ownerBid = ownerBid;
            return this;
        }
        public String getOwnerBid() {
            return this.ownerBid;
        }

        public CreateFabricConsortiumResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateFabricConsortiumResponseBodyResult setMemberCount(Integer memberCount) {
            this.memberCount = memberCount;
            return this;
        }
        public Integer getMemberCount() {
            return this.memberCount;
        }

        public CreateFabricConsortiumResponseBodyResult setChannelPolicy(String channelPolicy) {
            this.channelPolicy = channelPolicy;
            return this;
        }
        public String getChannelPolicy() {
            return this.channelPolicy;
        }

        public CreateFabricConsortiumResponseBodyResult setOrdererType(String ordererType) {
            this.ordererType = ordererType;
            return this;
        }
        public String getOrdererType() {
            return this.ordererType;
        }

        public CreateFabricConsortiumResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateFabricConsortiumResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public CreateFabricConsortiumResponseBodyResult setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public CreateFabricConsortiumResponseBodyResult setConsortiumName(String consortiumName) {
            this.consortiumName = consortiumName;
            return this;
        }
        public String getConsortiumName() {
            return this.consortiumName;
        }

    }

}
