// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class ListSubscriptionByTopicResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public ListSubscriptionByTopicResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Success")
    public Boolean success;

    public static ListSubscriptionByTopicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionByTopicResponseBody self = new ListSubscriptionByTopicResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionByTopicResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListSubscriptionByTopicResponseBody setData(ListSubscriptionByTopicResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSubscriptionByTopicResponseBodyData getData() {
        return this.data;
    }

    public ListSubscriptionByTopicResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSubscriptionByTopicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSubscriptionByTopicResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListSubscriptionByTopicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSubscriptionByTopicResponseBodyDataPageData extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("FilterTag")
        public String filterTag;

        @NameInMap("LastModifyTime")
        public Long lastModifyTime;

        @NameInMap("NotifyContentFormat")
        public String notifyContentFormat;

        @NameInMap("NotifyStrategy")
        public String notifyStrategy;

        @NameInMap("SubscriptionName")
        public String subscriptionName;

        @NameInMap("TopicName")
        public String topicName;

        @NameInMap("TopicOwner")
        public String topicOwner;

        public static ListSubscriptionByTopicResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            ListSubscriptionByTopicResponseBodyDataPageData self = new ListSubscriptionByTopicResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public ListSubscriptionByTopicResponseBodyDataPageData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListSubscriptionByTopicResponseBodyDataPageData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListSubscriptionByTopicResponseBodyDataPageData setFilterTag(String filterTag) {
            this.filterTag = filterTag;
            return this;
        }
        public String getFilterTag() {
            return this.filterTag;
        }

        public ListSubscriptionByTopicResponseBodyDataPageData setLastModifyTime(Long lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public Long getLastModifyTime() {
            return this.lastModifyTime;
        }

        public ListSubscriptionByTopicResponseBodyDataPageData setNotifyContentFormat(String notifyContentFormat) {
            this.notifyContentFormat = notifyContentFormat;
            return this;
        }
        public String getNotifyContentFormat() {
            return this.notifyContentFormat;
        }

        public ListSubscriptionByTopicResponseBodyDataPageData setNotifyStrategy(String notifyStrategy) {
            this.notifyStrategy = notifyStrategy;
            return this;
        }
        public String getNotifyStrategy() {
            return this.notifyStrategy;
        }

        public ListSubscriptionByTopicResponseBodyDataPageData setSubscriptionName(String subscriptionName) {
            this.subscriptionName = subscriptionName;
            return this;
        }
        public String getSubscriptionName() {
            return this.subscriptionName;
        }

        public ListSubscriptionByTopicResponseBodyDataPageData setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

        public ListSubscriptionByTopicResponseBodyDataPageData setTopicOwner(String topicOwner) {
            this.topicOwner = topicOwner;
            return this;
        }
        public String getTopicOwner() {
            return this.topicOwner;
        }

    }

    public static class ListSubscriptionByTopicResponseBodyData extends TeaModel {
        @NameInMap("PageData")
        public java.util.List<ListSubscriptionByTopicResponseBodyDataPageData> pageData;

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

        public static ListSubscriptionByTopicResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSubscriptionByTopicResponseBodyData self = new ListSubscriptionByTopicResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSubscriptionByTopicResponseBodyData setPageData(java.util.List<ListSubscriptionByTopicResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<ListSubscriptionByTopicResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public ListSubscriptionByTopicResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public ListSubscriptionByTopicResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListSubscriptionByTopicResponseBodyData setPages(Long pages) {
            this.pages = pages;
            return this;
        }
        public Long getPages() {
            return this.pages;
        }

        public ListSubscriptionByTopicResponseBodyData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListSubscriptionByTopicResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
