// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListExchangeUpStreamBindingsResponseBody extends TeaModel {
    /**
     * <p>The return code. A value of 200 indicates that the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * <p>2DCCCE88-BC82-4A4F-AF5E-9A759672B***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The x-match property. Valid values:</p>
         * <ul>
         * <li><p><strong>all</strong>: The default value. All key-value pairs in the message header must match.</p>
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
         * <li><p>The key can contain only letters, digits, hyphens (-), underscores (_), periods (.), forward slashes (/), and at signs (@).</p>
         * </li>
         * <li><p>The key must be 1 to 255 characters in length.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If the source exchange is a topic exchange:</p>
         * <ul>
         * <li><p>The key can contain letters, digits, hyphens (-), underscores (_), periods (.), number signs (#), forward slashes (/), and at signs (@).</p>
         * </li>
         * <li><p>The key cannot start or end with a period (.). A number sign (#) or an asterisk (\*) must be preceded by a period if it is not at the start of the key. It must be followed by a period if it is not at the end of the key.</p>
         * </li>
         * <li><p>The key must be 1 to 255 characters in length.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>amq.dle.test</p>
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
         * <p>EXCHANGE</p>
         */
        @NameInMap("BindingType")
        public String bindingType;

        /**
         * <p>The destination name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DestinationName")
        public String destinationName;

        /**
         * <p>The name of the source exchange.</p>
         * 
         * <strong>example:</strong>
         * <p>dle</p>
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
         * <p>The maximum number of results returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token that indicates the position where the current query ends. An empty value indicates that all data has been read.</p>
         * 
         * <strong>example:</strong>
         * <p>caebacccb2be03f84eb48b699f0a****</p>
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
