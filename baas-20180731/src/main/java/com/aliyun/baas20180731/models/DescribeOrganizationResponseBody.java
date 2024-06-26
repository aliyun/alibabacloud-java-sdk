// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrganizationResponseBody extends TeaModel {
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
    public DescribeOrganizationResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeOrganizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrganizationResponseBody self = new DescribeOrganizationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOrganizationResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeOrganizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOrganizationResponseBody setResult(DescribeOrganizationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeOrganizationResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeOrganizationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeOrganizationResponseBodyResultTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeOrganizationResponseBodyResultTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeOrganizationResponseBodyResultTags self = new DescribeOrganizationResponseBodyResultTags();
            return TeaModel.build(map, self);
        }

        public DescribeOrganizationResponseBodyResultTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeOrganizationResponseBodyResultTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeOrganizationResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ca</p>
         */
        @NameInMap("CAName")
        public String CAName;

        /**
         * <strong>example:</strong>
         * <p>asad</p>
         */
        @NameInMap("CAUrl")
        public String CAUrl;

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

        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("MSP")
        public String MSP;

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
        public java.util.List<DescribeOrganizationResponseBodyResultTags> tags;

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

        public static DescribeOrganizationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeOrganizationResponseBodyResult self = new DescribeOrganizationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeOrganizationResponseBodyResult setCAName(String CAName) {
            this.CAName = CAName;
            return this;
        }
        public String getCAName() {
            return this.CAName;
        }

        public DescribeOrganizationResponseBodyResult setCAUrl(String CAUrl) {
            this.CAUrl = CAUrl;
            return this;
        }
        public String getCAUrl() {
            return this.CAUrl;
        }

        public DescribeOrganizationResponseBodyResult setCodeName(String codeName) {
            this.codeName = codeName;
            return this;
        }
        public String getCodeName() {
            return this.codeName;
        }

        public DescribeOrganizationResponseBodyResult setConsortiumCount(Integer consortiumCount) {
            this.consortiumCount = consortiumCount;
            return this;
        }
        public Integer getConsortiumCount() {
            return this.consortiumCount;
        }

        public DescribeOrganizationResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeOrganizationResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeOrganizationResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeOrganizationResponseBodyResult setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeOrganizationResponseBodyResult setMSP(String MSP) {
            this.MSP = MSP;
            return this;
        }
        public String getMSP() {
            return this.MSP;
        }

        public DescribeOrganizationResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeOrganizationResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public DescribeOrganizationResponseBodyResult setOwnerBid(String ownerBid) {
            this.ownerBid = ownerBid;
            return this;
        }
        public String getOwnerBid() {
            return this.ownerBid;
        }

        public DescribeOrganizationResponseBodyResult setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public DescribeOrganizationResponseBodyResult setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        public DescribeOrganizationResponseBodyResult setPeerCount(Integer peerCount) {
            this.peerCount = peerCount;
            return this;
        }
        public Integer getPeerCount() {
            return this.peerCount;
        }

        public DescribeOrganizationResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeOrganizationResponseBodyResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeOrganizationResponseBodyResult setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

        public DescribeOrganizationResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeOrganizationResponseBodyResult setTags(java.util.List<DescribeOrganizationResponseBodyResultTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeOrganizationResponseBodyResultTags> getTags() {
            return this.tags;
        }

        public DescribeOrganizationResponseBodyResult setUserCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }
        public Integer getUserCount() {
            return this.userCount;
        }

        public DescribeOrganizationResponseBodyResult setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
