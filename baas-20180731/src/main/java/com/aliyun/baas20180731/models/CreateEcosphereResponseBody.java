// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateEcosphereResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>1890FA4F-067A-4CE9-AC9B-2BD2E58FB5D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateEcosphereResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateEcosphereResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEcosphereResponseBody self = new CreateEcosphereResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEcosphereResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CreateEcosphereResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateEcosphereResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEcosphereResponseBody setResult(CreateEcosphereResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateEcosphereResponseBodyResult getResult() {
        return this.result;
    }

    public CreateEcosphereResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateEcosphereResponseBodyResultOrganizations extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("ClusterState")
        public String clusterState;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>1544411108000</p>
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
         * <p>string</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("ServiceState")
        public String serviceState;

        public static CreateEcosphereResponseBodyResultOrganizations build(java.util.Map<String, ?> map) throws Exception {
            CreateEcosphereResponseBodyResultOrganizations self = new CreateEcosphereResponseBodyResultOrganizations();
            return TeaModel.build(map, self);
        }

        public CreateEcosphereResponseBodyResultOrganizations setClusterState(String clusterState) {
            this.clusterState = clusterState;
            return this;
        }
        public String getClusterState() {
            return this.clusterState;
        }

        public CreateEcosphereResponseBodyResultOrganizations setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateEcosphereResponseBodyResultOrganizations setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateEcosphereResponseBodyResultOrganizations setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateEcosphereResponseBodyResultOrganizations setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateEcosphereResponseBodyResultOrganizations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateEcosphereResponseBodyResultOrganizations setServiceState(String serviceState) {
            this.serviceState = serviceState;
            return this;
        }
        public String getServiceState() {
            return this.serviceState;
        }

    }

    public static class CreateEcosphereResponseBodyResultSpecification extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>basic</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NumOfNodes")
        public Integer numOfNodes;

        /**
         * <strong>example:</strong>
         * <p>basic</p>
         */
        @NameInMap("Title")
        public String title;

        public static CreateEcosphereResponseBodyResultSpecification build(java.util.Map<String, ?> map) throws Exception {
            CreateEcosphereResponseBodyResultSpecification self = new CreateEcosphereResponseBodyResultSpecification();
            return TeaModel.build(map, self);
        }

        public CreateEcosphereResponseBodyResultSpecification setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateEcosphereResponseBodyResultSpecification setNumOfNodes(Integer numOfNodes) {
            this.numOfNodes = numOfNodes;
            return this;
        }
        public Integer getNumOfNodes() {
            return this.numOfNodes;
        }

        public CreateEcosphereResponseBodyResultSpecification setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class CreateEcosphereResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
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
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>consortium-lianmenyumingyi-hc5d1bwlulg7</p>
         */
        @NameInMap("ConsortiumId")
        public String consortiumId;

        /**
         * <strong>example:</strong>
         * <p>1544411108000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>hello</p>
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
         * <p>2</p>
         */
        @NameInMap("OrdererCount")
        public Integer ordererCount;

        /**
         * <strong>example:</strong>
         * <p>Kafka</p>
         */
        @NameInMap("OrdererType")
        public String ordererType;

        @NameInMap("Organizations")
        public java.util.List<CreateEcosphereResponseBodyResultOrganizations> organizations;

        /**
         * <strong>example:</strong>
         * <p>26842</p>
         */
        @NameInMap("OwnerBid")
        public String ownerBid;

        /**
         * <strong>example:</strong>
         * <p>144566</p>
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

        @NameInMap("Specification")
        public CreateEcosphereResponseBodyResultSpecification specification;

        /**
         * <strong>example:</strong>
         * <p>zone</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateEcosphereResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateEcosphereResponseBodyResult self = new CreateEcosphereResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateEcosphereResponseBodyResult setChannelCount(Integer channelCount) {
            this.channelCount = channelCount;
            return this;
        }
        public Integer getChannelCount() {
            return this.channelCount;
        }

        public CreateEcosphereResponseBodyResult setChannelPolicy(String channelPolicy) {
            this.channelPolicy = channelPolicy;
            return this;
        }
        public String getChannelPolicy() {
            return this.channelPolicy;
        }

        public CreateEcosphereResponseBodyResult setClusterState(String clusterState) {
            this.clusterState = clusterState;
            return this;
        }
        public String getClusterState() {
            return this.clusterState;
        }

        public CreateEcosphereResponseBodyResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateEcosphereResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public CreateEcosphereResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateEcosphereResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateEcosphereResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateEcosphereResponseBodyResult setMemberCount(Integer memberCount) {
            this.memberCount = memberCount;
            return this;
        }
        public Integer getMemberCount() {
            return this.memberCount;
        }

        public CreateEcosphereResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateEcosphereResponseBodyResult setOrdererCount(Integer ordererCount) {
            this.ordererCount = ordererCount;
            return this;
        }
        public Integer getOrdererCount() {
            return this.ordererCount;
        }

        public CreateEcosphereResponseBodyResult setOrdererType(String ordererType) {
            this.ordererType = ordererType;
            return this;
        }
        public String getOrdererType() {
            return this.ordererType;
        }

        public CreateEcosphereResponseBodyResult setOrganizations(java.util.List<CreateEcosphereResponseBodyResultOrganizations> organizations) {
            this.organizations = organizations;
            return this;
        }
        public java.util.List<CreateEcosphereResponseBodyResultOrganizations> getOrganizations() {
            return this.organizations;
        }

        public CreateEcosphereResponseBodyResult setOwnerBid(String ownerBid) {
            this.ownerBid = ownerBid;
            return this;
        }
        public String getOwnerBid() {
            return this.ownerBid;
        }

        public CreateEcosphereResponseBodyResult setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        public CreateEcosphereResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateEcosphereResponseBodyResult setServiceState(String serviceState) {
            this.serviceState = serviceState;
            return this;
        }
        public String getServiceState() {
            return this.serviceState;
        }

        public CreateEcosphereResponseBodyResult setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

        public CreateEcosphereResponseBodyResult setSpecification(CreateEcosphereResponseBodyResultSpecification specification) {
            this.specification = specification;
            return this;
        }
        public CreateEcosphereResponseBodyResultSpecification getSpecification() {
            return this.specification;
        }

        public CreateEcosphereResponseBodyResult setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
