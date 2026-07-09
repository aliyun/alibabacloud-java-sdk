// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetCloudResourceDataResponseBody extends TeaModel {
    /**
     * <p>The total list of returned data.</p>
     */
    @NameInMap("data")
    public java.util.List<java.util.List<String>> data;

    /**
     * <p>The list of headers.</p>
     */
    @NameInMap("header")
    public java.util.List<String> header;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>264C3E89-XXXX-XXXX-XXXX-CE9C2196C7DC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result status.</p>
     */
    @NameInMap("responseStatus")
    public GetCloudResourceDataResponseBodyResponseStatus responseStatus;

    public static GetCloudResourceDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCloudResourceDataResponseBody self = new GetCloudResourceDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCloudResourceDataResponseBody setData(java.util.List<java.util.List<String>> data) {
        this.data = data;
        return this;
    }
    public java.util.List<java.util.List<String>> getData() {
        return this.data;
    }

    public GetCloudResourceDataResponseBody setHeader(java.util.List<String> header) {
        this.header = header;
        return this;
    }
    public java.util.List<String> getHeader() {
        return this.header;
    }

    public GetCloudResourceDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCloudResourceDataResponseBody setResponseStatus(GetCloudResourceDataResponseBodyResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
        return this;
    }
    public GetCloudResourceDataResponseBodyResponseStatus getResponseStatus() {
        return this.responseStatus;
    }

    public static class GetCloudResourceDataResponseBodyResponseStatusStatusItem extends TeaModel {
        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success,ExecuteTimeout,UModelNotExist</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The status level.</p>
         * 
         * <strong>example:</strong>
         * <p>Info,Warn,Error</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>The message content.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The suggestion when an execution error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>Try to reduce the query scope or increase timeout limit, then retry</p>
         */
        @NameInMap("suggestion")
        public String suggestion;

        public static GetCloudResourceDataResponseBodyResponseStatusStatusItem build(java.util.Map<String, ?> map) throws Exception {
            GetCloudResourceDataResponseBodyResponseStatusStatusItem self = new GetCloudResourceDataResponseBodyResponseStatusStatusItem();
            return TeaModel.build(map, self);
        }

        public GetCloudResourceDataResponseBodyResponseStatusStatusItem setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetCloudResourceDataResponseBodyResponseStatusStatusItem setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetCloudResourceDataResponseBodyResponseStatusStatusItem setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetCloudResourceDataResponseBodyResponseStatusStatusItem setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class GetCloudResourceDataResponseBodyResponseStatus extends TeaModel {
        /**
         * <p>The information during execution.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("executionStates")
        public String executionStates;

        /**
         * <p>The status level.</p>
         * 
         * <strong>example:</strong>
         * <p>Info,Warn,Error</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>The execution result.</p>
         * 
         * <strong>example:</strong>
         * <p>Success,PartialSuccess,Error</p>
         */
        @NameInMap("result")
        public String result;

        /**
         * <p>The retry policy.</p>
         * 
         * <strong>example:</strong>
         * <p>None,Once,Continuous</p>
         */
        @NameInMap("retryPolicy")
        public String retryPolicy;

        /**
         * <p>The detailed status information.</p>
         */
        @NameInMap("statusItem")
        public java.util.List<GetCloudResourceDataResponseBodyResponseStatusStatusItem> statusItem;

        public static GetCloudResourceDataResponseBodyResponseStatus build(java.util.Map<String, ?> map) throws Exception {
            GetCloudResourceDataResponseBodyResponseStatus self = new GetCloudResourceDataResponseBodyResponseStatus();
            return TeaModel.build(map, self);
        }

        public GetCloudResourceDataResponseBodyResponseStatus setExecutionStates(String executionStates) {
            this.executionStates = executionStates;
            return this;
        }
        public String getExecutionStates() {
            return this.executionStates;
        }

        public GetCloudResourceDataResponseBodyResponseStatus setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetCloudResourceDataResponseBodyResponseStatus setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetCloudResourceDataResponseBodyResponseStatus setRetryPolicy(String retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public String getRetryPolicy() {
            return this.retryPolicy;
        }

        public GetCloudResourceDataResponseBodyResponseStatus setStatusItem(java.util.List<GetCloudResourceDataResponseBodyResponseStatusStatusItem> statusItem) {
            this.statusItem = statusItem;
            return this;
        }
        public java.util.List<GetCloudResourceDataResponseBodyResponseStatusStatusItem> getStatusItem() {
            return this.statusItem;
        }

    }

}
