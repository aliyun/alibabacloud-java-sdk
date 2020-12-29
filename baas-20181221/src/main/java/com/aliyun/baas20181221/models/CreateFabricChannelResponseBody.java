// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateFabricChannelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public CreateFabricChannelResponseBodyResult result;

    public static CreateFabricChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFabricChannelResponseBody self = new CreateFabricChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFabricChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFabricChannelResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CreateFabricChannelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateFabricChannelResponseBody setResult(CreateFabricChannelResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateFabricChannelResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateFabricChannelResponseBodyResult extends TeaModel {
        @NameInMap("BatchTimeout")
        public Integer batchTimeout;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("ChaincodeCount")
        public Integer chaincodeCount;

        @NameInMap("State")
        public String state;

        @NameInMap("PreferredMaxBytes")
        public Integer preferredMaxBytes;

        @NameInMap("CreateTime")
        public String createTime;

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

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ConsortiumId")
        public String consortiumId;

        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("SupportConfig")
        public Boolean supportConfig;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("ConsortiumName")
        public String consortiumName;

        @NameInMap("BlockCount")
        public Integer blockCount;

        public static CreateFabricChannelResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateFabricChannelResponseBodyResult self = new CreateFabricChannelResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateFabricChannelResponseBodyResult setBatchTimeout(Integer batchTimeout) {
            this.batchTimeout = batchTimeout;
            return this;
        }
        public Integer getBatchTimeout() {
            return this.batchTimeout;
        }

        public CreateFabricChannelResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public CreateFabricChannelResponseBodyResult setChaincodeCount(Integer chaincodeCount) {
            this.chaincodeCount = chaincodeCount;
            return this;
        }
        public Integer getChaincodeCount() {
            return this.chaincodeCount;
        }

        public CreateFabricChannelResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateFabricChannelResponseBodyResult setPreferredMaxBytes(Integer preferredMaxBytes) {
            this.preferredMaxBytes = preferredMaxBytes;
            return this;
        }
        public Integer getPreferredMaxBytes() {
            return this.preferredMaxBytes;
        }

        public CreateFabricChannelResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateFabricChannelResponseBodyResult setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public CreateFabricChannelResponseBodyResult setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        public CreateFabricChannelResponseBodyResult setOwnerBid(String ownerBid) {
            this.ownerBid = ownerBid;
            return this;
        }
        public String getOwnerBid() {
            return this.ownerBid;
        }

        public CreateFabricChannelResponseBodyResult setMaxMessageCount(Integer maxMessageCount) {
            this.maxMessageCount = maxMessageCount;
            return this;
        }
        public Integer getMaxMessageCount() {
            return this.maxMessageCount;
        }

        public CreateFabricChannelResponseBodyResult setMemberCount(Integer memberCount) {
            this.memberCount = memberCount;
            return this;
        }
        public Integer getMemberCount() {
            return this.memberCount;
        }

        public CreateFabricChannelResponseBodyResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateFabricChannelResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public CreateFabricChannelResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public CreateFabricChannelResponseBodyResult setSupportConfig(Boolean supportConfig) {
            this.supportConfig = supportConfig;
            return this;
        }
        public Boolean getSupportConfig() {
            return this.supportConfig;
        }

        public CreateFabricChannelResponseBodyResult setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public CreateFabricChannelResponseBodyResult setConsortiumName(String consortiumName) {
            this.consortiumName = consortiumName;
            return this;
        }
        public String getConsortiumName() {
            return this.consortiumName;
        }

        public CreateFabricChannelResponseBodyResult setBlockCount(Integer blockCount) {
            this.blockCount = blockCount;
            return this;
        }
        public Integer getBlockCount() {
            return this.blockCount;
        }

    }

}
