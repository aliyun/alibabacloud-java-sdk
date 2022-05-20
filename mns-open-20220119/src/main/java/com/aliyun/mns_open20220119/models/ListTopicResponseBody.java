// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class ListTopicResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public ListTopicResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

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

    public static class ListTopicResponseBodyDataPageData extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

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

        @NameInMap("TopicInnerUrl")
        public String topicInnerUrl;

        @NameInMap("TopicName")
        public String topicName;

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

        public ListTopicResponseBodyDataPageData setTopicUrl(String topicUrl) {
            this.topicUrl = topicUrl;
            return this;
        }
        public String getTopicUrl() {
            return this.topicUrl;
        }

    }

    public static class ListTopicResponseBodyData extends TeaModel {
        @NameInMap("PageData")
        public java.util.List<ListTopicResponseBodyDataPageData> pageData;

        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

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
