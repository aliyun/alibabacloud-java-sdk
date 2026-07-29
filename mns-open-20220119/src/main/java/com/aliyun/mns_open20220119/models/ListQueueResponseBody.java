// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class ListQueueResponseBody extends TeaModel {
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
    public ListQueueResponseBodyData data;

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

    public static ListQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQueueResponseBody self = new ListQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQueueResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListQueueResponseBody setData(ListQueueResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListQueueResponseBodyData getData() {
        return this.data;
    }

    public ListQueueResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQueueResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListQueueResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListQueueResponseBodyDataPageDataDlqPolicy extends TeaModel {
        /**
         * <p>The target queue for dead-letter message delivery.</p>
         * 
         * <strong>example:</strong>
         * <p>deadLetterTargetQueue</p>
         */
        @NameInMap("DeadLetterTargetQueue")
        public String deadLetterTargetQueue;

        /**
         * <p>Indicates whether dead-letter message delivery is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The maximum number of times a message can be delivered.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxReceiveCount")
        public String maxReceiveCount;

        public static ListQueueResponseBodyDataPageDataDlqPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListQueueResponseBodyDataPageDataDlqPolicy self = new ListQueueResponseBodyDataPageDataDlqPolicy();
            return TeaModel.build(map, self);
        }

        public ListQueueResponseBodyDataPageDataDlqPolicy setDeadLetterTargetQueue(String deadLetterTargetQueue) {
            this.deadLetterTargetQueue = deadLetterTargetQueue;
            return this;
        }
        public String getDeadLetterTargetQueue() {
            return this.deadLetterTargetQueue;
        }

        public ListQueueResponseBodyDataPageDataDlqPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListQueueResponseBodyDataPageDataDlqPolicy setMaxReceiveCount(String maxReceiveCount) {
            this.maxReceiveCount = maxReceiveCount;
            return this;
        }
        public String getMaxReceiveCount() {
            return this.maxReceiveCount;
        }

    }

    public static class ListQueueResponseBodyDataPageDataTags extends TeaModel {
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

        public static ListQueueResponseBodyDataPageDataTags build(java.util.Map<String, ?> map) throws Exception {
            ListQueueResponseBodyDataPageDataTags self = new ListQueueResponseBodyDataPageDataTags();
            return TeaModel.build(map, self);
        }

        public ListQueueResponseBodyDataPageDataTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListQueueResponseBodyDataPageDataTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListQueueResponseBodyDataPageData extends TeaModel {
        /**
         * <p>The approximate total number of messages in the Active state in this queue.</p>
         * <p>This field will default to 0 in the future and is not recommended. Use CloudMonitor API to retrieve this metric instead.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ActiveMessages")
        public Long activeMessages;

        /**
         * <p>The time when the queue was created. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1250700999</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The approximate total number of messages in the Delayed state in this queue.</p>
         * <p>This field will default to 0 in the future and is not recommended. Use CloudMonitor API to retrieve this metric instead.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DelayMessages")
        public Long delayMessages;

        /**
         * <p>The delay period after which all messages sent to this queue become consumable. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("DelaySeconds")
        public Long delaySeconds;

        /**
         * <p>The dead-letter queue policy.</p>
         */
        @NameInMap("DlqPolicy")
        public ListQueueResponseBodyDataPageDataDlqPolicy dlqPolicy;

        @NameInMap("EnableSSE")
        public Boolean enableSSE;

        @NameInMap("EncryptionEnabled")
        public Boolean encryptionEnabled;

        /**
         * <p>The approximate total number of messages in the Inactive state in this queue.</p>
         * <p>This field will default to 0 in the future and is not recommended. Use CloudMonitor API to retrieve this metric instead.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InactiveMessages")
        public Long inactiveMessages;

        @NameInMap("KmsKeyId")
        public String kmsKeyId;

        /**
         * <p>The most recent time when the queue attributes were modified. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1250700999</p>
         */
        @NameInMap("LastModifyTime")
        public Long lastModifyTime;

        /**
         * <p>Indicates whether the log management feature is enabled.</p>
         * <ul>
         * <li><p>True: Enabled.</p>
         * </li>
         * <li><p>False: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("LoggingEnabled")
        public Boolean loggingEnabled;

        /**
         * <p>The maximum size of a message body that can be sent to this queue. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>65536</p>
         */
        @NameInMap("MaximumMessageSize")
        public Long maximumMessageSize;

        /**
         * <p>The maximum period for which a message can be retained in this queue. After the specified period elapses since a message is sent to the queue, the message is deleted regardless of whether it has been consumed. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>65536</p>
         */
        @NameInMap("MessageRetentionPeriod")
        public Long messageRetentionPeriod;

        /**
         * <p>The maximum wait time for a ReceiveMessage request when the queue is empty. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PollingWaitSeconds")
        public Long pollingWaitSeconds;

        /**
         * <p>The name of the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-queue</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The type of the queue. Valid values:</p>
         * <ul>
         * <li>normal: standard queue</li>
         * <li>fifo: FIFO queue</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("QueueType")
        public String queueType;

        @NameInMap("SseAlgorithm")
        public String sseAlgorithm;

        @NameInMap("SseType")
        public String sseType;

        /**
         * <p>The list of resource tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListQueueResponseBodyDataPageDataTags> tags;

        /**
         * <p>The duration for which a message stays in the Inactive state after it is consumed from the queue.</p>
         * <p>Valid values: 1 to 43200. Unit: seconds.</p>
         * <p>Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("VisibilityTimeout")
        public Long visibilityTimeout;

        public static ListQueueResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            ListQueueResponseBodyDataPageData self = new ListQueueResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public ListQueueResponseBodyDataPageData setActiveMessages(Long activeMessages) {
            this.activeMessages = activeMessages;
            return this;
        }
        public Long getActiveMessages() {
            return this.activeMessages;
        }

        public ListQueueResponseBodyDataPageData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListQueueResponseBodyDataPageData setDelayMessages(Long delayMessages) {
            this.delayMessages = delayMessages;
            return this;
        }
        public Long getDelayMessages() {
            return this.delayMessages;
        }

        public ListQueueResponseBodyDataPageData setDelaySeconds(Long delaySeconds) {
            this.delaySeconds = delaySeconds;
            return this;
        }
        public Long getDelaySeconds() {
            return this.delaySeconds;
        }

        public ListQueueResponseBodyDataPageData setDlqPolicy(ListQueueResponseBodyDataPageDataDlqPolicy dlqPolicy) {
            this.dlqPolicy = dlqPolicy;
            return this;
        }
        public ListQueueResponseBodyDataPageDataDlqPolicy getDlqPolicy() {
            return this.dlqPolicy;
        }

        public ListQueueResponseBodyDataPageData setEnableSSE(Boolean enableSSE) {
            this.enableSSE = enableSSE;
            return this;
        }
        public Boolean getEnableSSE() {
            return this.enableSSE;
        }

        public ListQueueResponseBodyDataPageData setEncryptionEnabled(Boolean encryptionEnabled) {
            this.encryptionEnabled = encryptionEnabled;
            return this;
        }
        public Boolean getEncryptionEnabled() {
            return this.encryptionEnabled;
        }

        public ListQueueResponseBodyDataPageData setInactiveMessages(Long inactiveMessages) {
            this.inactiveMessages = inactiveMessages;
            return this;
        }
        public Long getInactiveMessages() {
            return this.inactiveMessages;
        }

        public ListQueueResponseBodyDataPageData setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public String getKmsKeyId() {
            return this.kmsKeyId;
        }

        public ListQueueResponseBodyDataPageData setLastModifyTime(Long lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public Long getLastModifyTime() {
            return this.lastModifyTime;
        }

        public ListQueueResponseBodyDataPageData setLoggingEnabled(Boolean loggingEnabled) {
            this.loggingEnabled = loggingEnabled;
            return this;
        }
        public Boolean getLoggingEnabled() {
            return this.loggingEnabled;
        }

        public ListQueueResponseBodyDataPageData setMaximumMessageSize(Long maximumMessageSize) {
            this.maximumMessageSize = maximumMessageSize;
            return this;
        }
        public Long getMaximumMessageSize() {
            return this.maximumMessageSize;
        }

        public ListQueueResponseBodyDataPageData setMessageRetentionPeriod(Long messageRetentionPeriod) {
            this.messageRetentionPeriod = messageRetentionPeriod;
            return this;
        }
        public Long getMessageRetentionPeriod() {
            return this.messageRetentionPeriod;
        }

        public ListQueueResponseBodyDataPageData setPollingWaitSeconds(Long pollingWaitSeconds) {
            this.pollingWaitSeconds = pollingWaitSeconds;
            return this;
        }
        public Long getPollingWaitSeconds() {
            return this.pollingWaitSeconds;
        }

        public ListQueueResponseBodyDataPageData setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public ListQueueResponseBodyDataPageData setQueueType(String queueType) {
            this.queueType = queueType;
            return this;
        }
        public String getQueueType() {
            return this.queueType;
        }

        public ListQueueResponseBodyDataPageData setSseAlgorithm(String sseAlgorithm) {
            this.sseAlgorithm = sseAlgorithm;
            return this;
        }
        public String getSseAlgorithm() {
            return this.sseAlgorithm;
        }

        public ListQueueResponseBodyDataPageData setSseType(String sseType) {
            this.sseType = sseType;
            return this;
        }
        public String getSseType() {
            return this.sseType;
        }

        public ListQueueResponseBodyDataPageData setTags(java.util.List<ListQueueResponseBodyDataPageDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListQueueResponseBodyDataPageDataTags> getTags() {
            return this.tags;
        }

        public ListQueueResponseBodyDataPageData setVisibilityTimeout(Long visibilityTimeout) {
            this.visibilityTimeout = visibilityTimeout;
            return this;
        }
        public Long getVisibilityTimeout() {
            return this.visibilityTimeout;
        }

    }

    public static class ListQueueResponseBodyData extends TeaModel {
        /**
         * <p>The results returned on the current page.</p>
         */
        @NameInMap("PageData")
        public java.util.List<ListQueueResponseBodyDataPageData> pageData;

        /**
         * <p>The page number of the returned results.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Long pageNum;

        /**
         * <p>The maximum number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Pages")
        public Long pages;

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>130</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListQueueResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListQueueResponseBodyData self = new ListQueueResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListQueueResponseBodyData setPageData(java.util.List<ListQueueResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<ListQueueResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public ListQueueResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public ListQueueResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListQueueResponseBodyData setPages(Long pages) {
            this.pages = pages;
            return this;
        }
        public Long getPages() {
            return this.pages;
        }

        public ListQueueResponseBodyData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListQueueResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
