// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListQueuesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListQueuesResponseBodyData data;

    public static ListQueuesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQueuesResponseBody self = new ListQueuesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQueuesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQueuesResponseBody setData(ListQueuesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListQueuesResponseBodyData getData() {
        return this.data;
    }

    public static class ListQueuesResponseBodyDataQueues extends TeaModel {
        @NameInMap("ExclusiveState")
        public Boolean exclusiveState;

        @NameInMap("AutoDeleteState")
        public Boolean autoDeleteState;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Attributes")
        public java.util.Map<String, ?> attributes;

        @NameInMap("VHostName")
        public String VHostName;

        @NameInMap("Name")
        public String name;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("LastConsumeTime")
        public Long lastConsumeTime;

        public static ListQueuesResponseBodyDataQueues build(java.util.Map<String, ?> map) throws Exception {
            ListQueuesResponseBodyDataQueues self = new ListQueuesResponseBodyDataQueues();
            return TeaModel.build(map, self);
        }

        public ListQueuesResponseBodyDataQueues setExclusiveState(Boolean exclusiveState) {
            this.exclusiveState = exclusiveState;
            return this;
        }
        public Boolean getExclusiveState() {
            return this.exclusiveState;
        }

        public ListQueuesResponseBodyDataQueues setAutoDeleteState(Boolean autoDeleteState) {
            this.autoDeleteState = autoDeleteState;
            return this;
        }
        public Boolean getAutoDeleteState() {
            return this.autoDeleteState;
        }

        public ListQueuesResponseBodyDataQueues setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListQueuesResponseBodyDataQueues setAttributes(java.util.Map<String, ?> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.Map<String, ?> getAttributes() {
            return this.attributes;
        }

        public ListQueuesResponseBodyDataQueues setVHostName(String VHostName) {
            this.VHostName = VHostName;
            return this;
        }
        public String getVHostName() {
            return this.VHostName;
        }

        public ListQueuesResponseBodyDataQueues setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListQueuesResponseBodyDataQueues setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListQueuesResponseBodyDataQueues setLastConsumeTime(Long lastConsumeTime) {
            this.lastConsumeTime = lastConsumeTime;
            return this;
        }
        public Long getLastConsumeTime() {
            return this.lastConsumeTime;
        }

    }

    public static class ListQueuesResponseBodyData extends TeaModel {
        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("Queues")
        public java.util.List<ListQueuesResponseBodyDataQueues> queues;

        @NameInMap("MaxResults")
        public Integer maxResults;

        public static ListQueuesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListQueuesResponseBodyData self = new ListQueuesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListQueuesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListQueuesResponseBodyData setQueues(java.util.List<ListQueuesResponseBodyDataQueues> queues) {
            this.queues = queues;
            return this;
        }
        public java.util.List<ListQueuesResponseBodyDataQueues> getQueues() {
            return this.queues;
        }

        public ListQueuesResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

    }

}
