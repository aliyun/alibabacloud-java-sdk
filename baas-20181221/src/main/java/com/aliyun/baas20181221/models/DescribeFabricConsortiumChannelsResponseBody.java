// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumChannelsResponseBody extends TeaModel {
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
    public java.util.List<DescribeFabricConsortiumChannelsResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeFabricConsortiumChannelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumChannelsResponseBody self = new DescribeFabricConsortiumChannelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumChannelsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricConsortiumChannelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricConsortiumChannelsResponseBody setResult(java.util.List<DescribeFabricConsortiumChannelsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeFabricConsortiumChannelsResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeFabricConsortiumChannelsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeFabricConsortiumChannelsResponseBodyResult extends TeaModel {
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
         * <p>mychammel</p>
         */
        @NameInMap("ChannelName")
        public String channelName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ConsortiumChannelId")
        public Integer consortiumChannelId;

        /**
         * <strong>example:</strong>
         * <p>consortium-lianmenyumingyi-hc5d1bwlulg7</p>
         */
        @NameInMap("ConsortiumId")
        public String consortiumId;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("ConsortiumName")
        public String consortiumName;

        /**
         * <strong>example:</strong>
         * <p>1544411108000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1544411108000</p>
         */
        @NameInMap("DeleteTime")
        public String deleteTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Deleted")
        public Boolean deleted;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("MaxMessageCount")
        public Integer maxMessageCount;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MemberCount")
        public Integer memberCount;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MemberJoinedCount")
        public String memberJoinedCount;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedJoined")
        public Boolean needJoined;

        /**
         * <strong>example:</strong>
         * <p>26842</p>
         */
        @NameInMap("OwnerBid")
        public String ownerBid;

        /**
         * <strong>example:</strong>
         * <p>uid-*</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <strong>example:</strong>
         * <p>212</p>
         */
        @NameInMap("OwnerUid")
        public Long ownerUid;

        /**
         * <strong>example:</strong>
         * <p>102410241</p>
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
         * <p>Running</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportChannelConfig")
        public Boolean supportChannelConfig;

        /**
         * <strong>example:</strong>
         * <p>1544411108000</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

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

        public DescribeFabricConsortiumChannelsResponseBodyResult setBlockCount(Integer blockCount) {
            this.blockCount = blockCount;
            return this;
        }
        public Integer getBlockCount() {
            return this.blockCount;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setChaincodeCount(Integer chaincodeCount) {
            this.chaincodeCount = chaincodeCount;
            return this;
        }
        public Integer getChaincodeCount() {
            return this.chaincodeCount;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setConsortiumChannelId(Integer consortiumChannelId) {
            this.consortiumChannelId = consortiumChannelId;
            return this;
        }
        public Integer getConsortiumChannelId() {
            return this.consortiumChannelId;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setConsortiumName(String consortiumName) {
            this.consortiumName = consortiumName;
            return this;
        }
        public String getConsortiumName() {
            return this.consortiumName;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setDeleteTime(String deleteTime) {
            this.deleteTime = deleteTime;
            return this;
        }
        public String getDeleteTime() {
            return this.deleteTime;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
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

        public DescribeFabricConsortiumChannelsResponseBodyResult setMemberJoinedCount(String memberJoinedCount) {
            this.memberJoinedCount = memberJoinedCount;
            return this;
        }
        public String getMemberJoinedCount() {
            return this.memberJoinedCount;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setNeedJoined(Boolean needJoined) {
            this.needJoined = needJoined;
            return this;
        }
        public Boolean getNeedJoined() {
            return this.needJoined;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setOwnerBid(String ownerBid) {
            this.ownerBid = ownerBid;
            return this;
        }
        public String getOwnerBid() {
            return this.ownerBid;
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

        public DescribeFabricConsortiumChannelsResponseBodyResult setPreferredMaxBytes(Integer preferredMaxBytes) {
            this.preferredMaxBytes = preferredMaxBytes;
            return this;
        }
        public Integer getPreferredMaxBytes() {
            return this.preferredMaxBytes;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setSupportChannelConfig(Boolean supportChannelConfig) {
            this.supportChannelConfig = supportChannelConfig;
            return this;
        }
        public Boolean getSupportChannelConfig() {
            return this.supportChannelConfig;
        }

        public DescribeFabricConsortiumChannelsResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
