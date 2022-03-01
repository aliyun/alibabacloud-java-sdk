// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeFabricOrganizationResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeFabricOrganizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationResponseBody self = new DescribeFabricOrganizationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricOrganizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricOrganizationResponseBody setResult(DescribeFabricOrganizationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeFabricOrganizationResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeFabricOrganizationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeFabricOrganizationResponseBodyResultTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeFabricOrganizationResponseBodyResultTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricOrganizationResponseBodyResultTags self = new DescribeFabricOrganizationResponseBodyResultTags();
            return TeaModel.build(map, self);
        }

        public DescribeFabricOrganizationResponseBodyResultTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeFabricOrganizationResponseBodyResultTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeFabricOrganizationResponseBodyResult extends TeaModel {
        @NameInMap("CANAME")
        public String CANAME;

        @NameInMap("CAUrl")
        public String CAUrl;

        @NameInMap("CodeName")
        public String codeName;

        @NameInMap("ConsortiumCount")
        public Integer consortiumCount;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("MSP")
        public String MSP;

        @NameInMap("OrganizationDescription")
        public String organizationDescription;

        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("OrganizationName")
        public String organizationName;

        @NameInMap("OwnerBid")
        public String ownerBid;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("OwnerUid")
        public Long ownerUid;

        @NameInMap("PeerCount")
        public Integer peerCount;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("SpecName")
        public String specName;

        @NameInMap("State")
        public String state;

        @NameInMap("Tags")
        public java.util.List<DescribeFabricOrganizationResponseBodyResultTags> tags;

        @NameInMap("UserCount")
        public Integer userCount;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeFabricOrganizationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricOrganizationResponseBodyResult self = new DescribeFabricOrganizationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricOrganizationResponseBodyResult setCANAME(String CANAME) {
            this.CANAME = CANAME;
            return this;
        }
        public String getCANAME() {
            return this.CANAME;
        }

        public DescribeFabricOrganizationResponseBodyResult setCAUrl(String CAUrl) {
            this.CAUrl = CAUrl;
            return this;
        }
        public String getCAUrl() {
            return this.CAUrl;
        }

        public DescribeFabricOrganizationResponseBodyResult setCodeName(String codeName) {
            this.codeName = codeName;
            return this;
        }
        public String getCodeName() {
            return this.codeName;
        }

        public DescribeFabricOrganizationResponseBodyResult setConsortiumCount(Integer consortiumCount) {
            this.consortiumCount = consortiumCount;
            return this;
        }
        public Integer getConsortiumCount() {
            return this.consortiumCount;
        }

        public DescribeFabricOrganizationResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeFabricOrganizationResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeFabricOrganizationResponseBodyResult setMSP(String MSP) {
            this.MSP = MSP;
            return this;
        }
        public String getMSP() {
            return this.MSP;
        }

        public DescribeFabricOrganizationResponseBodyResult setOrganizationDescription(String organizationDescription) {
            this.organizationDescription = organizationDescription;
            return this;
        }
        public String getOrganizationDescription() {
            return this.organizationDescription;
        }

        public DescribeFabricOrganizationResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public DescribeFabricOrganizationResponseBodyResult setOrganizationName(String organizationName) {
            this.organizationName = organizationName;
            return this;
        }
        public String getOrganizationName() {
            return this.organizationName;
        }

        public DescribeFabricOrganizationResponseBodyResult setOwnerBid(String ownerBid) {
            this.ownerBid = ownerBid;
            return this;
        }
        public String getOwnerBid() {
            return this.ownerBid;
        }

        public DescribeFabricOrganizationResponseBodyResult setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public DescribeFabricOrganizationResponseBodyResult setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        public DescribeFabricOrganizationResponseBodyResult setPeerCount(Integer peerCount) {
            this.peerCount = peerCount;
            return this;
        }
        public Integer getPeerCount() {
            return this.peerCount;
        }

        public DescribeFabricOrganizationResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeFabricOrganizationResponseBodyResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeFabricOrganizationResponseBodyResult setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

        public DescribeFabricOrganizationResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeFabricOrganizationResponseBodyResult setTags(java.util.List<DescribeFabricOrganizationResponseBodyResultTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeFabricOrganizationResponseBodyResultTags> getTags() {
            return this.tags;
        }

        public DescribeFabricOrganizationResponseBodyResult setUserCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }
        public Integer getUserCount() {
            return this.userCount;
        }

        public DescribeFabricOrganizationResponseBodyResult setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
