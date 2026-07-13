// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class GetTopicAttributesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetTopicAttributesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Success")
    public Boolean success;

    public static GetTopicAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTopicAttributesResponseBody self = new GetTopicAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTopicAttributesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetTopicAttributesResponseBody setData(GetTopicAttributesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTopicAttributesResponseBodyData getData() {
        return this.data;
    }

    public GetTopicAttributesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTopicAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTopicAttributesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetTopicAttributesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTopicAttributesResponseBodyDataTags extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static GetTopicAttributesResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            GetTopicAttributesResponseBodyDataTags self = new GetTopicAttributesResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public GetTopicAttributesResponseBodyDataTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetTopicAttributesResponseBodyDataTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetTopicAttributesResponseBodyData extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("EnableSSE")
        public Boolean enableSSE;

        @NameInMap("EncryptionEnabled")
        public Boolean encryptionEnabled;

        @NameInMap("KmsKeyId")
        public String kmsKeyId;

        @NameInMap("LastModifyTime")
        public Long lastModifyTime;

        @NameInMap("LoggingEnabled")
        public Boolean loggingEnabled;

        @NameInMap("MaxMessageSize")
        public Long maxMessageSize;

        @NameInMap("MessageCount")
        public Long messageCount;

        @NameInMap("MessageRetentionPeriod")
        public Long messageRetentionPeriod;

        @NameInMap("SseAlgorithm")
        public String sseAlgorithm;

        @NameInMap("SseType")
        public String sseType;

        @NameInMap("Tags")
        public java.util.List<GetTopicAttributesResponseBodyDataTags> tags;

        /**
         * <strong>example:</strong>
         * <p>http:// 111111111****.mns.us-west-1-internal.aliyuncs.com/topics/testTopic</p>
         */
        @NameInMap("TopicInnerUrl")
        public String topicInnerUrl;

        @NameInMap("TopicName")
        public String topicName;

        @NameInMap("TopicType")
        public String topicType;

        /**
         * <strong>example:</strong>
         * <p>http:// 111111111****.mns.us-west-1.aliyuncs.com/topics/testTopic</p>
         */
        @NameInMap("TopicUrl")
        public String topicUrl;

        public static GetTopicAttributesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTopicAttributesResponseBodyData self = new GetTopicAttributesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTopicAttributesResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetTopicAttributesResponseBodyData setEnableSSE(Boolean enableSSE) {
            this.enableSSE = enableSSE;
            return this;
        }
        public Boolean getEnableSSE() {
            return this.enableSSE;
        }

        public GetTopicAttributesResponseBodyData setEncryptionEnabled(Boolean encryptionEnabled) {
            this.encryptionEnabled = encryptionEnabled;
            return this;
        }
        public Boolean getEncryptionEnabled() {
            return this.encryptionEnabled;
        }

        public GetTopicAttributesResponseBodyData setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public String getKmsKeyId() {
            return this.kmsKeyId;
        }

        public GetTopicAttributesResponseBodyData setLastModifyTime(Long lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public Long getLastModifyTime() {
            return this.lastModifyTime;
        }

        public GetTopicAttributesResponseBodyData setLoggingEnabled(Boolean loggingEnabled) {
            this.loggingEnabled = loggingEnabled;
            return this;
        }
        public Boolean getLoggingEnabled() {
            return this.loggingEnabled;
        }

        public GetTopicAttributesResponseBodyData setMaxMessageSize(Long maxMessageSize) {
            this.maxMessageSize = maxMessageSize;
            return this;
        }
        public Long getMaxMessageSize() {
            return this.maxMessageSize;
        }

        public GetTopicAttributesResponseBodyData setMessageCount(Long messageCount) {
            this.messageCount = messageCount;
            return this;
        }
        public Long getMessageCount() {
            return this.messageCount;
        }

        public GetTopicAttributesResponseBodyData setMessageRetentionPeriod(Long messageRetentionPeriod) {
            this.messageRetentionPeriod = messageRetentionPeriod;
            return this;
        }
        public Long getMessageRetentionPeriod() {
            return this.messageRetentionPeriod;
        }

        public GetTopicAttributesResponseBodyData setSseAlgorithm(String sseAlgorithm) {
            this.sseAlgorithm = sseAlgorithm;
            return this;
        }
        public String getSseAlgorithm() {
            return this.sseAlgorithm;
        }

        public GetTopicAttributesResponseBodyData setSseType(String sseType) {
            this.sseType = sseType;
            return this;
        }
        public String getSseType() {
            return this.sseType;
        }

        public GetTopicAttributesResponseBodyData setTags(java.util.List<GetTopicAttributesResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetTopicAttributesResponseBodyDataTags> getTags() {
            return this.tags;
        }

        public GetTopicAttributesResponseBodyData setTopicInnerUrl(String topicInnerUrl) {
            this.topicInnerUrl = topicInnerUrl;
            return this;
        }
        public String getTopicInnerUrl() {
            return this.topicInnerUrl;
        }

        public GetTopicAttributesResponseBodyData setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

        public GetTopicAttributesResponseBodyData setTopicType(String topicType) {
            this.topicType = topicType;
            return this;
        }
        public String getTopicType() {
            return this.topicType;
        }

        public GetTopicAttributesResponseBodyData setTopicUrl(String topicUrl) {
            this.topicUrl = topicUrl;
            return this;
        }
        public String getTopicUrl() {
            return this.topicUrl;
        }

    }

}
