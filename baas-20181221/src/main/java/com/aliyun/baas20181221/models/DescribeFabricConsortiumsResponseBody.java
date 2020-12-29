// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<DescribeFabricConsortiumsResponseBodyResult> result;

    public static DescribeFabricConsortiumsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumsResponseBody self = new DescribeFabricConsortiumsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricConsortiumsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricConsortiumsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeFabricConsortiumsResponseBody setResult(java.util.List<DescribeFabricConsortiumsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeFabricConsortiumsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeFabricConsortiumsResponseBodyResultTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeFabricConsortiumsResponseBodyResultTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricConsortiumsResponseBodyResultTags self = new DescribeFabricConsortiumsResponseBodyResultTags();
            return TeaModel.build(map, self);
        }

        public DescribeFabricConsortiumsResponseBodyResultTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeFabricConsortiumsResponseBodyResultTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeFabricConsortiumsResponseBodyResult extends TeaModel {
        @NameInMap("ChannelCount")
        public Integer channelCount;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("State")
        public String state;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Tags")
        public java.util.List<DescribeFabricConsortiumsResponseBodyResultTags> tags;

        @NameInMap("SpecName")
        public String specName;

        @NameInMap("SupportChannelConfig")
        public Boolean supportChannelConfig;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("OwnerUid")
        public Long ownerUid;

        @NameInMap("CodeName")
        public String codeName;

        @NameInMap("OwnerBid")
        public String ownerBid;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ChannelPolicy")
        public String channelPolicy;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ConsortiumId")
        public String consortiumId;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("OrganizationCount")
        public Integer organizationCount;

        @NameInMap("ConsortiumName")
        public String consortiumName;

        public static DescribeFabricConsortiumsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricConsortiumsResponseBodyResult self = new DescribeFabricConsortiumsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricConsortiumsResponseBodyResult setChannelCount(Integer channelCount) {
            this.channelCount = channelCount;
            return this;
        }
        public Integer getChannelCount() {
            return this.channelCount;
        }

        public DescribeFabricConsortiumsResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeFabricConsortiumsResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeFabricConsortiumsResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeFabricConsortiumsResponseBodyResult setTags(java.util.List<DescribeFabricConsortiumsResponseBodyResultTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeFabricConsortiumsResponseBodyResultTags> getTags() {
            return this.tags;
        }

        public DescribeFabricConsortiumsResponseBodyResult setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

        public DescribeFabricConsortiumsResponseBodyResult setSupportChannelConfig(Boolean supportChannelConfig) {
            this.supportChannelConfig = supportChannelConfig;
            return this;
        }
        public Boolean getSupportChannelConfig() {
            return this.supportChannelConfig;
        }

        public DescribeFabricConsortiumsResponseBodyResult setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public DescribeFabricConsortiumsResponseBodyResult setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        public DescribeFabricConsortiumsResponseBodyResult setCodeName(String codeName) {
            this.codeName = codeName;
            return this;
        }
        public String getCodeName() {
            return this.codeName;
        }

        public DescribeFabricConsortiumsResponseBodyResult setOwnerBid(String ownerBid) {
            this.ownerBid = ownerBid;
            return this;
        }
        public String getOwnerBid() {
            return this.ownerBid;
        }

        public DescribeFabricConsortiumsResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeFabricConsortiumsResponseBodyResult setChannelPolicy(String channelPolicy) {
            this.channelPolicy = channelPolicy;
            return this;
        }
        public String getChannelPolicy() {
            return this.channelPolicy;
        }

        public DescribeFabricConsortiumsResponseBodyResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeFabricConsortiumsResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeFabricConsortiumsResponseBodyResult setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeFabricConsortiumsResponseBodyResult setOrganizationCount(Integer organizationCount) {
            this.organizationCount = organizationCount;
            return this;
        }
        public Integer getOrganizationCount() {
            return this.organizationCount;
        }

        public DescribeFabricConsortiumsResponseBodyResult setConsortiumName(String consortiumName) {
            this.consortiumName = consortiumName;
            return this;
        }
        public String getConsortiumName() {
            return this.consortiumName;
        }

    }

}
