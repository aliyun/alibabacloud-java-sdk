// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListQueuesResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListQueuesResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CE811989-9F02-42CE-97A6-2239CB5C2***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListQueuesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQueuesResponseBody self = new ListQueuesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQueuesResponseBody setData(ListQueuesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListQueuesResponseBodyData getData() {
        return this.data;
    }

    public ListQueuesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListQueuesResponseBodyDataQueues extends TeaModel {
        /**
         * <p>The attributes.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Attributes")
        public java.util.Map<String, ?> attributes;

        /**
         * <p>Indicates whether the queue was automatically deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoDeleteState")
        public Boolean autoDeleteState;

        /**
         * <p>The time when the queue was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1580887085240</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Indicates whether the queue is an exclusive queue.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ExclusiveState")
        public Boolean exclusiveState;

        /**
         * <p>The time when messages in the queue were last consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>1680887085240</p>
         */
        @NameInMap("LastConsumeTime")
        public Long lastConsumeTime;

        /**
         * <p>The queue name.</p>
         * 
         * <strong>example:</strong>
         * <p>QueueTest</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the ApsaraMQ for RabbitMQ instance to which the queue belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1880770869023***</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The vhost name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("VHostName")
        public String VHostName;

        public static ListQueuesResponseBodyDataQueues build(java.util.Map<String, ?> map) throws Exception {
            ListQueuesResponseBodyDataQueues self = new ListQueuesResponseBodyDataQueues();
            return TeaModel.build(map, self);
        }

        public ListQueuesResponseBodyDataQueues setAttributes(java.util.Map<String, ?> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.Map<String, ?> getAttributes() {
            return this.attributes;
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

        public ListQueuesResponseBodyDataQueues setExclusiveState(Boolean exclusiveState) {
            this.exclusiveState = exclusiveState;
            return this;
        }
        public Boolean getExclusiveState() {
            return this.exclusiveState;
        }

        public ListQueuesResponseBodyDataQueues setLastConsumeTime(Long lastConsumeTime) {
            this.lastConsumeTime = lastConsumeTime;
            return this;
        }
        public Long getLastConsumeTime() {
            return this.lastConsumeTime;
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

        public ListQueuesResponseBodyDataQueues setVHostName(String VHostName) {
            this.VHostName = VHostName;
            return this;
        }
        public String getVHostName() {
            return this.VHostName;
        }

    }

    public static class ListQueuesResponseBodyData extends TeaModel {
        /**
         * <p>The maximum number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token that marks the end of the current returned page. If this parameter is empty, all data is retrieved.</p>
         * 
         * <strong>example:</strong>
         * <p>caebacccb2be03f84eb48b699f0a****</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The queues.</p>
         */
        @NameInMap("Queues")
        public java.util.List<ListQueuesResponseBodyDataQueues> queues;

        public static ListQueuesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListQueuesResponseBodyData self = new ListQueuesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListQueuesResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
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

    }

}
