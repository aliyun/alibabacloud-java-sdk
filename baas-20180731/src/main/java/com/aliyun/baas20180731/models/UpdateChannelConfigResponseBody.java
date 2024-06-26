// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateChannelConfigResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpdateChannelConfigResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateChannelConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateChannelConfigResponseBody self = new UpdateChannelConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateChannelConfigResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public UpdateChannelConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateChannelConfigResponseBody setResult(UpdateChannelConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateChannelConfigResponseBodyResult getResult() {
        return this.result;
    }

    public UpdateChannelConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateChannelConfigResponseBodyResult extends TeaModel {
        @NameInMap("BatchTimeout")
        public Integer batchTimeout;

        @NameInMap("BlockCount")
        public Integer blockCount;

        @NameInMap("ChaincodeCount")
        public Integer chaincodeCount;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("ConsortiumId")
        public String consortiumId;

        @NameInMap("ConsortiumName")
        public String consortiumName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("MaxMessageCount")
        public Integer maxMessageCount;

        @NameInMap("MemberCount")
        public Integer memberCount;

        @NameInMap("Name")
        public String name;

        @NameInMap("OwnerBid")
        public String ownerBid;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("OwnerUid")
        public Integer ownerUid;

        @NameInMap("PreferredMaxBytes")
        public Integer preferredMaxBytes;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("State")
        public String state;

        @NameInMap("SupportConfig")
        public Boolean supportConfig;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static UpdateChannelConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateChannelConfigResponseBodyResult self = new UpdateChannelConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateChannelConfigResponseBodyResult setBatchTimeout(Integer batchTimeout) {
            this.batchTimeout = batchTimeout;
            return this;
        }
        public Integer getBatchTimeout() {
            return this.batchTimeout;
        }

        public UpdateChannelConfigResponseBodyResult setBlockCount(Integer blockCount) {
            this.blockCount = blockCount;
            return this;
        }
        public Integer getBlockCount() {
            return this.blockCount;
        }

        public UpdateChannelConfigResponseBodyResult setChaincodeCount(Integer chaincodeCount) {
            this.chaincodeCount = chaincodeCount;
            return this;
        }
        public Integer getChaincodeCount() {
            return this.chaincodeCount;
        }

        public UpdateChannelConfigResponseBodyResult setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public UpdateChannelConfigResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public UpdateChannelConfigResponseBodyResult setConsortiumName(String consortiumName) {
            this.consortiumName = consortiumName;
            return this;
        }
        public String getConsortiumName() {
            return this.consortiumName;
        }

        public UpdateChannelConfigResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateChannelConfigResponseBodyResult setMaxMessageCount(Integer maxMessageCount) {
            this.maxMessageCount = maxMessageCount;
            return this;
        }
        public Integer getMaxMessageCount() {
            return this.maxMessageCount;
        }

        public UpdateChannelConfigResponseBodyResult setMemberCount(Integer memberCount) {
            this.memberCount = memberCount;
            return this;
        }
        public Integer getMemberCount() {
            return this.memberCount;
        }

        public UpdateChannelConfigResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateChannelConfigResponseBodyResult setOwnerBid(String ownerBid) {
            this.ownerBid = ownerBid;
            return this;
        }
        public String getOwnerBid() {
            return this.ownerBid;
        }

        public UpdateChannelConfigResponseBodyResult setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public UpdateChannelConfigResponseBodyResult setOwnerUid(Integer ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Integer getOwnerUid() {
            return this.ownerUid;
        }

        public UpdateChannelConfigResponseBodyResult setPreferredMaxBytes(Integer preferredMaxBytes) {
            this.preferredMaxBytes = preferredMaxBytes;
            return this;
        }
        public Integer getPreferredMaxBytes() {
            return this.preferredMaxBytes;
        }

        public UpdateChannelConfigResponseBodyResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public UpdateChannelConfigResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateChannelConfigResponseBodyResult setSupportConfig(Boolean supportConfig) {
            this.supportConfig = supportConfig;
            return this;
        }
        public Boolean getSupportConfig() {
            return this.supportConfig;
        }

        public UpdateChannelConfigResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
