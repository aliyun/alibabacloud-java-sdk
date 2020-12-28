// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListDownStreamBindingsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListDownStreamBindingsResponseBodyData data;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static ListDownStreamBindingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDownStreamBindingsResponseBody self = new ListDownStreamBindingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDownStreamBindingsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDownStreamBindingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDownStreamBindingsResponseBody setData(ListDownStreamBindingsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDownStreamBindingsResponseBodyData getData() {
        return this.data;
    }

    public ListDownStreamBindingsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListDownStreamBindingsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDownStreamBindingsResponseBodyDataBindings extends TeaModel {
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

        public static ListDownStreamBindingsResponseBodyDataBindings build(java.util.Map<String, ?> map) throws Exception {
            ListDownStreamBindingsResponseBodyDataBindings self = new ListDownStreamBindingsResponseBodyDataBindings();
            return TeaModel.build(map, self);
        }

        public ListDownStreamBindingsResponseBodyDataBindings setSourceExchange(String sourceExchange) {
            this.sourceExchange = sourceExchange;
            return this;
        }
        public String getSourceExchange() {
            return this.sourceExchange;
        }

        public ListDownStreamBindingsResponseBodyDataBindings setBindingKey(String bindingKey) {
            this.bindingKey = bindingKey;
            return this;
        }
        public String getBindingKey() {
            return this.bindingKey;
        }

        public ListDownStreamBindingsResponseBodyDataBindings setBindingType(String bindingType) {
            this.bindingType = bindingType;
            return this;
        }
        public String getBindingType() {
            return this.bindingType;
        }

        public ListDownStreamBindingsResponseBodyDataBindings setArgument(String argument) {
            this.argument = argument;
            return this;
        }
        public String getArgument() {
            return this.argument;
        }

        public ListDownStreamBindingsResponseBodyDataBindings setDestinationName(String destinationName) {
            this.destinationName = destinationName;
            return this;
        }
        public String getDestinationName() {
            return this.destinationName;
        }

    }

    public static class ListDownStreamBindingsResponseBodyData extends TeaModel {
        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("Bindings")
        public java.util.List<ListDownStreamBindingsResponseBodyDataBindings> bindings;

        public static ListDownStreamBindingsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDownStreamBindingsResponseBodyData self = new ListDownStreamBindingsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDownStreamBindingsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListDownStreamBindingsResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListDownStreamBindingsResponseBodyData setBindings(java.util.List<ListDownStreamBindingsResponseBodyDataBindings> bindings) {
            this.bindings = bindings;
            return this;
        }
        public java.util.List<ListDownStreamBindingsResponseBodyDataBindings> getBindings() {
            return this.bindings;
        }

    }

}
