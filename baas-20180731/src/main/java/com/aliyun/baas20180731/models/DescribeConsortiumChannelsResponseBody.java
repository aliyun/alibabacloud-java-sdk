// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeConsortiumChannelsResponseBody extends TeaModel {
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
    public java.util.List<DescribeConsortiumChannelsResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeConsortiumChannelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsortiumChannelsResponseBody self = new DescribeConsortiumChannelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConsortiumChannelsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeConsortiumChannelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConsortiumChannelsResponseBody setResult(java.util.List<DescribeConsortiumChannelsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeConsortiumChannelsResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeConsortiumChannelsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeConsortiumChannelsResponseBodyResult extends TeaModel {
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

        @NameInMap("Hybird")
        public Boolean hybird;

        /**
         * <p>Id</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxMessageCount")
        public Integer maxMessageCount;

        /**
         * <strong>example:</strong>
         * <p>2</p>
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
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

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

        public static DescribeConsortiumChannelsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeConsortiumChannelsResponseBodyResult self = new DescribeConsortiumChannelsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeConsortiumChannelsResponseBodyResult setBatchTimeout(Integer batchTimeout) {
            this.batchTimeout = batchTimeout;
            return this;
        }
        public Integer getBatchTimeout() {
            return this.batchTimeout;
        }

        public DescribeConsortiumChannelsResponseBodyResult setBlockCount(Integer blockCount) {
            this.blockCount = blockCount;
            return this;
        }
        public Integer getBlockCount() {
            return this.blockCount;
        }

        public DescribeConsortiumChannelsResponseBodyResult setChaincodeCount(Integer chaincodeCount) {
            this.chaincodeCount = chaincodeCount;
            return this;
        }
        public Integer getChaincodeCount() {
            return this.chaincodeCount;
        }

        public DescribeConsortiumChannelsResponseBodyResult setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeConsortiumChannelsResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeConsortiumChannelsResponseBodyResult setConsortiumName(String consortiumName) {
            this.consortiumName = consortiumName;
            return this;
        }
        public String getConsortiumName() {
            return this.consortiumName;
        }

        public DescribeConsortiumChannelsResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeConsortiumChannelsResponseBodyResult setDeleteTime(String deleteTime) {
            this.deleteTime = deleteTime;
            return this;
        }
        public String getDeleteTime() {
            return this.deleteTime;
        }

        public DescribeConsortiumChannelsResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public DescribeConsortiumChannelsResponseBodyResult setHybird(Boolean hybird) {
            this.hybird = hybird;
            return this;
        }
        public Boolean getHybird() {
            return this.hybird;
        }

        public DescribeConsortiumChannelsResponseBodyResult setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeConsortiumChannelsResponseBodyResult setMaxMessageCount(Integer maxMessageCount) {
            this.maxMessageCount = maxMessageCount;
            return this;
        }
        public Integer getMaxMessageCount() {
            return this.maxMessageCount;
        }

        public DescribeConsortiumChannelsResponseBodyResult setMemberCount(Integer memberCount) {
            this.memberCount = memberCount;
            return this;
        }
        public Integer getMemberCount() {
            return this.memberCount;
        }

        public DescribeConsortiumChannelsResponseBodyResult setMemberJoinedCount(String memberJoinedCount) {
            this.memberJoinedCount = memberJoinedCount;
            return this;
        }
        public String getMemberJoinedCount() {
            return this.memberJoinedCount;
        }

        public DescribeConsortiumChannelsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeConsortiumChannelsResponseBodyResult setNeedJoined(Boolean needJoined) {
            this.needJoined = needJoined;
            return this;
        }
        public Boolean getNeedJoined() {
            return this.needJoined;
        }

        public DescribeConsortiumChannelsResponseBodyResult setOwnerBid(String ownerBid) {
            this.ownerBid = ownerBid;
            return this;
        }
        public String getOwnerBid() {
            return this.ownerBid;
        }

        public DescribeConsortiumChannelsResponseBodyResult setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public DescribeConsortiumChannelsResponseBodyResult setOwnerUid(Integer ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Integer getOwnerUid() {
            return this.ownerUid;
        }

        public DescribeConsortiumChannelsResponseBodyResult setPreferredMaxBytes(Integer preferredMaxBytes) {
            this.preferredMaxBytes = preferredMaxBytes;
            return this;
        }
        public Integer getPreferredMaxBytes() {
            return this.preferredMaxBytes;
        }

        public DescribeConsortiumChannelsResponseBodyResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeConsortiumChannelsResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeConsortiumChannelsResponseBodyResult setSupportChannelConfig(Boolean supportChannelConfig) {
            this.supportChannelConfig = supportChannelConfig;
            return this;
        }
        public Boolean getSupportChannelConfig() {
            return this.supportChannelConfig;
        }

        public DescribeConsortiumChannelsResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
