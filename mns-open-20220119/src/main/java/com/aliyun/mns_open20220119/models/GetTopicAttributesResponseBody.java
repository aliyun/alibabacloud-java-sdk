// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class GetTopicAttributesResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public GetTopicAttributesResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>06273500-249F-5863-121D-74D51123****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the response.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>tag1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
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
        /**
         * <p>The time when the topic was created. The value is a UNIX timestamp in seconds in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1449554277</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Indicates whether storage encryption is enabled. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableSSE")
        public Boolean enableSSE;

        /**
         * <p>Indicates whether storage encryption is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EncryptionEnabled")
        public Boolean encryptionEnabled;

        /**
         * <p>The KMS key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>key-xxx</p>
         */
        @NameInMap("KmsKeyId")
        public String kmsKeyId;

        /**
         * <p>The time when the topic attributes were last modified. The value is a UNIX timestamp in seconds in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1449554460</p>
         */
        @NameInMap("LastModifyTime")
        public Long lastModifyTime;

        /**
         * <p>Indicates whether the log management feature is enabled. Valid values:</p>
         * <ul>
         * <li>True: Enabled.</li>
         * <li>False: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("LoggingEnabled")
        public Boolean loggingEnabled;

        /**
         * <p>The maximum size of a message body sent to the topic. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>65536</p>
         */
        @NameInMap("MaxMessageSize")
        public Long maxMessageSize;

        /**
         * <p>The number of messages in the topic.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MessageCount")
        public Long messageCount;

        /**
         * <p>The maximum retention period of a message in the topic. After the specified period elapses from the time the message is sent to the topic, the message is deleted regardless of whether it was successfully pushed to users. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("MessageRetentionPeriod")
        public Long messageRetentionPeriod;

        /**
         * <p>The storage encryption algorithm. Currently, only AES-256-GCM is supported. If this parameter is not specified, the default algorithm is used.</p>
         * 
         * <strong>example:</strong>
         * <p>AES-256-GCM</p>
         */
        @NameInMap("SseAlgorithm")
        public String sseAlgorithm;

        /**
         * <p>The storage encryption type. Valid values: SMQ and KMS.</p>
         * 
         * <strong>example:</strong>
         * <p>KMS</p>
         */
        @NameInMap("SseType")
        public String sseType;

        /**
         * <p>The list of resource tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetTopicAttributesResponseBodyDataTags> tags;

        /**
         * <p>The internal access URL of the topic.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://111111111****.mns.us-west-1-internal.aliyuncs.com/topics/testTopic">http://111111111****.mns.us-west-1-internal.aliyuncs.com/topics/testTopic</a></p>
         */
        @NameInMap("TopicInnerUrl")
        public String topicInnerUrl;

        /**
         * <p>The name of the topic.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-topic</p>
         */
        @NameInMap("TopicName")
        public String topicName;

        /**
         * <p>The topic type. Valid values:</p>
         * <ul>
         * <li>normal: Normal topic.</li>
         * <li>fifo: FIFO topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("TopicType")
        public String topicType;

        /**
         * <p>The public network access URL of the topic.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://111111111****.mns.us-west-1.aliyuncs.com/topics/testTopic">http://111111111****.mns.us-west-1.aliyuncs.com/topics/testTopic</a></p>
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
