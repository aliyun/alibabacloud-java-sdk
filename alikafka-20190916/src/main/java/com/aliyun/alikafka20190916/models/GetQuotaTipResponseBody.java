// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetQuotaTipResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned. The HTTP status code 200 indicates that the request is successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional message. This message is typically used to describe API call failures for troubleshooting.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The quota.</p>
     */
    @NameInMap("QuotaData")
    public GetQuotaTipResponseBodyQuotaData quotaData;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
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
        /**
         * <p>The number of available groups.</p>
         */
        @NameInMap("GroupLeft")
        public Integer groupLeft;

        /**
         * <p>The number of used groups.</p>
         */
        @NameInMap("GroupUsed")
        public Integer groupUsed;

        /**
         * <p>The method that you use to purchase partitions. Valid values:</p>
         * <br>
         * <p>*   0: indicates that the instance is purchased based on topics.</p>
         * <p>*   1: indicates that the instance is purchased based on partitions.</p>
         */
        @NameInMap("IsPartitionBuy")
        public Integer isPartitionBuy;

        /**
         * <p>The number of available partitions.</p>
         */
        @NameInMap("PartitionLeft")
        public Integer partitionLeft;

        /**
         * <p>The number of purchased partitions.</p>
         */
        @NameInMap("PartitionNumOfBuy")
        public Integer partitionNumOfBuy;

        /**
         * <p>The quota of partitions.</p>
         */
        @NameInMap("PartitionQuota")
        public Integer partitionQuota;

        /**
         * <p>The number of used partitions.</p>
         */
        @NameInMap("PartitionUsed")
        public Integer partitionUsed;

        /**
         * <p>The number of available topics.</p>
         */
        @NameInMap("TopicLeft")
        public Integer topicLeft;

        /**
         * <p>The number of purchased topics.</p>
         */
        @NameInMap("TopicNumOfBuy")
        public Integer topicNumOfBuy;

        /**
         * <p>The quota of topics.</p>
         */
        @NameInMap("TopicQuota")
        public Integer topicQuota;

        /**
         * <p>The number of used topics.</p>
         */
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

        public GetQuotaTipResponseBodyQuotaData setPartitionQuota(Integer partitionQuota) {
            this.partitionQuota = partitionQuota;
            return this;
        }
        public Integer getPartitionQuota() {
            return this.partitionQuota;
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
