// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class ListSubscriptionByTopicResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListSubscriptionByTopicResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>06273500-249F-5863-121D-74D51123****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The response status.</p>
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
        /**
         * <p>The time when the subscription was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1449554806</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The endpoint to which the messages are pushed.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com">http://example.com</a></p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The tag that is used to filter messages. Only the messages that are attached with the specified tag can be pushed.</p>
         * 
         * <strong>example:</strong>
         * <p>important</p>
         */
        @NameInMap("FilterTag")
        public String filterTag;

        /**
         * <p>The time when the subscription was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1449554806</p>
         */
        @NameInMap("LastModifyTime")
        public Long lastModifyTime;

        /**
         * <p>The content format of the messages that are pushed to the endpoint. Valid values:</p>
         * <ul>
         * <li>XML</li>
         * <li>JSON</li>
         * <li>SIMPLIFIED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>XML</p>
         */
        @NameInMap("NotifyContentFormat")
        public String notifyContentFormat;

        /**
         * <p>The retry policy that is applied if an error occurs when Message Service (MNS) pushes messages to the endpoint. Valid values:</p>
         * <ul>
         * <li>BACKOFF_RETRY</li>
         * <li>EXPONENTIAL_DECAY_RETRY</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BACKOFF_RETRY</p>
         */
        @NameInMap("NotifyStrategy")
        public String notifyStrategy;

        /**
         * <p>The name of the subscription.</p>
         * 
         * <strong>example:</strong>
         * <p>MySubscription</p>
         */
        @NameInMap("SubscriptionName")
        public String subscriptionName;

        /**
         * <p>The name of the topic.</p>
         * 
         * <strong>example:</strong>
         * <p>MyTopic</p>
         */
        @NameInMap("TopicName")
        public String topicName;

        /**
         * <p>The Alibaba Cloud account ID of the topic owner.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789098****</p>
         */
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
        /**
         * <p>The data returned on the current page.</p>
         */
        @NameInMap("PageData")
        public java.util.List<ListSubscriptionByTopicResponseBodyDataPageData> pageData;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Long pageNum;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Pages")
        public Long pages;

        /**
         * <p>The number of entries on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>130</p>
         */
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
