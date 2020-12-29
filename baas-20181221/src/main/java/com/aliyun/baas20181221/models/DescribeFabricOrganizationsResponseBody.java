// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<DescribeFabricOrganizationsResponseBodyResult> result;

    public static DescribeFabricOrganizationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationsResponseBody self = new DescribeFabricOrganizationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricOrganizationsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricOrganizationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeFabricOrganizationsResponseBody setResult(java.util.List<DescribeFabricOrganizationsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeFabricOrganizationsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeFabricOrganizationsResponseBodyResultTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeFabricOrganizationsResponseBodyResultTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricOrganizationsResponseBodyResultTags self = new DescribeFabricOrganizationsResponseBodyResultTags();
            return TeaModel.build(map, self);
        }

        public DescribeFabricOrganizationsResponseBodyResultTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeFabricOrganizationsResponseBodyResultTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeFabricOrganizationsResponseBodyResult extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("PeerCount")
        public Integer peerCount;

        @NameInMap("State")
        public String state;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ConsortiumCount")
        public Integer consortiumCount;

        @NameInMap("Tags")
        public java.util.List<DescribeFabricOrganizationsResponseBodyResultTags> tags;

        @NameInMap("SpecName")
        public String specName;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("OwnerUid")
        public Long ownerUid;

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

        public static DescribeFabricOrganizationsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricOrganizationsResponseBodyResult self = new DescribeFabricOrganizationsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricOrganizationsResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeFabricOrganizationsResponseBodyResult setPeerCount(Integer peerCount) {
            this.peerCount = peerCount;
            return this;
        }
        public Integer getPeerCount() {
            return this.peerCount;
        }

        public DescribeFabricOrganizationsResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeFabricOrganizationsResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeFabricOrganizationsResponseBodyResult setConsortiumCount(Integer consortiumCount) {
            this.consortiumCount = consortiumCount;
            return this;
        }
        public Integer getConsortiumCount() {
            return this.consortiumCount;
        }

        public DescribeFabricOrganizationsResponseBodyResult setTags(java.util.List<DescribeFabricOrganizationsResponseBodyResultTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeFabricOrganizationsResponseBodyResultTags> getTags() {
            return this.tags;
        }

        public DescribeFabricOrganizationsResponseBodyResult setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

        public DescribeFabricOrganizationsResponseBodyResult setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public DescribeFabricOrganizationsResponseBodyResult setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        public DescribeFabricOrganizationsResponseBodyResult setCodeName(String codeName) {
            this.codeName = codeName;
            return this;
        }
        public String getCodeName() {
            return this.codeName;
        }

        public DescribeFabricOrganizationsResponseBodyResult setOwnerBid(String ownerBid) {
            this.ownerBid = ownerBid;
            return this;
        }
        public String getOwnerBid() {
            return this.ownerBid;
        }

        public DescribeFabricOrganizationsResponseBodyResult setOrganizationDescription(String organizationDescription) {
            this.organizationDescription = organizationDescription;
            return this;
        }
        public String getOrganizationDescription() {
            return this.organizationDescription;
        }

        public DescribeFabricOrganizationsResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeFabricOrganizationsResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public DescribeFabricOrganizationsResponseBodyResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeFabricOrganizationsResponseBodyResult setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeFabricOrganizationsResponseBodyResult setUserCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }
        public Integer getUserCount() {
            return this.userCount;
        }

        public DescribeFabricOrganizationsResponseBodyResult setOrganizationName(String organizationName) {
            this.organizationName = organizationName;
            return this;
        }
        public String getOrganizationName() {
            return this.organizationName;
        }

    }

}
