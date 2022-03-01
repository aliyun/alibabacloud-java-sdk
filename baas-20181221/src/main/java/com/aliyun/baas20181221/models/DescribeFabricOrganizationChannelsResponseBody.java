// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationChannelsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeFabricOrganizationChannelsResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeFabricOrganizationChannelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationChannelsResponseBody self = new DescribeFabricOrganizationChannelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationChannelsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricOrganizationChannelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricOrganizationChannelsResponseBody setResult(java.util.List<DescribeFabricOrganizationChannelsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeFabricOrganizationChannelsResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeFabricOrganizationChannelsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeFabricOrganizationChannelsResponseBodyResult extends TeaModel {
        @NameInMap("BatchTimeout")
        public Integer batchTimeout;

        @NameInMap("BlockCount")
        public Integer blockCount;

        @NameInMap("ChaincodeCount")
        public Integer chaincodeCount;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("ConsortiumId")
        public String consortiumId;

        @NameInMap("ConsortiumName")
        public String consortiumName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DeleteTime")
        public String deleteTime;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("MaxMessageCount")
        public Integer maxMessageCount;

        @NameInMap("MemberCount")
        public Integer memberCount;

        @NameInMap("OwnerBid")
        public String ownerBid;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("OwnerUid")
        public Long ownerUid;

        @NameInMap("PreferredMaxBytes")
        public Integer preferredMaxBytes;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("State")
        public String state;

        @NameInMap("SupportChannelConfig")
        public Boolean supportChannelConfig;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeFabricOrganizationChannelsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricOrganizationChannelsResponseBodyResult self = new DescribeFabricOrganizationChannelsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricOrganizationChannelsResponseBodyResult setBatchTimeout(Integer batchTimeout) {
            this.batchTimeout = batchTimeout;
            return this;
        }
        public Integer getBatchTimeout() {
            return this.batchTimeout;
        }

        public DescribeFabricOrganizationChannelsResponseBodyResult setBlockCount(Integer blockCount) {
            this.blockCount = blockCount;
            return this;
        }
        public Integer getBlockCount() {
            return this.blockCount;
        }

        public DescribeFabricOrganizationChannelsResponseBodyResult setChaincodeCount(Integer chaincodeCount) {
            this.chaincodeCount = chaincodeCount;
            return this;
        }
        public Integer getChaincodeCount() {
            return this.chaincodeCount;
        }

        public DescribeFabricOrganizationChannelsResponseBodyResult setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeFabricOrganizationChannelsResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public DescribeFabricOrganizationChannelsResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeFabricOrganizationChannelsResponseBodyResult setConsortiumName(String consortiumName) {
            this.consortiumName = consortiumName;
            return this;
        }
        public String getConsortiumName() {
            return this.consortiumName;
        }

        public DescribeFabricOrganizationChannelsResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeFabricOrganizationChannelsResponseBodyResult setDeleteTime(String deleteTime) {
            this.deleteTime = deleteTime;
            return this;
        }
        public String getDeleteTime() {
            return this.deleteTime;
        }

        public DescribeFabricOrganizationChannelsResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public DescribeFabricOrganizationChannelsResponseBodyResult setMaxMessageCount(Integer maxMessageCount) {
            this.maxMessageCount = maxMessageCount;
            return this;
        }
        public Integer getMaxMessageCount() {
            return this.maxMessageCount;
        }

        public DescribeFabricOrganizationChannelsResponseBodyResult setMemberCount(Integer memberCount) {
            this.memberCount = memberCount;
            return this;
        }
        public Integer getMemberCount() {
            return this.memberCount;
        }

        public DescribeFabricOrganizationChannelsResponseBodyResult setOwnerBid(String ownerBid) {
            this.ownerBid = ownerBid;
            return this;
        }
        public String getOwnerBid() {
            return this.ownerBid;
        }

        public DescribeFabricOrganizationChannelsResponseBodyResult setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public DescribeFabricOrganizationChannelsResponseBodyResult setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        public DescribeFabricOrganizationChannelsResponseBodyResult setPreferredMaxBytes(Integer preferredMaxBytes) {
            this.preferredMaxBytes = preferredMaxBytes;
            return this;
        }
        public Integer getPreferredMaxBytes() {
            return this.preferredMaxBytes;
        }

        public DescribeFabricOrganizationChannelsResponseBodyResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeFabricOrganizationChannelsResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeFabricOrganizationChannelsResponseBodyResult setSupportChannelConfig(Boolean supportChannelConfig) {
            this.supportChannelConfig = supportChannelConfig;
            return this;
        }
        public Boolean getSupportChannelConfig() {
            return this.supportChannelConfig;
        }

        public DescribeFabricOrganizationChannelsResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
