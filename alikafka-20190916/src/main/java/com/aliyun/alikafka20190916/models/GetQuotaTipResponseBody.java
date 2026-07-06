// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetQuotaTipResponseBody extends TeaModel {
    /**
     * <p>Status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Additional information. In typical scenarios, it provides a brief description of failed calls to help the caller locate the problem</p>
     * 
     * <strong>example:</strong>
     * <p>operation success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Quota information.</p>
     */
    @NameInMap("QuotaData")
    public GetQuotaTipResponseBodyQuotaData quotaData;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0178A3A7-E87B-5E50-A16F-3E62F534****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
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
         * <p>Remaining Group quota.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("GroupLeft")
        public Integer groupLeft;

        /**
         * <p>Used Group quota.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("GroupUsed")
        public Integer groupUsed;

        /**
         * <p>Partition purchase method distinction, with the following values:</p>
         * <ul>
         * <li><p>0: indicates that the instance uses the topic model for purchase.</p>
         * </li>
         * <li><p>1: indicates partition model purchase.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsPartitionBuy")
        public Integer isPartitionBuy;

        /**
         * <p>Remaining partition quota.</p>
         * 
         * <strong>example:</strong>
         * <p>1050</p>
         */
        @NameInMap("PartitionLeft")
        public Integer partitionLeft;

        /**
         * <p>Number of purchased partitions.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PartitionNumOfBuy")
        public Integer partitionNumOfBuy;

        /**
         * <p>Partition quota.</p>
         * 
         * <strong>example:</strong>
         * <p>1100</p>
         */
        @NameInMap("PartitionQuota")
        public Integer partitionQuota;

        /**
         * <p>Used partition quota.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PartitionUsed")
        public Integer partitionUsed;

        /**
         * <p>Remaining topic quota.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TopicLeft")
        public Integer topicLeft;

        /**
         * <p>Number of purchased topics.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("TopicNumOfBuy")
        public Integer topicNumOfBuy;

        /**
         * <p>Topic quota.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("TopicQuota")
        public Integer topicQuota;

        /**
         * <p>Used topic quota.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
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
