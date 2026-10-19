// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class ListTopicResponseBody extends TeaModel {
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
    public ListTopicResponseBodyData data;

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
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListTopicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTopicResponseBody self = new ListTopicResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTopicResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListTopicResponseBody setData(ListTopicResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTopicResponseBodyData getData() {
        return this.data;
    }

    public ListTopicResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTopicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTopicResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTopicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTopicResponseBodyDataPageDataTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>tag1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListTopicResponseBodyDataPageDataTags build(java.util.Map<String, ?> map) throws Exception {
            ListTopicResponseBodyDataPageDataTags self = new ListTopicResponseBodyDataPageDataTags();
            return TeaModel.build(map, self);
        }

        public ListTopicResponseBodyDataPageDataTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListTopicResponseBodyDataPageDataTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListTopicResponseBodyDataPageData extends TeaModel {
        /**
         * <p>The time when the topic was created. The value is a UTC UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1449554962</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Specifies whether server-side encryption is enabled. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableSSE")
        public Boolean enableSSE;

        /**
         * <p>Indicates whether server-side encryption is enabled.</p>
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
         * <p>The time when the topic attributes were last modified. The value is a UTC UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1449554962</p>
         */
        @NameInMap("LastModifyTime")
        public Long lastModifyTime;

        /**
         * <p>Indicates whether the log management feature is enabled. Valid values:</p>
         * <ul>
         * <li>True: enabled</li>
         * <li>False: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("LoggingEnabled")
        public Boolean loggingEnabled;

        /**
         * <p>The maximum length of the message body that can be sent to the topic. Unit: bytes.</p>
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
         * <p>The maximum retention period of messages in the topic. After the specified period elapses from the time a message is sent to the topic, the message is deleted regardless of whether it is successfully pushed to users. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("MessageRetentionPeriod")
        public Long messageRetentionPeriod;

        /**
         * <p>The server-side encryption algorithm. Currently, AES-256-GCM is supported. If this parameter is not specified, the default algorithm is used.</p>
         * 
         * <strong>example:</strong>
         * <p>AES-256-GCM</p>
         */
        @NameInMap("SseAlgorithm")
        public String sseAlgorithm;

        /**
         * <p>The server-side encryption method. Valid values: SMQ and KMS.</p>
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
        public java.util.List<ListTopicResponseBodyDataPageDataTags> tags;

        /**
         * <p>The internal URL of the topic.</p>
         * 
         * <strong>example:</strong>
         * <p>http:// 111111111****.mns.us-west-1-internal.aliyuncs.com/topics/testTopic</p>
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
         * <p>The type of the topic. Valid values:</p>
         * <ul>
         * <li>normal: normal topic</li>
         * <li>fifo: FIFO topic</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("TopicType")
        public String topicType;

        /**
         * <p>The URL of the topic.</p>
         * 
         * <strong>example:</strong>
         * <p>http:// 111111111****.mns.us-west-1.aliyuncs.com/topics/testTopic</p>
         */
        @NameInMap("TopicUrl")
        public String topicUrl;

        public static ListTopicResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            ListTopicResponseBodyDataPageData self = new ListTopicResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public ListTopicResponseBodyDataPageData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListTopicResponseBodyDataPageData setEnableSSE(Boolean enableSSE) {
            this.enableSSE = enableSSE;
            return this;
        }
        public Boolean getEnableSSE() {
            return this.enableSSE;
        }

        public ListTopicResponseBodyDataPageData setEncryptionEnabled(Boolean encryptionEnabled) {
            this.encryptionEnabled = encryptionEnabled;
            return this;
        }
        public Boolean getEncryptionEnabled() {
            return this.encryptionEnabled;
        }

        public ListTopicResponseBodyDataPageData setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public String getKmsKeyId() {
            return this.kmsKeyId;
        }

        public ListTopicResponseBodyDataPageData setLastModifyTime(Long lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public Long getLastModifyTime() {
            return this.lastModifyTime;
        }

        public ListTopicResponseBodyDataPageData setLoggingEnabled(Boolean loggingEnabled) {
            this.loggingEnabled = loggingEnabled;
            return this;
        }
        public Boolean getLoggingEnabled() {
            return this.loggingEnabled;
        }

        public ListTopicResponseBodyDataPageData setMaxMessageSize(Long maxMessageSize) {
            this.maxMessageSize = maxMessageSize;
            return this;
        }
        public Long getMaxMessageSize() {
            return this.maxMessageSize;
        }

        public ListTopicResponseBodyDataPageData setMessageCount(Long messageCount) {
            this.messageCount = messageCount;
            return this;
        }
        public Long getMessageCount() {
            return this.messageCount;
        }

        public ListTopicResponseBodyDataPageData setMessageRetentionPeriod(Long messageRetentionPeriod) {
            this.messageRetentionPeriod = messageRetentionPeriod;
            return this;
        }
        public Long getMessageRetentionPeriod() {
            return this.messageRetentionPeriod;
        }

        public ListTopicResponseBodyDataPageData setSseAlgorithm(String sseAlgorithm) {
            this.sseAlgorithm = sseAlgorithm;
            return this;
        }
        public String getSseAlgorithm() {
            return this.sseAlgorithm;
        }

        public ListTopicResponseBodyDataPageData setSseType(String sseType) {
            this.sseType = sseType;
            return this;
        }
        public String getSseType() {
            return this.sseType;
        }

        public ListTopicResponseBodyDataPageData setTags(java.util.List<ListTopicResponseBodyDataPageDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListTopicResponseBodyDataPageDataTags> getTags() {
            return this.tags;
        }

        public ListTopicResponseBodyDataPageData setTopicInnerUrl(String topicInnerUrl) {
            this.topicInnerUrl = topicInnerUrl;
            return this;
        }
        public String getTopicInnerUrl() {
            return this.topicInnerUrl;
        }

        public ListTopicResponseBodyDataPageData setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

        public ListTopicResponseBodyDataPageData setTopicType(String topicType) {
            this.topicType = topicType;
            return this;
        }
        public String getTopicType() {
            return this.topicType;
        }

        public ListTopicResponseBodyDataPageData setTopicUrl(String topicUrl) {
            this.topicUrl = topicUrl;
            return this;
        }
        public String getTopicUrl() {
            return this.topicUrl;
        }

    }

    public static class ListTopicResponseBodyData extends TeaModel {
        /**
         * <p>The results returned on the current page.</p>
         */
        @NameInMap("PageData")
        public java.util.List<ListTopicResponseBodyDataPageData> pageData;

        /**
         * <p>The page number of the returned results.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Long pageNum;

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of results.</p>
         * 
         * <strong>example:</strong>
         * <p>130</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListTopicResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTopicResponseBodyData self = new ListTopicResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTopicResponseBodyData setPageData(java.util.List<ListTopicResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<ListTopicResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public ListTopicResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public ListTopicResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListTopicResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
