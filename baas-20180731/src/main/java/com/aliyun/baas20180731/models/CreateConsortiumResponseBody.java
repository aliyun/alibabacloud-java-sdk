// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateConsortiumResponseBody extends TeaModel {
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
    public CreateConsortiumResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateConsortiumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConsortiumResponseBody self = new CreateConsortiumResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConsortiumResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CreateConsortiumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateConsortiumResponseBody setResult(CreateConsortiumResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateConsortiumResponseBodyResult getResult() {
        return this.result;
    }

    public CreateConsortiumResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateConsortiumResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ChannelCount")
        public Integer channelCount;

        /**
         * <strong>example:</strong>
         * <p>Any</p>
         */
        @NameInMap("ChannelPolicy")
        public String channelPolicy;

        /**
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("ClusterState")
        public String clusterState;

        /**
         * <strong>example:</strong>
         * <p>lianmenyumingyi</p>
         */
        @NameInMap("CodeName")
        public String codeName;

        /**
         * <strong>example:</strong>
         * <p>consortium-lianmenyumingyi-hc5d1bwlulg7</p>
         */
        @NameInMap("ConsortiumId")
        public String consortiumId;

        /**
         * <strong>example:</strong>
         * <p>1544086901984</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MemberCount")
        public Integer memberCount;

        /**
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OrdererCount")
        public Integer ordererCount;

        /**
         * <strong>example:</strong>
         * <p>Kafka</p>
         */
        @NameInMap("OrdererType")
        public String ordererType;

        /**
         * <strong>example:</strong>
         * <p>26842</p>
         */
        @NameInMap("OwnerBid")
        public String ownerBid;

        /**
         * <strong>example:</strong>
         * <p>1019556</p>
         */
        @NameInMap("OwnerUid")
        public Long ownerUid;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>Pending</p>
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
         * <p>zone</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateConsortiumResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateConsortiumResponseBodyResult self = new CreateConsortiumResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateConsortiumResponseBodyResult setChannelCount(Integer channelCount) {
            this.channelCount = channelCount;
            return this;
        }
        public Integer getChannelCount() {
            return this.channelCount;
        }

        public CreateConsortiumResponseBodyResult setChannelPolicy(String channelPolicy) {
            this.channelPolicy = channelPolicy;
            return this;
        }
        public String getChannelPolicy() {
            return this.channelPolicy;
        }

        public CreateConsortiumResponseBodyResult setClusterState(String clusterState) {
            this.clusterState = clusterState;
            return this;
        }
        public String getClusterState() {
            return this.clusterState;
        }

        public CreateConsortiumResponseBodyResult setCodeName(String codeName) {
            this.codeName = codeName;
            return this;
        }
        public String getCodeName() {
            return this.codeName;
        }

        public CreateConsortiumResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public CreateConsortiumResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateConsortiumResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateConsortiumResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateConsortiumResponseBodyResult setMemberCount(Integer memberCount) {
            this.memberCount = memberCount;
            return this;
        }
        public Integer getMemberCount() {
            return this.memberCount;
        }

        public CreateConsortiumResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateConsortiumResponseBodyResult setOrdererCount(Integer ordererCount) {
            this.ordererCount = ordererCount;
            return this;
        }
        public Integer getOrdererCount() {
            return this.ordererCount;
        }

        public CreateConsortiumResponseBodyResult setOrdererType(String ordererType) {
            this.ordererType = ordererType;
            return this;
        }
        public String getOrdererType() {
            return this.ordererType;
        }

        public CreateConsortiumResponseBodyResult setOwnerBid(String ownerBid) {
            this.ownerBid = ownerBid;
            return this;
        }
        public String getOwnerBid() {
            return this.ownerBid;
        }

        public CreateConsortiumResponseBodyResult setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        public CreateConsortiumResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateConsortiumResponseBodyResult setServiceState(String serviceState) {
            this.serviceState = serviceState;
            return this;
        }
        public String getServiceState() {
            return this.serviceState;
        }

        public CreateConsortiumResponseBodyResult setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

        public CreateConsortiumResponseBodyResult setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
