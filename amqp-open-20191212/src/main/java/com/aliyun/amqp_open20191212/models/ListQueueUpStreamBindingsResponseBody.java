// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListQueueUpStreamBindingsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListQueueUpStreamBindingsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8BFB1C9D-08A2-4859-A47C-403C9EFA2***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListQueueUpStreamBindingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQueueUpStreamBindingsResponseBody self = new ListQueueUpStreamBindingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQueueUpStreamBindingsResponseBody setData(ListQueueUpStreamBindingsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListQueueUpStreamBindingsResponseBodyData getData() {
        return this.data;
    }

    public ListQueueUpStreamBindingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListQueueUpStreamBindingsResponseBodyDataBindings extends TeaModel {
        /**
         * <p>The x-match property. Valid values:</p>
         * <ul>
         * <li><p><strong>all</strong>: This is the default value. All key-value pairs in the message header must match.</p>
         * </li>
         * <li><p><strong>any</strong>: At least one key-value pair in the message header must match.</p>
         * </li>
         * </ul>
         * <p>This parameter is valid only for headers exchanges. It is invalid for other types of exchanges.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("Argument")
        public String argument;

        /**
         * <p>The binding key.</p>
         * <ul>
         * <li><p>If the source exchange is not a topic exchange:</p>
         * <ul>
         * <li><p>The binding key can contain only letters, digits, hyphens (-), underscores (_), periods (.), forward slashes (/), and at signs (@).</p>
         * </li>
         * <li><p>The binding key must be 1 to 255 characters in length.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If the source exchange is a topic exchange:</p>
         * <ul>
         * <li><p>The binding key can contain letters, digits, hyphens (-), underscores (_), periods (.), number signs (#), forward slashes (/), and at signs (@).</p>
         * </li>
         * <li><p>The binding key cannot start or end with a period (.). If a number sign (#) or an asterisk (\*) is at the beginning of the key, it must be followed by a period (.). If it is at the end of the key, it must be preceded by a period (.). If it is in the middle of the key, it must be enclosed by periods (.).</p>
         * </li>
         * <li><p>The binding key must be 1 to 255 characters in length.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>amq.test</p>
         */
        @NameInMap("BindingKey")
        public String bindingKey;

        /**
         * <p>The type of the destination object. Valid values:</p>
         * <ul>
         * <li><p><strong>QUEUE</strong></p>
         * </li>
         * <li><p><strong>EXCHANGE</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>QUEUE</p>
         */
        @NameInMap("BindingType")
        public String bindingType;

        /**
         * <p>The name of the destination.</p>
         * 
         * <strong>example:</strong>
         * <p>QueueTest</p>
         */
        @NameInMap("DestinationName")
        public String destinationName;

        /**
         * <p>The name of the source exchange.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SourceExchange")
        public String sourceExchange;

        public static ListQueueUpStreamBindingsResponseBodyDataBindings build(java.util.Map<String, ?> map) throws Exception {
            ListQueueUpStreamBindingsResponseBodyDataBindings self = new ListQueueUpStreamBindingsResponseBodyDataBindings();
            return TeaModel.build(map, self);
        }

        public ListQueueUpStreamBindingsResponseBodyDataBindings setArgument(String argument) {
            this.argument = argument;
            return this;
        }
        public String getArgument() {
            return this.argument;
        }

        public ListQueueUpStreamBindingsResponseBodyDataBindings setBindingKey(String bindingKey) {
            this.bindingKey = bindingKey;
            return this;
        }
        public String getBindingKey() {
            return this.bindingKey;
        }

        public ListQueueUpStreamBindingsResponseBodyDataBindings setBindingType(String bindingType) {
            this.bindingType = bindingType;
            return this;
        }
        public String getBindingType() {
            return this.bindingType;
        }

        public ListQueueUpStreamBindingsResponseBodyDataBindings setDestinationName(String destinationName) {
            this.destinationName = destinationName;
            return this;
        }
        public String getDestinationName() {
            return this.destinationName;
        }

        public ListQueueUpStreamBindingsResponseBodyDataBindings setSourceExchange(String sourceExchange) {
            this.sourceExchange = sourceExchange;
            return this;
        }
        public String getSourceExchange() {
            return this.sourceExchange;
        }

    }

    public static class ListQueueUpStreamBindingsResponseBodyData extends TeaModel {
        /**
         * <p>The bindings.</p>
         */
        @NameInMap("Bindings")
        public java.util.List<ListQueueUpStreamBindingsResponseBodyDataBindings> bindings;

        /**
         * <p>The maximum number of results returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxResults")
        public String maxResults;

        /**
         * <p>The token that marks the end of the current results. An empty value indicates that all results have been returned.</p>
         * 
         * <strong>example:</strong>
         * <p>caebacccb2be03f84eb48b699f0a****</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        public static ListQueueUpStreamBindingsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListQueueUpStreamBindingsResponseBodyData self = new ListQueueUpStreamBindingsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListQueueUpStreamBindingsResponseBodyData setBindings(java.util.List<ListQueueUpStreamBindingsResponseBodyDataBindings> bindings) {
            this.bindings = bindings;
            return this;
        }
        public java.util.List<ListQueueUpStreamBindingsResponseBodyDataBindings> getBindings() {
            return this.bindings;
        }

        public ListQueueUpStreamBindingsResponseBodyData setMaxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public String getMaxResults() {
            return this.maxResults;
        }

        public ListQueueUpStreamBindingsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
