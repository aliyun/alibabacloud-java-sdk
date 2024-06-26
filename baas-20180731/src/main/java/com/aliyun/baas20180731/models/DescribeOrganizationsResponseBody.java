// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrganizationsResponseBody extends TeaModel {
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
    public java.util.List<DescribeOrganizationsResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeOrganizationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrganizationsResponseBody self = new DescribeOrganizationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOrganizationsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeOrganizationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOrganizationsResponseBody setResult(java.util.List<DescribeOrganizationsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeOrganizationsResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeOrganizationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeOrganizationsResponseBodyResultTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeOrganizationsResponseBodyResultTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeOrganizationsResponseBodyResultTags self = new DescribeOrganizationsResponseBodyResultTags();
            return TeaModel.build(map, self);
        }

        public DescribeOrganizationsResponseBodyResultTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeOrganizationsResponseBodyResultTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeOrganizationsResponseBodyResult extends TeaModel {
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
         * <p>desc</p>
         */
        @NameInMap("Description")
        public String description;

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
         * <p>1533025590</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Hybrid")
        public Boolean hybrid;

        @NameInMap("MajorVersion")
        public String majorVersion;

        /**
         * <strong>example:</strong>
         * <p>name</p>
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
         * <p>bid</p>
         */
        @NameInMap("OwnerBid")
        public String ownerBid;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <strong>example:</strong>
         * <p>1232</p>
         */
        @NameInMap("OwnerUid")
        public Long ownerUid;

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
         * <p>basic</p>
         */
        @NameInMap("SpecName")
        public String specName;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("State")
        public String state;

        @NameInMap("Tags")
        public java.util.List<DescribeOrganizationsResponseBodyResultTags> tags;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("UserCount")
        public Integer userCount;

        /**
         * <strong>example:</strong>
         * <p>zone</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeOrganizationsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeOrganizationsResponseBodyResult self = new DescribeOrganizationsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeOrganizationsResponseBodyResult setCodeName(String codeName) {
            this.codeName = codeName;
            return this;
        }
        public String getCodeName() {
            return this.codeName;
        }

        public DescribeOrganizationsResponseBodyResult setConsortiumCount(Integer consortiumCount) {
            this.consortiumCount = consortiumCount;
            return this;
        }
        public Integer getConsortiumCount() {
            return this.consortiumCount;
        }

        public DescribeOrganizationsResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeOrganizationsResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeOrganizationsResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeOrganizationsResponseBodyResult setExpireState(String expireState) {
            this.expireState = expireState;
            return this;
        }
        public String getExpireState() {
            return this.expireState;
        }

        public DescribeOrganizationsResponseBodyResult setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeOrganizationsResponseBodyResult setHybrid(Boolean hybrid) {
            this.hybrid = hybrid;
            return this;
        }
        public Boolean getHybrid() {
            return this.hybrid;
        }

        public DescribeOrganizationsResponseBodyResult setMajorVersion(String majorVersion) {
            this.majorVersion = majorVersion;
            return this;
        }
        public String getMajorVersion() {
            return this.majorVersion;
        }

        public DescribeOrganizationsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeOrganizationsResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public DescribeOrganizationsResponseBodyResult setOwnerBid(String ownerBid) {
            this.ownerBid = ownerBid;
            return this;
        }
        public String getOwnerBid() {
            return this.ownerBid;
        }

        public DescribeOrganizationsResponseBodyResult setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public DescribeOrganizationsResponseBodyResult setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        public DescribeOrganizationsResponseBodyResult setPeerCount(Integer peerCount) {
            this.peerCount = peerCount;
            return this;
        }
        public Integer getPeerCount() {
            return this.peerCount;
        }

        public DescribeOrganizationsResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeOrganizationsResponseBodyResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeOrganizationsResponseBodyResult setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

        public DescribeOrganizationsResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeOrganizationsResponseBodyResult setTags(java.util.List<DescribeOrganizationsResponseBodyResultTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeOrganizationsResponseBodyResultTags> getTags() {
            return this.tags;
        }

        public DescribeOrganizationsResponseBodyResult setUserCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }
        public Integer getUserCount() {
            return this.userCount;
        }

        public DescribeOrganizationsResponseBodyResult setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
