// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateChannelResponseBody extends TeaModel {
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
    public CreateChannelResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateChannelResponseBody self = new CreateChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateChannelResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CreateChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateChannelResponseBody setResult(CreateChannelResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateChannelResponseBodyResult getResult() {
        return this.result;
    }

    public CreateChannelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateChannelResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("BatchTimeout")
        public Integer batchTimeout;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("BlockCount")
        public Integer blockCount;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ChaincodeCount")
        public Integer chaincodeCount;

        /**
         * <strong>example:</strong>
         * <p>chan-channelx-1l1hmckuuisxo</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <strong>example:</strong>
         * <p>consortium-aaaaaa-akpcsjjac2jd</p>
         */
        @NameInMap("ConsortiumId")
        public String consortiumId;

        /**
         * <strong>example:</strong>
         * <p>aaaaaa</p>
         */
        @NameInMap("ConsortiumName")
        public String consortiumName;

        /**
         * <strong>example:</strong>
         * <p>1544768139624</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxMessageCount")
        public Integer maxMessageCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MemberCount")
        public Integer memberCount;

        /**
         * <strong>example:</strong>
         * <p>channelx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>26842</p>
         */
        @NameInMap("OwnerBid")
        public String ownerBid;

        /**
         * <strong>example:</strong>
         * <p>uid-</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("OwnerUid")
        public Integer ownerUid;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PreferredMaxBytes")
        public Integer preferredMaxBytes;

        /**
         * <strong>example:</strong>
         * <p>1890FA4F-067A-4CE9-AC9B-2BD2E58FB5D3</p>
         */
        @NameInMap("RequestId")
        public String requestId;

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
        @NameInMap("SupportConfig")
        public Boolean supportConfig;

        /**
         * <strong>example:</strong>
         * <p>1544768139624</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static CreateChannelResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateChannelResponseBodyResult self = new CreateChannelResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateChannelResponseBodyResult setBatchTimeout(Integer batchTimeout) {
            this.batchTimeout = batchTimeout;
            return this;
        }
        public Integer getBatchTimeout() {
            return this.batchTimeout;
        }

        public CreateChannelResponseBodyResult setBlockCount(Integer blockCount) {
            this.blockCount = blockCount;
            return this;
        }
        public Integer getBlockCount() {
            return this.blockCount;
        }

        public CreateChannelResponseBodyResult setChaincodeCount(Integer chaincodeCount) {
            this.chaincodeCount = chaincodeCount;
            return this;
        }
        public Integer getChaincodeCount() {
            return this.chaincodeCount;
        }

        public CreateChannelResponseBodyResult setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public CreateChannelResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public CreateChannelResponseBodyResult setConsortiumName(String consortiumName) {
            this.consortiumName = consortiumName;
            return this;
        }
        public String getConsortiumName() {
            return this.consortiumName;
        }

        public CreateChannelResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateChannelResponseBodyResult setMaxMessageCount(Integer maxMessageCount) {
            this.maxMessageCount = maxMessageCount;
            return this;
        }
        public Integer getMaxMessageCount() {
            return this.maxMessageCount;
        }

        public CreateChannelResponseBodyResult setMemberCount(Integer memberCount) {
            this.memberCount = memberCount;
            return this;
        }
        public Integer getMemberCount() {
            return this.memberCount;
        }

        public CreateChannelResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateChannelResponseBodyResult setOwnerBid(String ownerBid) {
            this.ownerBid = ownerBid;
            return this;
        }
        public String getOwnerBid() {
            return this.ownerBid;
        }

        public CreateChannelResponseBodyResult setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public CreateChannelResponseBodyResult setOwnerUid(Integer ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Integer getOwnerUid() {
            return this.ownerUid;
        }

        public CreateChannelResponseBodyResult setPreferredMaxBytes(Integer preferredMaxBytes) {
            this.preferredMaxBytes = preferredMaxBytes;
            return this;
        }
        public Integer getPreferredMaxBytes() {
            return this.preferredMaxBytes;
        }

        public CreateChannelResponseBodyResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateChannelResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateChannelResponseBodyResult setSupportConfig(Boolean supportConfig) {
            this.supportConfig = supportConfig;
            return this;
        }
        public Boolean getSupportConfig() {
            return this.supportConfig;
        }

        public CreateChannelResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
