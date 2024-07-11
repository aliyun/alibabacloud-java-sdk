// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListQueueConsumersResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListQueueConsumersResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4409B7D5-E4EC-4EB5-804A-385DCDFCD***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListQueueConsumersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQueueConsumersResponseBody self = new ListQueueConsumersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQueueConsumersResponseBody setData(ListQueueConsumersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListQueueConsumersResponseBodyData getData() {
        return this.data;
    }

    public ListQueueConsumersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListQueueConsumersResponseBodyDataConsumers extends TeaModel {
        /**
         * <p>The consumer tag.</p>
         * 
         * <strong>example:</strong>
         * <p>sgen-1</p>
         */
        @NameInMap("ConsumerTag")
        public String consumerTag;

        public static ListQueueConsumersResponseBodyDataConsumers build(java.util.Map<String, ?> map) throws Exception {
            ListQueueConsumersResponseBodyDataConsumers self = new ListQueueConsumersResponseBodyDataConsumers();
            return TeaModel.build(map, self);
        }

        public ListQueueConsumersResponseBodyDataConsumers setConsumerTag(String consumerTag) {
            this.consumerTag = consumerTag;
            return this;
        }
        public String getConsumerTag() {
            return this.consumerTag;
        }

    }

    public static class ListQueueConsumersResponseBodyData extends TeaModel {
        /**
         * <p>The consumers.</p>
         */
        @NameInMap("Consumers")
        public java.util.List<ListQueueConsumersResponseBodyDataConsumers> consumers;

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

        public static ListQueueConsumersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListQueueConsumersResponseBodyData self = new ListQueueConsumersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListQueueConsumersResponseBodyData setConsumers(java.util.List<ListQueueConsumersResponseBodyDataConsumers> consumers) {
            this.consumers = consumers;
            return this;
        }
        public java.util.List<ListQueueConsumersResponseBodyDataConsumers> getConsumers() {
            return this.consumers;
        }

        public ListQueueConsumersResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListQueueConsumersResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
