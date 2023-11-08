// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListBindingsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListBindingsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListBindingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBindingsResponseBody self = new ListBindingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBindingsResponseBody setData(ListBindingsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListBindingsResponseBodyData getData() {
        return this.data;
    }

    public ListBindingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListBindingsResponseBodyDataBindings extends TeaModel {
        @NameInMap("Argument")
        public String argument;

        @NameInMap("BindingKey")
        public String bindingKey;

        @NameInMap("BindingType")
        public String bindingType;

        @NameInMap("DestinationName")
        public String destinationName;

        @NameInMap("SourceExchange")
        public String sourceExchange;

        public static ListBindingsResponseBodyDataBindings build(java.util.Map<String, ?> map) throws Exception {
            ListBindingsResponseBodyDataBindings self = new ListBindingsResponseBodyDataBindings();
            return TeaModel.build(map, self);
        }

        public ListBindingsResponseBodyDataBindings setArgument(String argument) {
            this.argument = argument;
            return this;
        }
        public String getArgument() {
            return this.argument;
        }

        public ListBindingsResponseBodyDataBindings setBindingKey(String bindingKey) {
            this.bindingKey = bindingKey;
            return this;
        }
        public String getBindingKey() {
            return this.bindingKey;
        }

        public ListBindingsResponseBodyDataBindings setBindingType(String bindingType) {
            this.bindingType = bindingType;
            return this;
        }
        public String getBindingType() {
            return this.bindingType;
        }

        public ListBindingsResponseBodyDataBindings setDestinationName(String destinationName) {
            this.destinationName = destinationName;
            return this;
        }
        public String getDestinationName() {
            return this.destinationName;
        }

        public ListBindingsResponseBodyDataBindings setSourceExchange(String sourceExchange) {
            this.sourceExchange = sourceExchange;
            return this;
        }
        public String getSourceExchange() {
            return this.sourceExchange;
        }

    }

    public static class ListBindingsResponseBodyData extends TeaModel {
        @NameInMap("Bindings")
        public java.util.List<ListBindingsResponseBodyDataBindings> bindings;

        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("NextToken")
        public String nextToken;

        public static ListBindingsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBindingsResponseBodyData self = new ListBindingsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBindingsResponseBodyData setBindings(java.util.List<ListBindingsResponseBodyDataBindings> bindings) {
            this.bindings = bindings;
            return this;
        }
        public java.util.List<ListBindingsResponseBodyDataBindings> getBindings() {
            return this.bindings;
        }

        public ListBindingsResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListBindingsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
