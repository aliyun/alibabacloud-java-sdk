// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetEntityStoreDataResponseBody extends TeaModel {
    /**
     * <p>Total list of returned data</p>
     */
    @NameInMap("data")
    public java.util.List<java.util.List<String>> data;

    /**
     * <p>List of request headers</p>
     */
    @NameInMap("header")
    public java.util.List<String> header;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>264C3E89-XXXX-XXXX-XXXX-CE9C2196C7DC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Result status</p>
     */
    @NameInMap("responseStatus")
    public GetEntityStoreDataResponseBodyResponseStatus responseStatus;

    public static GetEntityStoreDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEntityStoreDataResponseBody self = new GetEntityStoreDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEntityStoreDataResponseBody setData(java.util.List<java.util.List<String>> data) {
        this.data = data;
        return this;
    }
    public java.util.List<java.util.List<String>> getData() {
        return this.data;
    }

    public GetEntityStoreDataResponseBody setHeader(java.util.List<String> header) {
        this.header = header;
        return this;
    }
    public java.util.List<String> getHeader() {
        return this.header;
    }

    public GetEntityStoreDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEntityStoreDataResponseBody setResponseStatus(GetEntityStoreDataResponseBodyResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
        return this;
    }
    public GetEntityStoreDataResponseBodyResponseStatus getResponseStatus() {
        return this.responseStatus;
    }

    public static class GetEntityStoreDataResponseBodyResponseStatusStatusItem extends TeaModel {
        /**
         * <p>Status code</p>
         * 
         * <strong>example:</strong>
         * <p>Success,ExecuteTimeout,UModelNotExist</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>Status level</p>
         * 
         * <strong>example:</strong>
         * <p>Info,Warn,Error</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>Calculation execution information</p>
         * 
         * <strong>example:</strong>
         * <p>Query execution timeout after 30 seconds</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>Suggestions when an error occurs during execution</p>
         * 
         * <strong>example:</strong>
         * <p>Try to reduce the query scope or increase timeout limit, then retry</p>
         */
        @NameInMap("suggestion")
        public String suggestion;

        public static GetEntityStoreDataResponseBodyResponseStatusStatusItem build(java.util.Map<String, ?> map) throws Exception {
            GetEntityStoreDataResponseBodyResponseStatusStatusItem self = new GetEntityStoreDataResponseBodyResponseStatusStatusItem();
            return TeaModel.build(map, self);
        }

        public GetEntityStoreDataResponseBodyResponseStatusStatusItem setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetEntityStoreDataResponseBodyResponseStatusStatusItem setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetEntityStoreDataResponseBodyResponseStatusStatusItem setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetEntityStoreDataResponseBodyResponseStatusStatusItem setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class GetEntityStoreDataResponseBodyResponseStatus extends TeaModel {
        /**
         * <p>Information during the execution process</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("executionStates")
        public String executionStates;

        /**
         * <p>Status level</p>
         * 
         * <strong>example:</strong>
         * <p>Info,Warn,Error</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>Execution result</p>
         * 
         * <strong>example:</strong>
         * <p>Success,PartialSuccess,Error</p>
         */
        @NameInMap("result")
        public String result;

        /**
         * <p>Retry policy</p>
         * 
         * <strong>example:</strong>
         * <p>None,Once,Continuous</p>
         */
        @NameInMap("retryPolicy")
        public String retryPolicy;

        /**
         * <p>Detailed status information list</p>
         */
        @NameInMap("statusItem")
        public java.util.List<GetEntityStoreDataResponseBodyResponseStatusStatusItem> statusItem;

        public static GetEntityStoreDataResponseBodyResponseStatus build(java.util.Map<String, ?> map) throws Exception {
            GetEntityStoreDataResponseBodyResponseStatus self = new GetEntityStoreDataResponseBodyResponseStatus();
            return TeaModel.build(map, self);
        }

        public GetEntityStoreDataResponseBodyResponseStatus setExecutionStates(String executionStates) {
            this.executionStates = executionStates;
            return this;
        }
        public String getExecutionStates() {
            return this.executionStates;
        }

        public GetEntityStoreDataResponseBodyResponseStatus setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetEntityStoreDataResponseBodyResponseStatus setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetEntityStoreDataResponseBodyResponseStatus setRetryPolicy(String retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public String getRetryPolicy() {
            return this.retryPolicy;
        }

        public GetEntityStoreDataResponseBodyResponseStatus setStatusItem(java.util.List<GetEntityStoreDataResponseBodyResponseStatusStatusItem> statusItem) {
            this.statusItem = statusItem;
            return this;
        }
        public java.util.List<GetEntityStoreDataResponseBodyResponseStatusStatusItem> getStatusItem() {
            return this.statusItem;
        }

    }

}
