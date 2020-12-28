// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListQueueUpStreamBindingsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListQueueUpStreamBindingsResponseBodyData data;

    public static ListQueueUpStreamBindingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQueueUpStreamBindingsResponseBody self = new ListQueueUpStreamBindingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQueueUpStreamBindingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQueueUpStreamBindingsResponseBody setData(ListQueueUpStreamBindingsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListQueueUpStreamBindingsResponseBodyData getData() {
        return this.data;
    }

    public static class ListQueueUpStreamBindingsResponseBodyDataBindings extends TeaModel {
        @NameInMap("SourceExchange")
        public String sourceExchange;

        @NameInMap("BindingKey")
        public String bindingKey;

        @NameInMap("BindingType")
        public String bindingType;

        @NameInMap("Argument")
        public String argument;

        @NameInMap("DestinationName")
        public String destinationName;

        public static ListQueueUpStreamBindingsResponseBodyDataBindings build(java.util.Map<String, ?> map) throws Exception {
            ListQueueUpStreamBindingsResponseBodyDataBindings self = new ListQueueUpStreamBindingsResponseBodyDataBindings();
            return TeaModel.build(map, self);
        }

        public ListQueueUpStreamBindingsResponseBodyDataBindings setSourceExchange(String sourceExchange) {
            this.sourceExchange = sourceExchange;
            return this;
        }
        public String getSourceExchange() {
            return this.sourceExchange;
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

        public ListQueueUpStreamBindingsResponseBodyDataBindings setArgument(String argument) {
            this.argument = argument;
            return this;
        }
        public String getArgument() {
            return this.argument;
        }

        public ListQueueUpStreamBindingsResponseBodyDataBindings setDestinationName(String destinationName) {
            this.destinationName = destinationName;
            return this;
        }
        public String getDestinationName() {
            return this.destinationName;
        }

    }

    public static class ListQueueUpStreamBindingsResponseBodyData extends TeaModel {
        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("MaxResults")
        public String maxResults;

        @NameInMap("Bindings")
        public java.util.List<ListQueueUpStreamBindingsResponseBodyDataBindings> bindings;

        public static ListQueueUpStreamBindingsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListQueueUpStreamBindingsResponseBodyData self = new ListQueueUpStreamBindingsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListQueueUpStreamBindingsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListQueueUpStreamBindingsResponseBodyData setMaxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public String getMaxResults() {
            return this.maxResults;
        }

        public ListQueueUpStreamBindingsResponseBodyData setBindings(java.util.List<ListQueueUpStreamBindingsResponseBodyDataBindings> bindings) {
            this.bindings = bindings;
            return this;
        }
        public java.util.List<ListQueueUpStreamBindingsResponseBodyDataBindings> getBindings() {
            return this.bindings;
        }

    }

}
