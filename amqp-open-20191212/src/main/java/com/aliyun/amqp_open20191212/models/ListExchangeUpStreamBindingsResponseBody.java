// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListExchangeUpStreamBindingsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the request is successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListExchangeUpStreamBindingsResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListExchangeUpStreamBindingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExchangeUpStreamBindingsResponseBody self = new ListExchangeUpStreamBindingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExchangeUpStreamBindingsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListExchangeUpStreamBindingsResponseBody setData(ListExchangeUpStreamBindingsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListExchangeUpStreamBindingsResponseBodyData getData() {
        return this.data;
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

    public ListExchangeUpStreamBindingsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListExchangeUpStreamBindingsResponseBodyDataBindings extends TeaModel {
        /**
         * <p>The x-match attribute. Valid values:</p>
         * <br>
         * <p>*   **all:** A headers exchange routes a message to a queue only if all binding attributes of the queue except for x-match match the headers attributes of the message. This value is the default value.</p>
         * <p>*   **any:** A headers exchange routes a message to a queue if one or more binding attributes of the queue except for x-match match the headers attributes of the message.</p>
         * <br>
         * <p>This parameter is available only for headers exchanges.</p>
         */
        @NameInMap("Argument")
        public String argument;

        /**
         * <p>The binding key.</p>
         * <br>
         * <p>*   If the source exchange is not a topic exchange, the binding key must meet the following conventions:</p>
         * <br>
         * <p>    *   The binding key can contain only letters, digits, hyphens (-), underscores (\_), periods (.), forward slashes (/), and at signs (@).</p>
         * <p>    *   The binding key must be 1 to 255 characters in length.</p>
         * <br>
         * <p>*   If the source exchange is a topic exchange, the binding key must meet the following conventions:</p>
         * <br>
         * <p>    *   The binding key can contain letters, digits, hyphens (-), underscores (\_), periods (.), number signs (#), forward slashes (/), and at signs (@).</p>
         * <p>    *   The binding key cannot start or end with a period (.). If a binding key starts with a number sign (#) or an asterisk (\*), the number sign (#) or asterisk (\*) must be followed by a period (.). If the binding key ends with a number sign (#) or an asterisk (\*), the number sign (#) or asterisk (\*) must be preceded by a period (.). If a number sign (#) or an asterisk (\*) is used in the middle of a binding key, the number sign (#) or asterisk (\*) must be preceded and followed by a period (.).</p>
         * <p>    *   The binding key must be 1 to 255 characters in length.</p>
         */
        @NameInMap("BindingKey")
        public String bindingKey;

        /**
         * <p>The type of the object to which the source exchange is bound. Valid values:</p>
         * <br>
         * <p>*   **QUEUE**</p>
         * <p>*   **EXCHANGE**</p>
         */
        @NameInMap("BindingType")
        public String bindingType;

        /**
         * <p>The name of the object to which the source exchange is bound.</p>
         */
        @NameInMap("DestinationName")
        public String destinationName;

        /**
         * <p>The name of the source exchange.</p>
         */
        @NameInMap("SourceExchange")
        public String sourceExchange;

        public static ListExchangeUpStreamBindingsResponseBodyDataBindings build(java.util.Map<String, ?> map) throws Exception {
            ListExchangeUpStreamBindingsResponseBodyDataBindings self = new ListExchangeUpStreamBindingsResponseBodyDataBindings();
            return TeaModel.build(map, self);
        }

        public ListExchangeUpStreamBindingsResponseBodyDataBindings setArgument(String argument) {
            this.argument = argument;
            return this;
        }
        public String getArgument() {
            return this.argument;
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

        public ListExchangeUpStreamBindingsResponseBodyDataBindings setDestinationName(String destinationName) {
            this.destinationName = destinationName;
            return this;
        }
        public String getDestinationName() {
            return this.destinationName;
        }

        public ListExchangeUpStreamBindingsResponseBodyDataBindings setSourceExchange(String sourceExchange) {
            this.sourceExchange = sourceExchange;
            return this;
        }
        public String getSourceExchange() {
            return this.sourceExchange;
        }

    }

    public static class ListExchangeUpStreamBindingsResponseBodyData extends TeaModel {
        /**
         * <p>The bindings.</p>
         */
        @NameInMap("Bindings")
        public java.util.List<ListExchangeUpStreamBindingsResponseBodyDataBindings> bindings;

        /**
         * <p>The maximum number of entries returned.</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token that marks the end of the current returned page. If this parameter is empty, all data is retrieved.</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        public static ListExchangeUpStreamBindingsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListExchangeUpStreamBindingsResponseBodyData self = new ListExchangeUpStreamBindingsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListExchangeUpStreamBindingsResponseBodyData setBindings(java.util.List<ListExchangeUpStreamBindingsResponseBodyDataBindings> bindings) {
            this.bindings = bindings;
            return this;
        }
        public java.util.List<ListExchangeUpStreamBindingsResponseBodyDataBindings> getBindings() {
            return this.bindings;
        }

        public ListExchangeUpStreamBindingsResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListExchangeUpStreamBindingsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
