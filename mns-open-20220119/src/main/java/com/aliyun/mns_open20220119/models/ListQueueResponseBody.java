// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class ListQueueResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public ListQueueResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

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

    public static class ListQueueResponseBodyDataPageDataTags extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

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
        @NameInMap("ActiveMessages")
        public Long activeMessages;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DelayMessages")
        public Long delayMessages;

        @NameInMap("DelaySeconds")
        public Long delaySeconds;

        @NameInMap("InactiveMessages")
        public Long inactiveMessages;

        @NameInMap("LastModifyTime")
        public Long lastModifyTime;

        @NameInMap("LoggingEnabled")
        public Boolean loggingEnabled;

        @NameInMap("MaximumMessageSize")
        public Long maximumMessageSize;

        @NameInMap("MessageRetentionPeriod")
        public Long messageRetentionPeriod;

        @NameInMap("PollingWaitSeconds")
        public Long pollingWaitSeconds;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("Tags")
        public java.util.List<ListQueueResponseBodyDataPageDataTags> tags;

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

        public ListQueueResponseBodyDataPageData setInactiveMessages(Long inactiveMessages) {
            this.inactiveMessages = inactiveMessages;
            return this;
        }
        public Long getInactiveMessages() {
            return this.inactiveMessages;
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
        @NameInMap("PageData")
        public java.util.List<ListQueueResponseBodyDataPageData> pageData;

        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Pages")
        public Long pages;

        @NameInMap("Size")
        public Long size;

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
