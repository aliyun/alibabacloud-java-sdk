// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListExchangeUpStreamBindingsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListExchangeUpStreamBindingsResponseBodyData data;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static ListExchangeUpStreamBindingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExchangeUpStreamBindingsResponseBody self = new ListExchangeUpStreamBindingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExchangeUpStreamBindingsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListExchangeUpStreamBindingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExchangeUpStreamBindingsResponseBody setData(ListExchangeUpStreamBindingsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListExchangeUpStreamBindingsResponseBodyData getData() {
        return this.data;
    }

    public ListExchangeUpStreamBindingsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListExchangeUpStreamBindingsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListExchangeUpStreamBindingsResponseBodyDataBindings extends TeaModel {
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

        public static ListExchangeUpStreamBindingsResponseBodyDataBindings build(java.util.Map<String, ?> map) throws Exception {
            ListExchangeUpStreamBindingsResponseBodyDataBindings self = new ListExchangeUpStreamBindingsResponseBodyDataBindings();
            return TeaModel.build(map, self);
        }

        public ListExchangeUpStreamBindingsResponseBodyDataBindings setSourceExchange(String sourceExchange) {
            this.sourceExchange = sourceExchange;
            return this;
        }
        public String getSourceExchange() {
            return this.sourceExchange;
        }

        public ListExchangeUpStreamBindingsResponseBodyDataBindings setBindingKey(String bindingKey) {
            this.bindingKey = bindingKey;
            return this;
        }
        public String getBindingKey() {
            return this.bindingKey;
        }

        public ListExchangeUpStreamBindingsResponseBodyDataBindings setBindingType(String bindingType) {
            this.bindingType = bindingType;
            return this;
        }
        public String getBindingType() {
            return this.bindingType;
        }

        public ListExchangeUpStreamBindingsResponseBodyDataBindings setArgument(String argument) {
            this.argument = argument;
            return this;
        }
        public String getArgument() {
            return this.argument;
        }

        public ListExchangeUpStreamBindingsResponseBodyDataBindings setDestinationName(String destinationName) {
            this.destinationName = destinationName;
            return this;
        }
        public String getDestinationName() {
            return this.destinationName;
        }

    }

    public static class ListExchangeUpStreamBindingsResponseBodyData extends TeaModel {
        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("Bindings")
        public java.util.List<ListExchangeUpStreamBindingsResponseBodyDataBindings> bindings;

        public static ListExchangeUpStreamBindingsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListExchangeUpStreamBindingsResponseBodyData self = new ListExchangeUpStreamBindingsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListExchangeUpStreamBindingsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListExchangeUpStreamBindingsResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListExchangeUpStreamBindingsResponseBodyData setBindings(java.util.List<ListExchangeUpStreamBindingsResponseBodyDataBindings> bindings) {
            this.bindings = bindings;
            return this;
        }
        public java.util.List<ListExchangeUpStreamBindingsResponseBodyDataBindings> getBindings() {
            return this.bindings;
        }

    }

}
