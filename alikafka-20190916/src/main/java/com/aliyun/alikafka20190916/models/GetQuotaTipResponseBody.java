// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetQuotaTipResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("QuotaData")
    public GetQuotaTipResponseBodyQuotaData quotaData;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetQuotaTipResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaTipResponseBody self = new GetQuotaTipResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQuotaTipResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetQuotaTipResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQuotaTipResponseBody setQuotaData(GetQuotaTipResponseBodyQuotaData quotaData) {
        this.quotaData = quotaData;
        return this;
    }
    public GetQuotaTipResponseBodyQuotaData getQuotaData() {
        return this.quotaData;
    }

    public GetQuotaTipResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQuotaTipResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQuotaTipResponseBodyQuotaData extends TeaModel {
        @NameInMap("GroupLeft")
        public Integer groupLeft;

        @NameInMap("GroupUsed")
        public Integer groupUsed;

        @NameInMap("IsPartitionBuy")
        public Integer isPartitionBuy;

        @NameInMap("PartitionLeft")
        public Integer partitionLeft;

        @NameInMap("PartitionNumOfBuy")
        public Integer partitionNumOfBuy;

        @NameInMap("PartitionQuata")
        public Integer partitionQuata;

        @NameInMap("PartitionUsed")
        public Integer partitionUsed;

        @NameInMap("TopicLeft")
        public Integer topicLeft;

        @NameInMap("TopicNumOfBuy")
        public Integer topicNumOfBuy;

        @NameInMap("TopicQuota")
        public Integer topicQuota;

        @NameInMap("TopicUsed")
        public Integer topicUsed;

        public static GetQuotaTipResponseBodyQuotaData build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaTipResponseBodyQuotaData self = new GetQuotaTipResponseBodyQuotaData();
            return TeaModel.build(map, self);
        }

        public GetQuotaTipResponseBodyQuotaData setGroupLeft(Integer groupLeft) {
            this.groupLeft = groupLeft;
            return this;
        }
        public Integer getGroupLeft() {
            return this.groupLeft;
        }

        public GetQuotaTipResponseBodyQuotaData setGroupUsed(Integer groupUsed) {
            this.groupUsed = groupUsed;
            return this;
        }
        public Integer getGroupUsed() {
            return this.groupUsed;
        }

        public GetQuotaTipResponseBodyQuotaData setIsPartitionBuy(Integer isPartitionBuy) {
            this.isPartitionBuy = isPartitionBuy;
            return this;
        }
        public Integer getIsPartitionBuy() {
            return this.isPartitionBuy;
        }

        public GetQuotaTipResponseBodyQuotaData setPartitionLeft(Integer partitionLeft) {
            this.partitionLeft = partitionLeft;
            return this;
        }
        public Integer getPartitionLeft() {
            return this.partitionLeft;
        }

        public GetQuotaTipResponseBodyQuotaData setPartitionNumOfBuy(Integer partitionNumOfBuy) {
            this.partitionNumOfBuy = partitionNumOfBuy;
            return this;
        }
        public Integer getPartitionNumOfBuy() {
            return this.partitionNumOfBuy;
        }

        public GetQuotaTipResponseBodyQuotaData setPartitionQuata(Integer partitionQuata) {
            this.partitionQuata = partitionQuata;
            return this;
        }
        public Integer getPartitionQuata() {
            return this.partitionQuata;
        }

        public GetQuotaTipResponseBodyQuotaData setPartitionUsed(Integer partitionUsed) {
            this.partitionUsed = partitionUsed;
            return this;
        }
        public Integer getPartitionUsed() {
            return this.partitionUsed;
        }

        public GetQuotaTipResponseBodyQuotaData setTopicLeft(Integer topicLeft) {
            this.topicLeft = topicLeft;
            return this;
        }
        public Integer getTopicLeft() {
            return this.topicLeft;
        }

        public GetQuotaTipResponseBodyQuotaData setTopicNumOfBuy(Integer topicNumOfBuy) {
            this.topicNumOfBuy = topicNumOfBuy;
            return this;
        }
        public Integer getTopicNumOfBuy() {
            return this.topicNumOfBuy;
        }

        public GetQuotaTipResponseBodyQuotaData setTopicQuota(Integer topicQuota) {
            this.topicQuota = topicQuota;
            return this;
        }
        public Integer getTopicQuota() {
            return this.topicQuota;
        }

        public GetQuotaTipResponseBodyQuotaData setTopicUsed(Integer topicUsed) {
            this.topicUsed = topicUsed;
            return this;
        }
        public Integer getTopicUsed() {
            return this.topicUsed;
        }

    }

}
