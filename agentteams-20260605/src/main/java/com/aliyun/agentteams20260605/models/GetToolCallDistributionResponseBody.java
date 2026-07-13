// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetToolCallDistributionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetToolCallDistributionResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CallCount")
        public Integer callCount;

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
        @NameInMap("Items")
        public java.util.List<GetToolCallDistributionResponseBodyDataItems> items;

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
