// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeConsortiumsResponseBody extends TeaModel {
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
    public java.util.List<DescribeConsortiumsResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeConsortiumsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsortiumsResponseBody self = new DescribeConsortiumsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConsortiumsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeConsortiumsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConsortiumsResponseBody setResult(java.util.List<DescribeConsortiumsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeConsortiumsResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeConsortiumsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeConsortiumsResponseBodyResultTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeConsortiumsResponseBodyResultTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeConsortiumsResponseBodyResultTags self = new DescribeConsortiumsResponseBodyResultTags();
            return TeaModel.build(map, self);
        }

        public DescribeConsortiumsResponseBodyResultTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeConsortiumsResponseBodyResultTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeConsortiumsResponseBodyResult extends TeaModel {
        @NameInMap("CAName")
        public String CAName;

        @NameInMap("CAUrl")
        public String CAUrl;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ChannelCount")
        public Integer channelCount;

        /**
         * <strong>example:</strong>
         * <p>any</p>
         */
        @NameInMap("ChannelPolicy")
        public String channelPolicy;

        /**
         * <strong>example:</strong>
         * <p>code</p>
         */
        @NameInMap("CodeName")
        public String codeName;

        /**
         * <strong>example:</strong>
         * <p>consortium-lianmenyumingyi-hc5d1bwl****</p>
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
         * <p>domain</p>
         */
        @NameInMap("Domain")
        public String domain;

        @NameInMap("ExpireState")
        public String expireState;

        /**
         * <strong>example:</strong>
         * <p>1544411108000</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Hybrid")
        public Boolean hybrid;

        @NameInMap("MSP")
        public String MSP;

        @NameInMap("MajorVersion")
        public String majorVersion;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("OrdererCount")
        public Integer ordererCount;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("OrganizationCount")
        public Integer organizationCount;

        /**
         * <strong>example:</strong>
         * <p>26842</p>
         */
        @NameInMap("OwnerBid")
        public String ownerBid;

        /**
         * <strong>example:</strong>
         * <p>ownername</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <strong>example:</strong>
         * <p>1287126</p>
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
         * <p>1890FA4F-067A-4CE9-AC9B-2BD2E58FB5D3</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>basic</p>
         */
        @NameInMap("SpecName")
        public String specName;

        /**
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportChannelConfig")
        public Boolean supportChannelConfig;

        @NameInMap("Tags")
        public java.util.List<DescribeConsortiumsResponseBodyResultTags> tags;

        public static DescribeConsortiumsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeConsortiumsResponseBodyResult self = new DescribeConsortiumsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeConsortiumsResponseBodyResult setCAName(String CAName) {
            this.CAName = CAName;
            return this;
        }
        public String getCAName() {
            return this.CAName;
        }

        public DescribeConsortiumsResponseBodyResult setCAUrl(String CAUrl) {
            this.CAUrl = CAUrl;
            return this;
        }
        public String getCAUrl() {
            return this.CAUrl;
        }

        public DescribeConsortiumsResponseBodyResult setChannelCount(Integer channelCount) {
            this.channelCount = channelCount;
            return this;
        }
        public Integer getChannelCount() {
            return this.channelCount;
        }

        public DescribeConsortiumsResponseBodyResult setChannelPolicy(String channelPolicy) {
            this.channelPolicy = channelPolicy;
            return this;
        }
        public String getChannelPolicy() {
            return this.channelPolicy;
        }

        public DescribeConsortiumsResponseBodyResult setCodeName(String codeName) {
            this.codeName = codeName;
            return this;
        }
        public String getCodeName() {
            return this.codeName;
        }

        public DescribeConsortiumsResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeConsortiumsResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeConsortiumsResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeConsortiumsResponseBodyResult setExpireState(String expireState) {
            this.expireState = expireState;
            return this;
        }
        public String getExpireState() {
            return this.expireState;
        }

        public DescribeConsortiumsResponseBodyResult setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeConsortiumsResponseBodyResult setHybrid(Boolean hybrid) {
            this.hybrid = hybrid;
            return this;
        }
        public Boolean getHybrid() {
            return this.hybrid;
        }

        public DescribeConsortiumsResponseBodyResult setMSP(String MSP) {
            this.MSP = MSP;
            return this;
        }
        public String getMSP() {
            return this.MSP;
        }

        public DescribeConsortiumsResponseBodyResult setMajorVersion(String majorVersion) {
            this.majorVersion = majorVersion;
            return this;
        }
        public String getMajorVersion() {
            return this.majorVersion;
        }

        public DescribeConsortiumsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeConsortiumsResponseBodyResult setOrdererCount(Integer ordererCount) {
            this.ordererCount = ordererCount;
            return this;
        }
        public Integer getOrdererCount() {
            return this.ordererCount;
        }

        public DescribeConsortiumsResponseBodyResult setOrganizationCount(Integer organizationCount) {
            this.organizationCount = organizationCount;
            return this;
        }
        public Integer getOrganizationCount() {
            return this.organizationCount;
        }

        public DescribeConsortiumsResponseBodyResult setOwnerBid(String ownerBid) {
            this.ownerBid = ownerBid;
            return this;
        }
        public String getOwnerBid() {
            return this.ownerBid;
        }

        public DescribeConsortiumsResponseBodyResult setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public DescribeConsortiumsResponseBodyResult setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        public DescribeConsortiumsResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeConsortiumsResponseBodyResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeConsortiumsResponseBodyResult setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

        public DescribeConsortiumsResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeConsortiumsResponseBodyResult setSupportChannelConfig(Boolean supportChannelConfig) {
            this.supportChannelConfig = supportChannelConfig;
            return this;
        }
        public Boolean getSupportChannelConfig() {
            return this.supportChannelConfig;
        }

        public DescribeConsortiumsResponseBodyResult setTags(java.util.List<DescribeConsortiumsResponseBodyResultTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeConsortiumsResponseBodyResultTags> getTags() {
            return this.tags;
        }

    }

}
