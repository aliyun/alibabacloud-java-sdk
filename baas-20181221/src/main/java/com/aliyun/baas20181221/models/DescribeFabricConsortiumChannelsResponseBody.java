// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumChannelsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<DescribeFabricConsortiumChannelsResponseBodyResult> result;

    public static DescribeFabricConsortiumChannelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumChannelsResponseBody self = new DescribeFabricConsortiumChannelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumChannelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricConsortiumChannelsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricConsortiumChannelsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeFabricConsortiumChannelsResponseBody setResult(java.util.List<DescribeFabricConsortiumChannelsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeFabricConsortiumChannelsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeFabricConsortiumChannelsResponseBodyResult extends TeaModel {
        @NameInMap("BatchTimeout")
        public Integer batchTimeout;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("ChaincodeCount")
        public Integer chaincodeCount;

        @NameInMap("State")
        public String state;

        @NameInMap("MemberJoinedCount")
        public String memberJoinedCount;

        @NameInMap("PreferredMaxBytes")
        public Integer preferredMaxBytes;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("SupportChannelConfig")
        public Boolean supportChannelConfig;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("OwnerUid")
        public Long ownerUid;

        @NameInMap("OwnerBid")
        public String ownerBid;

        @NameInMap("MaxMessageCount")
        public Integer maxMessageCount;

        @NameInMap("MemberCount")
        public Integer memberCount;

        @NameInMap("NeedJoined")
        public Boolean needJoined;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ConsortiumId")
        public String consortiumId;

        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("DeleteTime")
        public String deleteTime;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("ConsortiumChannelId")
        public Integer consortiumChannelId;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("ConsortiumName")
        public String consortiumName;

        @NameInMap("BlockCount")
        public Integer blockCount;

        public static DescribeFabricConsortiumChannelsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricConsortiumChannelsResponseBodyResult self = new DescribeFabricConsortiumChannelsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setBatchTimeout(Integer batchTimeout) {
            this.batchTimeout = batchTimeout;
            return this;
        }
        public Integer getBatchTimeout() {
            return this.batchTimeout;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setChaincodeCount(Integer chaincodeCount) {
            this.chaincodeCount = chaincodeCount;
            return this;
        }
        public Integer getChaincodeCount() {
            return this.chaincodeCount;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setMemberJoinedCount(String memberJoinedCount) {
            this.memberJoinedCount = memberJoinedCount;
            return this;
        }
        public String getMemberJoinedCount() {
            return this.memberJoinedCount;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setPreferredMaxBytes(Integer preferredMaxBytes) {
            this.preferredMaxBytes = preferredMaxBytes;
            return this;
        }
        public Integer getPreferredMaxBytes() {
            return this.preferredMaxBytes;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setSupportChannelConfig(Boolean supportChannelConfig) {
            this.supportChannelConfig = supportChannelConfig;
            return this;
        }
        public Boolean getSupportChannelConfig() {
            return this.supportChannelConfig;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setOwnerBid(String ownerBid) {
            this.ownerBid = ownerBid;
            return this;
        }
        public String getOwnerBid() {
            return this.ownerBid;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setMaxMessageCount(Integer maxMessageCount) {
            this.maxMessageCount = maxMessageCount;
            return this;
        }
        public Integer getMaxMessageCount() {
            return this.maxMessageCount;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setMemberCount(Integer memberCount) {
            this.memberCount = memberCount;
            return this;
        }
        public Integer getMemberCount() {
            return this.memberCount;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setNeedJoined(Boolean needJoined) {
            this.needJoined = needJoined;
            return this;
        }
        public Boolean getNeedJoined() {
            return this.needJoined;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setDeleteTime(String deleteTime) {
            this.deleteTime = deleteTime;
            return this;
        }
        public String getDeleteTime() {
            return this.deleteTime;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setConsortiumChannelId(Integer consortiumChannelId) {
            this.consortiumChannelId = consortiumChannelId;
            return this;
        }
        public Integer getConsortiumChannelId() {
            return this.consortiumChannelId;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setConsortiumName(String consortiumName) {
            this.consortiumName = consortiumName;
            return this;
        }
        public String getConsortiumName() {
            return this.consortiumName;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setBlockCount(Integer blockCount) {
            this.blockCount = blockCount;
            return this;
        }
        public Integer getBlockCount() {
            return this.blockCount;
        }

    }

}
