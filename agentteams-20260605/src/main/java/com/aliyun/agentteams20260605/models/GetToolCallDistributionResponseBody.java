// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetToolCallDistributionResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Data")
    public GetToolCallDistributionResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>req-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetToolCallDistributionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetToolCallDistributionResponseBody self = new GetToolCallDistributionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetToolCallDistributionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetToolCallDistributionResponseBody setData(GetToolCallDistributionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetToolCallDistributionResponseBodyData getData() {
        return this.data;
    }

    public GetToolCallDistributionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetToolCallDistributionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetToolCallDistributionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetToolCallDistributionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetToolCallDistributionResponseBodyDataItems extends TeaModel {
        /**
         * <p>The number of calls for the tool.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("CallCount")
        public Integer callCount;

        /**
         * <p>The tool name.</p>
         * 
         * <strong>example:</strong>
         * <p>web_search</p>
         */
        @NameInMap("ToolName")
        public String toolName;

        public static GetToolCallDistributionResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            GetToolCallDistributionResponseBodyDataItems self = new GetToolCallDistributionResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public GetToolCallDistributionResponseBodyDataItems setCallCount(Integer callCount) {
            this.callCount = callCount;
            return this;
        }
        public Integer getCallCount() {
            return this.callCount;
        }

        public GetToolCallDistributionResponseBodyDataItems setToolName(String toolName) {
            this.toolName = toolName;
            return this;
        }
        public String getToolName() {
            return this.toolName;
        }

    }

    public static class GetToolCallDistributionResponseBodyData extends TeaModel {
        /**
         * <p>The tool calling distribution list.</p>
         * 
         * <strong>example:</strong>
         * <p>[...]</p>
         */
        @NameInMap("Items")
        public java.util.List<GetToolCallDistributionResponseBodyDataItems> items;

        /**
         * <p>The total number of tool invocations.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("TotalCalls")
        public Integer totalCalls;

        public static GetToolCallDistributionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetToolCallDistributionResponseBodyData self = new GetToolCallDistributionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetToolCallDistributionResponseBodyData setItems(java.util.List<GetToolCallDistributionResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetToolCallDistributionResponseBodyDataItems> getItems() {
            return this.items;
        }

        public GetToolCallDistributionResponseBodyData setTotalCalls(Integer totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Integer getTotalCalls() {
            return this.totalCalls;
        }

    }

}
